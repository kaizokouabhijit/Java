package inputoutputpackage;

import java.util.Scanner;

public class MatrixTest {

    public static void main(String[] args) {
        int [][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3x3 array");
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        {
            arr[i][j] = sc.nextInt();
        }}
        int [] sum = new int[10];
        int k=0;
        for(int i=0; i<3;i++)
        {
            sum[k] =0;
            for(int j=0;j<3;j++)
            {
                sum[k] = sum[k] + arr[i][j];
            }
            k++;
        }
        for(int j=0; j<3;j++)
        {
            sum[k] =0;
            for(int i=0;i<3;i++)
            {
                sum[k] = sum[k] + arr[i][j];
            }
            k++;
        }
        System.out.println(sum.length);
        int flag =0;
        for(int l=0;l<sum.length -1;l++)
        {
            if(sum[l+1] ==0)
            {break;}
            if(sum[l] != sum[l+1])
            {
                flag =1;
            }
        }
        if(flag ==1)
        {
            System.out.println("This is just an average matrix");

        }
        else{
            System.out.println("This is a beautiful matrix");
        }

    }
}
