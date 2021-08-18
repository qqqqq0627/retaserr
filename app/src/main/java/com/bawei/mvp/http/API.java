package com.bawei.mvp.http;

import com.bawei.mvp.bean.Food;


import io.reactivex.Observable;
import retrofit2.http.GET;

public
interface API {
    @GET("Girl/page/1/count/10")
    Observable<Food> getfood();
}
