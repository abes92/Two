package exercices;

public class test1 {
	public static void main(String[] args) {

		test obj = new test(01, "abes", 100000);

		int id = obj.getId();
		String name = obj.getName();
		int salary = obj.getSalary();

		System.out.println(id + " " + name + " " + salary);

	}

}
