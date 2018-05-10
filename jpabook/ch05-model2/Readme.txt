@ManyToOne

- optional : false로 설정하면 연관된 엔티티가 항상 있어야 한다. 기본값  true
- fetch : 글로벌 패치 전략을 설정한다. 기본값 : @ManyToOne=FetchType.EAGER , @OneToMany=FetchType=LAZY
- cascade : 영속성 전이 기능을 사용한다.
    cascade = CascadeType.PERSIST : 부모와 자식간의 엔티티가 있을 때 부모를 영속화 하면 자식도 모두 영속화 된다.

    ALL : 모두적용
    PERSIST : 영속
    MERGE : 병합
    REMOVE : 삭제
    REFRESH : REFRESH
    DETACH : DETACH
- targetEntity : 연관된 엔티티의 타입 정보를 설정한다. 이 기능은 거의 사용하지 않는다.

orphanRemoval = true : jpa는 부모 엔티티와 연관관계가 끊어진 엔티티를 자동으로 삭제하는 기능을 제공하는데 이를 고아 객체 제거라고 한다.


* JPA에서 엔티티를 저장할 때 연관된 모든 엔티티는 영속 상태여야 한다.


-----

수정

Member member = em.find(Member.class, "member1");
member.setName("홍길동");

em.update()는 없다. 영속성 컨텍스트에서 관리하는 객체는 커밋이 일어날때 자동으로 수정된다.


연관관계 제거


Member member = em.find(Member.class, "member1");
member.setTeam(null);

연관된 엔티티 삭제

member.setTeam(null);
em.remove(team);


------------

양방향 연관 관계일 때 연관관계의 주인이 외래키를 관리한다. 따라서 주인이 아닌 방향은 값을 설정하지 않아도 데이터베이스에 외래키 값이 정상입력된다.
주인이 아닌 곳에 입력된 값은 외래 키에 영향을 주지 않는다.

ex>

team1.getMembmers().add(member1); // 무시(연관관계의 주인이 아님)
member.setTeam(team1); // 연관관계 설정(연관관계의 주인)


-------------------------

