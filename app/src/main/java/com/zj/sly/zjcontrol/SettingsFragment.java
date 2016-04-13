package com.zj.sly.zjcontrol;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by LS on 2016/4/3.
 */
public class SettingsFragment extends ListFragment{
    protected String[]names = {"用户信息","意见反馈","关于"};
    private ListView mListView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(),R.layout.list_item,R.id.tv_list,names);
        setListAdapter(adapter);
        setHasOptionsMenu(true);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String names = (String)(getListAdapter()).getItem(position);
        switch (names){
            case "用户信息":
                Intent intent = new Intent(getActivity(),UserInfoActivity.class);
                startActivity(intent);
                break;
            case "意见反馈":
                Intent intent1 = new Intent(getActivity(),FeedbackActivity.class);
                startActivity(intent1);
                break;
            case "关于":
                Intent intent2 = new Intent(getActivity(),AboutActivity.class);
                startActivity(intent2);
                break;
        }

    }


}
