package com.irpan.gui;

public class KTM {
    private String NAMA;
    private String NIM;
    private String PRODI;
    private String FAKULTAS;
    private String BERLAKU;

    public KTM() {
    }

    public KTM(String NAMA, String NIM, String PRODI, String FAKULTAS, String BERLAKU) {
        this.NAMA = NAMA;
        this.NIM = NIM;
        this.PRODI = PRODI;
        this.FAKULTAS = FAKULTAS;
        this.BERLAKU = BERLAKU;
    }

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getPRODI() {
        return PRODI;
    }

    public void setPRODI(String PRODI) {
        this.PRODI = PRODI;
    }

    public String getFAKULTAS() {
        return FAKULTAS;
    }

    public void setFAKULTAS(String FAKULTAS) {
        this.FAKULTAS = FAKULTAS;
    }

    public String getBERLAKU() {
        return BERLAKU;
    }

    public void setBERLAKU(String BERLAKU) {
        this.BERLAKU = BERLAKU;
    }

    @Override
    public String toString() {
        return "KTM {" +
                "NAMA ='" + NAMA + '\'' +
                ", NIM ='" + NIM + '\'' +
                ", PRODI ='" + PRODI + '\'' +
                ", FAKULTAS ='" + FAKULTAS + '\'' +
                ", BERLAKU ='" + BERLAKU + '\'' +
                '}';
    }
}
