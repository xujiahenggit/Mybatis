package domain;

public class billType {
    private Integer id;
    private String name;

    public void setName(String name) {
        this.name = name;1111
        System.out.println("操练与喜爱");
         System.out.println("我自己修改的代码");
    }

    @Override
    public String toString() {
        return "billType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void aaa(String name) {
        this.name = name;
        System.out.println("操练与喜爱");
        System.out.println("我自己修改的代码");
    }
}
