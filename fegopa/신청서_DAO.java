package fegopa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ��û��_DAO {
	///updateApply : ��û�� �ۼ����� ����(�Ϲ�ȸ���� �ڱⰡ �ۼ��� ��û�� ����)
	// ��û�� ���� ����(�����ڰ� ���氡�� : ����  updateApplyCommit, ��� updateApplyWait, ���� updateApplyRefuse)
	// deleteApply ��û�� ����(�Ϲ�ȸ���� �ڱⰡ �ۼ��� ��û�� ����)
	// insertApply : ��û�� �ֱ� (�Ϲ�ȸ���� �ڱⰡ �뿩�Ϸ��� �ν� ��û�� �ۼ�)
	// selectMyApply() : ������ �ۼ��� ��û�� ��� ��ü����
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	����ȸ��_DAO ����dao = new ����ȸ��_DAO();
	�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();
	����DAO ����dao = new ����DAO();
	

	private void getConnection() {
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
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//��û�� �ۼ�(�Ϲ�ȸ��)

	public int insertApply(��û��_VO vo) {
		String id = �Ϲ�dao.selectID();
		int cnt = 0;
		int num = 0;
		try {
			getConnection();

			String sql = "insert into apply(��ûid,�̸�,����ڹ�ȣ,����ó,�ν�id,�ν��Ұ� ,÷������,ȸ��id,����id) values(EX_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.get�̸�());
			psmt.setString(2, vo.get����ڹ�ȣ());
			psmt.setString(3, vo.get����ó());
			psmt.setString(4, vo.get�ν�id());
			psmt.setString(5, vo.get�ν��Ұ�());
			psmt.setString(6, vo.get÷������());
			psmt.setString(7, id);
			psmt.setString(8, vo.get����id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//��û�� ����(�Ϲ�ȸ��)
	public int deleteApply(String ��ûid) {
		String id = �Ϲ�dao.selectID();
		int cnt = 0;
		try {
			getConnection();

			String sql = "DELETE FROM apply where ��ûid=? and ȸ��id = ?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, ��ûid);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//��û�� ����(�Ϲ�ȸ��)
	public int updateApply(��û��_VO vo) {
		String id = �Ϲ�dao.selectID();
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ����ڹ�ȣ=?,����ó=?,�ν�id=?,�ν��Ұ�=?,÷������=?,��û����=? where ��ûid=? and ȸ��id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get����ڹ�ȣ());
			psmt.setString(2, vo.get����ó());
			psmt.setString(3, vo.get�ν�id());
			psmt.setString(4, vo.get�ν��Ұ�());
			psmt.setString(5, vo.get÷������());
			psmt.setString(6, vo.get��û����());
			psmt.setNString(7, vo.get��ûid());
			psmt.setString(8, id);
			

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	//������ �ۼ��� ��û�� ��� ����
	public ArrayList<��û��_VO> selectMyApply() {

		ArrayList<��û��_VO> list = new ArrayList<��û��_VO>();
		String id = �Ϲ�dao.selectID();
		
		try {
			getConnection();
			
			String sql = "SELECT * FROM apply where ȸ��id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String app_id = rs.getString(1);
				String cus_id = rs.getString(2);
				String app_num = rs.getString(3);
				String cus_tel = rs.getString(4);
				String boo_id = rs.getString(5);
				String app_int = rs.getString(6);
				String fes_file = rs.getString(7);
				String ��û���� = rs.getString(8);
				String ȸ��id = rs.getString(9);

				list.add(new ��û��_VO(app_id, cus_id, app_num, cus_tel, boo_id, app_int, fes_file, ��û����, ȸ��id));
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
	//��û�� ���� ����(����.����.���)
	// --> ���� '���'�� ��ȯ
	public int updateApplyWait(��û��_VO vo) {
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ��û����= '���' where �ν�id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get�ν�id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	// --> ���� '�³�'�� ��ȯ
	public int updateAppltCommit(��û��_VO vo) {
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ��û����= '����' where �ν�id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get�ν�id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	// --> ���� '����'�� ��ȯ
	public int updateApplyRefuse(��û��_VO vo) {
		
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ��û����= '����' where �ν�id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get�ν�id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	
	
	
	
	
	
	

}
