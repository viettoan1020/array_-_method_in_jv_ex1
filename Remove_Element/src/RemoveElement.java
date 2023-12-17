import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6};
        System.out.println(" Mang truoc khi xoa: ");
        displayArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa : ");
        int elementToRemove = scanner.nextInt();

        boolean removed = removeElement(array, elementToRemove);

        if (removed) {
            System.out.println("Mang sau khi xoa: ");
            displayArray(array);
        }else {
            System.out.println("Element is not found in the array.");
        }
    }
    private static void displayArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static boolean removeElement(int[] array, int elementToRemove) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove ) {
                for (int j = 0; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
                return true;
            }
        }
        return false;
    }
}
