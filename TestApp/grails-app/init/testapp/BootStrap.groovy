package testapp

class BootStrap {

    def init = { servletContext ->

	def computing=new Course(
	department:'Computing',
	courseCode:'CS123',
	courseTitle:'BSc Hon Computing',
	courseLeader:'Dr Michelle Murphy',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents:'55',
	studyMode:'Fulltime',
	tuitionFees:'9000.60',
	description:"Lorem Ipsum is simply dummy text of the printing and typesetting 		industry. Lorem Ipsum has been the industry's standard dummy text ever since 		the 1500s."
	).save()



	def sports=new Course(
	department:'Sport',
	courseCode:'CS321',
	courseTitle:'BSc Hon Sport Science',
	courseLeader:'Mr Steve Barrel',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents:'55',
	studyMode:'Fulltime',
	tuitionFees:'9000.60',
	description:"Lorem Ipsum is simply dummy text of the printing and typesetting 		industry. Lorem Ipsum has been the industry's standard dummy text ever since 		the 1500s."
	).save()



	def game=new Course(
	department:'Gaming',
	courseCode:'CS231',
	courseTitle:'BSc Hon E-Sports',
	courseLeader:'Dr Disrespect',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents:'69',
	studyMode:'Fulltime',
	tuitionFees:'6969.69',
	description:"Lorem Ipsum is simply dummy text of the printing and typesetting 		industry. Lorem Ipsum has been the industry's standard dummy text ever since 		the 1500s."
	).save()









	def dbrad=new Lecturer(
	fullName:'Dave Bradbury',
	post:'Lecturer',
	subject:'Computing',
	lecturerEmail:'dbrad@hotmail.com',
	office:'492A',
	bio:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. 	Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
	).save()



	def tpart=new Lecturer(
	fullName:'Thomas Party',
	post:'Lecturer',
	subject:'Sport',
	lecturerEmail:'tpty@gmail.com',
	office:'568A',
	bio:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. 	Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
	).save()



	def srich=new Lecturer(
	fullName:'Scott Richardson',
	post:'Lecturer',
	subject:'Gaming',
	lecturerEmail:'scrich@hotmail.com',
	office:'420A',
	bio:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. 	Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
	).save()







	def comp=new Module(
	module_title:'Sys Arch',
	module_code:'MC1',
	credits:'40',
	lecturer:'Dave Bradbury',
	course:'BSc Hon Computing',
	description:"Lorem Ipsum is simply dummy text of the printing and typesetting 		industry. Lorem Ipsum has been the industry's standard dummy text ever since 		the 1500s."
	).save()





	def sport=new Module(
	module_title:'Recovery',
	module_code:'MC2',
	credits:'20',
	lecturer:'Thomas Party',
	course:'BSc Hon Sport Science',
	description:"Lorem Ipsum is simply dummy text of the printing and typesetting 		industry. Lorem Ipsum has been the industry's standard dummy text ever since 		the 1500s."
	).save()





	def gaming=new Module(
	module_title:'Get Good',
	module_code:'MC3',
	credits:'20',
	lecturer:'Scott Richardson',
	course:'BSc Hon E-Sports',
	description:"Lorem Ipsum is simply dummy text of the printing and typesetting 		industry. Lorem Ipsum has been the industry's standard dummy text ever since 		the 1500s."
	).save()
	







	def vanan=new Student(
	studentName:'Varun Anand',
	studentID:'b8017145',
	dob:new Date('23/06/2000'),
	isFundingAvailable:'yes',
	studentEmail:'b8017145@my.shu.ac.uk',
	studentUsername:'b8017145',
	studentPassword:'12345',
	course:'BSc Hon Computing',
	).save()




	def twhitt=new Student(
	studentName:'Tom Whittaker',
	studentID:'b878343',
	dob:new Date('02/03/2000'),
	isFundingAvailable:'no',
	studentEmail:'b878343@my.shu.ac.uk',
	studentUsername:'b878343',
	studentPassword:'fbzdfb',
	course:'BSc Hon Sport Science',
	).save()





	def edaff=new Student(
	studentName:'Eliott Daffin',
	studentID:'b801234',
	dob:new Date('01/01/1900'),
	isFundingAvailable:'no',
	studentEmail:'b801234@my.shu.ac.uk',
	studentUsername:'b801234',
	studentPassword:'wasds',
	course:'BSc Hon E-Sports',
	).save()

    }
    def destroy = {
    }
}
