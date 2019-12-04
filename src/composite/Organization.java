package composite;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description
 */
public abstract class Organization {

    public Organization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // 默认实现两个方法，叶子结点不需要 add remove
    public void add(Organization organization){

    }

    public void remove(Organization organization){

    }

    public abstract void print();
}
