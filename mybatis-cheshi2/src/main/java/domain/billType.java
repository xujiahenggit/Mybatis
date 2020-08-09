package domain;

public class billType {
    private Integer id;
    private String name;

    public billType() {
    }

    public billType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("操练与喜爱");
        if("6"=="6"){
            System.out.println("最后再试一次");
        }
    }

    @Override
    public String toString() {
        return "billType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
