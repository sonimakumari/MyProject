
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("/Users/sonimamishra/Documents/Sonima/filename.txt");
      if (myObj.createNewFile()) {
        printMessage("File Created.");
      } else {
        printMessage("File already exists.");
      }
    } catch (IOException e) {
      printMessage("An error occurred.");
      e.printStackTrace();
    }
  }
  public printMessage(String msg)
  {
	  system.out.println(msg);
  }
}