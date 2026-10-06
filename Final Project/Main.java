import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        String testPathGet = "C:/Users/fortn/Documents/CIT130/Final Project/TestEnv/Blender/WE MAKING IT TO ISEF WITH THIS ONE.kicad_sch";
        String testPathSet = "C:/Users/fortn/Documents/CIT130/Final Project/TestEnv/KiCAD/WE MAKING IT TO ISEF WITH THIS TWO.kicad_sch";
        FileManager admin = new FileManager();
        System.out.println(admin.getPerms());
        admin.moveFile(testPathGet,testPathSet);
        System.out.println(admin.getPerms());
        admin.moveFile(testPathGet,testPathSet);


    }
    
}
