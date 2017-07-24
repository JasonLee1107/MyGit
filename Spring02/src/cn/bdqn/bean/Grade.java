package cn.bdqn.bean;

public class Grade {
	private String name; // 年级名称

	@Override
	public String toString() {
		return "Grade [name=" + name + "]";
	}

	public Grade() {
		super();
	}

	public Grade(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
