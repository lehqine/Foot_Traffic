package com.example.foot_traffic.adapter2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foot_traffic.R;
import com.example.foot_traffic.ShoeDetail;
import com.example.foot_traffic.model.CategoryItem;

import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {
        holder.itemImage.setImageResource(categoryItemList.get(position).getImageurl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, ShoeDetail.class);
                i.putExtra("Price",categoryItemList.get(position).getPrice());
                i.putExtra("ShoeID",categoryItemList.get(position).getItemld());
                i.putExtra("Name",categoryItemList.get(position).getName());
                i.putExtra("Image",categoryItemList.get(position).getImageurl());
                i.putExtra("Description",categoryItemList.get(position).getDescription());
                i.putExtra("Category",categoryItemList.get(position).getCategory());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends  RecyclerView.ViewHolder{
        ImageView itemImage;

        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
        }
    }
}
