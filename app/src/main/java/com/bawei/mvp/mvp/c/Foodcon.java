package com.bawei.mvp.mvp.c;



import com.bawei.mvp.bean.Food;
import com.bawei.mvp.m.IModel;
import com.bawei.mvp.v.IView;

import java.util.List;

import io.reactivex.Observer;


public
interface Foodcon {
    //展示数据
    interface  View extends IView{
        void list(List<Food.DataBean> dataBeans);
    }

    //请求数据
    interface Model extends IModel{
        void getfood(Observer<Food> observable);
    }
}
