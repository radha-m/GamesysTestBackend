$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetBingoLobbyFeed.feature");
formatter.feature({
  "line": 2,
  "name": "Validate GetBingoLobbyFeed API and default values",
  "description": "",
  "id": "validate-getbingolobbyfeed-api-and-default-values",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ValidateGetBingoLobbyFeed"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify default values for GetBingoLobbyFeed API",
  "description": "",
  "id": "validate-getbingolobbyfeed-api-and-default-values;verify-default-values-for-getbingolobbyfeed-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ValideSuccessResponse"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I have GetBingoLobbyFeed API",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I made API http request",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "HTTPReponse status code should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "defaultGameFrequency should be 300000",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "startTime should be future timestamp",
  "keyword": "And "
});
formatter.match({
  "location": "getBingoLobbyFeed.setup()"
});
formatter.result({
  "duration": 1010164090,
  "status": "passed"
});
formatter.match({
  "location": "getBingoLobbyFeed.GetBingoLobbyFeed()"
});
formatter.result({
  "duration": 2113586018,
  "status": "passed"
});
formatter.match({
  "location": "getBingoLobbyFeed.checkHttpStatusCode()"
});
formatter.result({
  "duration": 10429889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "300000",
      "offset": 31
    }
  ],
  "location": "getBingoLobbyFeed.checkDefaultgamefrequency(int)"
});
