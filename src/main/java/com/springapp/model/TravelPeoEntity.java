package com.springapp.model;

import javax.persistence.*;

/**
 * Created by ÞÈ•D on 2017/5/12.
 */
@Entity
@Table(name = "travel_peo", schema = "", catalog = "confession_wall")
public class TravelPeoEntity {
    private String userId;
    private String travelId;

    @Id
    @Column(name = "user_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "travel_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelPeoEntity that = (TravelPeoEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (travelId != null ? !travelId.equals(that.travelId) : that.travelId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (travelId != null ? travelId.hashCode() : 0);
        return result;
    }
}
