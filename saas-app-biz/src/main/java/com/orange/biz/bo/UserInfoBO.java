package com.orange.biz.bo;

/**
 * @author chensy
 * @date 2024/3/30
 */
public class UserInfoBO {

    private Long id;

    private String name;

    private Integer age;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
