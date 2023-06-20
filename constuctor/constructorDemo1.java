public class constructorDemo1{
  String name;
 int id;
 constructorDemo1(String name,int id){
this.name=name;
this.id=id;

}
public static void main(String[] args){
 constructorDemo1 cd=new constructorDemo1("kiran",105);
 constructorDemo1 cd1=new constructorDemo1("sandeep",101);

System.out.println(cd.name+"...."+cd.id);
System.out.println("2nd object    "+cd1.name+"...."+cd1.id);
}
}