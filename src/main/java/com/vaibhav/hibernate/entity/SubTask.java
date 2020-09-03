package com.vaibhav.hibernate.entity;

import com.vaibhav.common.Priority;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "SubTask")
public class SubTask extends BaseEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private UUID subtaskid;

    private String description;
    private boolean isDone;
    @Enumerated(EnumType.STRING)
    private Priority priority;
    private Date deadline;

    public UUID getSubtaskid() {
        return subtaskid;
    }

    public void setSubtaskid(UUID subtaskid) {
        this.subtaskid = subtaskid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public SubTask() {
    }

    @Override
    public String toString() {
        return new StringBuilder(" SubTask{ " )
                .append("subtaskid= ").append(subtaskid)
                .append(", description= ").append(description)
                .append(", isDone= ").append(isDone)
                .append(", priority= ").append(priority)
                .append(", deadline= ").append(deadline)
                .append(" }").toString();
    }
}
