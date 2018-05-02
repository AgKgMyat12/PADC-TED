package com.bnkk.padc_ted.data.models;

import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.util.Log;

import com.bnkk.padc_ted.TEDApp;
import com.bnkk.padc_ted.data.db.AppDataBase;
import com.bnkk.padc_ted.network.TEDApi;
import com.bnkk.padc_ted.network.responses.GetTEDPlayListsResponse;
import com.bnkk.padc_ted.network.responses.GetTEDPodcastsResponse;
import com.bnkk.padc_ted.network.responses.GetTEDTalksResponse;
import com.bnkk.padc_ted.network.responses.SearchTEDResponse;
import com.bnkk.padc_ted.utils.AppConstants;
import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class TEDModel extends ViewModel {

    private TEDApi tedApi;
    private AppDataBase mAppDataBase;

    private int talksPageIndex = 1;
    private int playListPageIndex = 1;
    private int podcastsPageIndex = 1;
    private int searchPageIndex = 1;

    public TEDModel() {
        initTEDApi();
    }

    private void initTEDApi() {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.TED_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        tedApi = retrofit.create(TEDApi.class);
    }

    public void initDatabase(Context context) {
        mAppDataBase = AppDataBase.getInMemoryDatabase(context);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

    public void loadTalks() {
        Observable<GetTEDTalksResponse> tedTalksResponseObservable = getTEDTalksResponseObservable(
                AppConstants.ACCESS_TOKEN, talksPageIndex);
        tedTalksResponseObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GetTEDTalksResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GetTEDTalksResponse talksResponse) {
                        Log.d(TEDApp.LOG_TAG, "talksResponse" + talksResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TEDApp.LOG_TAG, "error :" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void loadPlayList() {
        Observable<GetTEDPlayListsResponse> getTEDPlayListsResponseObservable = getTEDPlayListsResponseObservable(
                AppConstants.ACCESS_TOKEN, playListPageIndex);
        getTEDPlayListsResponseObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GetTEDPlayListsResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GetTEDPlayListsResponse playListsResponse) {
                        Log.d(TEDApp.LOG_TAG, "playListsResponse" + playListsResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TEDApp.LOG_TAG, "error :" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void loadPodcasts() {
        Observable<GetTEDPodcastsResponse> getTEDPodcastsResponseObservable = getTEDPodcastsResponseObservable(
                AppConstants.ACCESS_TOKEN, podcastsPageIndex);
        getTEDPodcastsResponseObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GetTEDPodcastsResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GetTEDPodcastsResponse podcastsResponse) {
                        Log.d(TEDApp.LOG_TAG, "podcastsResponse" + podcastsResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TEDApp.LOG_TAG, "error :" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void loadSearchTED() {
        Observable<SearchTEDResponse> searchTEDResponseObservable = searchTEDResponseObservable(
                AppConstants.ACCESS_TOKEN, searchPageIndex);
        searchTEDResponseObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchTEDResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchTEDResponse searchTEDResponse) {
                        Log.d(TEDApp.LOG_TAG, "podcastsResponse" + searchTEDResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TEDApp.LOG_TAG, "error :" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private Observable<GetTEDTalksResponse> getTEDTalksResponseObservable(String accessToken, int pageIndex) {
        return tedApi.loadTEDTalks(accessToken, pageIndex);
    }

    private Observable<GetTEDPlayListsResponse> getTEDPlayListsResponseObservable(String accessToken, int pageIndex) {
        return tedApi.loadTEDPlaylist(accessToken, pageIndex);
    }

    private Observable<GetTEDPodcastsResponse> getTEDPodcastsResponseObservable(String accessToken, int pageIndex) {
        return tedApi.loadTEDPodcasts(accessToken, pageIndex);
    }

    private Observable<SearchTEDResponse> searchTEDResponseObservable(String accessToken, int pageIndex) {
        return tedApi.loadSearchTED(accessToken, pageIndex);
    }
}
