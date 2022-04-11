package com.example.shop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shop.R;
import com.example.shop.model.Loaisp;

import java.util.List;

public class LoaiSpAdapter extends BaseAdapter {

    List<Loaisp> array;
    Context context;

    public LoaiSpAdapter(Context context,List<Loaisp> array) {
        this.array = array;
        this.context = context;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class Viewholder{
        TextView product_name;
        ImageView images;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Viewholder viewholder = null;
        if(view == null){
            viewholder = new Viewholder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item_product,null);  //chuyển đổi xml thành view
            viewholder.product_name = view.findViewById(R.id.item_tensp);
            viewholder.images = view.findViewById(R.id.item_image);
            view.setTag(viewholder);
        }else{
            viewholder = (Viewholder) view.getTag();
            viewholder.product_name.setTag(array.get(i).getProduct_name());
            Glide.with(context).load(array.get(i).getImages()).into(viewholder.images);
        }
        return view;
    }
}
