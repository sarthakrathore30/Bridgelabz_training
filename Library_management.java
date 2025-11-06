import java.util.*;
class book_not_available extends Exception{}
class invalid_return extends Exception{}
class limit_exceed extends Exception{}

class libsys{
HashMap<String,Boolean>books=new HashMap<>();
HashMap<String,ArrayList<String>>users=new HashMap<>();

libsys(){
books.put("java",true);
books.put("cpp",true);
books.put("py",true);
}

void borrow(String usr,String bk)throws Exception{
if(!books.containsKey(bk)||books.get(bk)==false)throw new book_not_available();
users.putIfAbsent(usr,new ArrayList<>());
if(users.get(usr).size()>=5)throw new limit_exceed();
books.put(bk,false);
users.get(usr).add(bk);
System.out.println(usr+" got "+bk);
}

void ret(String usr,String bk)throws Exception{
if(!users.containsKey(usr)||!users.get(usr).contains(bk))throw new invalid_return();
books.put(bk,true);
users.get(usr).remove(bk);
System.out.println("bk "+bk+" back ok");
}

public static void main(String[]a){
libsys l=new libsys();
try{l.borrow("ram","java");l.borrow("ram","java");}
catch(book_not_available e){System.out.println("book gone");}
catch(limit_exceed e){System.out.println("too many books");}
catch(Exception e){System.out.println("something weird");}
try{l.ret("ram","cpp");}
catch(invalid_return e){System.out.println("cannot return not borrowed");}
catch(Exception e){System.out.println("error");}
}
}
