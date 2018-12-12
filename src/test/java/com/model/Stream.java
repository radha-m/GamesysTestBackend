
package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stream {

    @SerializedName("gameRef")
    @Expose
    private Integer gameRef;
    @SerializedName("streamId")
    @Expose
    private Integer streamId;
    @SerializedName("streamName")
    @Expose
    private String streamName;
    @SerializedName("streamClosure")
    @Expose
    private Boolean streamClosure;
    @SerializedName("startTime")
    @Expose
    private Integer startTime;
    @SerializedName("superJackpot")
    @Expose
    private SuperJackpot superJackpot;
    @SerializedName("progressiveJackpot")
    @Expose
    private Object progressiveJackpot;
    @SerializedName("fullHouse")
    @Expose
    private FullHouse fullHouse;
    @SerializedName("lineAndFullHouseTotal")
    @Expose
    private LineAndFullHouseTotal lineAndFullHouseTotal;
    @SerializedName("costPerCard")
    @Expose
    private CostPerCard costPerCard;
    @SerializedName("noPlayers")
    @Expose
    private Integer noPlayers;
    @SerializedName("defaultGameFrequency")
    @Expose
    private Integer defaultGameFrequency;
    @SerializedName("jackpotLoading")
    @Expose
    private Boolean jackpotLoading;
    @SerializedName("gameType")
    @Expose
    private Integer gameType;
    @SerializedName("session")
    @Expose
    private Boolean session;
    @SerializedName("allWinner")
    @Expose
    private Boolean allWinner;
    @SerializedName("linkGame")
    @Expose
    private Boolean linkGame;

    public Integer getGameRef() {
        return gameRef;
    }

    public void setGameRef(Integer gameRef) {
        this.gameRef = gameRef;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public Boolean getStreamClosure() {
        return streamClosure;
    }

    public void setStreamClosure(Boolean streamClosure) {
        this.streamClosure = streamClosure;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public SuperJackpot getSuperJackpot() {
        return superJackpot;
    }

    public void setSuperJackpot(SuperJackpot superJackpot) {
        this.superJackpot = superJackpot;
    }

    public Object getProgressiveJackpot() {
        return progressiveJackpot;
    }

    public void setProgressiveJackpot(Object progressiveJackpot) {
        this.progressiveJackpot = progressiveJackpot;
    }

    public FullHouse getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(FullHouse fullHouse) {
        this.fullHouse = fullHouse;
    }

    public LineAndFullHouseTotal getLineAndFullHouseTotal() {
        return lineAndFullHouseTotal;
    }

    public void setLineAndFullHouseTotal(LineAndFullHouseTotal lineAndFullHouseTotal) {
        this.lineAndFullHouseTotal = lineAndFullHouseTotal;
    }

    public CostPerCard getCostPerCard() {
        return costPerCard;
    }

    public void setCostPerCard(CostPerCard costPerCard) {
        this.costPerCard = costPerCard;
    }

    public Integer getNoPlayers() {
        return noPlayers;
    }

    public void setNoPlayers(Integer noPlayers) {
        this.noPlayers = noPlayers;
    }

    public Integer getDefaultGameFrequency() {
        return defaultGameFrequency;
    }

    public void setDefaultGameFrequency(Integer defaultGameFrequency) {
        this.defaultGameFrequency = defaultGameFrequency;
    }

    public Boolean getJackpotLoading() {
        return jackpotLoading;
    }

    public void setJackpotLoading(Boolean jackpotLoading) {
        this.jackpotLoading = jackpotLoading;
    }

    public Integer getGameType() {
        return gameType;
    }

    public void setGameType(Integer gameType) {
        this.gameType = gameType;
    }

    public Boolean getSession() {
        return session;
    }

    public void setSession(Boolean session) {
        this.session = session;
    }

    public Boolean getAllWinner() {
        return allWinner;
    }

    public void setAllWinner(Boolean allWinner) {
        this.allWinner = allWinner;
    }

    public Boolean getLinkGame() {
        return linkGame;
    }

    public void setLinkGame(Boolean linkGame) {
        this.linkGame = linkGame;
    }

}
