
package com.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BingoLobbyInfoResource {

    @SerializedName("ventureId")
    @Expose
    private Integer ventureId;
    @SerializedName("website")
    @Expose
    private Object website;
    @SerializedName("streams")
    @Expose
    private List<Stream> streams = null;

    public Integer getVentureId() {
        return ventureId;
    }

    public void setVentureId(Integer ventureId) {
        this.ventureId = ventureId;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

}
