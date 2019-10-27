package domain;

import java.util.List;

public class categoryId {
    private Integer id;
    private  String name;

    //一对多的关系
    private List<entry> entryList;

    public categoryId() {
    }

    public categoryId(Integer id, String name, List<entry> entryList) {
        this.id = id;
        this.name = name;
        this.entryList = entryList;
    }

    @Override
    public String toString() {
        return "categoryId{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", entryList=" + entryList +
                '}';
    }
}
