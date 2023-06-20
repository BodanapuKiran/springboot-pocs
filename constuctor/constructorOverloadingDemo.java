public class constructorOverloadingDemo{


 public constructorOverloadingDemo(String name){
  this(10);
System.out.println("String-arg constructor called");
}

public constructorOverloadingDemo(int i){
this();
System.out.println("int-arg constructor called");
}

public constructorOverloadingDemo(){
System.out.println("no-arg constructor called");
}

public static void main(String[] args){
constructorOverloadingDemo co=new constructorOverloadingDemo("kiran");
}
}