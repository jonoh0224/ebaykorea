package examples.boot.myboard;

import examples.boot.myboard.domain.Board;
import examples.boot.myboard.domain.User;
import examples.boot.myboard.repository.BoardRepository;
import examples.boot.myboard.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BoardRepositoryTest {
    @Autowired
    BoardRepository boardRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void testBoardCount() throws Exception{
        User user = userRepository.findUserByEmail("urstory@gmail.com");
        Board board = new Board();
        board.setUser(user);
        board.setTitle("test");
        board.setContent("hello world");
        boardRepository.save(board);

        long count = boardRepository.countByTitleContains("test");
        Assert.assertEquals(1L, count);

        count = boardRepository.countByContentContains("llo");
        Assert.assertEquals(1L, count);
    }

    @Test
    public void testFindBoardBy() throws Exception{
        User user = userRepository.findUserByEmail("urstory@gmail.com");
        Board board = new Board();
        board.setUser(user);
        board.setTitle("test");
        board.setContent("hello world");
        boardRepository.save(board);

        Board board2 = new Board();
        board2.setUser(user);
        board2.setTitle("test2");
        board2.setContent("hello2 world2");
        boardRepository.save(board2);

        Board board3 = new Board();
        board3.setUser(user);
        board3.setTitle("test3");
        board3.setContent("hello3 world2");
        boardRepository.save(board3);

        PageRequest pageRequest = PageRequest.of(0, 2,new Sort(Sort.Direction.DESC, "regdate"));
        Page<Board> list = boardRepository.findAllBy(pageRequest);
        for(Board b : list){
            System.out.println(b.getTitle());
            System.out.println(b.getRegdate());
            System.out.println(b.getUser().getName());
            System.out.println("--------------------------------------------------");
        }

        pageRequest = PageRequest.of(1, 2,new Sort(Sort.Direction.DESC, "regdate"));
        list = boardRepository.findAllBy(pageRequest);
        for(Board b : list){
            System.out.println(b.getTitle());
            System.out.println(b.getRegdate());
            System.out.println(b.getUser().getName());
            System.out.println("==================================================");
        }
    }
}
