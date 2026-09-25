import java.util.Scanner;
public class Search2DArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter columns : ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
    //Outer loop for input rows 
    for(int i = 0; i<rows; i++){
        //Inner (nested) loop for input columns
        for(int j = 0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
        }

    }
    System.out.println();
    System.out.println();
    // loop for print output
    for(int i = 0; i<rows; i++){
        for(int j = 0; j<cols; j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }
System.out.println();
System.out.println();
System.out.print("Enter any elemnt of above 2D array  to find location : ");
int  x = sc.nextInt();
for(int i = 0; i < rows; i++){
    for(int j = 0; j <cols; j++){
        if(numbers[i][j] == x ){
            System.out.println(" ["+i+"]"+"["+j+"]");
        }
    }
}
    
    }
    
}
