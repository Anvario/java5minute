package com.qingguatang.java5minute.course4;


import com.qingguatang.java5minute.course4.model.Comment;
import com.qingguatang.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CommentControl {

    @Autowired
    private CommentPostControl commentPostControl;



    @RequestMapping("/comments")
    public String comments(ModelMap modelMap){
        List<Comment>comments = commentPostControl.getComments("35847388");
        modelMap.addAttribute("comments",comments);
        return "comments";
    }
//    private List<Comment> getComment(){
//        List<Comment> comments = new ArrayList<>();
//        Comment comment = new Comment();
//        comment.setIcon("http://p1.music.126.net/xHAQ2seY8igYbjujpSB8Ug==/109951163348615205.jpg?param=50y50");
//        comment.setNickName("AriLuv");
//        comment.setContent("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
//        comment.setCommentTime("2015年10月23日");
//        comment.setLikeNum(84668);
//        comments.add(comment);
//        comment = new Comment();
//        comment.setIcon("http://p1.music.126.net/eLZfXg6oY_xqWmd3hzQg-w==/109951163043012263.jpg?param=50y50");
//        comment.setNickName("Edawn");
//        comment.setContent("这hello应该翻译成别来无恙更恰当。");
//        comment.setCommentTime("2015年12月13日");
//        comment.setLikeNum(65887);
//        comments.add(comment);
//        return comments;
//    }
}
