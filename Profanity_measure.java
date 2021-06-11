import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws IOException {

		// http://textfiles.com/100/captmidn.txt
		String s[]={"slut","SLUT","ASS","FUCK","NIGGER","ASSHOLE","ass","nigger","fuck","asshole"};
		int x,count=0;

		File file = new File("C:\\Users\\Rama Murthy\\Desktop\\java\\input.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			String a = scan.next();
			for(int i=0;i<10;i++)
			{
				x=a.compareTo(s[i]);
				if(x==0)
				{
					count++;
					System.out.printf("the word is : %s \n",a);
				}
				
			}
		}
		System.out.println("Profanity level = " +count);
	}

}
