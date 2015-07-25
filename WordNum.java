package text;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WordNum {
	public static void main(String[] args)throws IOException{
		FileReader text=new FileReader("F:\\temp\\x.txt");
		BufferedReader is= new BufferedReader(text);
		String s1="";
		String s="";
		while(true){
			s=is.readLine();
			if(s==null)
				break;
			else{
				s1+=s;
			}
		}
		test(s1);
	}

	public  static void test(String s){
		ArrayList<String> ch1=new ArrayList<String>();
		String regex="[A-Za-z0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches= m.group(0);
			ch1.add(matches);
		}
		
		ArrayList<Double> ch2=new ArrayList<Double>();
		String[] sp={"am","is","are","was","been","has","have","had","a","an","the","in","at","on","to","or"};
		for(int i=0;i<ch1.size();i++){
			int a=1;
			for(int j=i+1;j<ch1.size();j++){
				if(ch1.get(i).equals(ch1.get(j))){
					a++;
					ch1.remove(j);
					j--;
				}
			}
			int flag=0;
			for(int k=0;k<sp.length;k++){
				if(ch1.get(i).equals(sp[k])){
					ch2.add(a*0.2);
					flag=1;
				}	
			}
			if(flag==0){
				ch2.add(a*1.0);
			}
		}

		double[] ch3=new double[ch2.size()];
		int n=0;
		for(double c:ch2){
			ch3[n]=c;
			n++;
		}
		String[] ch4=new String[ch1.size()];
		int t=0;
		for(String c:ch1){
			ch4[t]=c;
			t++;
		}
		double max;
		String rep;
		for(int i=0;i<ch3.length-1;i++){
			for(int j=i+1;j<ch3.length;j++){ 
				if(ch3[i]<ch3[j]){
					max=ch3[i];
					ch3[i]=ch3[j];
					ch3[j]=max;
					rep=ch4[i];
					ch4[i]=ch4[j];
					ch4[j]=rep;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(ch4[i]);
		}
	}
}



