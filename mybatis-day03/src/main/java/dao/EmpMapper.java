package dao;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 11:21
 * @Description:
 */
public interface EmpMapper {

    //分页查询
    List<Map> selectPagetHelper();
}
