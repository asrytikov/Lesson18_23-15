package p3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) {
        String file = "Text.txt";
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("out.zip"));
            FileInputStream fileInputStream = new FileInputStream(file);
        ){
            ZipEntry zipEntry = new ZipEntry(file);
            zipOutputStream.putNextEntry(zipEntry);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            zipOutputStream.write(bytes);
            zipOutputStream.closeEntry();
        }catch (IOException exception){}

        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("out.zip"))){
            ZipEntry entry;
            String name;
            while ((entry = zipInputStream.getNextEntry())!=null){
                name = entry.getName();
                System.out.println(name);
                FileOutputStream fileOutputStream = new FileOutputStream("new"+name);
                for(int z = zipInputStream.read(); z != -1; z = zipInputStream.read()){
                    fileOutputStream.write(z);
                }
                fileOutputStream.flush();
                zipInputStream.closeEntry();
                fileOutputStream.close();
            }
        }catch (IOException exception){

        }

    }
}
