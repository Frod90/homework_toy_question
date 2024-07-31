package domain;

import java.util.List;

public enum Problem {

	FIRST(1, "Python에서 변수를 선언하는 방법은?", 10,
		List.of("var name", "name = value", "set name", "name == value"), 2),
	SECOND(2, "Python에서 리스트(List)의 특징은 무엇인가요?", 15,
		List.of("순서가 있고 변경 가능하다", "중복된 값을 가질 수 없다", "원소를 추가하거나 삭제할 수 없다", "정렬된 상태로 유지된다"), 1),
	THIRD(3, "Python에서 조건문을 작성하는 방법은?", 10, List.of("if-else", "for-in", "while", "def"), 1),
	FOURTH(4, "Python에서 함수를 정의하는 방법은?", 5, List.of("class", "def", "import", "return"), 2);

	final int number;
	final String question;
	final int score;
	final List<String> examples;
	final int answer;

	Problem(int number, String question, int score, List<String> examples, int answer) {

		this.number = number;
		this.question = question;
		this.score = score;
		this.examples = examples;
		this.answer = answer;

	}

	public int getAnswer() {
		return answer;
	}

	public List<String> getExamples() {
		return examples;
	}

	public int getNumber() {
		return number;
	}

	public String getQuestion() {
		return question;
	}

	public int getScore() {
		return score;
	}

}
