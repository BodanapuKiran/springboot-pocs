class joinMethodDemo{
public static void main(String[] args) throws InterruptedException{
myThread.mt=Thread.currentThread();
myThread t =new myThread();
t.start();
for(int i=0;i<10;i++){
System.out.println("main thread");

}
}
}
class myThread extends Thread{
static Thread mt; 
public void run(){

for(int i=0;i<10;i++){
System.out.println("child thread");
try{
 mt.join();
}
catch(InterruptedException ie){
}
}
}
}