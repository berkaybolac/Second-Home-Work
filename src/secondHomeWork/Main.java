package secondHomeWork;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setID(1);
		student.setName("Berkay");
		student.setSurname("Bolaç");
		student.setGender("Erkek");
		student.setAreaInterest("Machine Learning");
		
		Student student2 = new Student();
		student2.setID(2);
		student2.setName("Berk");
		student2.setSurname("Bol");
		student2.setGender("Erkek");
		student2.setAreaInterest(".Net Core and Java");
		
		Instructor instructor = new Instructor();
		instructor.setID(1);
		instructor.setName("Bat");
		instructor.setSurname("Bolcu");
		instructor.setGender("Erkek");
		instructor.setProfession("Java Developer");
		
		Instructor instructor2 = new Instructor();
		instructor2.setID(2);
		instructor2.setName("Kerem");
		instructor2.setSurname("Hayatçı");
		instructor2.setGender("Erkek");
		instructor2.setProfession(".Net Developer");
		
		Student[] studentList = {student, student2};
		
		Instructor[] instructorList = { instructor, instructor2}; 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.Add(instructor2);
		instructorManager.Delete(instructor);
		instructorManager.Delete(instructor2);
		instructorManager.GetById(instructor);
		instructorManager.Update(instructor);
		instructorManager.SearchUserByProperty(instructor2);
		instructorManager.GetAll(instructorList);
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		studentManager.Add(student2);
		studentManager.Delete(student);
		studentManager.Delete(student2);
		studentManager.GetById(student);
		studentManager.Update(student);
		instructorManager.SearchUserByProperty(student2);
		studentManager.GetAll(studentList);
		
		
	}
}
