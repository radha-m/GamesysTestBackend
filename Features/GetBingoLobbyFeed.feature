@ValidateGetBingoLobbyFeed
Feature: Validate GetBingoLobbyFeed API and default values

  @ValideSuccessResponse
  Scenario: Verify default values for GetBingoLobbyFeed API

    Given I have GetBingoLobbyFeed API
    When I made API http request
    Then HTTPReponse status code should be successful
    And defaultGameFrequency should be 300000
    And startTime should be future timestamp


