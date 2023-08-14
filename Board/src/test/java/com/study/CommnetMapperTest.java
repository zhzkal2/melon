package com.study;

import com.study.domain.comment.CommentRequest;
import com.study.domain.comment.CommentService;
import com.study.domain.post.PostRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommnetMapperTest {

    @Autowired
    CommentService commentService;

//    @Test
//    void save() {
//
//        CommentRequest params = new CommentRequest();
//        for( long i = 103; i < 105; i++ ) {
//            params.setId(i);
//            params.setContent("댓글 컨텐츠" + i);
//            params.setWriter("댓글 작성자" + i);
//            params.setPostId(32356L); // 마지막 게시물 지정
//            commentService.saveComment(params);
//        }
//
//
//    }
}
