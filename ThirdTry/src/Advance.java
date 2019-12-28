public class Advance extends Dictionary {

	private String sentence;
	private String description;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSentance(int signId) {
		throw new UnsupportedOperationException();
	}

	public String getDescription(int signId) {
		return this.description;
	}
}
