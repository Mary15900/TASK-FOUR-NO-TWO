
public class ReverseArray {
//function that reverses an array and stores it in another array.
    static void reverse(int a [],int n)
    {
        int[] b=new int[n];
        int j= n;
        for (int i=0;i<n;i++){
            b[j-1]=a[i];
                
            j=j-1;
        }
        // printing the reverse array
        System.out.println("Reversed array is\n");
        
        for (int k=0;k<n;k++){
            System.out.println(b[k]);
        }
    }
    
    }
    
    
}
