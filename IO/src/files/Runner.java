package files;

import java.io.File;
import java.io.IOException;

public class Runner {
	
	public static void main(String[] args) throws IOException {
		//createFile();
		separatorTypes();
	}
	
	private static void createFile() throws IOException {
		String fileSeparator = File.separator;
		
		// absolute path
		String absPath = fileSeparator +"Users"+fileSeparator+"allen"+fileSeparator+"Downloads"+fileSeparator+"file.csv";
		
		// file name only
		String filePath = "file.txt";
		
		// relative path
		String relPath = "tmp" + fileSeparator + "file.docx";
		
		//File textFile = new File("\\Users\\allen\\Downloads\\file.txt");
		File file1 = new File(absPath);
		File file2 = new File(filePath);
		File file3 = new File(relPath);
		
		if(file1.createNewFile()) {
			System.out.println("absolute file was created");
		} else {
			System.out.println("absolute file already exists");
		}
		
		/*
		 * if(file2.createNewFile()) { System.out.println("relative file was created");
		 * } else { System.out.println("relative file already exists"); }
		 * 
		 * if(file3.createNewFile()) { System.out.println("relative file was created");
		 * } else { System.out.println("relative file already exists"); }
		 */
		
		// deleting the file
		//textFile.delete();
	}
	
	private static void separatorTypes() {
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
	}
}
