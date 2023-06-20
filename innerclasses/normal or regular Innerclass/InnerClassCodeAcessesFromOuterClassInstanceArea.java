class InnerClassCodeAcessesFromOuterClassInstanceArea{

class Inner{
public void m1(){
System.out.println("inner class object");
}
}
public void m2(){
Inner i=new Inner();
i.m1();

}
public static void main(String[] args){
InnerClassCodeAcessesFromOuterClassInstanceArea o=new InnerClassCodeAcessesFromOuterClassInstanceArea();
o.m2();
}
}