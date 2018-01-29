package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/24/2018.
 */

public class TEDTalksVO {

    @SerializedName("talk_id")
    private int talkId;

    @SerializedName("title")
    private String title;

    @SerializedName("speaker")
    private SpeakerVO speaker;

    @SerializedName("imageUrl")
    private String imageUrl;

    @SerializedName("durationInSec")
    private int durationInSec;

    @SerializedName("description")
    private String description;

    @SerializedName("tag")
    private List<TagVO> tagVOList;

    public int getTalkId() {
        return talkId;
    }

    public String getTitle() {
        return title;
    }

    public SpeakerVO getSpeaker() {
        return speaker;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getDurationInSec() {
        return durationInSec;
    }

    public String getDescription() {
        return description;
    }

    public List<TagVO> getTagVOList() {
        if (tagVOList == null) {
            tagVOList = new ArrayList<>();
        }

        return tagVOList;
    }

    public void setTalkId(int talkId) {
        this.talkId = talkId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSpeaker(SpeakerVO speaker) {
        this.speaker = speaker;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDurationInSec(int durationInSec) {
        this.durationInSec = durationInSec;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTagVOList(List<TagVO> tagVOList) {
        this.tagVOList = tagVOList;
    }
}
