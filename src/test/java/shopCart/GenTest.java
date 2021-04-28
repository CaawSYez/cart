package shopCart;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.yh.shopCart.dao.BookMapper;

public class GenTest {

	@Test
	public void test() {
		Reader reader = null;

		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = builder.build(reader);
			SqlSession session=sqlSessionFactory.openSession();
			
			
			BookMapper mapper=session.getMapper(BookMapper.class);
			
			int count=mapper.countByExample(null);
			
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
