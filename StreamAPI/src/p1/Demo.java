package p1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Company{
  //Define all the variables and methods here
  private String companyName;
  private String type;
  private int turnover;

  Company(String companyName,String type,int turnover ){
    this.companyName=companyName;
    this.type=type;
    this.turnover=turnover;
  }

  public void setcompanyName(String companyName){
  this.companyName=companyName;
}
public String getcompanyName(){
return companyName;
}
public void setType(String type){
  this.type=type;
}
public String getType(){
return type;
}
public void setTurnover(int turnover){
  this.turnover=turnover;
}
public int getTurnover(){
   return turnover;
}
}

class Record{
  //Define all the variables and methods here
  public List<Company> companies;
  public String addCompany(Company company)
  {
    companies.add(company);
    return "Added";
  }
  public void filterData (String query)
  {
    if (query.contains("=="))
    {
      if (query.contains("type")) {
        int stposition1 = query.lastIndexOf("=") + 2;
        int enposition1 = query.length() - 1;
        String str = query.substring(stposition1, enposition1);
        companies.stream()
        .filter((com) -> com.getType().equals(str))
        .forEach((com) -> System.out.println(com));
      }
      else if (query.contains("name")) {
        int stposition2 = query.lastIndexOf("=") + 2;
        int enposition2 = query.length() - 1;
        String str = query.substring(stposition2, enposition2);
        companies.stream()
        .filter((com) -> com.getcompanyName().equals(str))
        .forEach((com) -> System.out.println(com));
      }
      else {
        System.out.println("Invalid Operator");
      }
    }
    else
    {
      System.out.println("Invalid Operator");
    }
  }
}

// Class name should be "Source",
// otherwise solution won't be accepted
public class Demo {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Company c1 = new Company("Doselect","IT",300);
    Record record = new Record();
    record.addCompany(c1);
    record.filterData("type == IT");
	}
}