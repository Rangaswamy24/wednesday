package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private int pid;
	private String pname;
	private String bg;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
	
	
	
}
