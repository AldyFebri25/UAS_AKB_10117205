package com.example.uas_akb_10117205;

import android.app.Activity;
import android.content.Context;

import com.example.uas_akb_10117205.Model.Pariwisata;

import java.util.List;

public interface HomeContract {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    interface View{
        Activity getContextView();
    }
    interface Presenter{
        List<Pariwisata> getPariwisata();

    }
}
