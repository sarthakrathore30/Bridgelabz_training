import java.util.*;
class invalid_seat extends Exception{}
class already_booked extends Exception{}

class movie_ticket{
HashMap<Integer,Boolean>seats=new HashMap<>();
movie_ticket(){for(int i=1;i<=5;i++)seats.put(i,false);}

void book(int s)throws Exception{
if(!seats.containsKey(s))throw new invalid_seat();
if(seats.get(s))throw new already_booked();
seats.put(s,true);
System.out.println("seat "+s+" done");
}

public static void main(String[]a) throws Exception{
movie_ticket m=new movie_ticket();
try{m.book(3);m.book(3);}
catch(invalid_seat e){System.out.println("seat not exist");}
catch(already_booked e){System.out.println("seat taken");}
}
}
