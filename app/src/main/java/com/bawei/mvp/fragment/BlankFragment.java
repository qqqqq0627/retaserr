package com.bawei.mvp.fragment;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bawei.mvp.R;
import com.bawei.mvp.adapter.FoodAdapter;
import com.bawei.mvp.bean.Food;
import com.bawei.mvp.mvp.c.Foodcon;
import com.bawei.mvp.mvp.m.FoodModel;
import com.bawei.mvp.mvp.p.FoodPresenter;
import com.bawei.mvp.v.BaseFragment;

import java.util.List;


public class BlankFragment extends BaseFragment<FoodPresenter> implements Foodcon.View {


    private RecyclerView rv;
    FoodPresenter foodPresenter;

    @Override
    public int bandLayout() {
        return R.layout.fragment_blank;
    }

    @Override
    public void list(List<Food.DataBean> dataBeans) {
        rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        FoodAdapter foodAdapter = new FoodAdapter(dataBeans);
        rv.setAdapter(foodAdapter);
    }

    @Override
    public void initView() {

        rv = (RecyclerView) findViewById(R.id.rv);

        foodPresenter = new FoodPresenter(new FoodModel(), this);
    }

    @Override
    public void initData() {
        foodPresenter.show();
    }

    @Override
    public void showLoaing() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showToast(String msg) {

    }


}