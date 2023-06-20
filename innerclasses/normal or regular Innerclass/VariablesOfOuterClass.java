class VariablesOfOuterClass{
int x=90;
static int y=36;
  class Inner{
public void m1(){
System.out.println(x);
System.out.println(y);
}
}
public static void main(String[] args){
new VariablesOfOuterClass().new Inner().m1();
}
}