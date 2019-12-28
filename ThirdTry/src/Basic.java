public class Basic extends Dictionary {

	private String text;

	public String getText(int signId) {
		return this.text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
