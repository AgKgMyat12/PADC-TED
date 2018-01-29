package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class SegmentsVO {

    @SerializedName("segment_id")
    private int segmentId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String segmentImg;

    public int getSegmentId() {
        return segmentId;
    }

    public String getTitle() {
        return title;
    }

    public String getSegmentImg() {
        return segmentImg;
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
