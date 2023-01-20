import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileH {
    public static void main(String[] args) {
        //create a file
        try {
            File f = new File("file.txt");
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e);
        }
        //write to a file
        try{
            FileOutputStream fout = new FileOutputStream("file.txt");
            String s = "Hello World";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
        //read from a file
        try{
            FileInputStream fin = new FileInputStream("file.txt");
            int i = 0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            System.out.println();
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
