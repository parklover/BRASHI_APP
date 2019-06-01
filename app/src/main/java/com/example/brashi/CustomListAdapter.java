package com.example.brashi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Dzielo> {

    private ArrayList<Dzielo> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtNazwa;
        TextView txtOpis;
        TextView txtDateCreate;
        ImageView info;
    }

    public CustomListAdapter(ArrayList<Dzielo> data, Context context) {
        super(context, R.layout.list_row, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Dzielo dzielo = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_row, parent, false);
            viewHolder.txtNazwa = (TextView) convertView.findViewById(R.id.nazwa);
            viewHolder.txtOpis = (TextView) convertView.findViewById(R.id.opis);
            viewHolder.txtDateCreate = (TextView) convertView.findViewById(R.id.date_create);
            viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result = convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.txtNazwa.setText(dzielo.getNazwa());
        viewHolder.txtOpis.setText(dzielo.getOpis());
        viewHolder.txtDateCreate.setText(dzielo.getData_powstania().toString());
        // Return the completed view to render on screen
        return convertView;
    }
}