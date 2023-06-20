class Demo{
public static void main(String[] args){
System.out.println("kiran");
try{
System.out.println(10/0);
}
catch(ArithmeticException ae){
ae.printStackTrace();
System.out.println(ae);
System.out.println(ae.toString());  //toString and sysout(ae) both methods are same
System.out.println(ae.getMessage());
}
System.out.println("soumya");
}
}