//package CH2_Elementary_prog_DL;
import java.util.*;
public class GuessTheNum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int guessnum;
    int ActualNum =748;
System.out.println("guess an integer number : ");
guessnum = sc.nextInt();
while(guessnum !=ActualNum){
    if (guessnum > ActualNum){
        System.out.println("you guess "+(guessnum-ActualNum)+" times greater tha Actul number");
    }
    else {
        System.out.println(" you guess "+(ActualNum -guessnum)+" times less than actual number");
    }
    System.out.println("try again");
    guessnum = sc.nextInt();
}
if (guessnum == ActualNum){
    System.out.println("you guessed successfully");
}
sc.close();

}
}