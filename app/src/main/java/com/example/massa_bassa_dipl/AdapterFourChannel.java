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

public class AdapterFourChannel extends RecyclerView.Adapter<AdapterFourChannel.ViewHolder> {

    private List<AmpsClass> ampsClassList;

    public AdapterFourChannel(List<AmpsClass> ampsClassList) {
        this.ampsClassList = ampsClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.amp_card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AmpsClass ampsClass = ampsClassList.get(position);
        holder.imageView.setImageResource(ampsClass.getImageResource());
        holder.nameTextView.setText(ampsClass.getName());
        holder.sizeTextView.setText(ampsClass.getSize());
        holder.amplifierTypeTextView.setText(ampsClass.getAmplifierType());
        holder.amplifierClassTextView.setText(ampsClass.getAmplifierClass());
        holder.signalToNoiseRatioTextView.setText(String.valueOf(ampsClass.getSignalToNoiseRatio()));
        holder.inputSensitivityTextView.setText(ampsClass.getInputSensitivity());
        holder.lowPassCrossoverTextView.setText(ampsClass.getLowPassCrossover());
        holder.highPassCrossoverTextView.setText(ampsClass.getHighPassCrossover());
        holder.fuseTextView.setText(String.valueOf(ampsClass.getFuse()));
        holder.operatingVoltageTextView.setText(ampsClass.getOperatingVoltage());
        holder.powerAt4OhmTextView.setText(String.valueOf(ampsClass.getPowerAt4Ohm()));
        holder.powerAt2OhmTextView.setText(String.valueOf(ampsClass.getPowerAt2Ohm()));
        holder.powerAt1OhmTextView.setText(String.valueOf(ampsClass.getPowerAt1Ohm()));
        holder.priceTextView.setText(ampsClass.getPriceWithCurrency());
        holder.descriptionTextView.setText(ampsClass.getDescription());
        holder.ratingBar.setRating(ampsClass.getRating());

        // Show separator for position 2
        if (position == 0) {
            holder.separator.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setVisibility(View.VISIBLE);
            holder.hiddendescriptionTextView.setText("4 Channel Amplifiers");
        }
        else {
            holder.separator.setVisibility(View.GONE);
            holder.hiddendescriptionTextView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return ampsClassList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView sizeTextView;
        TextView amplifierTypeTextView;
        TextView amplifierClassTextView;
        TextView signalToNoiseRatioTextView;
        TextView inputSensitivityTextView;
        TextView lowPassCrossoverTextView;
        TextView highPassCrossoverTextView;
        TextView fuseTextView;
        TextView operatingVoltageTextView;
        TextView powerAt4OhmTextView;
        TextView powerAt2OhmTextView;
        TextView powerAt1OhmTextView;
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
            amplifierTypeTextView = itemView.findViewById(R.id.amplifierTypeTextView);
            amplifierClassTextView = itemView.findViewById(R.id.amplifierClassTextView);
            signalToNoiseRatioTextView = itemView.findViewById(R.id.signalToNoiseRatioTextView);
            inputSensitivityTextView = itemView.findViewById(R.id.inputSensitivityTextView);
            lowPassCrossoverTextView = itemView.findViewById(R.id.lowPassCrossoverTextView);
            highPassCrossoverTextView = itemView.findViewById(R.id.highPassCrossoverTextView);
            fuseTextView = itemView.findViewById(R.id.fuseTextView);
            operatingVoltageTextView = itemView.findViewById(R.id.operatingVoltageTextView);
            powerAt4OhmTextView = itemView.findViewById(R.id.powerAt4OhmTextView);
            powerAt2OhmTextView = itemView.findViewById(R.id.powerAt2OhmTextView);
            powerAt1OhmTextView = itemView.findViewById(R.id.powerAt1OhmTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            separator = itemView.findViewById(R.id.separator);
            hiddendescriptionTextView = itemView.findViewById(R.id.hiddendescriptionTextView);
        }
    }
}
