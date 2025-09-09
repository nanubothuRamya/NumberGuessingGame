import java.util.Scanner;
public class Numberguessinggame {
    public static  void game(){
        
        Scanner sc=new Scanner(System.in);
        
        int  number = 1 + (int)(100 * Math.random());//random number is Generated
        
        int k=10;//number of attempts
        
        System.out.println("A Number is choosen Between 1 to 100");
        
        System.out.println("You Have "+ k +" Attempts to guess the correct answer");
        
        for(int i=0;i<k;i++){
            System.out.println("Enter your Guess:");
            
            int guess=sc.nextInt();
            
            if(guess==number){
                System.out.println("Congratulations! you have won the game");
                sc.close();
            }
            
            
            else if(guess<number){
                System.out.println( "The Number is greater than"+ guess);
            }
            else{
                System.out.println("The Number is less than " + guess);

            }
                
        }

    System.out.println("You have run out of attempts The correct answer was"+number);
    sc.close();
    }
    
    public static void main(String args[]){
        game();
    }
    
}
