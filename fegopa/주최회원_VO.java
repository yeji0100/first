package fegopa;

public class ����ȸ��_VO {
	private String ID;
	private String PW;
	private String �ּ�;
	private String �����;
	private String ����ó;
	private String logtime;
	///
	


	public ����ȸ��_VO(String iD, String pW, String �ּ�, String �����, String ����ó, String logtime) {
		this.ID = iD;
		this.PW = pW;
		this.�ּ� = �ּ�;
		this.����� = �����;
		this.����ó = ����ó;
		this.logtime = logtime;
	}


	public ����ȸ��_VO(String iD, String pW) {
		ID = iD;
		PW = pW;
	}


	public ����ȸ��_VO(String iD, String pW, String �ּ�, String �����, String ����ó) {
		this.ID = iD;
		this.PW = pW;
		this.�ּ� = �ּ�;
		this.����� = �����;
		this.����ó = ����ó;
	}
	
	
	public ����ȸ��_VO(String pW, String �ּ�, String �����, String ����ó) {
		this.PW = pW;
		this.�ּ� = �ּ�;
		this.����� = �����;
		this.����ó = ����ó;
	}




	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		this.PW = pW;
	}
	public String get�ּ�() {
		return �ּ�;
	}
	public void set�ּ�(String �ּ�) {
		this.�ּ� = �ּ�;
	}
	public String get�����() {
		return �����;
	}
	public void set�����(String �����) {
		this.����� = �����;
	}
	public String get����ó() {
		return ����ó;
	}
	public void set����ó(String ����ó) {
		this.����ó = ����ó;
	}
	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}

}
