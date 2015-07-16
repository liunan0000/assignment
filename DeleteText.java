import java.io.*;
public class DeleteText {
	public static void main(String[] args) throws IOException{
		File file=new File("F:\\file\\x.txt");
		boolean is_succ=file.delete();
		if(is_succ){
			System.out.println("x.txt has been deleted");
		}else{
			System.out.println("x.tet has NOT been deleted");
		}
	}

}
