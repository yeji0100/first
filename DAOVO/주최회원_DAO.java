package DAOVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ����ȸ��_DAO {
	// -- ������ ��� ���� --
	// insert() : vo �޾Ƽ� ���ַ� ȸ������
	// logIN() : ���̵�, ��й�ȣ �޾� ��ġ�ϴ��� Ȯ���ϰ�, ��ġ�ϸ� (����)id ����
	// updateLogtime() : �α��� ���� �� �ش� (����)id�� systime �����Ͽ� �α��� ���� ����
	// selectID() : ���� �α��� �Ǿ��ִ� (����)id ���� ������
	// deleteHost() : ���� �α��ε� (����)ȸ�� Ż��
	// showHostInfo() : ���� �α��ε� (����)ȸ�� ��������
	// updateHostInfo() : ���� �α��ε� (����)ȸ�� ��������
	///
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);

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

	// ������ ȸ������ ȸ������
	public int insert(����ȸ��_VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "insert into HOST values(?,?,?,?,?,null)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			pst.setString(3, vo.get�ּ�());
			pst.setString(4, vo.get�����());
			pst.setString(5, vo.get����ó());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// ȸ��Ż�� -- ���� �α����� ȸ���� Ż��
	public int deleteHost() {

		int cnt = 0;
		try {
			getConn();

			String sql = "delete from host where logtime = (select max(logtime) from host)";

			pst = conn.prepareStatement(sql);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}


	// �α��α�� -- > id, pw�� ��ġ�ؾ� �α��� : id�� return
	public String logIN(����ȸ��_VO vo) {
		String result = null;
		try {
			getConn();
			String sql = "select id from host where id = ? and pw = ?";

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
			String sql = "update host set logtime = systimestamp where id = ?";
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
			String sql = "select id from host where logtime = (select max(logtime) from host)";

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
	public ����ȸ��_VO showHostInfo() {
		����ȸ��_VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM host where logtime = (select max(logtime) from host)";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String �ּ� = rs.getString(3);
				String ����� = rs.getString(4);
				String ����ó = rs.getString(5);
				String logtime = rs.getString(6);
				vo = new ����ȸ��_VO(id, pw, �ּ�, �����, ����ó, logtime);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}
	
	//	 ȸ�� ���� - - -> ���� �α����� ȸ���� ������ ����
	public int updateHostInfo(����ȸ��_VO vo) {

		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE host SET pw = ?, �ּ� = ?, ����� = ?, ����ó = ? where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getPW());
			pst.setString(2, vo.get�ּ�());
			pst.setString(3, vo.get�����());
			pst.setString(4, vo.get����ó());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}
	
	

}
