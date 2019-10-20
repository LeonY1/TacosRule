import java.util.*;
import java.io.*;

public class Parse{
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("test.txt"));
		PrintStream out = new PrintStream("hispanic_per.csv");

		out.println("State,Hispanic (of any race),Non-Hispanic White,Non-Hispanic Black,Non-Hispanic Asian,Non-Hispanic American Indian,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		while(in.ready()) {
			String line = in.readLine();
			String [] arr = line.split("\\s+");
			int i = 0;
			while(i < arr.length - 5){
				if(i != 0)
					out.print(" ");
				out.print(arr[i++]);
			}
			for(; i < arr.length; i++){
				if(i != 0)
					out.print(",");
				out.printf("%.4f",Double.parseDouble(arr[i].substring(0, arr[i].length() - 1))/100);
				// System.out.print(arr[i]);
			}
			if(in.ready())
				out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		}
	}
}