package Nan_code_leap_year;

import java.util.Scanner;

public class TahunKabisatTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year;

        // meminta tahun untuk user
        System.out.println("Input a year: ");
        year = scan.nextInt();
        scan.close();

        // apakah tahun adalah tahun kabisat
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Is a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " Is a leap year");
        } else {
            System.out.println(year + " Is not a leap year");
        }
    }
}
