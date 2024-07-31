package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import domain.Answer;
import domain.Problem;
import output.ProblemPrinter;
import service.ScoreCalculator;

public class ProblemController {

	public void run() {

		Problem[] values = Problem.values();

		Map<Integer, Answer> answers = new HashMap<>();

		Scanner scanner = new Scanner(System.in);

		for (Problem value : values) {
			ProblemPrinter.printQuestionAndScore(value.getNumber(), value.getQuestion(), value.getScore());
			ProblemPrinter.printExample(value);
			int inputAnswer = scanner.nextInt();
			scanner.nextLine();

			Answer answer = new Answer(value.getNumber(), inputAnswer);
			answer.isCorrect(value);
			answers.put(value.getNumber(), answer);
		}

		int resultScore = ScoreCalculator.calculateScore(answers);
		String resultGrade = ScoreCalculator.calculateGrade(answers);
		ProblemPrinter.printResult(answers, resultScore, resultGrade);
	}

}
