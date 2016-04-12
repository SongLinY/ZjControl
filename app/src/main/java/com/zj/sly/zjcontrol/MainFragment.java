package com.zj.sly.zjcontrol;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by asus on 2016/4/6.
 */
public class MainFragment extends Fragment implements android.view.View.OnClickListener{
    private ViewPager mViewPager;// 用来放置界面切换
    private PagerAdapter mPagerAdapter;// 初始化View适配器
    private List<View> mViews = new ArrayList<View>();// 用来存放Tab01-03
    // 三个Tab，每个Tab包含一个按钮
    private LinearLayout mTabFirst;
    private LinearLayout mTabScene;
    private LinearLayout mTabSetting;
    // 三个按钮
    private ImageButton mFirstImg;
    private ImageButton mSceneImg;
    private ImageButton mSettingImg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 加上这句设置为全屏 不加则只隐藏title
        //setContentView(R.layout.activity_main);
        //initView();
        initViewPage();
        initEvent();
    }

    private void initEvent() {
        mTabFirst.setOnClickListener(this);
        mTabScene.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /**
             *ViewPage左右滑动时
             */
            @Override
            public void onPageSelected(int arg0) {
                int currentItem = mViewPager.getCurrentItem();
                switch (currentItem) {
                    case 0:
                        //resetImg();
                        mFirstImg.setImageResource(android.R.drawable.ic_menu_myplaces);
                        break;
                    case 1:
                       // resetImg();
                        mSceneImg.setImageResource(android.R.drawable.ic_menu_gallery);
                        break;
                    case 2:
                       // resetImg();
                        mSettingImg.setImageResource(android.R.drawable.ic_menu_manage);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }

    /**
     * 初始化设置
     */
    public View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_main,parent,false);
        mViewPager = (ViewPager) v.findViewById(R.id.id_viewpager);
        // 初始化三个LinearLayout
        mTabFirst = (LinearLayout) v.findViewById(R.id.id_tab_first);
        mTabScene = (LinearLayout) v.findViewById(R.id.id_tab_scene);
        mTabSetting = (LinearLayout) v.findViewById(R.id.id_tab_setting);

        // 初始化三个按钮
        mFirstImg = (ImageButton) v.findViewById(R.id.id_tab_first_img);
        mSceneImg = (ImageButton)v.findViewById(R.id.id_tab_setting_img);
        mSettingImg = (ImageButton) v.findViewById(R.id.id_tab_setting_img);

        return v;
    }

    /*private void initView() {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        mViewPager = (ViewPager) view.findViewById(R.id.id_viewpager);
        // 初始化三个LinearLayout
        mTabFirst = (LinearLayout) view.findViewById(R.id.id_tab_first);
        mTabScene = (LinearLayout) view.findViewById(R.id.id_tab_scene);
        mTabSetting = (LinearLayout) view.findViewById(R.id.id_tab_setting);

        // 初始化三个按钮
        mFirstImg = (ImageButton) view.findViewById(R.id.id_tab_first_img);
        mSceneImg = (ImageButton)view.findViewById(R.id.id_tab_setting_img);
        mSettingImg = (ImageButton) view.findViewById(R.id.id_tab_setting_img);
    }*/

    /**
     * 初始化ViewPage
     */
    private void initViewPage() {

        // 初始化三个布局
        LayoutInflater mLayoutInflater = LayoutInflater.from(this);
        View tab01 = mLayoutInflater.inflate(R.layout.message, null);
        View tab02 = mLayoutInflater.inflate(R.layout.scene, null);
        View tab03 = mLayoutInflater.inflate(R.layout.setting, null);


        mViews.add(tab01);
        mViews.add(tab02);
        mViews.add(tab03);

        // 适配器初始化并设置
        mPagerAdapter = new PagerAdapter() {

            @Override
            public void destroyItem(ViewGroup container, int position,
                                    Object object) {
                container.removeView(mViews.get(position));

            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = mViews.get(position);
                container.addView(view);
                return view;
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {

                return arg0 == arg1;
            }

            @Override
            public int getCount() {

                return mViews.size();
            }
        };
        mViewPager.setAdapter(mPagerAdapter);
    }

    /**
     * 判断哪个要显示，及设置按钮图片
     */
    @Override
    public void onClick(View arg0) {

        switch (arg0.getId()) {
            case R.id.id_tab_first:
                mViewPager.setCurrentItem(0);
               // resetImg();
                mFirstImg.setImageResource(android.R.drawable.ic_menu_myplaces);
                break;
            case R.id.id_tab_scene:
                mViewPager.setCurrentItem(1);
               // resetImg();
                mSceneImg.setImageResource(android.R.drawable.ic_menu_gallery);
                break;
            case R.id.id_tab_setting:
                mViewPager.setCurrentItem(2);
               // resetImg();
                mSettingImg.setImageResource(android.R.drawable.ic_menu_manage);
                break;
            default:
                break;
        }
    }

    /**
     * 把所有图片变暗

     private void resetImg() {
     mFirstImg.setImageResource(R.drawable.tab_first_normal);
     mSceneImg.setImageResource(R.drawable.tab_scene_normal);
     mSettingImg.setImageResource(R.drawable.tab_setting_normal);
     }
    */
}
