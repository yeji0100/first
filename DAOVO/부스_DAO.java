package DAOVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class �ν�_DAO {
	
	// insertBooth : ���������� �Ҵ��� �ν� ���
	// selectBoothCon �ν� id�� �ش��ϴ� �ν� ���� ��ȸ 
	//deleteBooth ��ϵ� �ν� ����
	//updateBooth ��ϵ� �ν� ���� 
	//�ν�����(���,����)���� : updateBoothWait, updateBoothCommit
	// selectAllBooth() : ��ϵ� ��� �ν� ��ȸ(�Ϲ�ȸ���� �����ְ�)
	//selectMyBooth() �α��� ���� ����ȸ���� ����� �ν� ����
	//showFestivalBoothCon : ����id�� �ν�id�� �ν� ���� ��ȸ 
	

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	����ȸ��_DAO ����dao = new ����ȸ��_DAO();

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
	//�ν����
	public int insertBooth(�ν�VO vo) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into booth values(EX_SEQ.NEXTVAL2,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, vo.get�ν�����());
			pst.setInt(2, vo.get�뿩��());
			pst.setString(3, vo.get�뿩���۱Ⱓ());
			pst.setString(4, vo.get�뿩����Ⱓ());
			pst.setString(5, vo.get�ν�ũ��());
			pst.setString(6, vo.get�ν�����());
			pst.setString(7, vo.get����ID());
			
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}	
	//deleteBooth ��ϵ� �ν� ����
	public int deleteBooth(String �ν�id) { 

		int cnt = 0;
		try {
			getConn();

			String sql = "DELETE FROM BOOTH where �ν�id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, �ν�id);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}	
	//updateBooth ��ϵ� �ν� ���� 
	public int updateBooth(�ν�VO vo) {

	int cnt = 0;
	try {
		getConn();
		
		String sql = "UPDATE BOOTH SET �ν�id=?,�ν�����=?,�뿩��=?,�뿩���۱Ⱓ=?,�뿩����Ⱓ=?,�ν�ũ��=?,�ν�����=? where ����ID = ? and �ν�ID = ? ";

		pst = conn.prepareStatement(sql);

		pst.setString(1, vo.get�ν�ID());
		pst.setString(2, vo.get�ν�����());
		pst.setInt(3, vo.get�뿩��());
		pst.setString(4, vo.get�뿩���۱Ⱓ());
		pst.setString(5, vo.get�뿩����Ⱓ());
		pst.setString(6, vo.get�ν�ũ��());
		pst.setString(7, vo.get�ν�����());
		

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}

	//��ϵȺν���ȸ
	
	//1. selectAllBooth �Ϲ�ȸ���� Ư�� ������ �ش��ϴ� �ν��� ��ȸ
	public ArrayList<�ν�VO> selectAllBooth(String ����id){
		ArrayList<�ν�VO> BOOTH = new ArrayList<�ν�VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where ����id = ?";
			
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				String iD = rs.getString(1);
		} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return BOOTH;
		}
	
	//2. selectMyBooth() �α��� ���� ����ȸ���� ����� �ν� ����
	public ArrayList<�ν�VO> selectMyBooth(){
		ArrayList<�ν�VO> BOOTH = new ArrayList<�ν�VO>();
		String ����id = ����dao.selectID();
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where ����id = (select id from festival where ����id = ?) ";
			pst = conn.prepareStatement(sql);

			pst.setString(1, ����id);
			
			rs = pst.executeQuery();
			while (rs.next()) {
				String iD = rs.getString(1);
		} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return BOOTH;
		}
	
	//selectBoothCon �ν� id�� �ش��ϴ� �ν� ���� ��ȸ 
	public String selectBoothCon(String �ν�id) {
		String condition = null;
		try {
			getConn();
			String sql = "select �ν����� from booth where �ν�id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, �ν�id);
			rs = pst.executeQuery();
			if (rs.next()) {
				condition = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return condition;
	}
	
	//showFestivalBoothCon �ش����� �ν�id�� �ν� ���� ��ȸ 
		public ArrayList<�ν�VO> showFestivalBoothCon(String ����id) {
			ArrayList<�ν�VO> list = new ArrayList<�ν�VO>();
			try {
				getConn();
				String sql = "select �ν�id, �ν����� from booth where ����id = ?";

				pst = conn.prepareStatement(sql);
				pst.setString(1, ����id);
				rs = pst.executeQuery();
				while(rs.next()) {
					String �ν�id = rs.getString(1);
					String �ν����� = rs.getString(2);
					�ν�VO vo = new �ν�VO(�ν�id, �ν�����);
					list.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
			return list;
		}
	
	
	//�ν�����(���,����)����
	public int updateBoothCommit(�ν�VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET �ν�����= '����' where �ν�id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get�ν�ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	public int updateBoothWait(�ν�VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET �ν�����= '���' where �ν�id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get�ν�ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	
}
