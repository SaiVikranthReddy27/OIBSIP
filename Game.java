import java.util.*;
public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        int ans = rand.nextInt(101);
        int c=0;
        while(c<5){
            System.out.println("----- Guess "+(c+1)+" -----");
            System.out.println("Please Enter Your Number Between 1 and 100:");
            int a =sc.nextInt();
            if(a==ans){
                System.out.println("*****Congratulations*****");
                System.out.println("You had guessed the right number!!!");
                break;
            }
            if(c==4){
                System.out.println("           //Sorry//        ");
                System.out.println("$$ You Had Failed To Guess The Number $$");
                System.out.println("     The Correct Number is : "+ans);
                System.out.println("    Better Luck Next Time......");
            }
            else if(ans<a){
                if(c==4){
                    break;
                }
                System.out.println("Number is less than : "+a);
            }
            else{
                if(c==4){
                    break;
                }
                System.out.println("Number is GreaterThan : "+a);
            }
            c++;
        }   
    }
}
