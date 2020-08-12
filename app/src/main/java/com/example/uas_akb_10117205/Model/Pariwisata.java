package com.example.uas_akb_10117205.Model;

public class Pariwisata {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    private int id;
    private String nama;
    private String desk;
    private String buka;
    private String tutup;
    private int awal;
    private int akhir;
    private String langti;

    public Pariwisata(int id, String nama, String desk, String buka, String tutup, int awal, int akhir, String langti, String longti) {
        this.id = id;
        this.nama = nama;
        this.desk = desk;
        this.buka = buka;
        this.tutup = tutup;
        this.awal = awal;
        this.akhir = akhir;
        this.langti = langti;
        this.longti = longti;
    }

    private String longti;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getBuka() {
        return buka;
    }

    public void setBuka(String buka) {
        this.buka = buka;
    }

    public String getTutup() {
        return tutup;
    }

    public void setTutup(String tutup) {
        this.tutup = tutup;
    }

    public int getAwal() {
        return awal;
    }

    public void setAwal(int awal) {
        this.awal = awal;
    }

    public int getAkhir() {
        return akhir;
    }

    public void setAkhir(int akhir) {
        this.akhir = akhir;
    }

    public String getLangti() {
        return langti;
    }

    public void setLangti(String langti) {
        this.langti = langti;
    }

    public String getLongti() {
        return longti;
    }

    public void setLongti(String longti) {
        this.longti = longti;
    }
}
