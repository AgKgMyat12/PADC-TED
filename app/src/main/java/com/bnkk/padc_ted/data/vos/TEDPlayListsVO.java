package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class TEDPlayListsVO {

    @SerializedName("playlist_id")
    private int playlistId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String playListImg;

    @SerializedName("totalTalks")
    private int totalTalks;

    @SerializedName("description")
    private String description;

    @SerializedName("talksInPlaylist")
    private List<TEDTalksVO> talksInPlaylist;

    public int getPlaylistId() {
        return playlistId;
    }

    public String getTitle() {
        return title;
    }

    public String getPlayListImg() {
        return playListImg;
    }

    public int getTotalTalks() {
        return totalTalks;
    }

    public String getDescription() {
        return description;
    }

    public List<TEDTalksVO> getTalksInPlaylist() {
        if (talksInPlaylist == null) {
            talksInPlaylist = new ArrayList<>();
        }

        return talksInPlaylist;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlayListImg(String playListImg) {
        this.playListImg = playListImg;
    }

    public void setTotalTalks(int totalTalks) {
        this.totalTalks = totalTalks;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTalksInPlaylist(List<TEDTalksVO> talksInPlaylist) {
        this.talksInPlaylist = talksInPlaylist;
    }
}
