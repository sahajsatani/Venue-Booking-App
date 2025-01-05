package com.sahajinfotech.crickhero.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingRequestDto {
    @Column(nullable = false)
    private int venueId;
    @Column(nullable = false)
    private LocalDate bookingDate;
    @Column(nullable = false)
    private LocalTime startTime;
    @Column(nullable = false)
    private LocalTime endTime;

    @Override
    public String toString() {
        return "BookingRequestDto{" +
                "venueId=" + venueId +
                ", bookingDate=" + bookingDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public BookingRequestDto() {
    }


    public int getVenueId() {
        return venueId;
    }

    public BookingRequestDto setVenueId(int venueId) {
        this.venueId = venueId;
        return this;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public BookingRequestDto setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public BookingRequestDto setStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public BookingRequestDto setEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }
}