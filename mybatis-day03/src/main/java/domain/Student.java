package domain;

import java.util.List;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 10:25
 * @Description:
 */
public class Student {

    private Integer stuid;
    private String stuname;

    private List<Score> scoreList;

    private List<Course> courseList;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", scoreList=" + scoreList +
                ", courseList=" + courseList +
                '}';
    }
}
