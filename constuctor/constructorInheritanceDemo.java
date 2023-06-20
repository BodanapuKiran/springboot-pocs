class parent{
 parent(){

 }
void m1(){
System.out.println("method is called");
}
}
public class constructorInheritanceDemo extends parent{
constructorInheritanceDemo(){

}
public static void main(String[] args){
constructorInheritanceDemo cid=new constructorInheritanceDemo();
 cid.m1();
constructorInheritanceDemo cid1=new parent();
}
}