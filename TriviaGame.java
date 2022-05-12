import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class TriviaGame {
    public static void main(String[] args) {

        try {
            File f = new File("triviaQuestions.txt");
            Scanner scanner = new Scanner(f);
            ArrayList<Question> ques = new ArrayList<>();//creating array list of object question
			for(int i=0 ;scanner.hasNextLine();i++) {
                String Question = scanner.nextLine();//taking question in the variable question
                String Answer1 = scanner.nextLine();//taking 1st option  in the variable Answer1
                String Answer2 = scanner.nextLine();//taking 2d option in the variable Answer2
                String Answer3 = scanner.nextLine();//taking 3rd optionin the variable Answer3
                String Answer4 = scanner.nextLine();//taking 4th option in the variable Correct4
                String correctAnswer = scanner.nextLine(); // taking corret answer in variable CorrectAnswer
                ques.add(i,(new Question (Question, Answer1,Answer2,Answer3,Answer4,correctAnswer)));
            }
            //Player 1
            Player player1 = new Player(1);
            //Player 2
            Player player2 = new Player(2);
            Scanner input = new Scanner(System.in);
            String answer;
            for(int i =0 ; i<(ques.size()); i+=2){
                System.out.println("Question for player #" + player1.getPlayerId());
                System.out.println("------------------------");
                System.out.println(ques.get(i).toString());
                answer = input.nextLine();
                if(answer.equals(ques.get(i).getCorrectAnswer())){
                    System.out.println("Correct answer");
                    player1.incPoints();
                }
                else{
                    System.out.println("Sorry, that is incorrect. The correct answer is " + ques.get(i).getCorrectAnswer());
                }

                System.out.println("Question for player #" + player2.getPlayerId());
                System.out.println("------------------------");
                System.out.println(ques.get(i+1).toString());
                answer = input.nextLine();
                if(answer.equals(ques.get(i+1).getCorrectAnswer())){
                    System.out.println("Correct answer");
                    player2.incPoints();
                }
                else{
                    System.out.println("Sorry, that is incorrect. The correct answer is " + ques.get(i+1).getCorrectAnswer());

                }
                
            }
            System.out.println("Game over!");
            System.out.println("------------------------");
            System.out.println("Player " + player1.getPlayerId() + "'s points: " + player1.getPoints());
            System.out.println("Player " + player2.getPlayerId() + "'s points: " + player2.getPoints());

            if(player1.getPoints()>player2.getPoints()){
                System.out.println("Player 1 wins!");
            }
            else{
                System.out.println("Player 2 wins!");
            }
            
            input.close();
            scanner.close(); // Close the stream
		} catch (Exception e) {
			e.printStackTrace();
            System.out.println("File cannot be opened");
		}


    }
}
