import java.io.*;

public class Example5_1 {
    public static void main(String[] args) {
        try {
            // Создание файла в текущей папке (где расположен файл KlassFile1.java)
            File f1=new File("MyFile1.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.println("Создан!");
                System.out.println("Полный путь1:  "+f1.getAbsolutePath());
            }
            // Создание файла на диске c и вывод полного пути
            File f2=new File("C:\\Users\\karte\\IdeaProjects\\Lab5\\example1\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь2:  "+f2.getAbsolutePath());
            // Создание нескольких вложенных папок
            File f3=new File("C:\\Users\\karte\\IdeaProjects\\Lab5\\example1\\Papka1\\Papka2");
            f3.mkdirs();
            System.out.println("Полный путь3:  "+f3.getAbsolutePath());
        } catch (Exception e){
            System.out.println("Ошибка!  "+e);
        }
    }
}