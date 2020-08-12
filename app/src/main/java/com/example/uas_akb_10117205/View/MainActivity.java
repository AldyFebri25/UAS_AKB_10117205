package com.example.uas_akb_10117205.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import com.example.uas_akb_10117205.View.MapsFragment;
import com.example.uas_akb_10117205.Model.DatabaseHelper;
import com.example.uas_akb_10117205.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    DatabaseHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDB = new DatabaseHelper(this);
        myDB.deleteALL();
        myDB.addPariwisata("Farm House Susu Lembang","Taman hiburan dengan bangunan bergaya Eropa, kostum Belanda untuk disewa, kebun binatang mini & resto trendi.","08.00","20.00",35000,35000,"-6.832812","107.606167");
        myDB.addPariwisata("NuArt Sculpture Park","Taman seluas 3 hektar yg berisi galeri modern dengan patung karya Nyoman Nuarta, kafe & toko suvenir.","08.00","20.00",25000,50000,"-6.877239","107.572487");
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.homeFragment:
                        fragment = new HomeFragment();
                        break;
                    case R.id.mapsFragment:
                            fragment = new MapsFragment();
                        break;
                    case R.id.infoFragment:
                        fragment = new InfoFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
        if(savedInstanceState==null){
            bottomNavigationView.setSelectedItemId(R.id.homeFragment);
        }

    }
}