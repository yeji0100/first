package fegopa;

public class �Ϲ�ȸ��_VO {
	///
	
	private String ID;
	private String PW;
	private String �ּ�;
	private String �̸�;
	private String ����ó;
	private String �������;
	private String �̸���;
	private String logtime;
	
	
	public �Ϲ�ȸ��_VO() {
		
	}
	
	public �Ϲ�ȸ��_VO(String iD, String pW) {
		ID = iD;
		PW = pW;
	}

	public �Ϲ�ȸ��_VO(String pW, String �ּ�, String �̸�, String ����ó, String �������, String �̸���) {
		this.PW = pW;
		this.�ּ� = �ּ�;
		this.�̸� = �̸�;
		this.����ó = ����ó;
		this.������� = �������;
		this.�̸��� = �̸���;
	}
	
	public �Ϲ�ȸ��_VO(String iD, String pW, String �ּ�, String �̸�, String ����ó, String �������, String �̸���) {
		this.ID = iD;
		this.PW = pW;
		this.�ּ� = �ּ�;
		this.�̸� = �̸�;
		this.����ó = ����ó;
		this.������� = �������;
		this.�̸��� = �̸���;
	}
	public �Ϲ�ȸ��_VO(String iD, String pW, String �ּ�, String �̸�, String ����ó, String �������, String �̸���, String logtime) {
		this.ID = iD;
		this.PW = pW;
		this.�ּ� = �ּ�;
		this.�̸� = �̸�;
		this.����ó = ����ó;
		this.������� = �������;
		this.�̸��� = �̸���;
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
	public String get�̸�() {
		return �̸�;
	}
	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	public String get����ó() {
		return ����ó;
	}
	public void set����ó(String ����ó) {
		this.����ó = ����ó;
	}
	public String get�������() {
		return �������;
	}
	public void set�������(String �������) {
		this.������� = �������;
	}
	public String get�̸���() {
		return �̸���;
	}
	public void set�̸���(String �̸���) {
		this.�̸��� = �̸���;
	}
	public String getLogtime() {
		return logtime;
	}
	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}
	
	
}
