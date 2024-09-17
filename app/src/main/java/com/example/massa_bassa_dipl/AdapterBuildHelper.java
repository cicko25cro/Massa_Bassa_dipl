package com.example.massa_bassa_dipl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterBuildHelper extends RecyclerView.Adapter<AdapterBuildHelper.ViewHolder> {

    private Context context;
    private List<Helper> helperList;

    public AdapterBuildHelper(Context context, List<Helper> helperList) {
        this.context = context;
        this.helperList = helperList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_helper, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Helper helper = helperList.get(position);
        holder.bind(helper);
    }

    @Override
    public int getItemCount() {
        return helperList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView helperNameTextView;
        private TextView helperDescriptionTextView;
        private ImageView helperImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            helperNameTextView = itemView.findViewById(R.id.helperNameTextView);
            helperDescriptionTextView = itemView.findViewById(R.id.helperDescriptionTextView);
            helperImageView = itemView.findViewById(R.id.helperImageView);
        }

        public void bind(Helper helper) {
            helperNameTextView.setText(helper.getTitle());
            helperDescriptionTextView.setText(helper.getDescription());
            // Učitaj sliku u ImageView korištenjem Glide biblioteke (ukoliko koristite)
            Glide.with(context).load(helper.getImageUrl()).into(helperImageView);
        }
    }
}
