package Day4;

public class Instancevariables {
	   /* declaration of instance variables. */  
    public String name; //public instance  
    String division;    //default instance  
    private int age;    //private instance  
    /* Constructor that initialize an instance variable. */  
    public Instancevariables(String sname)  
    {  
        name = sname;  
    }  
  
    /* Method to intialize an instance variable. */  
    public void setDiv(String sdiv)  
    {  
        division = sdiv;  
    }  
      
    /* Method to intialize an instance variable. */  
    public void setAge(int sage)  
    {  
        age = sage;  
    }  
  
    /* Method to display the values of instance variables. */  
    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
    } 
    public static void main(String args[])  
    {  
    	Instancevariables s = new Instancevariables("Monica");  
        s.setAge(14);  
        s.setDiv("B");  
        s.printstud();  
    }  
}  



