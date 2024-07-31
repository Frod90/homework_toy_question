package domain;

public class Answer {

	int questionNum;
	boolean correctSign;
	int inputAnswer;
	int score;

	public Answer(int questionNum, int inputAnswer) {
		this.questionNum = questionNum;
		this.inputAnswer = inputAnswer;
	}

	public void isCorrect(Problem problem) {

		if (problem.getAnswer() == inputAnswer) {
			correctSign = true;
			score = problem.getScore();
		}
	}

	public int getScore(){
		return score;
	}

	public int getQuestionNum() {
		return questionNum;
	}

	public int getInputAnswer() {
		return inputAnswer;
	}

	@Override
	public String toString() {
		return "Answer{" +
			"questionNum=" + questionNum +
			", correctSign=" + correctSign +
			", inputAnswer=" + inputAnswer +
			", score=" + score +
			'}';
	}
}
