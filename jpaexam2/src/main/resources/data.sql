INSERT INTO label(name, parent, level, regdate)
VALUES('라벨1', 0, 1, now());

INSERT INTO label(name, parent, level, regdate)
VALUES('라벨1-1', 1, 2, now());

INSERT INTO label(name, parent, level, regdate)
VALUES('라벨1-2', 2, 3, now());

INSERT INTO board(subject, content, regdate, modifydate, user_no, album_no)
VALUES('게시판 1', '게시판 작성중', now(), now(), 1, 1);

INSERT INTO board(subject, content, regdate, modifydate, user_no, album_no)
VALUES('게시판 2', '게시판 작성중', now(), now(), 1, 1);

INSERT INTO board(subject, content, regdate, modifydate, user_no, album_no)
VALUES('게시판 3', '게시판 작성중', now(), now(), 1, 1);

INSERT INTO board(subject, content, regdate, modifydate, user_no, album_no)
VALUES('게시판 4', '게시판 작성중', now(), now(), 1, 1);

INSERT INTO board(subject, content, regdate, modifydate, user_no, album_no)
VALUES('게시판 5', '게시판 작성중', now(), now(), 1, 1);

INSERT INTO board(subject, content, regdate, modifydate, user_no, album_no)
VALUES('게시판 6', '게시판 작성중', now(), now(), 1, 1);

INSERT INTO board_label(board_no, label_no)
VALUES(1 , 1);
INSERT INTO board_label(board_no, label_no)
VALUES(1 , 2);

INSERT INTO board_label(board_no, label_no)
VALUES(2 , 1);
INSERT INTO board_label(board_no, label_no)
VALUES(2 , 2);

INSERT INTO image(path, original_name, file_name, file_extesion, regdate, board_no)
VALUES('/users/mac/test', 'test.png', 'dasda.pnd', 'png', now(), 1);
INSERT INTO image(path, original_name, file_name, file_extesion, regdate, board_no)
VALUES('/users/mac/test', 'test.png', 'dasda.pnd', 'png', now(), 1);