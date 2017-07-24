package cn.bdqn.bean;

public class Student {
	private String name; // 姓名
	private Integer age; // 年龄
	private Grade grade; // 年级

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade
				+ "]";
	}

	// p 注入的时候需要
	public Student() {
		super();
	}

	// 带参构造
	public Student(String name, Integer age, Grade grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// p 必须要有set（）
	public String getName() {
		return name;
	}

	// set（） DI 依赖注入 public void setName(String name) { this.name = name; }

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
