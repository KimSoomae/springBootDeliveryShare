package com.graphql.deliveryShare2.sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC)
@Table(name = "message")
@Getter
public class MessageEntity {

    @Id
    @Column(name= "seq", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    
    @Column(name = "isRead", nullable=false)
    private Boolean isRead;

    @Column(name = "createdAt",nullable=false)
    private String createdAt;

    @Column(name = "updatedAt", nullable=false)
    private String updatedAt;

    public MessageEntity(Boolean isRead, String createdAt, String updatedAt){
        this.isRead=isRead;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }
    

}
