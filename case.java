//code to return the integer number of words in the input string
//note. in input every new word is concatenated at the end of previous word and started with the uppercase
//eg. saveChangesInTheEditor 5 words
import java.util.Scanner;
public class Case{
    public static void main(String args[]){
        int count=1;//intialize count to 1
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();//take input of the string and store it in line
        char[] ch=new char[line.length()];//declare a char array of length of string
        for(int i=0;i<line.length();i++){
            ch[i]=line.charAt(i);//convert  input string into char array
        }
        for(int i=0;i<line.length();i++){
            
             if (ch[i] >= 'A' && ch[i] <= 'Z') {//check when there is a uppercase letter and count++
                 count++;
             }
        }
        System.out.println(count);
        
    }
}
