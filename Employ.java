package employ;

public class Employ
{
    int emp_id;
    String ename;
    float salary;
    float ts;

    Employ(int a, String b, float c) 
    {
        emp_id = a;
        ename = b;
        salary = c;
    }
 public void tot_sal()
 {
    float ts= ((salary + salary)*2/100); 
     System.out.println(ts);
 }
   

    public static void main(String[] args) 
    {
       Employ emp1 = new Employ(100,"Alan",2000);
       emp1.tot_sal();
       Employ emp2 = new Employ(101,"Arun",3000);
       emp2.tot_sal();
    }
}
