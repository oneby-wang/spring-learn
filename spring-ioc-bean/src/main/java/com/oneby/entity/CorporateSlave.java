package com.oneby.entity;

/**
 * @ClassName CorporateSlave
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/21 12:32
 * @Version 1.0
 */
public class CorporateSlave {

    private Integer id;
    private String name;
    private String company;
    private String hobby;
    private String profession;

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
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "CorporateSlave{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hobby='" + hobby + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
