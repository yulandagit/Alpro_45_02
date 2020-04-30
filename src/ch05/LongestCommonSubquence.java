package ch05;

public class LongestCommonSubquence {

    public static void main(String args[]) {

        String siswa = "yola";
        String mahasiswa= "yulanda";

        // Contoh perbandingan String dengan equals
        if (siswa.equals(mahasiswa)) {
            System.out.println("siswa dan mahasiswa mengandung makna sama by equals method of String");
        }

        // Contoh perbandingan String dengan compareTo
        if (siswa.compareTo(mahasiswa) == 0) {
            System.out.println("baikk siswa dan mahasiswa sama-sama menggunakan compareTo method of String");
        }

        mahasiswa = "yulanda";

        // Contoh perbandingan String dengan equalsIgnoreCase
        if (siswa.equalsIgnoreCase(mahasiswa)) {
            System.out.println("siswa dan mahasiswa adalah sama by equalsIgnoreCase method of String");
        }

        // Contoh perbandingan String dengan compareToIgnoreCase
        if (siswa.compareToIgnoreCase(mahasiswa) == 0) {
            System.out.println("siswa dan mahasiswa sama artinya yaitu pelajar by compareToIgnoreCase of String");
        }

        String sony = "dosen";
        String samsung = "guru";

        // Contoh perbandingan String dengan compareTo
        if (sony.compareTo(samsung) > 0) {
            System.out.println("dosen profesi lebih tinggi dari guru");
        } else if (sony.compareTo(samsung) < 0) {
            System.out.println("dosen profesi lebih rendah dari guru");
        }
    }

}