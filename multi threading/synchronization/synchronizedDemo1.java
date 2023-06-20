class Display{
public synchronized void diplayn(){
for(int i=0;i<10;i++){
System.out.print(i);
try{
Thread.sleep(2000);
}
catch(InterruptedException ie){
    }

   }
  }

public synchronized void displayc(){
for(int i=65;i<75;i++){
System.out.print((char)i);
try{
Thread.sleep(2000);
}
catch(InterruptedException ie){
    }
}
}
}
public class synchronizedDemo1{
public static void main(String[] args){
Display d=new Display();
myThread1 t1=new myThread1(d);
myThread2 t2=new myThread2(d);
t2.start();
t1.start();
}
}
class myThread1 extends Thread{
Display d;

myThread1(Display d){
this.d=d;

}
public void run(){
d.displayn();
}
}
class myThread2 extends Thread{
Display d;

myThread2(Display d){
this.d=d;

}
public void run(){
d.displayc();
}
}