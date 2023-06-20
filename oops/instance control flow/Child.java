class Parent{
int i =10;
{
m1();
System.out.println("parent instance block");
}
Parent(){
System.out.println("parent constructor");
}
public static void main(String[]args){
Parent p=new Parent();
System.out.println("parent main");
}
public void m1(){
System.out.println(j);
}
int j=20;
}
class Child extends Parent{
int x=100;
{
m2();
System.out.println("first childclass block");
}
Child(){
System.out.println("chils class constructor");
}
public static void main(String[] args){
Child c=new Child();
System.out.println("child main");
}
public void m2(){
System.out.println(y);
}
{
System.out.println("second childclass block");
}
int y=200;
}