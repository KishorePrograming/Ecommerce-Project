package Users;

abstract class User {
	String UserId = " ";
	String  password="";
	String 	logstatus = "";
	String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	abstract boolean  verfyuser();
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogstatus() {
		return logstatus;
	}
	public void setLogstatus(String logstatus) {
		this.logstatus = logstatus;
	}

}
