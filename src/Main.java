public class Main {
    public static void main(String[] args) {
        int[] array=new int[CountStudents.sizeArray()];
        CountStudents.addValues(array);
        CountStudents.display(array, "displayArray");
        CountStudents.display(array, "displayMark");
    }
}