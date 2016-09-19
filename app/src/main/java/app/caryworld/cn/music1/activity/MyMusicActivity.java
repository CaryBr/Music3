package app.caryworld.cn.music1.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import app.caryworld.cn.music1.R;

/**
 * Created by Ultron on 16/9/19.
 */

public class MyMusicActivity extends BaseActivity {
    //compents
    ListView listView;
    //data
    int [] nameRes={R.string.download,R.string.recent,R.string.local,R.string.singer};
    int [] imgRes={R.drawable.lay_icn_dld,R.drawable.music_icn_recent,R.drawable.music_icn_local,R.drawable.lay_icn_artist};
    int [] nums={0,0,0,0};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymusic);
        init();
    }

    private void init() {
        initView();
    }

    private void initView() {
        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new ListAdapter());
        listView.setOnItemClickListener(new ListItemClickListener());

    }

    class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        }
    }
    class ListAdapter extends BaseAdapter {

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
            View view= getLayoutInflater().inflate(R.layout.list_item,null);
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
