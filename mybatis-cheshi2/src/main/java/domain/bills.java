package domain;

public class bills {
    private Integer id;
    private String title;
    private String billtime;
    private Integer typeid;
    private double price;
    private String enplain;

    public bills() {
    }

    public bills(Integer id, String title, String billtime, Integer typeid, double price, String enplain) {
        this.id = id;
        this.title = title;
        this.billtime = billtime;
        this.typeid = typeid;
        this.price = price;
        this.enplain = enplain;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBilltime() {
        return billtime;
    }

    public void setBilltime(String billtime) {
        this.billtime = billtime;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEnplain() {
        return enplain;
    }

    public void setEnplain(String enplain) {
        this.enplain = enplain;
        System.out.println("asdasdasd");
    }
    sout
        

   
}
