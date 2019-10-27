import dao.entryMapper;
import domain.entry;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;
import java.util.Map;

public class Testdemo {
    SqlSession sqlSession = null;

    @Before
    public void init() {
        try {
            /*加载mybatis的核心配置文件*/
            Reader reader = Resources.getResourceAsReader("mapConfig.xml");
            /*获取mybatis的工厂对象*/
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            /*获取操作数据的对象：sqlsession*/
            sqlSession = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //插入
    @Test
    public void testinsert(){
        entry entry=new entry(null,3,"王菲","专辑ccc");
        int insert = sqlSession.getMapper(entryMapper.class).insertEntry(entry);
        sqlSession.commit();
        sqlSession.close();
    }
    //修改
    @Test
    public void test02(){
        entry entry=new entry(5,2,"1111","专辑111");
       sqlSession.getMapper(entryMapper.class).updateEntry(entry);
        sqlSession.commit();
        sqlSession.close();
    }
    //模糊查
    @Test
    public void test03(){
        List<entry> entryList = sqlSession.getMapper(entryMapper.class).querylike("郭德纲");
        entryList.forEach(temp-> System.out.println(temp));
    }
    //删除
    @Test
    public void test04(){
        int i = sqlSession.getMapper(entryMapper.class).delEntry(5);
        sqlSession.commit();
        sqlSession.close();

    }
    //2表连查
    @Test
    public void test05(){
        entry entry=new entry();
        entry.setId(5);
        List<Map> mapList = sqlSession.getMapper(entryMapper.class).seleAll(entry);
        mapList.forEach(a-> System.out.println(a));


    }


}


