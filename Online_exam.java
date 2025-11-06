import java.time.*;
class Late_Sumbit extends Exception{}
class File_invalid extends Exception{}

class exam{
void submitExam(String f,LocalDateTime t)throws Late_Sumbit,File_invalid{
LocalDateTime d=LocalDateTime.of(2025,11,5,12,0);
if(!f.endsWith(".pdf"))throw new File_invalid();
if(t.isAfter(d))throw new Late_Sumbit();
System.out.println("submitted ok");
}

public static void main(String[]a){
exam e=new exam();
try{e.submitExam("ans.docx",LocalDateTime.now());}
catch(File_invalid x){System.out.println("Submission failed: invalid file format");}
catch(Late_Sumbit y){System.out.println("Submission failed: late!!");}
}
}
