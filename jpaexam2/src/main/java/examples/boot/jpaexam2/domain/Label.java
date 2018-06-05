package examples.boot.jpaexam2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "label")
@Setter
@Getter
public class Label implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    private String name;
    private int parent;
    private int level;
    @CreatedDate //Entity가 생성되어 저장될 때 시간이 자동 저장
    private LocalDateTime regdate;

    @JsonBackReference
    @ManyToMany(mappedBy = "labels")
    private Set<Board> boards = new HashSet<>();

}
