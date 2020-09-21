import java.io.*;
import java.util.Scanner;

public class Exercise_5_2_var10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = "variant10.txt";
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            System.out.print("Введите строку для записи в файл => ");
            String s = sc.nextLine();
            dOut.writeUTF(s);
            dOut.flush();
            dOut.close();
            fname = "result.txt";
            File f2 = new File(fname);
            f2.createNewFile();
        }catch (IOException e) {
            System.out.println("End of file");
        }
        try{
            File f2 = new File("result.txt");
            f2.createNewFile();
            FileInputStream dIn = new FileInputStream("C:\\Users\\karte\\IdeaProjects\\lab5\\exercise2\\variant10.txt");
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f2));
            int i = -1;
            while ((i = dIn.read()) != -1) {
                if(i!=32){
                    dOut.write((char)i);
                }else{
                    dOut.write('\n');
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


