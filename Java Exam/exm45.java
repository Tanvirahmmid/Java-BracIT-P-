import java.io.File;
    
public class exm45 {
    public static void main(String[] args) {
        String tFile = "C:\\Users\\tanvir.ahmmad\\Downloads\\Java Exam\\h.png";


        File file = new File(tFile);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println(fileSize + " bytes");
        } 
        
    }
}