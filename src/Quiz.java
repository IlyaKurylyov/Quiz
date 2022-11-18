import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException{

        File file = new File("filename.txt");
        if (!file.exists());
        file.createNewFile();
        FileWriter writer = new FileWriter(file,true);

Scanner scanner = new Scanner(System.in);
        System.out.println("Какая самая выоская гора в мире?");
        String answer_1 = scanner.nextLine();
        if (answer_1 == "Эверест"){
            System.out.println("Отлично!");
        }
        else {
            System.out.println("Error");
        }
        System.out.println("Третья планета от Солнца?");
        String answer_2 = scanner.nextLine();
        if (answer_2 == "Земля"){
            System.out.println("Отлично!");
        }
        else {
            System.out.println("Error");
        }
        System.out.println("Самое быстрое животное?");
        String answer_3 = scanner.nextLine();
        if (answer_3== "Гепард"){
            System.out.println("Отлично!");
        }
        else {
            System.out.println("Error");

            //Далее запись полученных ответов в Файл
            writer.write("Гора" + answer_1);
            writer.append("\n");
            writer.write("Планета" + answer_2);
            writer.append("\n");
            writer.write("Животное" + answer_3);
            writer.append("\n");
            writer.append("\n");
            writer.close();
        }
    }
}