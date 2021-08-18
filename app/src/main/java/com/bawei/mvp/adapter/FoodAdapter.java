package com.bawei.mvp.adapter;

import android.widget.ImageView;

import com.bawei.mvp.R;
import com.bawei.mvp.bean.Food;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FoodAdapter extends BaseQuickAdapter<Food.DataBean, BaseViewHolder> {

    public FoodAdapter( @Nullable List<Food.DataBean> data) {
        super(R.layout.item_view, data);
        addChildClickViewIds(R.id.item_view_tv);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, Food.DataBean dataBean) {
        baseViewHolder.setText(R.id.item_view_tv,dataBean.getDesc());

        Glide.with(getContext()).load(dataBean.getUrl()).into((ImageView) baseViewHolder.getView(R.id.item_view_image));
    }
}
