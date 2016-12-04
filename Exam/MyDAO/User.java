package MyDAO;

public class User {
	private int iduser;
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSurnameuser() {
		return surnameuser;
	}
	public void setSurnameuser(String surnameuser) {
		this.surnameuser = surnameuser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String first;
	private String surnameuser;
	private String email;
	private String password;

	}

