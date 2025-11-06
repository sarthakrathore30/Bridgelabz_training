class noMoneyExcep extends Exception{
public noMoneyExcep(String msg){super(msg);}
}
class atm{
double bal=10000;
void takeOut(int amt)throws noMoneyExcep{
if(amt>bal){
throw new noMoneyExcep("no bal left, u only got ₹"+bal);
}else{
bal-=amt;
System.out.println("done withdraw, now u got ₹"+bal);
}
}
}
public class Atm{
public static void main(String a[]){
atm m=new atm();
try{
m.takeOut(12000);
}catch(noMoneyExcep e){
System.out.println("err:"+e.getMessage());
}
}
}
