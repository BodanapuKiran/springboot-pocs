class myThread extends Thread{
public void run(){
System.out.println("run method executed by: "+Thread.currentThread().getName());
}
}
class getNameSetNameOfThread{
public static void main(String[] args){
myThread t=new myThread();
t.start();
Thread.currentThread().setName("superstar");
System.out.println("main method executed by: "+Thread.currentThread().getName());
}
}
