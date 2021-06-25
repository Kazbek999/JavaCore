package LessonJC3;


import java.util.Arrays;

public class Switch {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        change(arr,1,3);
        System.out.println(Arrays.toString(arr));

    }
    private static <T> void change(T[] arr, int n1, int n2) {
        T t = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = t;
    }
}
