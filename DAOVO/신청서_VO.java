package DAOVO;

public class ��û��_VO {

	// apply ���̺��� ������ �ִ� Į��//.
	private String ��ûid;
	private String �̸�;
	private String ����ڹ�ȣ;
	private String ����ó;
	private String �ν�id;
	private String �ν��Ұ�;
	private String ÷������;
	private String ��û����;
	private String ȸ��id;
	private String ����id;
	
	

	

	public ��û��_VO(String �̸�, String ����ڹ�ȣ, String ����ó, String �ν�id, String �ν��Ұ�, String ÷������, String ����id) {
		this.�̸� = �̸�;
		this.����ڹ�ȣ = ����ڹ�ȣ;
		this.����ó = ����ó;
		this.�ν�id = �ν�id;
		this.�ν��Ұ� = �ν��Ұ�;
		this.÷������ = ÷������;
		this.����id = ����id;
	}


	public ��û��_VO(String ��ûid, String �̸�, String ����ڹ�ȣ, String ����ó, String �ν�id, String �ν��Ұ�, String ÷������, String ��û����,
			String ȸ��id, String ����id) {
		this.��ûid = ��ûid;
		this.�̸� = �̸�;
		this.����ڹ�ȣ = ����ڹ�ȣ;
		this.����ó = ����ó;
		this.�ν�id = �ν�id;
		this.�ν��Ұ� = �ν��Ұ�;
		this.÷������ = ÷������;
		this.��û���� = ��û����;
		this.ȸ��id = ȸ��id;
		this.����id = ����id;
	}
	

	public ��û��_VO(String �̸�, String ����ڹ�ȣ, String ����ó, String �ν�id, String �ν��Ұ�, String ÷������, String ��û����, String ȸ��id,
			String ����id) {
		this.�̸� = �̸�;
		this.����ڹ�ȣ = ����ڹ�ȣ;
		this.����ó = ����ó;
		this.�ν�id = �ν�id;
		this.�ν��Ұ� = �ν��Ұ�;
		this.÷������ = ÷������;
		this.��û���� = ��û����;
		this.ȸ��id = ȸ��id;
		this.����id = ����id;
	}





	public String get����id() {
		return ����id;
	}

	public void set����id(String ����id) {
		this.����id = ����id;
	}
	
	public String getȸ��id() {
		return ȸ��id;
	}

	public void setȸ��id(String ȸ��id) {
		this.ȸ��id = ȸ��id;
	}
	
	public String get��û����() {
		return ��û����;
	}

	public void set��û����(String ��û����) {
		this.��û���� = ��û����;
	}

	public ��û��_VO(String ȸ��id) {
		super();
		this.ȸ��id = ȸ��id;
	}

	public String get��ûid() {
		return ��ûid;
	}

	public void set��ûid(String ��ûid) {
		this.��ûid = ��ûid;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get����ڹ�ȣ() {
		return ����ڹ�ȣ;
	}

	public void set����ڹ�ȣ(String ����ڹ�ȣ) {
		this.����ڹ�ȣ = ����ڹ�ȣ;
	}

	public String get����ó() {
		return ����ó;
	}

	public void set����ó(String ����ó) {
		this.����ó = ����ó;
	}

	public String get�ν�id() {
		return �ν�id;
	}

	public void set�ν�id(String �ν�id) {
		this.�ν�id = �ν�id;
	}

	public String get�ν��Ұ�() {
		return �ν��Ұ�;
	}

	public void set�ν��Ұ�(String �ν��Ұ�) {
		this.�ν��Ұ� = �ν��Ұ�;
	}

	public String get÷������() {
		return ÷������;
	}

	public void set÷������(String ÷������) {
		this.÷������ = ÷������;
	}

}
