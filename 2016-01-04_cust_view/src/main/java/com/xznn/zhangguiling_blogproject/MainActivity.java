package com.xznn.zhangguiling_blogproject;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.xznn.zhangguiling_blogproject.my_view.CircleView;
import com.xznn.zhangguiling_blogproject.my_view.OvalView;
import com.xznn.zhangguiling_blogproject.my_view.PathView;
import com.xznn.zhangguiling_blogproject.my_view.RectView;
import com.xznn.zhangguiling_blogproject.my_view.SectorView;
import com.xznn.zhangguiling_blogproject.my_view.TrigonView;
import com.xznn.zhangguiling_blogproject.my_view.TvIvView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Android绘图机制（一）——自定义View的基础属性和方法 - 刘桂林的博客 - 博客频道 - CSDN.NET
// - http://blog.csdn.net/qq_26787115/article/details/50457413

//Android绘图机制（二）——自定义View绘制形, 圆形, 三角形, 扇形, 椭圆, 曲线,文字和图片的坐标讲解 - 刘桂林的博客 - 博客频道 - CSDN.NET -
// http://blog.csdn.net/qq_26787115/article/details/50466655


public class MainActivity extends AppCompatActivity implements RefreshListView.OnRefreshListener {


    private RefreshListView mListView;
    private List<String> mDatas;
    private ArrayAdapter<String> mAdapter;

    private final static int REFRESH_COMPLETE = 0;

    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case REFRESH_COMPLETE:
                    mListView.refreshComplete();
                    mAdapter.notifyDataSetChanged();
                    break;

                default:
                    break;
            }
        }

        ;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (RefreshListView) findViewById(R.id.listview);
        //item上的数据源
        String[] data = {"矩形", "圆形", "三角形", "扇形", "椭圆", "曲线", "文字和图片"};
        mDatas = new ArrayList<String>(Arrays.asList(data));
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas);
        mListView.setAdapter(mAdapter);
        mListView.setOnRefreshListener(this);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //判断点击了第几个
                MainActivity context = MainActivity.this;
                AlertDialog.Builder adb = new AlertDialog.Builder(context);
                if (id == 0) {
                    //矩形
                    adb.setView(new RectView(context));

                } else if (id == 1) {
                    //圆形
                    adb.setView(new CircleView(context));

                } else if (id == 2) {
                    //三角形
                    adb.setView(new TrigonView(context));

                } else if (id == 3) {
                    //扇形
                    adb.setView(new SectorView(context));

                } else if (id == 4) {
                    //椭圆
                    adb.setView(new OvalView(context));

                } else if (id == 5) {
                    //曲线
                    adb.setView(new PathView(context));

                } else if (id == 6) {
                    //文字和图片
                    adb.setView(new TvIvView(context));

                }
                adb.setPositiveButton("Ok", null);
                adb.show();

            }
        });

    }

    @Override
    public void onRefresh() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    mDatas.add(0, "new data");
                    mHandler.sendEmptyMessage(REFRESH_COMPLETE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
