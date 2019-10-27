package dao;

import domain.Student;
import domain.Users;
import domain.Wife;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 09:11
 * @Description:
 */
public interface RelationMapper {

    //1对1关系查询
    List<Wife> selectOne2One(String name);

    //1对多的关系查询
    Users selectOne2Many(String phone);

    //多对多的关系查询
    List<Student> selectMany2Many();

    //1对1关系查询使用map
    List<Map> selectOne2One11(String name);

    //1对多关系查询使用map
    List<Map> selectOne2Manymap(String phone);



}
