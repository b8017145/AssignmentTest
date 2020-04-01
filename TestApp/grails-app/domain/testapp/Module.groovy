package testapp

class Module {

	String module_title;
	String module_code;
	Integer credits;
	String lecturer;
	String course;
	String description;


    static constraints = {

	module_title nullable:false
	module_title blank:false
	module_code nullable:false
	module_code blank:false
	credits nullable:false
	credits blank:false
	credits min:20
	credits max:120
	lecturer nullable:false
	lecturer blank:false
	description nullable:false
	description blank:false
	description maxSize:5000
	description widget:'textarea'
	


    }
}
