package idone;

public class cartech {
	
	
	
	
	private String name;
	private Integer age;
	private Integer years;

	
	public cartech() {
		
		super();

		
	}
	
	public cartech(String name, Integer age, Integer years) {
		
		this.name = name;
		this.age = age;
		this.years = years;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "cartech [name=" + name + ", age=" + age + ", years=" + years + "]";
	}
	
	

}
