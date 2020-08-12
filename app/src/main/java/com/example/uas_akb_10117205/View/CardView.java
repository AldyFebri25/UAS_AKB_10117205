package com.example.uas_akb_10117205.View;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.uas_akb_10117205.Model.Pariwisata;
import com.example.uas_akb_10117205.R;

import java.util.List;

public class CardView extends PagerAdapter {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    private List<Pariwisata> pariwisataList;
    private LayoutInflater layoutInflater;
    private Context context;

    public CardView(List<Pariwisata> pariwisataList,Context context){
        this.pariwisataList = pariwisataList;
        this.context = context;
    }
    @Override
    public int getCount() {
        return pariwisataList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_view,container,false);
        TextView textView1,textView2,textView3,desc;
        ImageView imageView;
        imageView = view.findViewById(R.id.imageView);
        textView1 = view.findViewById(R.id.title);
        textView2 = view.findViewById(R.id.jam);
        textView3 = view.findViewById(R.id.harga);
        desc = view.findViewById(R.id.desc);
        textView1.setText(pariwisataList.get(position).getNama());
        textView2.setText("Buka  :"+pariwisataList.get(position).getBuka()+" - "+pariwisataList.get(position).getTutup());
        textView3.setText("Harga : Rp."+pariwisataList.get(position).getAwal()+" - "+"Rp."+pariwisataList.get(position).getAkhir());
        desc.setText(pariwisataList.get(position).getDesk());
        container.addView(view,0);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object){
        container.removeView((View)object);
    }
}
