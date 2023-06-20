import java.lang.reflect.*;
class methods{
public static void main(String[] args) throws ClassNotFoundException{
int count=0;
Class a= Class.forName("java.lang.Object");
  Method[] m=a.getDeclaredMethods();
for(Method m1:m){
count++;
System.out.println(m1.getName());
}
System.out.println("no of methods in object class are: "+count);
}
}
