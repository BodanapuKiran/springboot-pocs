import java.util.regex.*;
import java.io.*;
class RegexDemo1{
public static void main(String[] args) throws Exception{
File f=new File("c:/Users/Bodhanapu/eclipse/javaByDurgaSir/multi threading");
Pattern p=Pattern.compile("[a-zA-Z1-9]+[.]java");
  String[] s=f.list();
for(String s1:s){
Matcher m=p.matcher(s1);
if(m.find()&&m.group().equals(s1)){
System.out.println(s1);
}
}
}
}
