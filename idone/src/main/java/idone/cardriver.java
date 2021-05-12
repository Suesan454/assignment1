package idone;

public class cardriver {
	
	private String name;
	private Integer age;
	private Integer points;

	
	public cardriver() {
		
		super();

		
	}
	
	public cardriver(String name, Integer age, Integer points) {
		
		this.name = name;
		this.age = age;
		this.points = points;
		
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

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "cardriver [name=" + name + ", age=" + age + ", points=" + points + "]";
	}
	
	


}
