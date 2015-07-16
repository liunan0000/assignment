import java.io.*;
import java.util.*;
public class WriteTest {
	public static void main(String[] args) throws IOException{
		File file=new File("F:\\file\\x.txt");
		OutputStream os=new FileOutputStream(file);
		Scanner in=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãÒªĞ´µÄ");
		String cont=in.next();
		for(int i=0;i<cont.length();i++){
			char x=cont.charAt(i);
			os.write(x);
		}
		os.close();
		System.out.println("content has been written to file");
	}
}
