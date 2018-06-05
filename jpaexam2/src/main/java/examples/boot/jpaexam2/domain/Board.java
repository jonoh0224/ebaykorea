package examples.boot.jpaexam2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "board")
@Setter
@Getter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Board implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB의 identity 컬럼을 이용
    private Long no;
    private String subject;
    @Column(columnDefinition = "TEXT") // jpa 2.0 이상 지원
    private String content;
    @CreatedDate //Entity가 생성되어 저장될 때 시간이 자동 저장
    private LocalDateTime regdate;
    @LastModifiedDate //조회한 Entity의 값을 변경할 때 시간이 자동 저장
    private LocalDateTime modifydate;
    private Long userNo;
    private Long albumNo;

    @JsonManagedReference
    @OneToMany(mappedBy = "board")
    Set<Image> images = new HashSet<>();

    @JsonManagedReference
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "board_label",
            joinColumns = @JoinColumn(name = "board_no", referencedColumnName = "no"),
            inverseJoinColumns = @JoinColumn(name = "label_no", referencedColumnName = "no"))
    private Set<Label> labels = new HashSet<>();

}

