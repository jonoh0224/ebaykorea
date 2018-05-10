package jpabook.start;

import javax.persistence.*;  //**

@Entity // 테이블과 맵핑된다고 알린다.
@Table(name="MEMBER") //맵핑할 테이블 정보를 전달
public class Member {

    @Id // 엔티티 클래스의 필드를 테이블의 기본키에 매핑
    @Column(name = "ID") // 필드를 칼럼에 매핑
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    @Column(name = "NAME")
    private String username;

    private Integer age; // 칼럼 애노테이션이 사용되지 않을 경우 필드명과 같은 칼럼명이 맵핑

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
