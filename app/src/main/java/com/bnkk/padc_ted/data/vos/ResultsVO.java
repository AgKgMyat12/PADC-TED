package com.bnkk.padc_ted.data.vos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class ResultsVO {

    @SerializedName("search_result_id")
    private int searchResulId;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("imageUrl")
    private String resultImg;

    @SerializedName("result_type")
    private String resultType;

    @SerializedName("result_id")
    private int resultId;

    public int getSearchResulId() {
        return searchResulId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getResultImg() {
        return resultImg;
    }

    public String getResultType() {
        return resultType;
    }

    public int getResultId() {
        return resultId;
    }

    public void setSearchResulId(int searchResulId) {
        this.searchResulId = searchResulId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResultImg(String resultImg) {
        this.resultImg = resultImg;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }
}
