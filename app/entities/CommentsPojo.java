package com.example.projectui.entities;

public class CommentsPojo {

    private String nodeId , commentContent,userId;
    int likeCounter;
    boolean isUserLike;

    public CommentsPojo() {

    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(int likeCounter) {
        this.likeCounter = likeCounter;
    }

    public boolean isUserLike() {
        return isUserLike;
    }

    public void setUserLike(boolean userLike) {
        isUserLike = userLike;
    }
}
