package fr.ibformation.spring.bataille.batailleNavale.models;

public class Case {
	private long x;
	private long y;
	Bateau b;

	StatusCase status = StatusCase.UNDISCOVERED;
	CaseStatus status2 = CaseStatus.EAU;

	public Case(long x, long y) {

		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}

	public CaseStatus getStatus2() {
		return status2;
	}

	public void setStatus2(CaseStatus status2) {
		this.status2 = status2;
	}

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}

	public StatusCase getStatus() {
		return status;
	}

	public void setStatus(StatusCase status) {
		this.status = status;
	}

	public Bateau getB() {
		return b;
	}

	public void setB(Bateau b) {
		this.b = b;
	}

}
