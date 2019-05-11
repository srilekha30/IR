/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.util.Scanner;
public class cgpa {
    String stdnt_name="";
    int sem=0;
    public cgpa(String stdnt_name,int sem){
        this.stdnt_name=stdnt_name;
        this.sem = sem;
    }
    int Course(float mid1,float mid2,float assign,float lab,float end){
        //assuming all those exams are for 100 marks
        double score=0.15*mid1 + 0.15*mid2 + 0.2*assign + 0.2*lab + 0.3*end;
        if(score>90)
        {
            return 10;
        }
        else if(score>80)
        {
            return 9;
        }
        else if(score>70)
        {
            return 8;
        }
        else if(score>60)
        {
            return 7;
        }
        else if(score>50)
        {
            return 6;
        }
        else if(score>40)
        {
            return 5;
        }
        else if(score>30)
        {
            return 4;
        }
        else {
            return 0;
        }
    }
    public void Calculate_CGPA(){
        Scanner sc = new Scanner(System.in); 
        float grade=0;
        for(int i=0;i<sem-1;i++) {
            for(int j=0;j<5;j++) { //assuming 5 subjects per sem
                System.out.println("sub - "+(j+1));
                float mid1=sc.nextFloat();
                float mid2=sc.nextFloat();
                float assign=sc.nextFloat();
                float lab=sc.nextFloat();
                float end=sc.nextFloat();
               grade+= Course(mid1,mid2,assign,lab,end);
        }
        }
        System.out.println("CGPA="+ grade/((sem-1)*5));
    }
    public static void main(String[] args) {
       cgpa Srilekha=new cgpa("Srilekha",2);
       Srilekha.Calculate_CGPA();
    }
    
}
