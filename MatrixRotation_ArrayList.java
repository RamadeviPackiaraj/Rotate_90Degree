import java.util.ArrayList;
import java.util.Scanner;
public class MatrixRotation_ArrayList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the Square matrix(N*N):");
        int n=sc.nextInt();
        
        //Creating a 2d ArrayList
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        
        System.out.println("Enter the Matrix row by row:");
        for(int i=0;i<n;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }
        
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        
        System.out.println("\n Matrix After 90-degree rotation:");
        printMatrix(matrix);
        
        sc.close();
        
    }
    
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> matrix){
        
        int n=matrix.size();
        
        //Firstly Transpose the Matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix.get(i).get(j);
                matrix.get(i).set(j,matrix.get(j).get(i));
                matrix.get(j).set(i,temp);
            }
        }
        //now rotate 90 90-degree
        for(ArrayList<Integer>row:matrix){
            int left=0,right=n-1;
            while(left<right){
                int temp=row.get(left);
                row.set(left,row.get(right));
                row.set(right,temp);
                left++;
                right--;
            }
        }
    }
    
    
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}