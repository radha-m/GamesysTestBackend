package Steps;


import com.model.GetBingoLobbyFeed;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ResponseBody;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.readPropConfig;



import com.google.gson.Gson;
import com.model.Stream;


/**
 * Created by Radha on 12/12/2018.
 */
public class getBingoLobbyFeed {
    private final Logger logger = LoggerFactory.getLogger(getBingoLobbyFeed.class);
    readPropConfig prop = new readPropConfig();
    public int headerstatus;
    public String responseBody = "";
    public Boolean GameFreqValidStatus = false;



    @Given("^I have GetBingoLobbyFeed API$")
    public void setup() throws Throwable {
        //Specify the URL
        RestAssured.baseURI = prop.getConfig("RESTURI");

    }

    @When("^I made API http request$")
    public void GetBingoLobbyFeed() throws Throwable {
        //Make http request
        RequestSpecification httpRequest = RestAssured.given();

        // Process the response
        Response APIresponse = httpRequest.request(Method.GET);
        headerstatus = APIresponse.statusCode();

        //Retrieve the response
        ResponseBody body = APIresponse.getBody();
        responseBody = body.asString();
        logger.info("Http response = " + responseBody);



    }

    @Then("^HTTPReponse status code should be successful$")
    public void checkHttpStatusCode() throws Throwable {

        // Check the response status code
        if (headerstatus == 200 || headerstatus == 201){
            logger.info("Http response status is success ");
            Assert.assertTrue("Http response status is success", true);
        }else{
            logger.info("Http response status is failure ");
            Assert.assertTrue("Http response status is failure", false);
        }
    }

    @Then("^defaultGameFrequency should be (\\d+)$")
    public void checkDefaultgamefrequency(int arg1) throws Throwable {
        getStreams(responseBody);
    }

    @Then("^startTime should be future timestamp$")
    public void validateStarttime() throws Throwable {
        getStreamsStartTime(responseBody);
    }

// Parsing and Validation of DefaultGameFrequency
    private void getStreams(String responseBody){
        Gson gson = new Gson();
        GetBingoLobbyFeed bingoFeed = gson.fromJson(responseBody,GetBingoLobbyFeed.class);

        if (bingoFeed != null){
            for (Stream st : bingoFeed.getBingoLobbyInfoResource().getStreams())
            {
                logger.info("DefaultGameFrequency on Stream = " + st.getDefaultGameFrequency());
                    if (st.getDefaultGameFrequency() != 300000) {
                        logger.info("One of DefaultGameFrequency do not have the expected default value of 300000 ");
                        Assert.fail("One of DefaultGameFrequency do not have the expected default value of 300000 ");
                    }else{
                        Assert.assertTrue(" DefaultGameFrequency have the expected default value of 300000 ", true);
                        logger.info("DefaultGameFrequency have the expected default value of 300000  ");
                    }
                }
            }
        }

    // Parsing of timeStamp
    private Long getTimeStamp(String responseBody){
        Long timeStmp = null;
        Gson gson = new Gson();
        GetBingoLobbyFeed bingoFeed = gson.fromJson(responseBody,GetBingoLobbyFeed.class);

        if (bingoFeed != null) {
            timeStmp = bingoFeed.getTimestamp();
            logger.info("TimeStamp is = " + timeStmp);
        }else{
            logger.info("TimeStamp is not available");
            Assert.fail("TimeStamp is not available");
        }
        return  timeStmp;
    }


    // Parsing and Validation of StartTime
    private void getStreamsStartTime(String responseBody){
        Long optainTimeStamp = getTimeStamp(responseBody);
        Gson gson = new Gson();
        GetBingoLobbyFeed bingoFeed = gson.fromJson(responseBody,GetBingoLobbyFeed.class);

        if (bingoFeed != null){
            for (Stream st : bingoFeed.getBingoLobbyInfoResource().getStreams())
            {
                logger.info("StartTime on Stream = " + st.getStartTime());
                if (st.getStartTime() < optainTimeStamp){
                    logger.info("One of startTime is less than the current timestamp ");
                    Assert.fail("One of startTime is less than the current timestamp");
                }else{
                    Assert.assertTrue("Streams startTime is future timestamp", true);
                    logger.info("Streams startTime is future timestamp");
                }
            }
        }
    }

}
