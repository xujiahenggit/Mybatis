package domain;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 08:58
 * @Description:
 */
public class Wife {

    private Integer wifeid;
    private Integer nianlin;
    private String sex;
    private String wifename;
    private Integer hid;

    private Husband husband;//1对1的关系

    public Wife() {
    }

    public Wife(Integer wifeid, Integer nianlin, String sex, String wifename, Integer hid, Husband husband) {
        this.wifeid = wifeid;
        this.nianlin = nianlin;
        this.sex = sex;
        this.wifename = wifename;
        this.hid = hid;
        this.husband = husband;
    }

    public Integer getWifeid() {
        return wifeid;
    }

    public void setWifeid(Integer wifeid) {
        this.wifeid = wifeid;
    }

    public Integer getNianlin() {
        return nianlin;
    }

    public void setNianlin(Integer nianlin) {
        this.nianlin = nianlin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWifename() {
        return wifename;
    }

    public void setWifename(String wifename) {
        this.wifename = wifename;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "wifeid=" + wifeid +
                ", nianlin=" + nianlin +
                ", sex='" + sex + '\'' +
                ", wifename='" + wifename + '\'' +
                ", hid=" + hid +
                ", husband=" + husband +
                '}';
    }
}
