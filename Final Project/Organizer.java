import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Organizer extends FileManager{
    private static int hierarchy = 2;
    private static ArrayList<String> permissions = new ArrayList<>(List.of("Read","Write","Move","Delete"));
    private static ArrayList<String> localPermissions = new ArrayList<>();
    Scanner io = new Scanner(System.in);
    //probably going to add ui elements to constructor later
    public Organizer(){
        updatePerms();
    }
    
    public ArrayList<String> getPerms(){
        //returns object's hierarchy compared to all other objects
        return localPermissions;
    }
    private void updatePerms(){
        //update permissions based on private hierarchy - only one level at the moment
        //will be added to every subclass type 
        if (hierarchy == -1){
            System.out.println("you have no perms hahaha");
        }else{
            localPermissions = new ArrayList<>(permissions.subList(0, hierarchy));
        }
    }

    public static void orgFolderAlphabetOrder(File folderPath){
        if(folderPath.isDirectory()){
            ArrayList<File> filesList = new ArrayList<>(Arrays.asList(folderPath.listFiles()));

            if(filesList != null){
                Arrays.sort(filesList);
            }
        }else{
            System.out.println("Error: Invalid filepath or provided path is not a directory(folder)");
        }

    }

}
