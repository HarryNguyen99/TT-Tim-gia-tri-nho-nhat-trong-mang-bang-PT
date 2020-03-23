import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMangBangPT {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > min) {
                min = array[j];
            }
        }
        return (min);
    }

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.print("Kích thước không được vượt quá 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Các phần tử trong mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("Giá trị lớn nhất trong danh sách là " + minValue(arr));
    }
}
