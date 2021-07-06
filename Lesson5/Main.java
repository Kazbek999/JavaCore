package LessonJC5;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./info.csv");

        List<String> stringList = new ArrayList<>();
        stringList.add("Point 1; Point 2; Point 3");
        stringList.add("111; 222; 333");
        stringList.add("444; 555; 666");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String e : stringList) {
                writer.write(e);
                writer.newLine();
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String e;
                while ((e = reader.readLine()) != null) {
                    System.out.println(e);
                }
            }


            System.out.println(getAppData(stringList));
        }
    }
    public static AppData getAppData (List<String> stringList) {
        String headersString = stringList.get(0);
        String[] headers = headersString.split(";");
        int[][] data = new int[headers.length][stringList.size() - 1];
        List<String[]> listOfArrays = new ArrayList<>(stringList.size() - 1);
        for (int i = 1; i < stringList.size(); i++) {
            String s = stringList.get(i).trim();
            String[] values = s.split(";");
            listOfArrays.add(values);
        }
        for (int i = 0; i < listOfArrays.size(); i++) {
            String[] values = listOfArrays.get(i);
            for (int j = 0; j < values.length; j++) {
                data[j][i] = Integer.parseInt(values[j].trim());
            }
        }
        return new AppData(headers, data);
    }
}
