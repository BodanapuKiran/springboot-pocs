class sleepMethodDemo{
public static void main(String[] args){
myThread t=new myThread();
t.start();
for(int i=0;i<10;i++){
System.out.println("main method: "+i);

}
}
}
class myThread extends Thread{
public void run(){
for(int i=0;i<10;i++){
System.out.println("child method: "+i);
try{
Thread.sleep(1000);
}
catch(InterruptedException ie){
}
}
}
}
