import dao.billsMapper;
import domain.bills;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class testDemo {
    SqlSession sqlSession = null;

    @Before
    public void init(){
        try{
            Reader reader = Resources.getResourceAsReader("mapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void add(){
        bills bills=new bills();
        bills.setTitle("rng");
        bills.setBilltime("2018-10-20");
        bills.setTypeid(1);
        bills.setPrice(100.21);
        bills.setEnplain("asdasajdjadjajda");
        int i = sqlSession.getMapper(billsMapper.class).add(bills);
    }

    @Test
    public void update(){
        bills bills=new bills();
        bills.setId(8);
        bills.setEnplain("asdadadppisdifs");
        bills.setPrice(101.12);
        bills.setTypeid(3);
        bills.setTitle("中国足球的秘密");
        bills.setBilltime("1111-11-11");
        int i = sqlSession.getMapper(billsMapper.class).update(bills);
    }
    @Test
    public void queryLike(){
        List<bills> list = sqlSession.getMapper(billsMapper.class).queryLike("小");
        list.forEach(a-> System.out.println(a));
    }
    @Test
    public void queryById(){
        bills bills= sqlSession.getMapper(billsMapper.class).queryById(3);
        System.out.println(bills);
    }
    @Test
    public void selectid(){
        List<bills> selectid = sqlSession.getMapper(billsMapper.class).selectid(3);
        selectid.forEach(a-> System.out.println(a));

    }
    @Test
    public void del(){
        int i = sqlSession.getMapper(billsMapper.class).del(8);
        System.out.println("i===="+i);
    }








    @After
    public void destory(){
        try{
            if(sqlSession!=null){
                sqlSession.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            //回滚
            sqlSession.rollback();
        }finally {
            //用完之后关闭
            sqlSession.close();
        }
    }
}
