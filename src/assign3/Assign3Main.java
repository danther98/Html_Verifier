package assign3;


import java.io.IOException;
import java.util.Scanner;

public class Assign3Main {
    static int lineCount = 0;
    static Assign3Stack stack = new Assign3Stack();
    static boolean flag;

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String line;
       
        
        while ((reader.hasNextLine())) {
            lineCount++;
if(flag==false) {
            line = reader.nextLine();
            doesHTMLMatch(line);


        }

        }

    }

   

    public static void doesHTMLMatch(String html) {
        

        int j = html.indexOf('<');
        while (j != -1) {
            int k = html.indexOf('>', j + 1);
            if (k == -1) {
      
            }

            String tag = html.substring(j + 1, k);

            if (!tag.startsWith("/")) {//if opening tag add to stack 
               
                if(tag.startsWith("!")||(tag.contains("br"))||(tag.contains("hr"))) { //checking if comments or tags with no closing 
                    
                    break;
                }
                stack.push(tag);
      
                
            } else {
                if (!stack.isStackEmpty()) {
             
                }

                if (tag.substring(1).equals(stack.pop())) { //reading if closing tag matches first element (opening tag)
                    
           
                    
                    if(stack.isStackEmpty()) {
                        System.out.println("Congratulations...  \r\n"
                                + "The given HTML file meets all the tag rules..  ");
                        
                    }
                    break;
                }else {
                    if(tag.substring(1).matches("a")||tag.substring(1).matches("body")) { //checking for descriptors 
                      
                        break;
                    }
                    
                    lineCount=lineCount+1;
                    System.out.println("Oops... There is a problem.. ");
                    System.out.println("The "+tag+" tag at line #"+lineCount+" does not meet the tag rules..");
                    flag=true;
                    return;
                    
                }

            }
            j = html.indexOf('<', k + 1);
            if (stack.isQueueEmpty()) {
           
            }   
    }
 
   
}
}