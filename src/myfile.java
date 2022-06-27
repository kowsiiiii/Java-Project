import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

	

	

	public class myfile{
		public static void main(String args[])

	{

	try

	{

	RandomAccessFile raf = new RandomAccessFile("asd.txt", "r"); byte b[] = new byte[1888]; raf.readFully (b, 0, 1000);

	

	}

	catch(FileNotFoundException e)

	{

	System.err.println("File not found"); System.err.println(e.getMessage()); e.printStackTrace();
	}

	catch (IOException e)

	{ System.err.println("IO Error");
	System.err.println(e.toString()); 
	e.printStackTrace();
	}
}
}


	

		
	


