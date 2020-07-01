package com.example.geomab.data.network.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/geomab/data/network/response/ApiCountryService;", "", "getContries", "Lkotlinx/coroutines/Deferred;", "Lcom/example/geomab/data/network/response/CountryResponse;", "getSlideShowImages", "Lcom/example/geomab/data/network/response/SlideShowImages;", "country_id", "", "Companion", "app_debug"})
public abstract interface ApiCountryService {
    public static final com.example.geomab.data.network.response.ApiCountryService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "countries/")
    public abstract kotlinx.coroutines.Deferred<com.example.geomab.data.network.response.CountryResponse> getContries();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "slideshowImages/")
    public abstract kotlinx.coroutines.Deferred<com.example.geomab.data.network.response.SlideShowImages> getSlideShowImages(@retrofit2.http.Query(value = "country")
    int country_id);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/example/geomab/data/network/response/ApiCountryService$Companion;", "", "()V", "invoke", "Lcom/example/geomab/data/network/response/ApiCountryService;", "conectivityInterceptor", "Lcom/example/geomab/data/network/ConectivityInterceptor;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.geomab.data.network.response.ApiCountryService invoke(@org.jetbrains.annotations.NotNull()
        com.example.geomab.data.network.ConectivityInterceptor conectivityInterceptor) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}