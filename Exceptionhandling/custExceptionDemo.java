import java.util.*;
class InsufficientFundException extends RuntimeException{
  InsufficientFundException(String s){
  super(s);
}
}
class custExceptionDemo{
static int balance;
public static void main(String[] args){
custExceptionDemo kiran=new custExceptionDemo();
kiran.balance=1500;
Scanner sc= new Scanner(System.in);
System.out.println("enter withdrawal amount");
int withdrawal=sc.nextInt();
if(withdrawal<balance){
System.out.println("amount sucessfully withdrawn");
}
else{
throw new InsufficientFundException("there is no sufficient balance in your account");
}
}
}

