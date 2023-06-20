 class myRunnable implements Runnable{
public void run(){
System.out.println("child thread");
}
}
 class definingByRunnableInterface{
public static void main(String[] args){
myRunnable r=new myRunnable();
Thread t=new Thread(r);
t.start();
System.out.println("main thread");
}
}
