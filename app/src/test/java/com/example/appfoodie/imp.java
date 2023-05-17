import java.io.File;
import java.io.IOException;

public class GhostFileCreator {
    public static void main(String[] args) {
        String directoryPath = "/path/to/directory";
        int numFiles = 10;
        createGhostFiles(directoryPath, numFiles);
    }
    
    public static void createGhostFiles(String directoryPath, int numFiles) {
        File directory = new File(directoryPath);
        
        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }
        
        if (!directory.isDirectory()) {
            System.out.println("Provided path is not a directory.");
            return;
        }
        
        for (int i = 1; i <= numFiles; i++) {
            String fileName = "ghost_file_" + i + ".txt";
            File file = new File(directory, fileName);
            
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create file: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file: " + file.getAbsolutePath());
                e.printStackTrace();
            }
        }
    }
}
