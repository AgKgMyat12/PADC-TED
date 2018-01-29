package com.bnkk.padc_ted.network.responses;

import com.bnkk.padc_ted.data.vos.TEDTalksVO;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/24/2018.
 */

public class GetTEDTalksResponse extends TEDResponse {

    @SerializedName("ted_talks")
    private List<TEDTalksVO> tedTalksVOList;

    public List<TEDTalksVO> getTedTalksVOList() {
        if (tedTalksVOList == null) {
            tedTalksVOList = new ArrayList<>();
        }

        return tedTalksVOList;
    }
}
