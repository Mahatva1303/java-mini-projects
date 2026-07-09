import java.util.Scanner;
public class quiz_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = {"What is the main function of a router ?",
                            "Which part of the computer is consider the brain ?",
                            "What year was Facebook launched ?",
                            "Who is known as the father of computer ?",
                            "Whta was the first programming language ?"};

                    String[][] options = {{"1. Storing files","2. Encrypting data","3. Directing internet traffic","4. Managing passwards "},
                                        {"1.CPU","2. Hard drive","3.Ram","4. GPU"},
                                        {"1.2000","2. 2004","3. 2006","4. 2008"},
                                        {"1.Steve Jobs","2. Bill gates","3. Alan Turing","4. Charles Bagers"},
                                        {"1.COBOL","2.C","3.Fortran","4.Assembly"}};

                    int[] answers = {3,1,2,4,3};
                    int score = 0;
                    int guess;
                    System.out.println("*************************");
                    System.out.println("WELCOME TO JAVA QUIZ GAME");
                    System.out.println("*************************");
                    input.nextLine(); 

                    for(int i = 0; i < questions.length;i++){
                        System.out.println(questions[i]);
                        for(String option : options[i]){
                            System.out.println(option);
                        }

                        System.out.print("Enter your guess: ");
                        guess = input.nextInt();
                        if(guess == answers[i]){
                            System.out.println("*********");
                            System.out.println("CORRECT!");
                            System.out.println("*********");
                            score++;
                        }
                        else{
                            System.out.println("WRONG!!!");
                        }
                    }
                    System.out.println("YOUR FINAL SCORE: " + score + " Out of 5");

        input.close();
    }
}
