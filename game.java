import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int cpu = (int)(Math.random() * 3);
        int user, draw=0, lose=0, won=0,turn=3;
        System.out.println(" welcome ");
        for ( int i = 1; i <= 3; i++ )
        {
            System.out.println(" SCORE: PC " + lose + "   USER " + won);
            System.out.println(" you have " + turn + " turns ");
            do{
		        System.out.println(" scissor (0), rock (1), paper (2): ");
                user = input.nextInt();
            }while(user < 0 || user > 2);

		    System.out.print("The computer is ");
		    switch (cpu)
		    {
			    case 0: System.out.print("scissor."); break;
			    case 1: System.out.print("rock."); break;
			    case 2: System.out.print("paper.");
		    }

		    System.out.print(" You are ");
		    switch (user)
		    {
		    	case 0: System.out.print("scissor"); break;
		    	case 1: System.out.print("rock"); break;
		    	case 2: System.out.print("paper ");
		    }

		    if (cpu == user){
                System.out.println(" too. It is a draw");
                draw++;
            }else{
			    boolean win = (user == 0 && cpu == 2) ||
			    				  (user == 1 && cpu == 0) || 
			    				  (user == 2 && cpu == 1);
			    if (win){
                    System.out.println(". You won");
                    won++;
                }else{
                    System.out.println(". You lose");
                    lose++;
                }
            }
            if(won==2 || lose==2)
            {
            i=3;
            }
            turn=3-i;
        }

        if(draw == 3){
            System.out.println("DRAW");
            System.out.println(" SCORE: PC " + lose + "   USER " + won);
	    }else if(won > lose){
            System.out.println("WINNER");
            System.out.println(" SCORE: PC " + lose + "   USER " + won);
        }else{
            System.out.println("LOSER");
            System.out.println(" SCORE: PC " + lose + "   USER " + won);
        }
    }
}