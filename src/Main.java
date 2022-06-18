import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        createDirectory("E:/Games/src");
        createDirectory("E:/Games/res");
        createDirectory("E:/Games/savegames");
        createDirectory("E:/Games/temp");

        createDirectory("E:/Games/src/main");
        createDirectory("E:/Games/src/test");

        createFile("E:/Games/src/main/Main.java");
        createFile("E:/Games/src/main/Utils.java");

        createDirectory("E:/Games/res/drawables");
        createDirectory("E:/Games/res/vectors");
        createDirectory("E:/Games/res/icons");

        createFile("E:/Games/temp/temp.txt");

        try (FileWriter fileWriter = new FileWriter("E:/Games/temp/temp.txt")) {
            fileWriter.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDirectory(String path) {
        File directory = new File(path);
        if (directory.mkdir())
            result.append("Успешное создание каталога по пути: " + path + " Дата и время: " + LocalDateTime.now() + "\n");
        else
            result.append("Ошибка при создании каталога по пути " + path + " Дата и время: " + LocalDateTime.now() + "\n");
    }

    public static void createFile(String path) {
        File file = new File(path);
        try {
            if (file.createNewFile())
                result.append("Успешное создание файла по пути: " + path + " Дата и время: " + LocalDateTime.now() + "\n");
            else
                result.append("Ошибка при создании файла по пути " + path + " Дата и время: " + LocalDateTime.now() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
