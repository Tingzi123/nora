package com.noah.service;

import com.noah.model.Comment;
import com.noah.model.Diary;

import java.util.List;

public interface CommentService {
    //添加评论
    public Comment addComment(Comment comment);

    //删除评论
    public void deleteComment(int commentId);

    //查询某条动态的所有评论
    public List<Comment> listComment(Diary diary);
}
