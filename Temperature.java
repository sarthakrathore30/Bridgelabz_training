class Temp extends Exception{}

class Temperature{
static void convert(double val,String u)throws Temp{
if(u.equalsIgnoreCase("C")&&val<-273.15)throw new Temp();
if(u.equalsIgnoreCase("F")&&val<-459.67)throw new Temp();
if(u.equalsIgnoreCase("C"))System.out.println("F="+(val*9/5+32));
else if(u.equalsIgnoreCase("F"))System.out.println("C="+((val-32)*5/9));
else System.out.println("wrong unit");
}

public static void main(String[]a){
try{convert(-500,"C");}
catch(Temp e){System.out.println("Error: Temperature below absolute zero is not possible!");}
}
}
