package com.vaibhav.hibernate.entity;

import com.vaibhav.common.Status;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Task")
public class Task extends BaseEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private UUID taskid;
    private String title;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "activityId", nullable = true)
    List<SubTask> subTasks;
    private Status status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getTaskid() {
        return taskid;
    }

    public void setTaskid(UUID taskid) {
        this.taskid = taskid;
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Task() {
    }

    @Override
    public String toString() {
        return new StringBuilder("Task { ")
                .append("taskid= ").append(taskid)
                .append(", subTasks= ").append(subTasks)
                .append(", status= ").append(status)
                .append(" }").toString();
    }
}
