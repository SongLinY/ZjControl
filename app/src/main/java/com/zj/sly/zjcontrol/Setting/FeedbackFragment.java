package com.zj.sly.zjcontrol.Setting;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zj.sly.zjcontrol.R;

/**
 * Created by LS on 2016/4/3.
 */
public class FeedbackFragment extends Fragment {
    private Toolbar mFeedbackToolBar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feedback,container,false);
        mFeedbackToolBar = (Toolbar)view.findViewById(R.id.feedbackToolBar);
        mFeedbackToolBar.setTitle("意见反馈");
        return view;
    }
}
