import java.util.Scanner;
public class MatrixRotation{
    static int[][] rotateMatrix(int[][] mat,int rows,int cols){
                int[][] newMat = new int[cols][rows]; // New matrix with swapped dimensions

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                newMat[j][rows-i-1]=mat[i][j];
            }
        }
        return newMat;
    }
    
    
    static void displayMatrix(int[][] mat){
        for(int[] row:mat){
            for(int elem:row){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the Number of cols:");
        int cols=sc.nextInt();
    
        int mat[][]=new int[rows][cols];
        
        System.out.println("Enter the Element of the Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
        } }
        int[][] rotatemat=rotateMatrix(mat,rows,cols);
        
        System.out.println("Rotate Matrix:");
        displayMatrix(rotatemat);
        sc.close();
    }
}