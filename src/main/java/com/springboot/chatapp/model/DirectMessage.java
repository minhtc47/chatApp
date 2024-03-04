package com.springboot.chatapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "DirectMessage")
public class DirectMessage {
    @Id
    @UuidGenerator
    private String id;

    @Lob
    private String content;

    @Lob
    private String fileUrl;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "conversationId")
    private Conversation conversation;

    private boolean deleted;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    // getters and setters
}
