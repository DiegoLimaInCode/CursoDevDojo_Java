package Main.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("C:\\Users\\usuario\\Documents\\Intellij\\Main Project\\Java\\arquivo\\file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path :"+ file.getPath());
            System.out.println("is directory :"+ file.isDirectory());
            System.out.println("is file :"+ file.isFile());
            System.out.println("is hidden :"+ file.isHidden());
            System.out.println("last modified :"+ new Date( file.lastModified()));
            System.out.println("last modified :"+ Instant.ofEpochMilli( file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
