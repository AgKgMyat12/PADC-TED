package com.bnkk.padc_ted.network.responses;

import com.bnkk.padc_ted.data.vos.TEDPlayListsVO;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class GetTEDPlayListsResponse extends TEDResponse {

    @SerializedName("ted_playlists")
    private List<TEDPlayListsVO> tedPlayListsVOList;

    public List<TEDPlayListsVO> getTedPlayListsVOList() {
        if (tedPlayListsVOList == null) {
            tedPlayListsVOList = new ArrayList<>();
        }

        return tedPlayListsVOList;
    }
}
