package com.example.demo.graphql.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FriendShip {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private Long friendId;
}
