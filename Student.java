package student;

public class Student {
    
    int m1,m2,m3;
    float s,p;
    
    Student (int a,int b,int c) 
    {
      m1=a;
      m2=b;
      m3=c;
    }
    
    public void sum()
    {
        s=m1+m2+m3;
    }
    public void perc()
    {
       s=m1+m2+m3;
       p=(s/300)*100;
    }
    
    public static void main(String[] args)
    {
     Student s1=new Student(10,30,40);
     
     Student s2=new Student(70,60,50);
    }
    
}
