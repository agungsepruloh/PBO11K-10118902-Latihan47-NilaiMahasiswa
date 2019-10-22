package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung nilai mahasiswa
 *
 */

public class NilaiMahasiswa {

    private double nilaiQuiz, nilaiUts, nilaiUas;

    public double getNilaiQuiz() {
        return nilaiQuiz;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiQuiz(double nilaiQuiz) {
        this.nilaiQuiz = nilaiQuiz;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double nilaiHasil(double quiz, double uts, double uas) {
        double hasil = (quiz * 20 / 100) + (uts * 30 / 100) + (uas * 50 / 100);
        return hasil;
    }

    public void showIndex(double nilaiAkhir) {
        String index = nilaiAkhir >= 80 ? "A":
                        nilaiAkhir >= 68 ? "B" :
                        nilaiAkhir >= 56 ? "C" :
                        nilaiAkhir >= 45 ? "D" : "E";

        String keterangan;
        switch (index) {
            case "B":
                keterangan = "Baik";
                break;
            case "C":
                keterangan = "Cukup";
                break;
            case "D":
                keterangan = "Kurang";
                break;
            case "E":
                keterangan = "Sangat Kurang";
                break;
            default:
                keterangan = "Sangat Baik";
        }

        System.out.println("\nIndex\t\t= ".concat(index));
        System.out.println("Keterangan\t= ".concat(keterangan));
    }

    public static void main(String[] args) {
        NilaiMahasiswa nilaiMahasiswa = new NilaiMahasiswa();
        nilaiMahasiswa.setNilaiQuiz(60);
        nilaiMahasiswa.setNilaiUts(80);
        nilaiMahasiswa.setNilaiUas(75);
        double nilaiQuiz = nilaiMahasiswa.getNilaiQuiz();
        double nilaiUts = nilaiMahasiswa.getNilaiUts();
        double nilaiUas = nilaiMahasiswa.getNilaiUas();
        double nilaiHasil = nilaiMahasiswa.nilaiHasil(nilaiQuiz, nilaiUts, nilaiUas);

        System.out.println("Quiz\t\t= " + nilaiQuiz);
        System.out.println("UTS\t\t\t= " + nilaiUts);
        System.out.println("UAS\t\t\t= " + nilaiUas);
        System.out.println("Nilai Akhir = " + nilaiHasil);
        nilaiMahasiswa.showIndex(nilaiHasil);
    }
}
