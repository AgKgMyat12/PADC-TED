package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/24/2018.
 */

public class SpeakerVO {

    @SerializedName("speaker_id")
    private int speakerId;

    @SerializedName("name")
    private String name;

    public int getSpeakerId() {
        return speakerId;
    }

    public String getName() {
        return name;
    }

    public void setSpeakerId(int speakerId) {
        this.speakerId = speakerId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
