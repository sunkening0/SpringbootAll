package com.keelin.model;

import java.util.Date;

public class WsFormSoftwarenettestapplyNetreview {
    private String taskId;

    private String wsid;

    private String handleNetuserid;

    private String handleResult;

    private String taskKey;

    private String handleCompany;

    private String handleGroupName;

    private Date createTime;

    private String handleComment;

    private String handleUsername;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid == null ? null : wsid.trim();
    }

    public String getHandleNetuserid() {
        return handleNetuserid;
    }

    public void setHandleNetuserid(String handleNetuserid) {
        this.handleNetuserid = handleNetuserid == null ? null : handleNetuserid.trim();
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult == null ? null : handleResult.trim();
    }

    public String getTaskKey() {
        return taskKey;
    }

    public void setTaskKey(String taskKey) {
        this.taskKey = taskKey == null ? null : taskKey.trim();
    }

    public String getHandleCompany() {
        return handleCompany;
    }

    public void setHandleCompany(String handleCompany) {
        this.handleCompany = handleCompany == null ? null : handleCompany.trim();
    }

    public String getHandleGroupName() {
        return handleGroupName;
    }

    public void setHandleGroupName(String handleGroupName) {
        this.handleGroupName = handleGroupName == null ? null : handleGroupName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHandleComment() {
        return handleComment;
    }

    public void setHandleComment(String handleComment) {
        this.handleComment = handleComment == null ? null : handleComment.trim();
    }

    public String getHandleUsername() {
        return handleUsername;
    }

    public void setHandleUsername(String handleUsername) {
        this.handleUsername = handleUsername == null ? null : handleUsername.trim();
    }
}