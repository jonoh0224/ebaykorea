package examples.boot.jpaexam.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_connection")
@Getter
@Setter
@NoArgsConstructor
public class UserConnection implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String providerId;
    private String providerUserId;
    private int rank;
    private String displayName;
    private String profileUrl;
    private String imageUrl;
    private String accessToken;
    private String secret;
    private String refreshToken;

    private long expireTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    User user;

    // 헬퍼메소드
    public void setUser(User user){
        this.user = user;
        if(!user.getUserConnections().contains(this)){
            user.getUserConnections().add(this);
        }
    }

}
