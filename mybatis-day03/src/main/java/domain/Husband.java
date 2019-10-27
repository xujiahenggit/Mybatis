package domain;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 08:53
 * @Description:
 */
public class Husband {

    private Integer husid;
    private Integer age;
    private String gender;
    private String husbandname;

    public Husband() {
    }

    public Husband(Integer husid, Integer age, String gender, String husbandname) {
        this.husid = husid;
        this.age = age;
        this.gender = gender;
        this.husbandname = husbandname;
    }

    public Integer getHusid() {
        return husid;
    }

    public void setHusid(Integer husid) {
        this.husid = husid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHusbandname() {
        return husbandname;
    }

    public void setHusbandname(String husbandname) {
        this.husbandname = husbandname;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "husid=" + husid +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", husbandname='" + husbandname + '\'' +
                '}';
    }
}
