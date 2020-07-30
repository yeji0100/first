package DAOVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class �Ϲ�ȸ��_DAO {
		// -- ������ ��� ���� --
		// insert() : vo �޾Ƽ� ȸ������
		// logIN() : ���̵�, ��й�ȣ �޾� ��ġ�ϴ��� Ȯ���ϰ�, ��ġ�ϸ� id ����
		// updateLogtime() : �α��� ���� �� �ش� id�� systime �����Ͽ� �α��� ���� ����
		// selectID() : ���� �α��� �Ǿ��ִ� id ���� ������
		// deleteCustomer() : ���� �α��ε� ȸ�� Ż��
		// showCustomerInfo() : ���� �α��ε� ȸ�� ��������
		// updateCustomerInfo() : ���� �α��ε� ȸ�� ��������
	///
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	private void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �Ϲ�ȸ��ȸ������
	public int insert(�Ϲ�ȸ��_VO vo) {

		int cnt = 0;
		try {
			getConn();

			String sql = "insert into customer values(?,?,?,?,?,?,?,null)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			pst.setString(3, vo.get�ּ�());
			pst.setString(4, vo.get�̸�());
			pst.setString(5, vo.get����ó());
			pst.setString(6, vo.get�������());
			pst.setString(7, vo.get�̸���());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// �α��α��

	public String logIN(�Ϲ�ȸ��_VO vo) {
		String result=null;
		try {
			getConn();
			String sql = "select id from customer where id = ? and pw = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			rs = pst.executeQuery();
			if (rs.next()) {
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// systimestamp update ���(�α��ν� ����)
	public int updateLogtime(String id) {
		int cnt = 0;
		try {
			getConn();
			String sql = "update customer set logtime = systimestamp where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// ���� �α����� ���̵� ��������
	public String selectID() {
		String id = null;
		try {
			getConn();
			String sql = "select id from customer where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				id = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return id;
	}

	// ȸ�� ������ȸ(���β�)
	public �Ϲ�ȸ��_VO showCustomerInfo() {
		�Ϲ�ȸ��_VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM CUSTOMER where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String �ּ� = rs.getString(3);
				String �̸� = rs.getString(4);
				String ����ó = rs.getString(5);
				String ������� = rs.getString(6);
				String �̸��� = rs.getString(7);
				String logtime = rs.getString(8);
				vo = new �Ϲ�ȸ��_VO(id, pw, �ּ�, �̸�, ����ó, �������, �̸���, logtime);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	// ȸ��Ż�� -- ���� �α����� ȸ���� Ż��
	public int deleteCustomer() {

		int cnt = 0;
		try {
			getConn();

			String sql = "delete from customer where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
//	 ȸ�� ���� - - -> ���� �α����� ȸ���� ������ ����
	public int updateCustomerInfo(�Ϲ�ȸ��_VO vo) {

		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE CUSTOMER SET pw = ?, �ּ� = ?, �̸� = ?, ����ó = ?, ������� = ? , �̸��� = ? where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getPW());
			pst.setString(2, vo.get�ּ�());
			pst.setString(3, vo.get�̸�());
			pst.setString(4, vo.get����ó());
			pst.setString(5, vo.get�������());
			pst.setString(6, vo.get�̸���());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}
	
}
