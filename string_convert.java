//WAP to take the input of full name and print it in short form
//exmaple abhishek sharma>>a.sharma
public class string_convert {
    String funtn(String name){//take the input of the string
        String [] st=name.split(" ");//split the string entered using the split function
        String str=" ";//declare a empty string
        for(int i=0;i<st.length -1;i++){//apply the loop till length-1 because we want to store and print the last word full
            str=str+st[i].charAt(0)+".";//this will take the first element of every word of the string array
        }
        return (str+st[st.length-1]);           
    }
    public static void main(String[] args) {
        String name;
        string_convert obj=new string_convert();//make the object call the function
        System.out.println(obj.funtn("abhishek sharma"));
    }
    
}
