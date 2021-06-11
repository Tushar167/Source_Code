package Default;
/*To write a program which reads each and every line of the file and generates profanity of file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws IOException {

		// http://textfiles.com/100/captmidn.txt
		String s[]={"slut","SLUT","ASS","FUCK","NIGGER","ASSHOLE","ass","nigger","fuck","asshole"};
		int x,count=0,c=0;

		File file = new File("C:\\Users\\Rama Murthy\\Desktop\\java\\input.txt");//Address of the file
		Scanner scan = new Scanner(file);//Reading the file
		while (scan.hasNextLine())
		{
			String a = scan.nextLine();//Processing each line of the file
			Scanner scan1 = new Scanner(a);
			c++;
			while(scan1.hasNext())
			{
				String b = scan1.next();//Processing each word of the line scanned
			for(int i=0;i<10;i++)
			{
				x=b.compareTo(s[i]);//comparing it to the words given by us as an input
				if(x==0)
				{
					count++;//Determining the profanity level of each line using count
					System.out.printf("the word is : %s \n",b);
				}
				
			}
		}
			
			System.out.println("The profanity level of line : " +c+ "=" +count);//Printing out profanity level for each line
            count=0;
		}
	}

}
