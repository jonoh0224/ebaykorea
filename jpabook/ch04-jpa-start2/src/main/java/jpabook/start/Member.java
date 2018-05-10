package jpabook.start;

import javax.persistence.*;  //**
import java.util.Date;

// uniqueConstraints : ddl 생성시에 유니크 제약조건을 만든다. 2개 이상의 복합 유니크 제약조건도 만들 수 있다.
@Entity
@Table(name="MEMBER", uniqueConstraints = {@UniqueConstraint( //추가 //**
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"} )})
public class Member {

    @Id // @Id가 적용가능한 타입은 자바 기본형, 자바 래퍼형, String, Date, BigDecimal, BigInteger
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME", nullable = false, length = 10) //추가 //**
//    @Column(name = "NAME") //추가 //**
    private String username;

    private Integer age;

    //=== 추가
    @Enumerated(EnumType.STRING) // enum타입을 사용한다. 데이터 베이스에 저장되는 크기가 작은건 단덤이지만 enum순서를 변경할 수 없다.
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) // 날짜 정보를 매핑할 때 사용한다.
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    @Transient // 이 필드는 맵핑하지 않는다.
    private String temp;


    //Getter, Setter

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

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
