//Count how many specific char in a String

//For example, there are two 'o' in "Hello, I am Johann", so count=2

public class CountCh {
 public static void main (String args[]) {
        String s = "Hello, I am Johann.";
        int i, count=0, l=s.length();
        for(i=0;i<l-1;i++)
         if(s.charAt(i)=='o') {
          count+=1;
         } 
        System.out.println(count);      
  }
}