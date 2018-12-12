package Steps;

import com.google.gson.reflect.TypeToken;
import com.processor.Streams;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.http.ContentEncoding;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import org.json.JSONObject;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.readPropConfig;
import java.util.List;


import com.google.gson.Gson;
import com.model.Stream;
import com.model.BingoLobbyInfoResource;


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

    }


    private void getStreams(String responseBody){
        String json = null;
        Gson gson = new Gson();


        //Streams streams = gson.fromJson(responseBody,Streams.class);
        BingoLobbyInfoResource bingo = gson.fromJson(responseBody,BingoLobbyInfoResource.class);

        if (bingo != null){
            for (Stream st : bingo.getStreams()){
                logger.info("DefaultGameFrequency on array = " + st.getStreamName() + ",         Start time = " + st.getStartTime());
            }

        }
//        return new String[]{
//          "DefaultGameFrequency : " +  streams.getDefaultGameFrequency(),
//                  "StartTime :" + streams.getStartTime()
//        };

    }
}
