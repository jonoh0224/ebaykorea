package examples.boot.myboard;

import examples.boot.myboard.domain.Board;
import examples.boot.myboard.repository.BoardRepository;
import examples.boot.myboard.repository.UserRepository;
import examples.boot.myboard.service.BoardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.mockito.ArgumentMatchers.anyLong;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BoardServiceTest {
    @Autowired
    BoardService boardService;

    @MockBean
    BoardRepository boardRepository;

    @MockBean
    UserRepository userRepository;

    @Test
    public void testGetBoardCount() throws Exception{
        Board board = new Board();
        board.setTitle("hello");
        BDDMockito.given(boardRepository.getOne(anyLong()))
                .willReturn(board);

        Board result = boardService.getBoard(1L);

        System.out.println("===============================================");
        System.out.println(result.getTitle());
        System.out.println("===============================================");
        BDDMockito.verify(boardRepository).getOne(anyLong());
    }
}
