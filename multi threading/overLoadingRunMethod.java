class myThread extends Thread{
 public void run(int i){
 System.out.println("int arg run method");
}
public void run(){
 System.out.println("no arg run method");
}
}
public class overLoadingRunMethod{
public static void main(String[] args){
myThread t=new myThread();
t.start();
}
}
