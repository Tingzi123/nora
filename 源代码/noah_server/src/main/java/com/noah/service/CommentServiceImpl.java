package com.noah.service;

import com.noah.model.Comment;
import com.noah.model.Diary;
import com.noah.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return  commentRepository.save(comment);
    }

    @Override
    public void deleteComment(int commentId) {
         commentRepository.delete(commentId);
    }

    @Override
    public List<Comment> listComment(Diary diary) {
        return commentRepository.findCommentByDiary(diary);
    }
}
