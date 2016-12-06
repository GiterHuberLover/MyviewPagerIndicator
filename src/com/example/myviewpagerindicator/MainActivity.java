package com.example.myviewpagerindicator;

import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.view.ViewPagerIndicator;


public class MainActivity extends Activity {
    private ViewPager mViewPager;
    private ViewPagerIndicator mIndicator;
    private List<String> mTitles = Arrays.asList("¶ÌÐÅ","ÊÕ²Ø","ÍÆ¼ö");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
