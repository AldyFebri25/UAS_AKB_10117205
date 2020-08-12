package com.example.uas_akb_10117205.Presenter;

import com.example.uas_akb_10117205.HomeContract;
import com.example.uas_akb_10117205.MapContract;
import com.example.uas_akb_10117205.Model.DatabaseHelper;
import com.example.uas_akb_10117205.Model.Pariwisata;

import java.util.ArrayList;
import java.util.List;

public class MapsPresenter implements MapContract.Presenter {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    DatabaseHelper databaseHelper;
    private MapContract.View view;
    public MapsPresenter(MapContract.View view){
        this.view = view;
    }
    @Override
    public List<Pariwisata> getPariwisata(){
        databaseHelper = new DatabaseHelper(view.getContextView());
        databaseHelper.getAllPariwisata();
        List<Pariwisata> pariwisataList= new ArrayList<Pariwisata>();
        return pariwisataList;
    }
}
