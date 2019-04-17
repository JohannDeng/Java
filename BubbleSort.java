public class BubbleSort {
  public static void main (String args[]) {
    int a[] = {2,6,80,100,8,-9,23};
    int i, j, l=a.length;
    for(i=0;i<l-1;i++) 
       for(j=i+1;j<l;j++)
          if(a[i]>a[j]) {
             int t=a[i];
             a[i]=a[j];
             a[j]=t;
          }
     for(i=0;i<l;i++)
        System.out.println(a[i]);
   }
}