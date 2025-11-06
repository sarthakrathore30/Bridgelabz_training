class wrongCredEx extends Exception{
public wrongCredEx(String m){super(m);}
}
class logSys{
void chk(String u,String p)throws wrongCredEx{
if(!u.equals("admin")||!p.equals("1234")){
throw new wrongCredEx("wrong user/pass");
}else{
System.out.println("u in!");
}
}
}
public class Login_sytem{
public static void main(String a[]){
logSys l=new logSys();
try{
l.chk("admin","4321");
}catch(wrongCredEx e){
System.out.println(e.getMessage());
}
}
}
