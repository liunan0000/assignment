import java.io.*;
public class ReadTest {
	public static void main(String[] args) throws IOException{
		File file=new File("F:\\course\\javacourse\\intern\\x.txt");
		InputStream is=new FileInputStream(file);
		/*char[] chars=new char[1024];
		int len=0;
		for(int i=0;i<1024;i++){
			int x=is.read();
			if(x==-1){
				len=i;
				break;                                           
			}
			chars[i]=(char)x;
		}*/
		int x=is.read();
		while((x=is.read())!=-1){
			char y=(char) x;
			System.out.print(y);
		}
		
	}
}
