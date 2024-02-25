package com.springboot.chatapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "DirectMessage")
public class DirectMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "content")
    private String content;

    @Column(name = "fileUrl")
    private String fileUrl;

    @Column(name = "memberId")
    private String memberId;

    @Column(name = "conversationId")
    private String conversationId;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

}
