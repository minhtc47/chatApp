package com.springboot.chatapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Conversation")
public class  Conversation {
    @Id
    @UuidGenerator
    private String id;

    @ManyToOne
    @JoinColumn(name = "memberOneId")
    private Member memberOne;

    @ManyToOne
    @JoinColumn(name = "memberTwoId")
    private Member memberTwo;

    @OneToMany(mappedBy = "conversation")
    private List<DirectMessage> directMessages;

    // getters and setters
}
