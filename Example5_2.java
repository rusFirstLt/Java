import java.io.*;
import java.net.URL;

public class Example5_2 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException{
        while (true){
            int oneByte=in.read();
            if (oneByte!=-1){   // признак отсутствия конца файла
                System.out.print((char)oneByte);
            }else{
                System.out.println("\n"+"end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // С потоком связан файл
            InputStream inFile=new FileInputStream("C:\\Users\\karte\\IdeaProjects\\Lab5\\example2\\primer2.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();
            // С потоком связана интернет-страница
            InputStream inUrl=new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();
            // С потоком связан массив типа byte
            InputStream inArray=new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        }
        catch(IOException e) {
        System.out.println("Ошибка: "+e);
        }
    }
}
