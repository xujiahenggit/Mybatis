import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.EmpMapper;
import dao.RelationMapper;
import dao.WifeMapper;
import domain.Student;
import domain.Users;
import domain.Wife;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 09:27
 * @Description:
 */
public class TestDemo1 {

    SqlSession sqlSession = null;

    @Before
    public void init(){
        try{
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

    @Test
    public void test01(){
        List<Wife> wifeList = sqlSession.getMapper(RelationMapper.class).selectOne2One("小明");
        wifeList.forEach(temp-> System.out.println(temp));
    }

    @Test
    //使用map查询测试
    public void test11(){
        List<Map> mapList = sqlSession.getMapper(RelationMapper.class).selectOne2One11("小明");
        mapList.forEach(temp-> System.out.println(temp));
    }


    @Test
    public void test02(){
        Users users = sqlSession.getMapper(RelationMapper.class).selectOne2Many("159123456");
        System.out.println(users);
    }
    @Test
    //使用map查询1对多
    public void test22(){
        List<Map> mapList = sqlSession.getMapper(RelationMapper.class).selectOne2Manymap("159123456");
        mapList.forEach(a-> System.out.println(a));

    }



    @Test
    public void test03(){
        List<Student> list = sqlSession.getMapper(RelationMapper.class).selectMany2Many();
        list.forEach(temp-> System.out.println(temp));
    }

    @Test
    public void test04(){
        //测试分页
        //第一步：设置传入的参数
        //1.当前是第几页
        int pageNum = 2;
        //2.每页显示多少条记录
        int pageSize = 5;
        //第二步：使用PageHelper的API
        PageHelper.startPage(pageNum,pageSize);
        //第三步：查询数据
        List<Map> mapList = sqlSession.getMapper(EmpMapper.class).selectPagetHelper();
        //第四步：使用PageInfo的API
        //构造参数传入查询出来的数据
        PageInfo pageInfo = new PageInfo(mapList);
        //获取数据
        List list = pageInfo.getList();
        list.forEach(temp-> System.out.println(temp));
        System.out.println("当前是第几页："+pageInfo.getPageNum());
        System.out.println("每页显示多少条记录："+pageInfo.getPageSize());
        System.out.println("总共有多少条记录："+pageInfo.getTotal());
        System.out.println("总共有多少页："+pageInfo.getPages());
    }

    @Test
    public void test05(){
        List<Wife> all = sqlSession.getMapper(WifeMapper.class).findAll();
        for (Wife wife : all) {
            //只需要老婆的信息
            System.out.println(wife.getWifename());
            //System.out.println(wife.getHusband());
        }
    }

    //单元测试执行完之后，调用=必调用
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
