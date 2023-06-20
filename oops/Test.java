class Animal{

}
class Monkey extends Animal{

}
class Test{
public void m1(Animal a){
System.out.println("animal version");
}
public void m1(Monkey m){
System.out.println("monkey version");
}
public static void main(String [] args){
Test t=new Test();
Animal a=new Animal();
Monkey m=new Monkey();
Animal a1=new Monkey();
t.m1(a);
t.m1(m);
t.m1(a1);
}
}