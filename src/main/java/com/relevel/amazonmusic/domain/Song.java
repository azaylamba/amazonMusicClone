package com.relevel.amazonmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Song {
    
    @Id
    private long song_id;
}
