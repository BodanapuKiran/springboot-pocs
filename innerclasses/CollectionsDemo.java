class CollectionsDemo{
public static void main(String[] args){
ArrayList<Integer> l=new ArrayList<>();
l.add(94);
l.add(65);
l.add(25);
l.add(59);
l.add(55);
l.add(23);
System.out.println(l);
Comparator<Integer> c=(I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
System.out.println(l,c);
}
}