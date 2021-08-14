package com.relevel.amazonmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class User {
    
    @Id
    private long user_id;
}
