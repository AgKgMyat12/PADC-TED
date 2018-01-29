package com.bnkk.padc_ted.network.responses;

import com.bnkk.padc_ted.data.vos.PodcastsVO;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class GetTEDPodcastsResponse extends TEDResponse {

    @SerializedName("ted_podcasts")
    private List<PodcastsVO> podcastsVOList;

    public List<PodcastsVO> getPodcastsVOList() {
        if (podcastsVOList == null) {
            podcastsVOList = new ArrayList<>();
        }

        return podcastsVOList;
    }
}
