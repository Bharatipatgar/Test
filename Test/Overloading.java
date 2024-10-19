public class Overloading{
public static void main (String args[]){
number(7);
number(77,"Bharti");
userprofile(1);
userprofile(1,"abc");
productcatalog(101);
productcatalog(5.9,63.6f);
}
public static void number(int digit){
System.out.println("display digit:" +digit);
}

public static void number(int digit,String name){
System.out.println("display digit:" +digit);
System.out.println("display name:" +name);
}
public static void userprofile(int id){
System.out.println("userid:" +id); 
}
public static void userprofile(int id,String username){
System.out.println("display userid:" +id);
System.out.println("display username:" +username);
}
public static void productcatalog(int proid){
System.out.println("proid:" +proid); 
}
public static void productcatalog(double weight,float price){
System.out.println("weight:" +weight);
System.out.println("price:" +price);
}
}
}



    








