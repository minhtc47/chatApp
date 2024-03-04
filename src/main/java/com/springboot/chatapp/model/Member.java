package com.springboot.chatapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Member")
public class Member implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @UuidGenerator
    private String id;

    @Enumerated(EnumType.STRING)
    private MemberRole role;

    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "serverId")
    private Server server;

    @OneToMany(mappedBy = "member")
    private List<Message> messages;

    @OneToMany(mappedBy = "member")
    private List<DirectMessage> directMessages;

    @OneToMany(mappedBy = "memberOne")
    private List<Conversation> conversationsInitiated;

    @OneToMany(mappedBy = "memberTwo")
    private List<Conversation> conversationsReceived;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    public enum MemberRole {
        ADMIN,
        MODERATOR,
        GUEST
    }
    

}
