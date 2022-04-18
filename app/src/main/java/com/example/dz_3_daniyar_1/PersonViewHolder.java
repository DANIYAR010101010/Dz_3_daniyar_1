package com.example.dz_3_daniyar_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    TextView num;
    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        num= itemView.findViewById(R.id.contact_1);
    }
    public void bind(String contactes ){
        num.setText(contactes);
    }
}
