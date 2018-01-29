package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/24/2018.
 */

public class TagVO {

    @SerializedName("tagId")
    private int tagId;

    @SerializedName("tag")
    private String tag;

    @SerializedName("description")
    private String description;

    public int getTagId() {
        return tagId;
    }

    public String getTag() {
        return tag;
    }

    public String getDescription() {
        return description;
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
