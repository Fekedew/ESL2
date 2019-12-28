public abstract class Dictionary {

	private int signId;
	private String sign;

	public int getSignId() {
		return signId;
	}

	public void setSignId(int signId) {
		this.signId = signId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSign(int signId) {
		return this.sign;
	}
}
