package p1;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\test\\Text.txt");
            file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.getParent());
            if (file.exists()){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

            if (file.canRead()){
                System.out.println("I can read");
            }
            if (file.canWrite()){
                System.out.println("I can write");
            }
            if (file.canExecute()){
                System.out.println("I can execute");
            }
            String newName = file.getParent() + "\\Text4.txt";
            System.out.println(newName);
            File newFile = new File(newName);
            if (file.renameTo(newFile)){
                System.out.println("YES");
            }
            if (newFile.exists()) {
                System.out.println(newFile.getName());
            }
        }catch (IOException exception){}
    }

}
