class Demo{
public void m1(){
class Inner{
public void m2(int x,int y){
System.out.println("the sum of:"+(x+y));
}
}
Inner i=new Inner();
i.m2(10,20);
i.m2(30,40);
i.m2(50,60);
}
public static void main(String[] args){
Demo d=new Demo();
d.m1();
}
}