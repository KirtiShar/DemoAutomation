package demoAutomation;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;
/*1. We have predefined class called CSVReader, create an object and pass the csv file path
2- call readAll() method which will return the csv content in List<String[]>
3-using Iterator, you can iterate all the values and use according to application*/

public class ReadCsvFiles {
 
 public static void main(String[] args) throws Exception {
    
 // This will load csv file 
 CSVReader reader = new CSVReader(new FileReader("C:\\Users\\anand.mohan.patel\\Documents\\Anand\\test.csv"));
 // this will load content into list
  List<String[]> li=reader.readAll();
  System.out.println("Total rows which we have is "+li.size());
            
 // create Iterator reference
  Iterator<String[]>i1= li.iterator();
    
 // Iterate all values 
 while(i1.hasNext()){
     
 String[] str=i1.next();
   
 System.out.print(" Values are ");
 
 for(int i=0;i<str.length;i++)
{
 
   System.out.print(" "+str[i]);
 
}
   System.out.println("   ");
     
    
}
 
}
 }