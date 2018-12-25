
package testarray;
import java.io.FileInputStream;
public class FileHandling {

	public static void main(String[] args) {
		try {
		FileInputStream fs = new FileInputStream("E:\\test.doc");
		int i = fs.read();
		System.out.print((char)i);

	}catch(Exception e)
		{
		System.out.println(e);
		}

}
}

