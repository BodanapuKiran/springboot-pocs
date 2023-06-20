class demo{
String name;
int rollNo;
demo(String name,int rollNo){
this.name=name;
this.rollNo=rollNo;
}
public String toString(){
return name+".."+rollNo;
}
public static void main(String[] args){
demo d=new demo("durga",101);
demo d1=new demo("kiran",102);
System.out.println(d);
System.out.println(d.toString());
System.out.println(d1);
}
}