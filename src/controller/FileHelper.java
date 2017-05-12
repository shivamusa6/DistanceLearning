package controller;


import java.io.File;
import java.util.ArrayList;

public class FileHelper {
	 public static ArrayList<String> GetAllFiles(String path) throws Exception {
	        ArrayList<String> list = new ArrayList<String>();
	        File[] files = new File(path).listFiles();
	        for (File ff : files) {
	            list.add(ff.getName());
	            System.out.println(ff);
	        }
	        
	        return list;

}
}
