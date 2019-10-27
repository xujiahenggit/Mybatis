package dao;

import domain.bills;

import java.util.List;

/*功能要求：
1.	添加一条账单信息
2.	根据账单id修改账单信息
3.	根据账单标题模糊查询账单信息
4.	根据账单id查询账单信息
5.	根据类型id查询账单信息
6.	删除指定id的账单信息
*/
public interface billsMapper {

    int add(bills bills);
    int update(bills bills);
    List<bills> queryLike(String title);
    bills queryById(Integer id);
    List<bills> selectid(Integer id);
    int del(Integer id);

}
