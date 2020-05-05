
import java.io.BufferedInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 

// Java program to demonstrate BufferedInputStream methods 
class BufferedInputStreamDemo 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		FileInputStream fin = new FileInputStream("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt"); 

		BufferedInputStream bin = new BufferedInputStream(fin); 

		// illustrating available method 
		System.out.println("Number of remaining bytes:" + 
											bin.available()); 

		// illustrating markSupported() and mark() method 
		boolean b=bin.markSupported(); 
		if (b) 
			bin.mark(bin.available()); 

		// illustrating skip method 
		/*Original File content: 
		* This is my first line 
		* This is my second line*/
		bin.skip(4); 
		System.out.println("FileContents :"); 
		int ch; 
		while ((ch=bin.read()) != -1) 
			System.out.print((char)ch); 

		// illustrating reset() method 
		bin.reset(); 
		while ((ch=bin.read()) != -1) 
			System.out.print((char)ch); 
		fin.close(); 
	} 
} 
