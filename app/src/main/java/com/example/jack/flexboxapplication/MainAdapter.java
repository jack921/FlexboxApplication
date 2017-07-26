package com.example.jack.flexboxapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/18.
 */

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;
    private String[] param=new String[]{
            "影视天堂","教育","综艺咖","男人装","互联网","谈写作",
            "诗","大学生活","艺术.文化","社会热点","美人说","奇思妙想"
    };

    private Integer[] paramColor=new Integer[]{
            R.color.color1,R.color.color2,R.color.color3,R.color.color4,R.color.color5,
            R.color.color1,R.color.color2,R.color.color3,R.color.color4,R.color.color5,
            R.color.color1,R.color.color2
    };

    public MainAdapter(Context context){
        this.context=context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewItem(LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewItem viewItem=(ViewItem)holder;
        viewItem.name.setText(param[position]);
        viewItem.itemView.setBackgroundColor(context.getResources().getColor(paramColor[position]));
    }

    @Override
    public int getItemCount() {
        return param.length;
    }

    class ViewItem extends RecyclerView.ViewHolder{
        public TextView name;
        public ViewItem(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.item_name);
        }
    }


}
