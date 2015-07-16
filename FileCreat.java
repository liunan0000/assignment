import java.io.*;
public class FileCreat {
	public static void main(String[] args) throws IOException{//Å×³öÒì³£
		File file=new File("F:\\file\\x.txt");
		boolean is_succ=file.createNewFile();
		if(is_succ){
			System.out.println("x.txt has been created");
		}else{
			System.out.println("x.txt already exists");
		}
	}
}
