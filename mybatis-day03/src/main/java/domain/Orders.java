package domain;

import java.util.Date;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 09:47
 * @Description:
 */
public class Orders {

    private Integer orderId;
    private String remark;
    private String orderNo;
    private Float cost;
    private Date createTime;
    private Integer userId;

    public Orders() {
    }

    public Orders(Integer orderId, String remark, String orderNo, Float cost, Date createTime, Integer userId) {
        this.orderId = orderId;
        this.remark = remark;
        this.orderNo = orderNo;
        this.cost = cost;
        this.createTime = createTime;
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", remark='" + remark + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", cost=" + cost +
                ", createTime=" + createTime +
                ", userId=" + userId +
                '}';
    }
}
