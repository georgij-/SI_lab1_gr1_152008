class Student {
	String index;
	String firstName;
	String lastName;
	int labPoints[];
	boolean signature;
	//TODO constructor
	Student() {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
		this.signature = signature;
	}
	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getAverage() {
		//TODO
		int averagePoints = 0;
		while (i < labPoints.length) {
			averagePoints += labPoints[i];
			i++;
		}
		return averagePoints / labPoints.length;
	}

	public boolean hasSignature() {
		//TODO
		if (getAverage() > 8) {
			return true;
		} else {
			return false;
		}
	}

	public boolean setSignature(signature) {
		this.signature = signature;
	}

}