package com.springboot.chatapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Channel")
public class Channel {
    @Id
    @UuidGenerator
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ChannelType type;

    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "serverId")
    private Server server;

    @OneToMany(mappedBy = "channel")
    private List<Message> messages;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    public enum ChannelType {
        TEXT,
        AUDIO,
        VIDEO
    }
    
    // getters and setters
}
