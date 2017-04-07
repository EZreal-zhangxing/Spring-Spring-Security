package hibernate;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Integer statue;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatue() {
		return statue;
	}
	public void setStatue(Integer statue) {
		this.statue = statue;
	}
	public User(Integer id, String username, String password, Integer statue) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.statue = statue;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", statue=" + statue + "]";
	}
	
}
