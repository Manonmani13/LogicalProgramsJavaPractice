package com.proretention.scrm.admin;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    String name;

    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString()
    {
        return "name="+name+" ,id="+id;
    }
    public int hashCode(){
        final int prime=31;
        int res=1;
        res=prime*res+id;
//        res=prime*res+((name==null)?0:name.hashCode());
        return res;
    }


    public static void main(String[] args) {
        Employee e=new Employee("Mano",111);
        Employee e2=new Employee("Prasath",121);
        Employee e3=new Employee("Anbu",112);
        Employee e4=new Employee("Mano",111);

        Set s=new HashSet();
        s.add(e);
        s.add(e2);
        s.add(e3);
        s.add(e4);

        System.out.println(s);
    }
    public boolean equals(Object obj)
    {
        Employee e=(Employee) obj;
        if(id!=e.id && name==e.name)
                return false;
        return true;
    }

}
