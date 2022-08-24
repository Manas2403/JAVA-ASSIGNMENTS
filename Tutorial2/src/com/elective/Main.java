package com.elective;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Professor op=new Professor("OP Vyas");
       Professor bg=new Professor("Bibhas Ghoshal");
       Professor rk=new Professor("Rahul Kala");
       Professor director=new Professor("P Nagabhushan");
       Core oom=new Core("OOM",4);
       Core ds=new Core("DS",4);
       Core daa=new Core("DAA",4);
       Core os =new Core("OS",4);
       op.allotSubject(oom);
       bg.allotSubject(ds);
       bg.allotSubject(os);
       rk.allotSubject(oom);
       rk.allotSubject(daa);
       Elective mining=new Elective("Data Mining",2);
       Elective python=new Elective("Python",2);
       Elective German=new Elective("German",2);
       Elective publicSpeaking=new Elective("Public Speaking",2);
       op.allotSubject(mining);
       director.allotSubject(German);
       director.allotSubject(publicSpeaking);
       bg.allotSubject(python);
       Student manas=new Student("Manas Gupta",8.57f,"IIT2021146","Information Technology");
       Student vipul=new Student("Vipul Jain",2.3f,"IIT2021115","Information Technology");
       Student raaj=new Student("Raaj Rishi Tandon",8.8f,"IIT2021151","Information Technology");
       Student saksham=new Student("Saksham Golechha",0.0f,"IIT2021154","Information Technology");
       Student awasthy=new Student("Aaditya Awasthy",10.0f,"IIT2021260","Information Technology");
       ArrayList<Student>miningPrefernce=new ArrayList<>(5);
       manas.addPreviousSubject(python);
       vipul.addPreviousSubject(German);
       raaj.addPreviousSubject(python);
       saksham.addPreviousSubject(German);
       awasthy.addPreviousSubject(python);
      miningPrefernce.add(manas);
      miningPrefernce.add(vipul);
      miningPrefernce.add(raaj);
      miningPrefernce.add(saksham);
      miningPrefernce.add(awasthy);
      mining.addSeats(3);
      mining.shortlist(miningPrefernce);
      for(int i=0;i<mining.selectedStudents.size();i++){
         System.out.println("Congratulations!!"+" "+mining.selectedStudents.get(i).name+" "+"has been selected in data mining elective");
      }
    }
}
