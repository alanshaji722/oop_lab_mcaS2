
package employee;

import java.util.Scanner;

public class Employee
{
int eno;
String ename;
double esalary;
void getdata()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Id ");
eno=sc.nextInt();
System.out.println("Enter Name");
ename=sc.next();
System.out.println("Enter Salary");
esalary=sc.nextDouble();
}
void display()
{
System.out.println("Employee Id is : "+ eno);
System.out.println("Employee Name is : "+ ename);
System.out.println("Employee Salary is : "+ esalary);
}


public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
int i,n,c,f=0;
System.out.println("Enter the number of Employees");
n=sc1.nextInt();
Employee e[]=new Employee[n];
for(i=0;i<n;i++) {
e[i]=new Employee();
e[i].getdata();
}
System.out.println("Employee details are :\n");
for(i=0;i<n;i++) {
e[i].display();
}
System.out.println("Enter the id to be Searched");
c=sc1.nextInt();
for(i=0;i<n;i++) {
if(c==e[i].eno) {
f=1;
break;
}
}
if(f==1) {
System.out.println("Details of Employee is ");
e[i].display();
}
else
System.out.println("Employee Not Found!!!");	

}
}
