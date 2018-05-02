package com.bnkk.padc_ted.data.vos;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/24/2018.
 */

@Entity(tableName = "tag")
public class TagVO {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @SerializedName("tagId")
    @PrimaryKey
    private int tagId;

    @SerializedName("tag")
    private String tag;

    @SerializedName("description")
    private String description;

    public long getId() {
        return id;
    }

    public int getTagId() {
        return tagId;
    }

    public String getTag() {
        return tag;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
