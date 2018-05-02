package com.bnkk.padc_ted.data.vos;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/25/2018.
 */

@Entity(tableName = "segments")
public class SegmentsVO {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @SerializedName("segment_id")
    @PrimaryKey
    private int segmentId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String segmentImg;

    public long getId() {
        return id;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public String getTitle() {
        return title;
    }

    public String getSegmentImg() {
        return segmentImg;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSegmentImg(String segmentImg) {
        this.segmentImg = segmentImg;
    }
}
