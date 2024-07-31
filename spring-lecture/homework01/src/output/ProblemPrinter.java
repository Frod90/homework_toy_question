package output;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import domain.Answer;
import domain.Problem;

public class ProblemPrinter {

	public static void printQuestionAndScore(int no, String question, int score) {
		System.out.println(no + ". " + question + " (점수: " + score + "점)");
	}

	public static void printExample(Problem problem) {

		List<String> examples = problem.getExamples();

		for (int i = 0; i < examples.size(); i++) {
			System.out.print((i + 1) + ") " + examples.get(i) + " ");
		}

		System.out.println();
		System.out.print("-정답 : ");
	}

	public static void printResult(Map<Integer, Answer> answers, int resultScore, String resultGrade) {
		System.out.println("—----- 결과 —-------------");
		// System.out.println("응답한 내용 : ");

		StringJoiner stringJoiner = new StringJoiner(", ", "응답한 내용 : ", "");

		for (int i = 1; i <= answers.size(); i++) {
			Answer answer = answers.get(i);
			stringJoiner.add(answer.getQuestionNum() + "번 " + answer.getInputAnswer());
		}

		System.out.println(stringJoiner);
		System.out.println("당신 응답 합계 : " + resultScore + "점");
		System.out.println("학점은 " + resultGrade + " 입니다.");

	}

}
