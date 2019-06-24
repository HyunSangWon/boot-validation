package com.example.validation.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Author Sangwon Hyun on 2019-06-24
 */
public class PersonForm {

    /*message default값으로 한글이 출력됨*/
    @NotNull
    @Size(min=2,max=10,message = "length should be in between 6 to 10!")
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
