package day8;

public class Student {
	String name ;
	long number;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Prasanna";
		s1.number = 9363261343l;
		
		System.out.println(s1.name + s1.number);
	
		Student s2 = new Student();
		s2.name = "Lakshmanan";
		s2.number = 9364653343l;
		System.out.println(s2.name + s2.number);
		Student s3 = new Student();
		s3.name = "Mohan";
		s3.number = 9847961343l;
		System.out.println(s3.name + s3.number);
		Student s4 = new Student();
		s4.name = "Perumal";
		s4.number = 9300987343l;
		System.out.println(s4.name + s4.number);
	}

}
