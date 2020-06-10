package entities;

public class CommentsPojoAdd {

    private String nodeId, commentContent,userId,mobile;
    int likeCounter;
    boolean isUserLike;

    public CommentsPojoAdd(String nodeId, String commentContent, String userId, String mobile, int likeCounter, boolean isUserLike) {
        this.nodeId = nodeId;
        this.commentContent = commentContent;
        this.userId = userId;
        this.mobile = mobile;
        this.likeCounter = likeCounter;
        this.isUserLike = isUserLike;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
