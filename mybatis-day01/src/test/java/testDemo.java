import domain.Books;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class testDemo {
    SqlSession sqlSession=null;


    @Before
    public void init() {
        try {
            Reader reader = Resources.getResourceAsReader("mapConfig.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testSelect1() throws Exception {
        Reader reader = Resources.getResourceAsReader("mapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Object> selectList = sqlSession.selectList("mapper.BooksMapper.queryBooks");
        selectList.forEach(a -> System.out.println(a));
        sqlSession.close();
    }

    @Test
    public void test01() {
        List<Object> selectList = sqlSession.selectList("mapper.BooksMapper.queryBooks1");
        selectList.forEach(a -> System.out.println(a));
    }

    @Test
    public void testlike01() {
        List<Object> selectList = sqlSession.selectList("mapper.BooksMapper.queryByLikeName1", "入门");
        selectList.forEach(a -> System.out.println(a));
    }

    @Test
    public void testlike02() {
        List<Object> selectList = sqlSession.selectList("mapper.BooksMapper.queryByLikeName2", "%入门%");
        selectList.forEach(a -> System.out.println(a));
    }

    @Test
    public void testlike03() {
        Books books = new Books();
        books.setBookName("入门");
        List<Object> selectList = sqlSession.selectList("mapper.BooksMapper.queryByLikeName3", books);
        selectList.forEach(a -> System.out.println(a));
    }

    @Test
    public void testlike04() {
        List<Object> selectList = sqlSession.selectList("mapper.BooksMapper.queryByLikeName4", "入门");
        selectList.forEach(a -> System.out.println(a));
    }

    @Test
    public void insertinto() {
        Books book = new Books(null, "三毛", 500.5, 30);
        int i = sqlSession.insert("mapper.BooksMapper.insertBook", book);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update() {
        Books books = new Books();
        books.setId(7);
        books.setPrice(80.2);
        sqlSession.update("mapper.BooksMapper.updateBook", books);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void delete() {
        sqlSession.delete("mapper.BooksMapper.delBook", 8);
        sqlSession.commit();
        sqlSession.close();

    }
}

