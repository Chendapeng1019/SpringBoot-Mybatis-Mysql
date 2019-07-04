package springbootDemo.entity;

import java.io.Serializable;

/**
 * @ClassName Car
 * @Description
 * @Author chendapeng
 * @Date 2019/7/4
 **/

public class Car implements Serializable {

    private int id;

    private String name;
    private String ctime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }
}
