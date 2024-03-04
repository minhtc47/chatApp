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
@Table(name = "Message")
public class Message {
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
    @JoinColumn(name = "channelId")
    private Channel channel;

    private boolean deleted;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    // getters and setters
}
