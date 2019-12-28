public class Intermediate extends Dictionary {

	private String text;
	private String description;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription(int signId) {
		return this.description;
	}

	public String getText(int signId) {
		return this.text;
	}
}
