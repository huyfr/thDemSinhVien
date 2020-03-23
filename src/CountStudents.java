import java.util.Scanner;

public class CountStudents {

    static Scanner sc = new Scanner(System.in);

    public static int sizeArray() {
        int size = 0;
        try {
            do {
                System.out.print("Enter a size: ");
                size = sc.nextInt();
                if (size > 30) {
                    System.out.println("Size should not exceed 30");
                }
            } while (size > 30);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return size;
    }

    public static void addValues(int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                array[i] = sc.nextInt();
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static void display(int[] array, String type) {
        int count=0;
        try {
            if (type.equals("displayArray")) {
                System.out.println("\nList of mark:");
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Student " + (i + 1)+": "+ array[i]);
                }
            } else if (type.equals("displayMark")){
                count=countMark(array);
                System.out.print("\nThe number of students passing the exam is: "+count);
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static int countMark(int[] array) {
        int count = 0;
        try {
            for (int value : array) {
                if (value >= 5 && value <= 10) {
                    count++;
                }
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return count;
    }
}