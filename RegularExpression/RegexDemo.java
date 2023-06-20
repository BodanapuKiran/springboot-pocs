import java.util.regex.*;
import java.io.*;
class RegexDemo{
public static void main(String[] args) throws Exception{
PrintWriter pr=new PrintWriter("C:\\Users\\Bodhanapu Kiran\\eclipse-workspace\\javaByDurgaSir\\RegularExpression\\a2.txt");
BufferedReader br=new BufferedReader(new FileReader("a1.txt"));
Pattern p=Pattern.compile("[7-9][0-9]{9}");
     String line=br.readLine();
     while(line!=null) {
    	 Matcher m=p.matcher(line);
    	while( m.find()){
    		 pr.println(m.group());
System.out.println(m.group());
    	 }
    		line=br.readLine(); 
     }
}
}