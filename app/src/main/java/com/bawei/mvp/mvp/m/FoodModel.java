package com.bawei.mvp.mvp.m;

import android.database.Observable;

import com.bawei.mvp.bean.Food;
import com.bawei.mvp.http.API;
import com.bawei.mvp.http.RetrofitManager;
import com.bawei.mvp.m.BaseModel;
import com.bawei.mvp.mvp.c.Foodcon;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class FoodModel extends BaseModel implements Foodcon.Model {

    @Override
    public void getfood(Observer<Food> observable) {
        RetrofitManager.getManager().getRetrofit()
                .create(API.class)
                .getfood()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observable);
    }
}
