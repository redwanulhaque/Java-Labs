import java.io.File;

import javax.swing.JFileChooser;

public class ListLargestFile {
	static File largestFile;
	static long largestFileSize=-1;
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser("./");
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f,"");
		System.out.println("The largest File is: "+largestFile.getName()+", its length is: "+largestFile.length());

	}
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles();
		
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			if(f2.length()>largestFileSize) {
				largestFile=f2;
				largestFileSize=f2.length();
			}
			
			/**System.out.print(indent+f2.getName());
			System.out.print("...");
			System.out.print(f2.lastModified());
			System.out.print("...");
			System.out.print(f2.length());
			System.out.println();
			*/
			
            if (f2.isDirectory())
                listFiles(f2, indent+"   ");
		}
	}
}

