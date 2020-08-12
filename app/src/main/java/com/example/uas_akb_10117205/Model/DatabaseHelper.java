package com.example.uas_akb_10117205.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.uas_akb_10117205.Model.Pariwisata;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    /*NIM:10117205
      Nama:Aldy Febriansyah
      Kelas:IF7*/
    public static final String DATABASE_NAME="Wonderfulba.db";
    public static final String TABLE_NAME1="pariwisata";
    public static final String TABLE_NAME2="pariwisata_image";
    public static final String COL_1="id";
    public static final String COL_2="nama";
    public static final String COL_3="deskripsi";
    public static final String COL_4="jam_buka";
    public static final String COL_5="jam_tutup";
    public static final String COL_6="harga_awal";
    public static final String COL_7="harga_akhir";
    public static final String COL_8="lang";
    public static final String COL_9="long";
    public static final String COL_1_1="id";
    public static final String COL_1_2="nama_foto";
    public static final String COL_1_3="id_pariwisata";
    private SQLiteDatabase db;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 2);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME1+" " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, deskripsi TEXT," +
                " jam_buka TEXT, jam_tutup TEXT, harga_awal INTEGER, harga_akhir INTEGER," +
                " lang TEXT, long TEXT)");
        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME2+" " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, id_pariwisata INTEGER)") ;


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(sqLiteDatabase);
    }
    public void deleteALL(){
        db.execSQL("delete from "+ TABLE_NAME1);
    }
    public long addPariwisata(String nama, String desk, String buka, String tutup, int awal, int akhir,
    String langti, String longti){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,nama);
        contentValues.put(COL_3,desk);
        contentValues.put(COL_4,buka);
        contentValues.put(COL_5,tutup);
        contentValues.put(COL_6,awal);
        contentValues.put(COL_7,akhir);
        contentValues.put(COL_8,langti);
        contentValues.put(COL_9,longti);
        long insert = sqLiteDatabase.insert(TABLE_NAME1,null,contentValues);
        return insert;
    }
    public List<Pariwisata> getAllPariwisata(){
        List<Pariwisata> pariwisataList= new ArrayList<Pariwisata>();
        String selectQuery = "SELECT * FROM " + TABLE_NAME1;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c =db.rawQuery(selectQuery,null);
        if(c.moveToFirst()){
            do{
                Pariwisata pariwisata = new Pariwisata(
                        c.getInt(c.getColumnIndex(COL_1)),
                        c.getString(c.getColumnIndex(COL_2)),
                        c.getString(c.getColumnIndex(COL_3)),
                        c.getString(c.getColumnIndex(COL_4)),
                        c.getString(c.getColumnIndex(COL_5)),
                        c.getInt(c.getColumnIndex(COL_6)),
                        c.getInt(c.getColumnIndex(COL_7)),
                        c.getString(c.getColumnIndex(COL_8)),
                        c.getString(c.getColumnIndex(COL_9)));
                pariwisataList.add(pariwisata);
            }while(c.moveToNext());
        }
        c.close();
        return pariwisataList;
    }
}
