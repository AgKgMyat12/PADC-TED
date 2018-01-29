package com.bnkk.padc_ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnkk.padc_ted.R;
import com.bnkk.padc_ted.viewholders.PlaylistsViewHolder;

/**
 * Created by E5-575G on 1/25/2018.
 */

public class PlaylistsAdapter extends RecyclerView.Adapter<PlaylistsViewHolder> {

    private LayoutInflater mLayoutInflater;

    public PlaylistsAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public PlaylistsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_playlist, parent, false);
        return new PlaylistsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaylistsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
