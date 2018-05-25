package examples.boot.webapi.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement
public class Board {
    private Long id;
    private String name;
    private String title;
    private String content;
    private LocalDateTime regdate;
}
