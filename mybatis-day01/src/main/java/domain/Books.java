package domain;

       /*  POJO实体类
         实体类的名字和表名一样
        */
public class Books {

           /*注意：实体类中的属性名和数据表中字段名一样！*/
    private Integer id;
    private String bookName;
    private Double price;
    private Integer num;

    public Books(){

    }

    public Books(Integer id, String bookName, Double price, Integer num) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
