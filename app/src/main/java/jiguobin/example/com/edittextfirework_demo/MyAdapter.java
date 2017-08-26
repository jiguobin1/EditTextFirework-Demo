package jiguobin.example.com.edittextfirework_demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by acer-PC on 2017/8/25.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private final Context context;
    private List<String> num;
    public MyAdapter(Context context,List<String> num) {
        this.context = context;
        this.num=num;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==TYPE_HEADER){
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_header, parent, false));
        }
        return new NewViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_item, parent, false));

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return num.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        } else {
            return TYPE_ITEM;
        }
    }
}
class ViewHolder extends RecyclerView.ViewHolder{

    public TextView tv;
    public ViewHolder(View itemView) {
        super(itemView);
        tv=itemView.findViewById(R.id.tv);
    }
}
class NewViewHolder extends RecyclerView.ViewHolder{

    public NewViewHolder(View itemView) {
        super(itemView);
    }
}
