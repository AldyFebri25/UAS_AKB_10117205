package com.example.uas_akb_10117205.Presenter;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.provider.ContactsContract;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

import com.example.uas_akb_10117205.HomeContract;
import com.example.uas_akb_10117205.Model.DatabaseHelper;
import com.example.uas_akb_10117205.Model.Pariwisata;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HomePresenter implements HomeContract.Presenter {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    DatabaseHelper databaseHelper;
    private HomeContract.View view;
    FusedLocationProviderClient fusedLocationProviderClient;

    public HomePresenter(HomeContract.View view){
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
