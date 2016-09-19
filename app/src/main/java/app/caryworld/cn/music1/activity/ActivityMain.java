package app.caryworld.cn.music1.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.BaseAdapter;

import app.caryworld.cn.music1.R;
import app.caryworld.cn.music1.fragment.MyMusicFragment;

/**
 * Created by Ultron on 16/9/19.
 */

public class ActivityMain extends BaseActivity {
    //fragment
    FragmentManager fragmentManager;
    MyMusicFragment myMusicFragment;
    //container

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        initFragments();
    }

    private void initFragments() {
        fragmentManager=getSupportFragmentManager();
        myMusicFragment=new MyMusicFragment();
        fragmentManager.beginTransaction().add(R.id.base_main_container,myMusicFragment).commit();

    }
}
