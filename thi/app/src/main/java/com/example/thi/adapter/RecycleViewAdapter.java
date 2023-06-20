//package com.example.thi.adapter;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.thi.R;
//import com.example.thi.mode.Item;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.HomeViewHolde>{
//
//    private List<Item> list;
//    private ItemListener itemListener;
//    public RecycleViewAdapter() {
//        list = new ArrayList<>();
//    }
//
//    public void setItemListener(ItemListener itemListener) {
//        this.itemListener = itemListener;
//    }
//
//    public void setList(List<Item> list) {
//        this.list = list;
//        notifyDataSetChanged();
//    }
//    public Item getItem(int position){
//        return list.get(position);
//    }
//
//    @NonNull
//    @Override
//    public HomeViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
//        //inflate(R.layout.item,parent,attachToRoot= false)
//        return new HomeViewHolde(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull HomeViewHolde holder, int position) {
//        Item item= list.get(position);
//        holder.title.setText(item.getTitle());
//        holder.category.setText(item.getCategory());
//        holder.date.setText(item.getDate());
//        holder.price.setText(item.getPrice());
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    public class HomeViewHolde extends RecyclerView.ViewHolder implements View.OnClickListener{
//        private TextView title,category,price,date;
//        public HomeViewHolde(@NonNull View itemView) {
//            super(view);
//            title= view.findViewById(R.id.tvTitle);
//            category= view.findViewById(R.id.tvCategory);
//            price=view.findViewById(R.id.tvPrice);
//            date=view.findViewById(R.id.tvDate);
//            View.setOnClickListener(this);
//        }
//
//        @Override
//        public void onClick(View view) {
//            if(itemListener!=null){
//                itemListener.onItemClick(view.getAdapterPosition());
//            }
//        }
//    }
//    public interface ItemListener{
//        void onItemClick(View view,int position);
//    }
//
//}
