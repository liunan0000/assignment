import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Link {
	public static void main(String[] args)throws IOException{
		FileReader text=new FileReader("F:\\temp\\x.txt");
		BufferedReader is= new BufferedReader(text);
		while(true){
			String s=is.readLine();
			if(s==null)
				break;
			else{
				if(test(s)==""){
					continue;
				}else{
					System.out.println(test(s));
				}
			}
		}
	}

	private static String test(String s) {
		//String regex="http.+>";
		String regex="(http|https)://[a-zA-Z0-9_][^/]+(/[^>]+)+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches= m.group(0);
		}
		return  matches;
	}
}