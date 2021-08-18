package com.bawei.mvp.http;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public
class RetrofitManager {
    private  static  RetrofitManager manager;

    public static RetrofitManager getManager(){
        if (manager == null) {
            manager = new RetrofitManager();
        }
        return manager;
    }

    private Retrofit retrofit;

    public Retrofit getRetrofit(){
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .client(new OkHttpClient()
                            .newBuilder()
                            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                            .build())
                    .baseUrl("https://gank.io/api/v2/data/category/Girl/type/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();



        }
        return retrofit;
    }
}
