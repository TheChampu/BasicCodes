import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOption;

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

public class QuizApplication {
    private List<Question> questions;
    private int score;
    private int timeLimitInSeconds;

    public QuizApplication(List<Question> questions, int timeLimitInSeconds) {
        this.questions = questions;
        this.timeLimitInSeconds = timeLimitInSeconds;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        score = 0;

        // Shuffle questions for randomization
        Collections.shuffle(questions);

        // Start the timer
        Thread timerThread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(timeLimitInSeconds);
                System.out.println("\nTime's up!");
                displayFinalScore();
                System.exit(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();

        // Present questions to the user
        for (Question question : questions) {
            System.out.println("\n" + question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Your choice: ");
            int userChoice = scanner.nextInt();

            // Check if the user's choice is correct
            if (userChoice == question.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectOption());
            }
        }

        // Stop the timer
        timerThread.interrupt();

        // Display the final score
        displayFinalScore();
    }

    private void displayFinalScore() {
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.size());
    }

    public static void main(String[] args) {
        // Sample quiz with questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                List.of("Berlin", "Madrid", "Paris", "Rome"), 3));
        questions.add(new Question("Which planet is known as the Red Planet?",
                List.of("Mars", "Venus", "Jupiter", "Saturn"), 1));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?",
                List.of("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"), 2));

        // Create a QuizApplication with a time limit of 20 seconds
        QuizApplication quizApp = new QuizApplication(questions, 20);

        // Start the quiz
        quizApp.startQuiz();
    }
}
//Shivanshu Deo