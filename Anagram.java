import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();
   char ch1[]=str1.toCharArray();
    char ch2[]=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(Arrays.equals(ch1,ch2)){
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
    }
}
