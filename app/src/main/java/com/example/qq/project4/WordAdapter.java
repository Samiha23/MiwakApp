package com.example.qq.project4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by qq on 11/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    Context context;

    public WordAdapter (Context context, ArrayList<Word> words)
    {
        super(context,R.layout.list_item,words);
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView =convertView;
        if(listView == null)
        {
            LayoutInflater inflater= LayoutInflater.from(context);
            listView = inflater.inflate(R.layout.list_item,null);
        }

        TextView tv1=(TextView) listView.findViewById(R.id.miwaki_word);
        TextView tv2=(TextView) listView.findViewById(R.id.english_word);

        Word word=getItem(position);

        tv1.setText(word.getMiwkiWord());
        tv2.setText(word.getEnglishWord());


        return listView;
    }
}
