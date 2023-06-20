class Display{
public synchronized void wish(String name){
for(int i=0;i<10;i++){
System.out.print("welcome: ");
try{
Thread.sleep(2000);
}
catch(InterruptedException ie){
    }
System.out.println(name);

   }
  }
}
public class synchronizedDemo{
public static void main(String[] args){
Display d=new Display();
myThread t1=new myThread(d,"dhoni");
myThread t2=new myThread(d,"kohli");
t2.start();
t1.start();
}
}
class myThread extends Thread{
Display d;
String name;
myThread(Display d,String name){
this.d=d;
this.name=name;
}
public void run(){
d.wish(name);
}
}