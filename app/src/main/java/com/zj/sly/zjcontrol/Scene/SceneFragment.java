package com.zj.sly.zjcontrol.Scene;



import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zj.sly.zjcontrol.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by asus on 2016/5/4.
 */
public class SceneFragment extends Fragment {
    private GridView gridView;
    //图片的文字标题
    private String[] titles = new String[]
            { "pic1", "pic2", "pic3", "pic4", "pic5", "pic6", "pic7", "pic8", "pic9"};
    //图片ID数组
    private int[] images = new int[]{
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8, R.drawable.pic9
    };

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.scene,parent,false);
        gridView = (GridView) v.findViewById(R.id.gridview);
        PictureAdapter adapter = new PictureAdapter(titles, images, getActivity());
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                Toast.makeText(getActivity(), "pic" + (position+1), Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

    /**
     * Created by asus on 2016/5/14.
     */ //自定义适配器
    static class PictureAdapter extends BaseAdapter {
        private LayoutInflater inflater;
        private List<Picture> pictures;

        public PictureAdapter(String[] titles, int[] images, Context context)
        {
            super();
            pictures = new ArrayList<Picture>();
            inflater = LayoutInflater.from(context);
            for (int i = 0; i < images.length; i++)
            {
                Picture picture = new Picture(titles[i], images[i]);
                pictures.add(picture);
            }
        }

        @Override
        public int getCount()
        {
            if (null != pictures)
            {
                return pictures.size();
            } else
            {
                return 0;
            }
        }

        @Override
        public Object getItem(int position)
        {
            return pictures.get(position);
        }

        @Override
        public long getItemId(int position)
        {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            ViewHolder viewHolder;
            if (convertView == null)
            {
                convertView = inflater.inflate(R.layout.scene_picture_item, null);
                viewHolder = new ViewHolder();
                viewHolder.title = (TextView) convertView.findViewById(R.id.title);
                viewHolder.image = (ImageView) convertView.findViewById(R.id.image);
                convertView.setTag(viewHolder);
            } else
            {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.title.setText(pictures.get(position).getTitle());
            viewHolder.image.setImageResource(pictures.get(position).getImageId());
            return convertView;
        }

    }

    /**
     * Created by asus on 2016/5/14.
     */
    static class ViewHolder
    {
        public TextView title;
        public ImageView image;
    }

    /**
     * Created by asus on 2016/5/14.
     */
    static class Picture
    {
        private String title;
        private int imageId;

        public Picture()
        {
            super();
        }

        public Picture(String title, int imageId)
        {
            super();
            this.title = title;
            this.imageId = imageId;
        }

        public String getTitle()
        {
            return title;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

        public int getImageId()
        {
            return imageId;
        }

        public void setImageId(int imageId)
        {
            this.imageId = imageId;
        }
    }
}

