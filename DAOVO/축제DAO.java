package DAOVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ����DAO {
	
	//1. insertFestival : ������ϱ��
	//2. updateFestival : �������� ������
	//3. deleteFestival : ���� �������
	//4. selectMyFestivalInfo : ������ ���� ���� ��ȸ���
	//5. showFestivalList : ��ü ���� ��� ��ȸ���
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	����ȸ��_DAO ����dao = new ����ȸ��_DAO();
	����ȸ��_VO ����vo = null;
	
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
	
	//���� ��� 
	public int insertFestival(����VO vo) {
		
		String id = ����dao.selectID();
		int cnt = 0;
		try {
			getConn();

			String sql = "insert into festival values(?,?,?,?,?,?,?,?,?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.get����ID());
			pst.setString(2, vo.get������());
			pst.setString(3, vo.get���۱Ⱓ());
			pst.setString(4, vo.get����Ⱓ());
			pst.setString(5, vo.get�ּ�());
			pst.setString(6, vo.get�������ó());
			pst.setString(7, vo.get��������());
			pst.setString(8, vo.get÷������());
			pst.setString(9, id);

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
	//�������� ����
	public int updateFestivalInfo(����VO vo, String ����id) {
		int cnt = 0;
		try {
			getConn();
			String sql = "update festival set ������ = ? , ���۱Ⱓ = ? , ����Ⱓ = ? , �ּ� = ? , �������ó = ?, �������� = ?, ÷������ = ? where ����id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.get������());
			pst.setString(2, vo.get���۱Ⱓ());
			pst.setString(3, vo.get����Ⱓ());
			pst.setString(4, vo.get�ּ�());
			pst.setString(5, vo.get�������ó());
			pst.setString(6, vo.get��������());
			pst.setString(7, vo.get÷������());
			pst.setString(8, ����id);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//���� ���� ����
	public int deleteFestival(String ����id) {
		int cnt = 0;
		try {
			getConn();

			String sql = "delete from festival where ����id = ?";
			pst = conn.prepareStatement(sql);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//���� ����Ʈ
	public ArrayList<����VO> showFestivalList() {
		ArrayList<����VO> list = new ArrayList<����VO>();
		����VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM festival";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String ����id = rs.getString(1);
				String ������ = rs.getString(2);
				String ���۱Ⱓ = rs.getString(3);
				String ����Ⱓ = rs.getString(4);
				String �ּ� = rs.getString(5);
				String �������ó = rs.getString(6);
				String �������� = rs.getString(7);
				String ÷������ = rs.getString(8);
				String ����id = rs.getString(9);
				vo = new ����VO(����id, ������, ���۱Ⱓ, ����Ⱓ, �ּ�, �������ó, ��������, ÷������, ����id);
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	//���� ���� ��ȸ
	public ArrayList<����VO> showMyFestivalInfo(String ����id) {
		ArrayList<����VO> list = new ArrayList<����VO>();
		����VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM festival where ����id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, ����id);
			rs = pst.executeQuery();
			while (rs.next()) {
				String ������ = rs.getString(1);
				String ���۱Ⱓ = rs.getString(2);
				String ����Ⱓ = rs.getString(3);
				String �ּ� = rs.getString(4);
				String �������ó = rs.getString(5);
				String �������� = rs.getString(6);
				String ÷������ = rs.getString(7);
				String ����id = rs.getString(8);
				vo = new ����VO(����id, ������, ���۱Ⱓ, ����Ⱓ, �ּ�, �������ó, ��������, ÷������, ����id);
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	}
	
	
	

