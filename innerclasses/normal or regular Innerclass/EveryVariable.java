class EveryVariable{
int x=10;
  class Inner{
int x=20;
public void m1(){
int x=30;
System.out.println(x);
System.out.println(Inner.this.x);
System.out.println(EveryVariable.this.x);
}
}
public static void main(String[] args){
new EveryVariable().new Inner().m1();
}
}