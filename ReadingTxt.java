package JavaPgm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingTxt {

                @SuppressWarnings("null")
                public static void main(String[] args) throws Exception
                {
                                File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\JavaAutomation\\test.txt");
                                FileReader fr=new FileReader(f);
                                BufferedReader bf=new BufferedReader(fr);
                                String line; 
        
        // Initializing counters 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
        while((line = bf.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paragraphCount++; 
            } 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 
    } 


                }

