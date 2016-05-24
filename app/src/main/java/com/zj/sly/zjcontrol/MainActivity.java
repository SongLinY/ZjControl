package com.zj.sly.zjcontrol;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zj.sly.zjcontrol.Home_page.HomePagerFragment;
import com.zj.sly.zjcontrol.Scene.SceneFragment;
import com.zj.sly.zjcontrol.Setting.SettingsFragment;
import com.zj.sly.zjcontrol.User.LoginActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements android.view.View.OnClickListener {
    private static final String TAG = "ZJ";
    private ViewPager mViewPager;// 用来放置界面切换
    private FragmentPagerAdapter mPagerAdapter;// 初始化View适配器
    private List<Fragment> mListFragment = new ArrayList<Fragment>();// 用来存放Tab01-03
    //三个fragment
    private android.support.v4.app.Fragment HomeFragment;
    private android.support.v4.app.Fragment SceneFragment;
    private android.support.v4.app.Fragment SettingFragment;
    // 三个Tab，每个Tab包含一个按钮
    private LinearLayout mTabFirst;
    private LinearLayout mTabScene;
    private LinearLayout mTabSetting;
    // 三个按钮
    private ImageButton mFirstImg;
    private ImageButton mSceneImg;
    private ImageButton mSettingImg;
    //创建ToolBar
    private Toolbar mMainToolbar;
    //
    private TextView mTitleTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 加上这句设置为全屏 不加则只隐藏title
        //setContentView(R.layout.activity_main);
        //initView();
        //initViewPage();
        //initEvent();
        initFragment();
        initEvent();
    }
    
    private void initFragment() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        // 初始化三个LinearLayout
        mTabFirst = (LinearLayout)findViewById(R.id.id_tab_first);

        mTabScene = (LinearLayout)findViewById(R.id.id_tab_scene);

        mTabSetting = (LinearLayout)findViewById(R.id.id_tab_setting);


        // 初始化三个按钮
        mFirstImg = (ImageButton) findViewById(R.id.id_tab_first_img);
        mSceneImg = (ImageButton) findViewById(R.id.id_tab_scene_img);

        mSettingImg = (ImageButton) findViewById(R.id.id_tab_setting_img);


        //初始化ToolBar
        mMainToolbar = (Toolbar) findViewById(R.id.mainToolBar);
        mMainToolbar.setLogo(R.drawable.ic_menu_home);//用户头像，后期需要从数据库中获取
        //mMainToolbar.setTitle("登录/注册");//有个点击事件，点击后跳转到登录注册界面，登录后从数据库获取用户名显示
        //int titleId = Resources.getSystem().getIdentifier("tool_bar_title","id","android");
        //TextView tvTitle = (TextView) v.findViewById(titleId);
        mTitleTextView = (TextView) findViewById(R.id.title_main);
        //跳转到登录界面
        //需要显示返回值
        mTitleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
        HomeFragment = new HomePagerFragment();
        SceneFragment = new SceneFragment();
        SettingFragment = new SettingsFragment();

        mListFragment.add(HomeFragment);
        mListFragment.add(SceneFragment);
        mListFragment.add(SettingFragment);
        mPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public android.support.v4.app.Fragment getItem(int i) {
                return mListFragment.get(i);
            }

            @Override
            public int getCount() {
                return mListFragment.size();
            }
        };

        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                int curItem = mViewPager.getCurrentItem();
                setSelected(curItem);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void setSelected(int curItem) {
        mViewPager.setCurrentItem(curItem);
    }

    /*
    @Override
    public void onQuery(String szContent){
        //getFragmentManager().findFragmentById(showFragment.getId())
    }*/

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
                        /*Intent intent0 = new Intent(MainFragment.this, HomePagerActivity.class);
                        startActivity(intent0);*/
                        break;
                    case 1:
                        // resetImg();
                        mSceneImg.setImageResource(android.R.drawable.ic_menu_gallery);
                        /*Intent intent1 = new Intent(MainFragment.this,SceneActivity.class);
                        startActivity(intent1);*/
                        break;
                    case 2:
                        // resetImg();
                        mSettingImg.setImageResource(android.R.drawable.ic_menu_manage);
                        /*Intent intent2 = new Intent(MainFragment.this,SettingsActivity.class);
                        startActivity(intent2);*/
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
    /*
    private void initViewPage() {

        // 初始化三个布局
        LayoutInflater mLayoutInflater = LayoutInflater.from(getActivity());
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
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<3;i++){
                    if (i == 0){
                        Log.i(TAG,"加载首页");
                        //Intent intent = new Intent(getActivity(),FirstActivity.class);
                    }else if (i == 1){
                        Intent intent = new Intent(getActivity(),SceneActivity.class);
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(getActivity(),SettingsActivity.class);
                        startActivity(intent);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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

