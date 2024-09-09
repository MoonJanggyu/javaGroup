package t15_Api.T01_Object;

//toString
public class Test2VO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address=" + address
				+ "]";
	}
	
	
	
	// VO 객체에는 저장을 계속 하고 다니는데 이것을 중간에 흘리지 않았는가 점검 하기 위해 마지막에 toString을 해서 return 값에 주소가 아닌 '값'을 저장해 두기
	// 즉 getter, setter를 만들고 toString도 만든다.
	// source 탭에가면 generate toString 이 있다.
//	@Override
//	public String toString() {
//		return "Test2[name="+name+", age="+age+", gender="+gender+", job="+job+", adress="+ address+"]";
}


// 즉 VO객체는 필드를 먼저 선언하고
// 1. getter setter
// 2. toString               만들기 필수

