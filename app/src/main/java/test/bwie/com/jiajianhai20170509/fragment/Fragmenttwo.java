package test.bwie.com.jiajianhai20170509.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;

import test.bwie.com.jiajianhai20170509.MyAdapter;
import test.bwie.com.jiajianhai20170509.R;
import test.bwie.com.jiajianhai20170509.bean.Bean;
import test.bwie.com.jiajianhai20170509.bean.ComicsBean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/9
 */

public class Fragmenttwo extends Fragment {
    private RecyclerView recycler;
    public Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    String data = (String) msg.obj;
                    Gson gson = new Gson();
                    Bean bean = gson.fromJson(data, Bean.class);
                    Log.d("sss", bean.toString());

                    comics = (ArrayList<ComicsBean>) bean.getData().getComics();
                    Log.d("sss", comics.size() + "");
                    MyAdapter adapter = new MyAdapter(getActivity(), comics);
                    recycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

                    recycler.setItemAnimator(new DefaultItemAnimator());

                    recycler.setAdapter(adapter);
                    //设置item之间的间隔
                    SpacesItemDecoration decoration = new SpacesItemDecoration(16);
                    recycler.addItemDecoration(decoration);

                    Log.i("zzz", adapter.toString());
                    break;
                case 1:
                    String data1 = (String) msg.obj;
                    Log.i("zzz", data1.toString());
                    break;
            }
        }
    };
    private ArrayList<ComicsBean> comics;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f1layout, null);
        recycler = (RecyclerView) view.findViewById(R.id.recycler);

        initdata();
        return view;
    }

    private void initdata() {
        String url = "http://api.kkmh.com/v1/daily/comic_lists/1487606400?since=0&gender=0&sa_event=eyJwcm9qZWN0Ijoia3VhaWthbl9hcHAiLCJ0aW1lIjoxNDg3ODM0MzY5NDYwLCJwcm9wZXJ0aWVzIjp7IkhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIlZDb21tdW5pdHlUYWJOYW1lIjoi54Ot6ZeoIiwiJG9zX3ZlcnNpb24iOiI0LjQuMiIsIkdlbmRlclR5cGUiOiLlpbPniYgiLCJGcm9tSG9tZXBhZ2VUYWJOYW1lIjoi54Ot6ZeoIiwiJGxpYl92ZXJzaW9uIjoiMS42LjM0IiwiJG5ldHdvcmtfdHlwZSI6IlVua25vd24iLCIkd2lmaSI6ZmFsc2UsIiRtYW51ZmFjdHVyZXIiOiJCQksiLCJGcm9tSG9tZXBhZ2VVcGRhdGVEYXRlIjoyLCIkc2NyZWVuX2hlaWdodCI6MTI4MCwiSG9tZXBhZ2VVcGRhdGVEYXRlIjoyLCJQcm9wZXJ0eUV2ZW50IjoiUmVhZEhvbWVQYWdlIiwiRmluZFRhYk5hbWUiOiLmjqjojZAiLCJhYnRlc3RfZ3JvdXAiOjg5LCIkc2NyZWVuX3dpZHRoIjo3MjAsIiRvcyI6IkFuZHJvaWQiLCJUcmlnZ2VyUGFnZSI6IkhvbWVQYWdlIiwiJGNhcnJpZXIiOiJDaGluYSBNb2JpbGUiLCIkbW9kZWwiOiJ2aXZvIFgxU3QiLCIkYXBwX3ZlcnNpb24iOiIzLjguMSJ9LCJ0eXBlIjoidHJhY2siLCJkaXN0aW5jdF9pZCI6IkE6MTExMTExMTExMTExMDAwMCIsIm9yaWdpbmFsX2lkIjoiQToxMTExMTExMTExMTEwMDAwIiwiZXZlbnQiOiJSZWFkSG9tZVBhZ2UifQ%3D%3D";

        OkHttpClient mOkHttpClient = new OkHttpClient();

        //创建Request对象
        Request request = new Request.Builder().url(url).build();
        //得到Call
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                final String string = response.body().string();
                Message message = handler.obtainMessage(0, string);
                message.sendToTarget();
               /* runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                      Toast.makeText(MainActivity.this, "string:" + string.toString(), Toast.LENGTH_SHORT).show();
                    }
                });*/

            }
        });
    }


    public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

        private int space;


        public SpacesItemDecoration(int space) {
            this.space = (int) (space + Math.random() * 100);
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            outRect.left = 0;
            outRect.right = 0;
            outRect.bottom = space;
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top = (int) (space + Math.random() * 100);
            }
        }
    }
}

