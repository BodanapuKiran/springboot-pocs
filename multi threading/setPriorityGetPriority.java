class myThread extends Thread{
public void run(){
for(int i=0;i<10;i++){
System.out.println("child thread");
}
}
}
class setPriorityGetpriority{
public static void main(String[] args){
myThread t=new myThread();
System.out.println("main thread priority: "+Thread.currentThread().getPriority());
System.out.println("child thread priority: "+t.getPriority());
Thread.currentThread().setPriority(10);
System.out.println("main thread priority: "+Thread.currentThread().getPriority());
t.start();
for(int i=0;i<10;i++){
System.out.println("main thread");
}
}
}