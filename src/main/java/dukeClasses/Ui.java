package dukeClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ui {

    public Ui(){

    }

    public void showLoadingError(){
        System.out.println("Storage load failed");
    }

    public void showFileError(){
        System.out.println("Invalid File");
    }

    public void showStorageError(){
        System.out.println("Fail to update storage");
    }

    public void showInputError(){
        System.out.println("    Invalid input detected. Please check your input");
    }

    public void greet(){
        System.out.println(Commands.HI.toString());
    }

    public void sayBye(){
        System.out.println(Commands.BYE.toString());
    }


    public void identifyTask(Task task) {
        if (task.getIsDone()) {
            String output = String.format(
                "%s    %s", Commands.MARK.toString(), task.identify());
            System.out.println(output);
        } else {
            System.out.println(String.format(
                "%s      %s", Commands.UNMARK.toString(), task.identify()));
        }
    }

    public void newTask(Task task, int numOfTask) {
        System.out.println(String.format(
            "%s      %s", Commands.ADD.toString(), task.identify()));
        System.out.println(String.format("    Now you have %d tasks in the list.", numOfTask));
    }

    public void listTask(String filePath) {
        System.out.println(Commands.LIST.toString());
        File file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException errorMessage) {
            showFileError();
        }
    }
}