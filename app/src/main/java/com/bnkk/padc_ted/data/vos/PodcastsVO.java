package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class PodcastsVO {

    @SerializedName("podcast_id")
    private int podcastId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String podcastImg;

    @SerializedName("description")
    private String description;

    @SerializedName("segments")
    private List<SegmentsVO> segmentsVOList;

    public int getPodcastId() {
        return podcastId;
    }

    public String getTitle() {
        return title;
    }

    public String getPodcastImg() {
        return podcastImg;
    }

    public String getDescription() {
        return description;
    }

    public List<SegmentsVO> getSegmentsVOList() {
        if (segmentsVOList == null) {
            segmentsVOList = new ArrayList<>();
        }

        return segmentsVOList;
    }

    public void setPodcastId(int podcastId) {
        this.podcastId = podcastId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPodcastImg(String podcastImg) {
        this.podcastImg = podcastImg;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSegmentsVOList(List<SegmentsVO> segmentsVOList) {
        this.segmentsVOList = segmentsVOList;
    }
}
