package domain;

/**
 * @Auther: zhaojing
 * @Date: 2019/9/19 10:28
 * @Description:
 */
public class Score {

    private Integer sid;
    private Integer cid;
    private Integer stuid;
    private Float score;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", stuid=" + stuid +
                ", score=" + score +
                '}';
    }
}
