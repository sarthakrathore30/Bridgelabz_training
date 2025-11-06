import java.util.*;
class negAmtEx extends Exception{public negAmtEx(String m){super(m);}}
class noBalEx extends Exception{public noBalEx(String m){super(m);}}
class netErrEx extends Exception{public netErrEx(String m){super(m);}}
class trans{
void go()throws negAmtEx,noBalEx,netErrEx{
Random r=new Random();
int n=r.nextInt(3);
    switch (n) {
        case 0 -> throw new negAmtEx("no -ve amt!");
        case 1 -> throw new noBalEx("no amount");
        default -> throw new netErrEx("");
    }
}
}
public class Bank{
public static void main(String a[]){
trans t=new trans();
try{t.go();}catch(negAmtEx | noBalEx | netErrEx e){System.out.println(e.getMessage());}
}
}
