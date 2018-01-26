package com.eccjt.bidservice.subjectpriority.model;

public class SubjectPriority {
    private String id;

    private String user;

    private String subject;

    private Byte priorityLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Byte getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Byte priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}