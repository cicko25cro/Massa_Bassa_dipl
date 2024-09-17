package com.example.massa_bassa_dipl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterSpeaker extends RecyclerView.Adapter<AdapterSpeaker.ViewHolder> {

    private List<SubsSpeakersClass> subsSpeakersClassList2;

    public AdapterSpeaker(List<SubsSpeakersClass> subsSpeakersClassList) {
        this.subsSpeakersClassList2 = subsSpeakersClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SubsSpeakersClass subsSpeakersClass = subsSpeakersClassList2.get(position);
        holder.imageView.setImageResource(subsSpeakersClass.getImageResource());
        holder.nameTextView.setText(subsSpeakersClass.getName());
        holder.sizeTextView.setText(subsSpeakersClass.getSize());
        holder.wrmsTextView.setText(subsSpeakersClass.getWattsWithRMS());
        holder.ohmTextView.setText(subsSpeakersClass.getOhm());
        holder.priceTextView.setText(subsSpeakersClass.getPriceWithCurrency());
        holder.descriptionTextView.setText(subsSpeakersClass.getDescription());
        holder.ratingBar.setRating(subsSpeakersClass.getRating());

        // Show separator for position 2
        if (position == 0) {
            holder.separator.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setText("4 Inch");
        } else if (position == 2) {
            holder.separator.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setText("5 Inch");
        }
        else if (position == 4) {
            holder.separator.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setText("6.5 Inch");
        }
        else if (position == 6) {
            holder.separator.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setText("8 Inch");
        }
        else if (position == 8) {
            holder.separator.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setText("10 Inch");
        }
        else {
            holder.separator.setVisibility(View.GONE);
            holder.hiddendescriptionTextView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return subsSpeakersClassList2.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView sizeTextView;
        TextView wrmsTextView;
        TextView ohmTextView;
        TextView priceTextView;
        TextView descriptionTextView;
        RatingBar ratingBar;
        View separator;
        TextView hiddendescriptionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            sizeTextView = itemView.findViewById(R.id.sizeTextView);
            wrmsTextView = itemView.findViewById(R.id.wrmsTextView);
            ohmTextView = itemView.findViewById(R.id.ohmTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            separator = itemView.findViewById(R.id.separator);
            hiddendescriptionTextView = itemView.findViewById(R.id.hiddendescriptionTextView);
        }
    }
}
