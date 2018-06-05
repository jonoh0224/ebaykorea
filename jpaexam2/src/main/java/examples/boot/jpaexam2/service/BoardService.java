package examples.boot.jpaexam2.service;

import examples.boot.jpaexam2.domain.Board;
import examples.boot.jpaexam2.domain.Image;

import java.util.List;

public interface BoardService {
    List<Board> getBoards();
    List<Board> getBoards(String searchType, String searchStr);
}
