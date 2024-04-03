import java.util.Scanner;

public class Main {
    public static String quyDoiDiem(double x, boolean y) {
        if (x < 0 || x > 10) {
            return "Input khong hop le";
        }
        if (y) {
            x = 10;
        }
        if (x >= 8.5) {
            return "Sinh vien qua mon voi diem A";
        } else if (x >= 7.0) {
            return "Sinh vien qua mon voi diem B";
        } else if (x >= 5.5) {
            return "Sinh vien qua mon voi diem C";
        } else if (x >= 4.0) {
            return "Sinh vien qua mon voi diem D";
        } else {
            return "Sinh vien truot mon voi diem F";
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap so diem can chuyen doi: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.println("Sinh vien co thi ICPC khong: ");
        boolean y = sc.nextBoolean();

        System.out.println(quyDoiDiem(x, y));

    }
}
