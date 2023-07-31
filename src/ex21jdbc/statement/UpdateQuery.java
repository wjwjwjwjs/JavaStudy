package ex21jdbc.statement;

import java.sql.SQLException;

// 추상클래스를 상속하여 클래스를 정의한다.
public class UpdateQuery extends ConnectDB {
	
	/* 부모클래스의 생성자 중 매개변수가 있는것을 호출하기위해
	super(인수)와 같은 형태로 기술한다. 이를 통해 DB가 연결된다. */
	public UpdateQuery(String user, String pass) {
		super(user, pass);
	}
	
	/* 부모클래스의 추상메서드를 오버라이딩하여 update기능을
	수행할 수 있는 메서드로 재정의한다. */
	@Override
	void execute() {

		try {
			// 쿼리실행을 위한 Statement 객체생성
			stmt = con.createStatement();
			
			// 쿼리문 작성
			String sql = "UPDATE member "
					+ " Set "
					+ " 	pass='1110' ,	 "
					+ " 	name='테스터33', 	"
					+ " 	regidate=sysdate 	"
					+ " WHERE id = 'test1' ";
			
			System.out.println("sql= "+ sql);
			
			// 쿼리문 실행 및 결과확인
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 업데이트 됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리오류");
		}
		catch (Exception e) {
			System.out.println("알 수 없는 예외발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	
	public static void main(String[] args) {
		new UpdateQuery("education", "1234").execute();
	}
}
