import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class WordNum {
	public static void main(String[] args)throws IOException{
		FileReader text=new FileReader("F:\\temp\\x.txt");
		BufferedReader is= new BufferedReader(text);
		while(true){
			String s=is.readLine();
			if(s==null)
				break;
			else{
				test(s);
			}
		}
	}


	public  static void test(String s){
		String[] ch1=new String[10000];
		for(int i=0;i<20;i++){
			String regex="[A-za-z0-9]{i}";
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(s);
			String matches = "";
			while(m.find()){
				matches= m.group(0);
				for(int j=0;j<ch1.length;j++){
					ch1[i]=matches;
				}
			}
		}
		int a=0;
		double max;
		double[] wei=new double[1000];
		String[] sp={"am","is","are","was","been","has","have","had","a","an","the","in","at","on","to","or"};
		for(int i=0;i<ch1.length;i++){
			for(int j=i+1;j<ch1.length;j++){
				if(ch1[i].equals(ch1[j]))
					a++;
			}
			for(int k=0;k<sp.length;k++)
				if(!ch1[i].equals(sp[k])){
					wei[i]=a*1;
				}else{
					wei[i]=a*0.2;
				}
		}
		for(int i=0;i<wei.length-1;i++){
			for(int j=0;j<wei.length-1;j++){  //j=6
				if(wei[j]<wei[j+1]){
					double t=wei[j];
					wei[j]=wei[j+1];
					wei[j+1]=t;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(wei[i]);
		}
		
	}
}
