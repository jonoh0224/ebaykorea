package examples.boot.webapi.api;

import examples.boot.webapi.dto.Board;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardRestController {
    @GetMapping
    public List<Board> getBoards(){
        List<Board> list = new ArrayList<>();
        list.add(new Board(1L, "홍길동",
                "test1", "content1", LocalDateTime.now()));
        list.add(new Board(2L, "고길동",
                "test2", "content2", LocalDateTime.now()));

        return list;
    }

    @PostMapping
    public Board saveBoard(@RequestBody Board board){
        board.setId(100L);

        return board;
    }
}
