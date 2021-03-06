package com.bnkk.padc_ted.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.adapters.PlaylistsAdapter;
import com.bnkk.padc_ted.components.SmartRecyclerView;
import com.bnkk.padc_ted.data.models.TEDModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 1/23/2018.
 */

public class PlaylistsFragment extends BaseFragment {

    @BindView(R.id.rv_playlist)
    SmartRecyclerView rvPlaylist;

    private TEDModel tedModel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlists, container, false);
        ButterKnife.bind(this, view);

        tedModel = ViewModelProviders.of(this).get(TEDModel.class);
        tedModel.loadPlayList();

        rvPlaylist.setLayoutManager(new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false));
        PlaylistsAdapter playlistsAdapter = new PlaylistsAdapter(getContext());
        rvPlaylist.setAdapter(playlistsAdapter);

        return view;
    }
}
