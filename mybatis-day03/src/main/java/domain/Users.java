package domain;

import java.util.List;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 09:46
 * @Description:
 */
public class Users {

    private Integer id;
    private String uName;
    private String phone;
    private String address;

    //1对多的关系
    private List<Orders> ordersList;

    public Users() {
    }

    public Users(Integer id, String uName, String phone, String address, List<Orders> ordersList) {
        this.id = id;
        this.uName = uName;
        this.phone = phone;
        this.address = address;
        this.ordersList = ordersList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}
