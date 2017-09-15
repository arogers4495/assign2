
public class Member {

	protected String education, name, pic, job, phone, email, desc;

	public Member(String name, String phone, String email, String desc) {
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.desc = desc;
	}

	public String ProfilePic() {

		return pic;

	}

	public String Education() {

		return education;

	}

	public String Job() {

		return job;

	}

}
