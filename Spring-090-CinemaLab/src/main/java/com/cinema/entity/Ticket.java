package com.cinema.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class Ticket extends BaseEntity {

    @Column(name = "seat_number")
    private Integer seatNumber ;

    @Column(name = "row_number")
    private Integer rowNumber;

    @Column(columnDefinition = "Timestamp")
    private LocalDateTime localDateTime;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_cinema_id")
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private User user;


}
