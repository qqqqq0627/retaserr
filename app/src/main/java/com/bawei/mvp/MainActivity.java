package com.bawei.mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.bawei.mvp.adapter.FragmentADapter;
import com.bawei.mvp.fragment.BlankFragment;
import com.bawei.mvp.fragment.BlankFragment2;
import com.bawei.mvp.v.BaseActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {


    private ViewPager vp;
    private TabLayout tab;

    @Override
    public int bandLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
    }

    @Override
    public void initData() {

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new BlankFragment());
        fragments.add(new BlankFragment2());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("asdasd");
        strings.add("qweqwe");

        FragmentADapter fragmentADapter = new FragmentADapter(getSupportFragmentManager(), fragments, strings);
        vp.setAdapter(fragmentADapter);
        tab.setupWithViewPager(vp);

    }



    @Override
    public void showLoaing() {

    }

    @Override
    public void hideLoading() {

    }
}