import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderThrows {
	public static void main(String[] args) throws FileNotFoundException {
		File fp = new File("horse.txt");
		Scanner s = new Scanner(fp);
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}
}
