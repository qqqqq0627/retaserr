package com.bawei.mvp.mvp.p;

import com.bawei.mvp.bean.Food;
import com.bawei.mvp.mvp.c.Foodcon;
import com.bawei.mvp.p.BasePresenter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.observers.BlockingBaseObserver;

public
class FoodPresenter extends BasePresenter<Foodcon.Model,Foodcon.View> {

    public FoodPresenter(Foodcon.Model mModel, Foodcon.View mView) {
        super(mModel, mView);
    }

    public void show(){
      mModel.getfood(new BlockingBaseObserver<Food>() {
          @Override
          public void onNext(@NotNull Food food) {
              List<Food.DataBean> dataBeans = food.getData();
              mView.list(dataBeans);
          }

          @Override
          public void onError(@NotNull Throwable e) {

          }
      });
    }

}
