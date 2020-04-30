package ch05;

import java.util.Scanner;

public class Eucledian {

public static void main(String[] args) {

int r, s, t;

Scanner dataInput = new Scanner(System.in);

System.out.print("Masukkan nila r : ");
r = dataInput.nextInt();
System.out.print("Masukkan nila s : ");
s = dataInput.nextInt();
System.out.println();

t = s % r;

while (t != 0) {
r = s;
s = t;
t = r % s;
}
System.out.println("FPB = "+s);
}
}