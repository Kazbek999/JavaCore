package LessonJC2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"4", "4", "4", "4"},
                {"чвчв", "2", "1", "1"},
                {"1", "2", "2", "3"},
                {"1", "1", "2", "1"}};

        try {
            int result = massive(arr);
            System.out.println(result);
        } catch (MyArraySizeException ex) {
            System.out.println("Размер массива меньше");
        } catch (MyArrayDataException ex) {
            System.out.println("Неправильные данные");
            System.out.println("Ошибка в ячейке: " + ex.i + "x" + ex.j);
        }
    }

    public static int massive(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
