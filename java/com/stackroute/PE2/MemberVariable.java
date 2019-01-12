/*Create a class named Member with Name, age, Salary 
as its variable, write an other class 
named Member Variable that creates 
an instance of the Member class, initialises
its member variables, and then displays
the value of each member variable.*/

package com.stackroute.PE2;

//this class has objects of the member class and access the member variables//
public class MemberVariable {
    public String memberName(String name)
    {
        Member obj =new Member();
        obj.setName(name);
        return obj.getName();
    }
    public int memberAge(int age)
    {
        Member obj =new Member();
        obj.setAge(age);
        return obj.getAge();
    }
    public String memberSalary(String salary)
    {
        Member obj =new Member();
        obj.setSalary(salary);
        return obj.getSalary();
    }
}


