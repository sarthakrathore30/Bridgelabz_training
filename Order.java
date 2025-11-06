import java.util.*;
class noStockEx extends Exception{public noStockEx(String m){super(m);}}
class payFailEx extends Exception{public payFailEx(String m){super(m);}}
class shop{
void buy()throws noStockEx,payFailEx{
Random r=new Random();
int n=r.nextInt(2);
if(n==0)throw new noStockEx("item gone lol");
else throw new payFailEx("pay not wrk bro");
}
}
public class Order{
public static void main(String a[]){
shop s=new shop();
try{s.buy();}catch(noStockEx | payFailEx e){System.out.println(e.getMessage());}
}
}
