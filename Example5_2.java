import java.io.*;
import java.net.URL;

public class Example5_2 {
    public static void readAllByByte(InputStream in) throws IOException{
        while (true){
            int oneByte=in.read();
            if (oneByte!=-1){
                System.out.print((char)oneByte);
            }else{
                System.out.println("\n"+"end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile=new FileInputStream("C:\\Users\\User\\Desktop\\Универ\\Алгоритмизация\\Java\\2 курс\\СРС\\Байтовые потоки\\Примеры\\5.2\\Пример2.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inUrl=new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

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
