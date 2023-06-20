import java.util.*;
import java.util.Map.Entry;
class DuplicatesElementsInAString{
public void m1(String s){
  char[] ch=s.toCharArray();
Map<Character,Integer> m=new HashMap();
for(char c:ch){
if(m.containsKey(c)){
m.put(c,m.get(c)+1);
}
else
{
  m.put(c,1);
}
}
for(Map.Entry<Character,Integer> entry:m.entrySet()){
if(entry.getValue()>1){
System.out.println(entry.getKey()+"...."+entry.getValue());
}
}
}
public static void main(String[] args){
 DuplicatesElementsInAString dup=new  DuplicatesElementsInAString();
   dup.m1("geeksforgeeks");
}
}