/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.support.android.designlibdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaDeFragmentos extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(
                R.layout.fragmentos_lista, container, false);
        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(getActivity(),
                // cantidad de elementos en las listas!!!
                getRandomSublist(ImagenesCase.Categorias, 15)));

        //Categorias

    }


    private List<String> getRandomSublist(String[] array, int amount) {

        //List<ToSort> sortList = new ArrayList<ToSort>(amount);
        ArrayList<String> list = new ArrayList<>(amount);
       Random random = new Random();

       // while (list.size() < amount) {
         //   list.add(array[random.nextInt(array.length)]);

        //}
        //
        //
        //list.add("Restaurantes");
        list.add("Presupuesto menor a 500lps");
        //list.add("Clubes Nocturnos");
        list.add("Presupuesto de 500lps a 700lps");
        //list.add("Parques");
        list.add("Presupuesto de 700lps a 1000lps");
        //list.add("Actividades Extremas");
        list.add("Presupuesto de 1000lps a 1500lps");
        //list.add("Museos");
        list.add("Presupuesto de 1500lps a 2000lps");
        //list.add("Teatros");
        list.add("Presupuesto de 2000lps a 2500lps");
        //list.add("Cines");
        list.add("Presupuesto de 2500lps a 3000lps");
        //list.add("Transporte");
        list.add("Presupuesto de 3000lps a 3500lps");

        list.add("Presupuesto de 3500lps a 4000lps");
        list.add("Presupuesto de 4500lps a 5000lps");
        list.add("Presupuesto de 5000lps a 5500lps");
        list.add("Presupuesto de 5500lps a 6000lps");
        list.add("Presupuesto de 6000lps a 6500lps");
        list.add("Presupuesto de 6500lps a 7000lps");




        return list;
    }

    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

        private final TypedValue mTypedValue = new TypedValue();
        private int mBackground;
        private List<String> mValues;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public String mBoundString;

            public final View mView;
            public final ImageView mImageView;

            public final TextView mTextView;

            public ViewHolder(View view) {
                super(view);
                mView = view;

                ///////

                mImageView = (ImageView) view.findViewById(R.id.avatar);
                mTextView = (TextView) view.findViewById(android.R.id.text1);

            }

            @Override
            public String toString() {
                return super.toString() + " '" + mTextView.getText();
            }
        }

        public String getValueAt(int position) {
            return mValues.get(position);
        }

        public SimpleStringRecyclerViewAdapter(Context context, List<String> items) {
            context.getTheme().resolveAttribute(R.attr.selectableItemBackground, mTypedValue, true);
            mBackground = mTypedValue.resourceId;
            mValues = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.lista_item, parent, false);
            view.setBackgroundResource(mBackground);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mBoundString = mValues.get(position);
            holder.mTextView.setText(mValues.get(position));

            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, ActividadDetalle.class);
                    intent.putExtra(ActividadDetalle.EXTRA_NAME, holder.mBoundString);

                    context.startActivity(intent);
                }
            });

            //Glide.with(holder.mImageView.getContext())
                    //.load(ImagenesCase.getRandomCheeseDrawable())
                    //.load(ImagenesCase.getRandomCheese())
                   // .fitCenter()
                   // .into(holder.mImageView);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }
    }
}
