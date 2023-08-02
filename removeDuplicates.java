import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    String str=input.next();
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        set.add(ch);
    }
    for(char ch:set){
    System.out.print(ch);
    }
}
}
