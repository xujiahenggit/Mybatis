import dao.DemoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo {
    SqlSession sqlSession=null;
    @Before
    public void init(){

        try {
            /*加载mybatis的核心配置文件*/
            Reader reader = Resources.getResourceAsReader("MapConfig.xml");
            /*获取mybatis的工厂对象*/
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            /*获取操作数据的对象：sqlsession*/
            sqlSession = sessionFactory.openSession(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void testActive(){
        Map map = new HashMap();
        //map.put("brand","联想");
        map.put("startPrice",5000);
        map.put("endPrice",100000);
        List<Map> mapList = sqlSession.getMapper(DemoMapper.class).selectActive(map);
        mapList.forEach(temp-> System.out.println(temp));
    }
    @Test
    public void testUpdateActive() {
        Map map = new HashMap();
        map.put("brand", "神舟333");
        map.put("id", 3);
        int i = sqlSession.getMapper(DemoMapper.class).updateActive(map);
        System.out.println("i:" + i);
    }
    @Test
    public void testActiveByTrim(){
        Map map=new HashMap();
        map.put("brand","联想");
        map.put("startPrice",5000);
        map.put("endPrice",10000);
        List<Map> mapList=sqlSession.getMapper(DemoMapper.class).selectActive(map);
        mapList.forEach(temp-> System.out.println(temp));
    }
    @Test
    public void testSelectBatch(){
        List list=new ArrayList();
        list.add(10);
        list.add(11);
        list.add(12);
        List<Map> mapList = sqlSession.getMapper(DemoMapper.class).selectBatch(list);
        mapList.forEach(temp-> System.out.println(temp));
    }

    @Test
    public void testDelBatch() {
      Integer[] t=new Integer[]{13,14,15};
        int i = sqlSession.getMapper(DemoMapper.class).deleteBatch(t);
        System.out.println("i"+i);
    }
    @Test
    public void testPage(){
        Map map=new HashMap();
        map.put("start",0);
        map.put("size",3);
        List<Map> mapList = sqlSession.getMapper(DemoMapper.class).selectPage(map);
        mapList.forEach(temp-> System.out.println(temp));
    }
    public void testPageLike(){
        Map map=new HashMap();
        map.put("start",0);
        map.put("size",3);
        map.put("ename","张");
        List<Map> mapList = sqlSession.getMapper(DemoMapper.class).selectPageLike(map);
        mapList.forEach(temp-> System.out.println(temp));
    }
  //单元测试执行完之后，调用=必调用
    @After
    public void destory(){
        try {
            if(sqlSession!=null){
                sqlSession.commit();
            }
        }catch (Exception e){
            e.printStackTrace();
            //回滚
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
    }
    }
