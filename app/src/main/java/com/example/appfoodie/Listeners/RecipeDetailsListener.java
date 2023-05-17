package com.example.appfoodie.Listeners;

import com.example.appfoodie.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    int container = 0;
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
