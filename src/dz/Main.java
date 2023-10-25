package dz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        Task task = new Task(1, "New task");
        System.out.println(task);
        taskList.add(task);
        saveListFile(taskList);
    }

    private static void saveListFile(List<Task> taskList){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\test\\tasks.txt", false))){
            String t = "";
            for (int i = 0; i < taskList.size(); i++){
                t += taskList.get(i);
            }
            writer.write(t);
            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }


}