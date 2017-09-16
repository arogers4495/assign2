public class Member {

	private String email, discription, name, phoneNum;

	public Member(String name, String phoneNum,String email, String job) {

		this.phoneNum = phoneNum;
		  this.email = email;
		  this.discription = job;
		  this.name = name;

	}

	public String getPhoneNum(){

	      return phoneNum;

	 }

	 public String getName(){

	return name;

	 }

	 public String getDiscription(){

	      return discription;

	 }

	 public String getEmail(){

	      return email;

	 }

	 public String toString(){

	     return name + "/n" + phoneNum +"/n"+ email +"/n"+ discription;
	 }

}
