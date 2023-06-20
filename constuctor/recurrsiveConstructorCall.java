class parent{
  parent(){
  this(10);
}
}
public class recurrsiveConstructorCall extends parent{
recurrsiveConstructorCall(int i){
  this();
}
public static void main(String [] args){
 recurrsiveConstructorCall rcc=new recurrsiveConstructorCall(10);
}
}