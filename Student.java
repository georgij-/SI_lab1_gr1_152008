class Student {
	String index;
	String firstName;
	String lastName;
	int labPoints[];
	//TODO constructor
	Student() {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	//TODO seters & getters


	public double getAverage() {
		//TODO
		int averagePoints = 0;
		while(i<labPoints.length) {
			averagePoints += labPoints[i];
			i++;
		}
		return averagePoints / labPoints.length;
	}

	public boolean hasSignature() {
		//TODO
		if(getAverage() > 8) {
			return true;
		} else {
			return false;
		}
 	}
}
