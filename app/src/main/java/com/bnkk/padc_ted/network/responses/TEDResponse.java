package com.bnkk.padc_ted.network.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/24/2018.
 */

public class TEDResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private int page;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public int getPage() {
        return page;
    }
}
