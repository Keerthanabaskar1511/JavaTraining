package com.wipro.maven.lombok;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Employee e1 = new Employee();
        
        e1.setEid(102);
        
        System.out.println(e1.getEid());
        
        Employee e2 = new Employee(1, "javeed", 7000);
        
        
        System.out.println(e2.toString());
        
        
    }
}