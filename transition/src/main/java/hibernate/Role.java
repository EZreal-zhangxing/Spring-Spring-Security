package hibernate;

public class Role {
	private Integer id;
	private Integer userid;
	private String roleCode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public Role(Integer id, Integer userid, String roleCode) {
		super();
		this.id = id;
		this.userid = userid;
		this.roleCode = roleCode;
	}
	public Role() {
		super();
	}
	
}
