class myThread extends Thread{
public void run(){
for(int i=0;i<10;i++){
System.out.println("run method");
}
}
}
class definingThread{
public static void main(String[] args){
myThread t=new myThread();
t.start();
for(int i=0;i<10;i++){
System.out.println("main method");
}
}
}
