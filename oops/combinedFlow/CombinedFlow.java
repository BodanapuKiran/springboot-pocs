class CombinedFlow{
static int count=0;
{
count++;
}
CombinedFlow(){

}
CombinedFlow(int i){

}
CombinedFlow(double d){

}
CombinedFlow(String name){

}
public static void main(String[] args){
CombinedFlow f1=new CombinedFlow();
CombinedFlow f2=new CombinedFlow(10);
CombinedFlow f3=new CombinedFlow(10.5);
CombinedFlow f4=new CombinedFlow("kiran");
System.out.println(count);
}
}



