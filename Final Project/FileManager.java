import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static int hierarchy = 0;
    private static ArrayList<String> permissions = new ArrayList<>(List.of("Read","Write","Move","Delete","Upload"));
    private static ArrayList<String> localPermissions = new ArrayList<>();


    //probably going to add ui elements to constructor later
    public FileManager(){
        updatePerms();

    }
    
    public ArrayList<String> getPerms(){
        //returns object's hierarchy compared to all other objects
        return localPermissions;
    }
    private void updatePerms(){
        //update permissions based on private hierarchy - only one level at the moment
        //will be added to every class type 
        if (hierarchy == 0){
            localPermissions = permissions;
        }
    }
    public void moveFile(String pathNameCurrent, String pathNameEnd) throws IOException{
        if (localPermissions.contains("Move")){
            System.out.println("Authorization: Successful");
            Path temp = Files.move(Paths.get(pathNameCurrent), Paths.get(pathNameEnd));
        }else{
            System.out.println("Authorization: Failed - No move permission granted");
        }
    }

}
