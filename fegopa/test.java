package fegopa;

import java.util.Scanner;
import DAOVO.�Ϲ�ȸ��_DAO;
import DAOVO.�Ϲ�ȸ��_VO;

public class test {

	public static void main(String[] args) {
		///

		Scanner sc = new Scanner(System.in);
		
		�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();
//		�Ϲ�ȸ��_VO vo1 = new �Ϲ�ȸ��_VO("iD2", "pW", "�ּ�", "�̸�", "����ó", "�������", "�̸���");
//		System.out.println(�Ϲ�dao.insert(vo1));
		
		
		//�α��� ��� : id, pw �Է¹ޱ�
//		System.out.print("id �Է� >> ");
//		String id = sc.next();
//		System.out.print("pw �Է� >> ");
//		String pw = sc.next();
		String res = �Ϲ�dao.logIN(new �Ϲ�ȸ��_VO("123","11"));
		if(res !=null) {
		�Ϲ�dao.updateLogtime("123");}
//		System.out.println(�Ϲ�dao.updateLogtime(id));
		System.out.println("���� �α��� �� ���̵�" + �Ϲ�dao.selectID());
		
		
		
		//�α����� ȸ�� ���� �����ֱ�
		System.out.println(�Ϲ�dao.showCustomerInfo().get�������());
		System.out.println(�Ϲ�dao.showCustomerInfo().get����ó());
		System.out.println(�Ϲ�dao.showCustomerInfo().get�̸�());
		System.out.println(�Ϲ�dao.showCustomerInfo().get�̸���());
		System.out.println(�Ϲ�dao.showCustomerInfo().get�ּ�());
		
		
		�Ϲ�ȸ��_VO vo = null;
		//�α����� ȸ�� ���� ����
		int cnt = �Ϲ�dao.updateCustomerInfo(vo = new �Ϲ�ȸ��_VO("12345", "����", "����", "010", "1997", "dptmf24@naver.com"));
		
		System.out.println(cnt + " " + �Ϲ�dao.selectID()+" ���� ����� �н����� : " +�Ϲ�dao.showCustomerInfo().getPW());
	}

}
