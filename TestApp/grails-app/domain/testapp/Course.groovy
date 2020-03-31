package testapp

class Course {

	String department;
	String courseTitle;
	String courseLeader;
	String courseCode;
	Date startDate;
	Date endDate;
	String studyMode;
	String description;
	Integer numberOfStudents;
	Double tuitionFees;
	
	
    static constraints = {

	department nullable: false
	department blank: false
	courseTitle nullable: false
	courseTitle blank: false
	courseLeader nullable: false
	courseLeader blank: false
	courseCode nullable: false
	courseCode blank: false
	numberOfStudents nullable: false
	numberOfStudents blank: false
	numberOfStudents min:20
	numberOfStudents max:60
	startDate nullable: false
	startDate blank: false
	endDate nullable: false
	endDate blank: false
	studyMode nullable: false
	studyMode blank: false
	studyMode minSize:20
	description nullable: false
	description blank: false
	description maxSize: 5000
	description widget:'textarea'
	tuitionFees nullable: false
	tuitionFees blank: false
	tuitionFees scale:2

    }
}
