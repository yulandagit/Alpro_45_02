package ch05;
public class LongestIncreasingSubquence {

    public static void main(String[] args) {
           int A = 10;
    int B [] = {5,2,9,7,1,6,8,3,10,4};
    int BatasAtas, BatasTengah, Bawah;
    int search = 9;
    BatasAtas = 0;
    BatasTengah = A - 1;
    Bawah = 0;
    boolean ditemukan;
    ditemukan = false;
   
    while((BatasAtas <= BatasTengah) && (ditemukan == false)){
       
        Bawah = (BatasAtas + BatasTengah) / 2;
        if (B[Bawah] == search){
            ditemukan = true;
        } else
            if (B[Bawah] <= search){
            BatasAtas = Bawah + 1;
        } else {
            BatasTengah = Bawah - 1;
        }
        }
    if (ditemukan) {
        System.out.println ("Angka : "+ search + "Data berada di urutan nomor " + Bawah);
    } else {
        System.out.println ("Angka :" + search + "Data tidak ketemu");
    }
    }
}