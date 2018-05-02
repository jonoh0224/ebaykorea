package examples.boot.myboard.service;

import examples.boot.myboard.domain.Board;
import examples.boot.myboard.domain.ImageFile;
import org.springframework.data.domain.Page;

public interface BoardService {
    public Board getBoard(Long id);
    public Long getBoardCount();
    public Long getBoardCountByUserName(String userName);
    public Board addBoard(Board board);
    public Page<Board> getBoardList(int page);
    public Page<Board> getBoardList(int page, String searchType, String searchStr);
    public ImageFile addImageFile(ImageFile imageFile);
    public ImageFile getImageFile(Long imageFileId);
    public void deleteBaord(Long id);
    public void updateBoard(Board board);
}
