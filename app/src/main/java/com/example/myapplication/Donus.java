package com.example.myapplication;

import java.io.Serializable;

public class Donus implements Serializable {
    private int anhSP,btn_Cong;
    private String tenSP,chiTietSP;
    private double giaSP;

    public int getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(int anhSP) {
        this.anhSP = anhSP;
    }

    public int getBtn_Cong() {
        return btn_Cong;
    }

    public void setBtn_Cong(int btn_Cong) {
        this.btn_Cong = btn_Cong;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(String chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public Donus(int anhSP, int btn_Cong, String tenSP, String chiTietSP, double giaSP) {
        this.anhSP = anhSP;
        this.btn_Cong = btn_Cong;
        this.tenSP = tenSP;
        this.chiTietSP = chiTietSP;
        this.giaSP = giaSP;
    }
}
