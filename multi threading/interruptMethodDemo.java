class myThread extends Thread{
public void run(){
try{
for(int i=0;i<20;i++){
System.out.println("child thread");
Thread.sleep(2000);
}
}
catch(InterruptedException ie){
System.out.println("i got interrupted");
}
}
}

class interruptMethodDemo{
public static void main(String[] args){
myThread t=new myThread();
t.start();
t.interrupt();
for(int i=0;i<20;i++){
System.out.println("main thread");
}
}
}
