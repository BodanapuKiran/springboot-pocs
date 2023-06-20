
import java.lang.reflect.*;
class GetMethods{
public static void main (String [] args)  throws ClassNotFoundException{
Class c=Class.forName("java.lang.Object");
int count=0;
 Method [] m=c.getDeclaredMethods();
for(Method m1:m){
System.out.println(m1.getName());
count++;
}
System.out.println(count);
}
}