class service extends Exception{}
class mileage extends Exception{}

class vehcl{
int mileage;
String serivce_date;
vehcl(int m,String d){mileage=m;serivce_date=d;}

void checkMaintenance()throws service,mileage{
if(mileage<0)throw new mileage();
if(serivce_date.equals("overdue"))throw new service();
System.out.println("veh ok no prob");
}

public static void main(String[]args){
vehcl v=new vehcl(-10,"ok");
try{v.checkMaintenance();}
catch(mileage e){System.out.println("wrong milege vale");}
catch(service e){System.out.println("service late");}
}
}
