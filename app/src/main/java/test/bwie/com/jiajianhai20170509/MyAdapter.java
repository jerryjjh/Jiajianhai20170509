package test.bwie.com.jiajianhai20170509;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import test.bwie.com.jiajianhai20170509.bean.ComicsBean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/9
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<ComicsBean> news;

    public MyAdapter(Context context, ArrayList<ComicsBean> news) {
        this.context = context;
        this.news = news;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = View.inflate(context, R.layout.item, null);
        MyViewHolder mViewHolder = new MyViewHolder(view);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("iii", news.get(position).getCover_image_url());
        Glide.with(context).load(news.get(position).getCover_image_url()).into(holder.iv);
        Log.i("iii", news.get(position).getCover_image_url());
        holder.tv1.setText(news.get(position).getLabel_text());
        holder.tv2.setText(news.get(position).getTitle());
        Log.i("iii", news.get(position).getTitle());


    }


    @Override
    public int getItemCount() {
        Log.d("ppp", news.size() + "");
        return news.size();

    }

    public interface OnItemClickLitener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    private OnItemClickLitener mOnItemClickLitener;
    private AdapterView.OnItemLongClickListener monItemLongClick;

    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv;
        private final TextView tv1;
        private final TextView tv2;


        public MyViewHolder(View itemView) {
            super(itemView);

            iv = (ImageView) itemView.findViewById(R.id.image_item);
            tv1 = (TextView) itemView.findViewById(R.id.title);
            tv2 = (TextView) itemView.findViewById(R.id.content);

        }
    }


}
