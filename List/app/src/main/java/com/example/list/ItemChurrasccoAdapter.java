package com.example.list;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemChurrasccoAdapter extends ArrayAdapter<ItemChurrasco> {
    Context mContext;
    int mResource;
    public ItemChurrasccoAdapter(@NonNull Context context, int resource, @NonNull List<ItemChurrasco> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView txtNome = convertView.findViewById(R.id.nome);
        TextView txtId = convertView.findViewById(R.id.id);
        ImageView imagem = convertView.findViewById(R.id.imageView);

        txtNome.setText(getItem(position).nome);
        txtId.setText(String.valueOf(getItem(position).id));
        imagem.setImageResource(getItem(position).imagem);

        return convertView;
    }
}
