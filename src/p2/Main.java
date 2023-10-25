package p2;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File dir = new File("D:\\test");
        if (dir.isDirectory()){
            for(File item:dir.listFiles()){
                if (item.isDirectory()){
                    System.out.println(item.getName() + " - directory");
                }else{
                    System.out.println(item.getName());
                }
            }
        }

        File dirFile = new File("D:\\test\\newDir");
        boolean created = dirFile.mkdir();
        if (created){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        boolean delDir = dirFile.delete();
        if (delDir) {
            System.out.println("DELETE");
        }


    }
}
