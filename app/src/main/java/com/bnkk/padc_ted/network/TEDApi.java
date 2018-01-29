package com.bnkk.padc_ted.network;

import com.bnkk.padc_ted.network.responses.GetTEDPlayListsResponse;
import com.bnkk.padc_ted.network.responses.GetTEDPodcastsResponse;
import com.bnkk.padc_ted.network.responses.GetTEDTalksResponse;
import com.bnkk.padc_ted.network.responses.SearchTEDResponse;
import com.bnkk.padc_ted.utils.AppConstants;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by E5-575G on 1/24/2018.
 */

public interface TEDApi {

    @FormUrlEncoded
    @POST(AppConstants.API_GET_TED_TALKS)
    Observable<GetTEDTalksResponse> loadTEDTalks(
            @Field(AppConstants.PARAM_ACCESS_TOKEN) String accessToken,
            @Field(AppConstants.PAGE) int pageIndex
    );

    @FormUrlEncoded
    @POST(AppConstants.API_GET_TED_PLAYLSIT)
    Observable<GetTEDPlayListsResponse> loadTEDPlaylist(
            @Field(AppConstants.PARAM_ACCESS_TOKEN) String accessToken,
            @Field(AppConstants.PAGE) int pageIndex
    );

    @FormUrlEncoded
    @POST(AppConstants.API_GET_TED_PODCASTS)
    Observable<GetTEDPodcastsResponse> loadTEDPodcasts(
            @Field(AppConstants.PARAM_ACCESS_TOKEN) String accessToken,
            @Field(AppConstants.PAGE) int pageIndex
    );

    @FormUrlEncoded
    @POST(AppConstants.API_SEARCH_TED)
    Observable<SearchTEDResponse> loadSearchTED(
            @Field(AppConstants.PARAM_ACCESS_TOKEN) String accessToken,
            @Field(AppConstants.PAGE) int pageIndex
    );
}
