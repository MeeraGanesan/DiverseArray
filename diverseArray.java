import java.util.*;
class diverseArray
{
    public static int[] rowSums(int[][] arr2D)
    {
        int b[]=new int[arr2D.length];
        for (int i=0;i<arr2D.length;i++)
        {
            for (int j=0;j<arr2D[i].length;j++)
            {
              b[i]=b[i]+arr2D[i][j];
            }
            System.out.println("The row  " + (i+1) + " sum = " + b[i]);
        }
        return b;
    }
    public static boolean isDiverse(int[][] arr2D)
    {
        int arr[]=rowSums(arr2D);
        boolean diverse=true;
        for (int i=0;i<arr.length ;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    diverse=false;
                    break;
                }
            }
        }
        return diverse;
    }
    
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=SC.nextInt();
        System.out.println("Enter the number of columns");
        int n=SC.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the values");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=SC.nextInt();
            }
        }
        boolean fin=isDiverse(a);
        if (fin==true)
        {
          System.out.println("Is diverse");
    }
        else
        {
            System.out.println("Not diverse");
        }
    }
}
    
        