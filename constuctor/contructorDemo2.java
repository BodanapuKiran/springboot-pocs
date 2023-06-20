public class contructorDemo2{
   String name="kiran";
public static void main(String[] args){
child c=new child();
c.m1();
}
}
class child extends contructorDemo2{
String name="soumya";
public void m1(){
System.out.println(name);
System.out.println(this.name);
System.out.println(super.name);
}
}
