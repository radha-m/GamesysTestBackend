
package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetBingoLobbyFeed {

    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("bingoLobbyInfoResource")
    @Expose
    private BingoLobbyInfoResource bingoLobbyInfoResource;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public BingoLobbyInfoResource getBingoLobbyInfoResource() {
        return bingoLobbyInfoResource;
    }

    public void setBingoLobbyInfoResource(BingoLobbyInfoResource bingoLobbyInfoResource) {
        this.bingoLobbyInfoResource = bingoLobbyInfoResource;
    }

}
