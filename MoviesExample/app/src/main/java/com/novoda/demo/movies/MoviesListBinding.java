package com.novoda.demo.movies;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

public class MoviesListBinding {

    @BindingAdapter({"app:items"})
    public static void setItems(RecyclerView recyclerView, MoviesSate moviesSate) {
        MoviesAdapter adapter = (MoviesAdapter) recyclerView.getAdapter();
        if (adapter != null && moviesSate != null) {
            adapter.setMoviesSate(moviesSate);
        }
    }

}