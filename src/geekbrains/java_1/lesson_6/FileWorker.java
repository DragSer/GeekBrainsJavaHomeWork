package geekbrains.java_1.lesson_6;
import java.io.*;

/**
 *---------------------------------------------
 * Библиотечка для работы с текстовыми файлами
 *---------------------------------------------
 */
public class FileWorker {

    // Создаем файл "file_name"
    // и заполненяем его символами "text" "num_text" раз
    public static void write(String file_name, String text, int num_text) {
        File file = new File(file_name);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                for (int i=0; i<num_text; i++){
                out.print(text);
                }
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Поиск слова "search_text"
    public static void find_text(String file, String search_text) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(new File(file));
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();
        String[] lines = new String(content, "UTF-8").split("\n");
        int i = 1;
        for (String line : lines) {
            String[] words = line.split(" ");
            int j = 1;
            for (String word : words) {
                if (word.equalsIgnoreCase(search_text)) {
                    System.out.println("Текст '" + search_text + "' найден в " + i + "-й строке, " + j + "-е слово");
                }
                j++;
            }
            i++;
        }
    }
}