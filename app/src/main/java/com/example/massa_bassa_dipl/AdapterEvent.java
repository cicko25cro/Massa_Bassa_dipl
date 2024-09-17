package com.example.massa_bassa_dipl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterEvent extends RecyclerView.Adapter<AdapterEvent.EventViewHolder> {
    private List<Event> eventList;

    public AdapterEvent(List<Event> eventList) {
        this.eventList = eventList;
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView descriptionTextView;
        public TextView dateTimeTextView;
        public ImageView eventImageView;

        public EventViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            dateTimeTextView = itemView.findViewById(R.id.dateTimeTextView);
            eventImageView = itemView.findViewById(R.id.eventImageView);
        }
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = eventList.get(position);
        holder.titleTextView.setText(event.getTitle());
        holder.descriptionTextView.setText(event.getDescription());
        holder.dateTimeTextView.setText(String.format("%s, %s", event.getDate(), event.getTime()));

        // Set the image based on the event
        int imageResId = getImageResourceForEvent(event.getTitle());
        holder.eventImageView.setImageResource(imageResId);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    private int getImageResourceForEvent(String eventTitle) {
        // Logic to determine image resource based on event title
        switch (eventTitle) {
            case "1. Tuning Car Meet Zadar 2024":
                return R.drawable.zadar_meet;
            case "Style and Expo Rijeka 2024":
                return R.drawable.meet_rijeka;
            case "Poreč Auto Moto Show 2024":
                return R.drawable.meet_porec;
            case "Zagreb Season End":
                return R.drawable.meet_zagreb;
            default:
                return R.drawable.placeholder; // Fallback image
        }
    }
}
