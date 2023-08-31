import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        write("What is happening", "file.txt");
        System.out.print(read("file.txt"));
        System.out.print(countCharacters("file.txt"));
    }

    public static String read(String fileName) {
        try {
            String word = "";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (br.ready()) {
                word += (char) br.read();
            }
            br.close();
            return word;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void write(String str, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countCharacters(String fileName) {
        try {
            int count = 0;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (br.ready()) {
                br.read();
                count++;
            }
            br.close();
            return count;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}