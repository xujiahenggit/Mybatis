package dao;

import java.util.List;
import java.util.Map;

/**
        * 接口开发
        */
public interface DemoMapper {
   //动态条件查询
    List<Map> selectActive(Map map);

    //动态条件更新
    int updateActive(Map map);

    //动态条件查询=使用trim标签
    List<Map> selectActiveByTrim(Map map);

    //批量查询
    List<Map> selectBatch(List list);

    //批量删除
     int deleteBatch(Integer[] t);

    //分页查询
    List<Map> selectPage(Map map);


    //分页查询：名字模糊查询
    List<Map>  selectPageLike(Map map);




}
