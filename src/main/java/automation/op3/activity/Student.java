package automation.op3.activity;

public class Student extends Person {

	private byte yearOfStudy;
	private String classId;
	private int registrationNumber;

	public byte getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(byte yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

}
