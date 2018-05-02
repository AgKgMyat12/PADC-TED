package com.bnkk.padc_ted.data.vos;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/24/2018.
 */
@Entity(tableName = "speaker")
public class SpeakerVO {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @SerializedName("speaker_id")
    @PrimaryKey
    private int speakerId;

    @SerializedName("name")
    private String name;

    public long getId() {
        return id;
    }

    public int getSpeakerId() {
        return speakerId;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSpeakerId(int speakerId) {
        this.speakerId = speakerId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
