package com.bnkk.padc_ted.network.responses;

import com.bnkk.padc_ted.data.vos.ResultsVO;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class SearchTEDResponse extends TEDResponse {

    @SerializedName("results")
    private List<ResultsVO> resultsVOList;

    public List<ResultsVO> getResultsVOList() {
        if (resultsVOList == null) {
            resultsVOList = new ArrayList<>();
        }

        return resultsVOList;
    }
}
