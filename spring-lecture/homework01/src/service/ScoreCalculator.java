package service;

import java.util.Map;

import domain.Answer;

public class ScoreCalculator {

	public static int calculateScore(Map<Integer, Answer> answers) {

		int scoreResult = 0;

		for (int i = 1; i <= answers.size(); i++) {
			scoreResult += answers.get(i).getScore();
		}

		return scoreResult;
	}

	public static String calculateGrade(Map<Integer, Answer> answers) {
		int resultScore = calculateScore(answers);

		if(resultScore >= 30) {
			return "A";
		}

		if(resultScore >= 20) {
			return "B";
		}

		return "F";

	}
}
