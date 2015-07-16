import java.io.*;
import java.util.*;
class CreatText {
	public  void creat()throws IOException{
		File txt=new File("F:\\file\\x.java");
		boolean issucc=txt.createNewFile();
		if(issucc){
			System.out.println("x.txt has been created");
		}
		else
			System.out.println("x.txt already exists");
	}
}
class WriteText {
	public  void write()throws IOException{
		File txt=new File("F:\\file\\x.java");
		Scanner in=new Scanner(System.in);
		OutputStream os=new FileOutputStream(txt);
		System.out.println("please write your test");
		String cont=in.next();
		for(int i=0;i<cont.length();i++){
			char x=cont.charAt(i);
			os.write(x);
		}
		os.close();
		System.out.println("content has been written to file");
	}
}
class ReadText {
	public  void read()throws IOException{
		File txt=new File("F:\\file\\x.java");
		InputStream is=new FileInputStream(txt);
		int ch=0;
		while((ch=is.read())!=-1){
			System.out.print((char)ch);
		}
	}
}
class DelText {
	public  void del(){
		File file=new File("F:\\file\\x.java");
		boolean issucc=file.delete();
		if(issucc){
			System.out.println("x.txt has been deleted");
		}
		else
			System.out.println("x.txt has not been deleted");
	}
}
public class Fil {
	public static void main(String[] args)throws IOException{
		Scanner in=new Scanner(System.in);
		CreatText txt=new CreatText();
		WriteText txt2=new WriteText();
		ReadText txt3=new ReadText();
		DelText txt4=new DelText();
		System.out.println("please input your choose:1 creat;2:write; 3:read; 4:delete;");
		int S=in.nextInt();
			switch(S){
			case 1:txt.creat();break;
			case 2:txt2.write();break;
			case 3:txt3.read();break;
			case 4:txt4.del();break;
		}
	}
}