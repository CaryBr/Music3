package app.caryworld.cn.music1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import app.caryworld.cn.music1.R;

/**
 * Created by Ultron on 16/9/19.
 * 用于显示用户本地音乐的frament
 * 首次使用时,应让第一个Activity进行本地扫描
 */

public class MyMusicFragment extends Fragment {
    //compents
    ListView listView;
    //data
    int [] nameRes={R.string.download,R.string.recent,R.string.local,R.string.singer};
    int [] imgRes={R.drawable.lay_icn_dld,R.drawable.music_icn_recent,R.drawable.music_icn_local,R.drawable.lay_icn_artist};
    int [] nums={0,0,0,0};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_music,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView=(ListView)view.findViewById(R.id.listview);
        initListView();


    }

    private void initListView() {
        listView.setAdapter(new ListAdapter());

    }
    class ListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imgRes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=LayoutInflater.from(getContext()).inflate(R.layout.list_item,null);
            ImageView image=(ImageView)view.findViewById(R.id.item_img);
            TextView name=(TextView)view.findViewById(R.id.item_name);
            TextView num=(TextView)view.findViewById(R.id.item_num);
            image.setImageResource(imgRes[position]);
            name.setText(nameRes[position]);
            num.setText("("+nums[position]+")");
            return view;
        }
    }
}
