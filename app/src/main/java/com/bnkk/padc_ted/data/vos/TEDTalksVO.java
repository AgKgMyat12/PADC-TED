package com.bnkk.padc_ted.data.vos;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/24/2018.
 */

@Entity(tableName = "talks")
public class TEDTalksVO {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @SerializedName("talk_id")
    @PrimaryKey
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

    public long getId() {
        return id;
    }

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

    public void setId(long id) {
        this.id = id;
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
