package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ÞÈ•D on 2017/5/12.
 */
@Entity
@Table(name = "travel_detail", schema = "", catalog = "confession_wall")
public class TravelDetailEntity {
    private Integer joinMax;
    private Integer clicks;
    private String content;
    private String travelPic;
    private Integer joinNum;
    private String title;
    private Timestamp endTime;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String objectId;
    private String releaseUserId;
    private Timestamp cantJoinTime;
    private Timestamp beginTime;
    private Timestamp releaseTime;
    private String destination;

    @Basic
    @Column(name = "joinMax", nullable = true, insertable = true, updatable = true)
    public Integer getJoinMax() {
        return joinMax;
    }

    public void setJoinMax(Integer joinMax) {
        this.joinMax = joinMax;
    }

    @Basic
    @Column(name = "clicks", nullable = true, insertable = true, updatable = true)
    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    @Basic
    @Column(name = "content", nullable = true, insertable = true, updatable = true, length = 255)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "travelPic", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTravelPic() {
        return travelPic;
    }

    public void setTravelPic(String travelPic) {
        this.travelPic = travelPic;
    }

    @Basic
    @Column(name = "joinNum", nullable = true, insertable = true, updatable = true)
    public Integer getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(Integer joinNum) {
        this.joinNum = joinNum;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "endTime", nullable = true, insertable = true, updatable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "createdAt", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updatedAt", nullable = true, insertable = true, updatable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Id
    @Column(name = "objectId", nullable = false, insertable = true, updatable = true, length = 255)
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "releaseUserId", nullable = true, insertable = true, updatable = true, length = 255)
    public String getReleaseUserId() {
        return releaseUserId;
    }

    public void setReleaseUserId(String releaseUserId) {
        this.releaseUserId = releaseUserId;
    }

    @Basic
    @Column(name = "cantJoinTime", nullable = true, insertable = true, updatable = true)
    public Timestamp getCantJoinTime() {
        return cantJoinTime;
    }

    public void setCantJoinTime(Timestamp cantJoinTime) {
        this.cantJoinTime = cantJoinTime;
    }

    @Basic
    @Column(name = "beginTime", nullable = true, insertable = true, updatable = true)
    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "releaseTime", nullable = true, insertable = true, updatable = true)
    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Basic
    @Column(name = "destination", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelDetailEntity that = (TravelDetailEntity) o;

        if (joinMax != null ? !joinMax.equals(that.joinMax) : that.joinMax != null) return false;
        if (clicks != null ? !clicks.equals(that.clicks) : that.clicks != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (travelPic != null ? !travelPic.equals(that.travelPic) : that.travelPic != null) return false;
        if (joinNum != null ? !joinNum.equals(that.joinNum) : that.joinNum != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (releaseUserId != null ? !releaseUserId.equals(that.releaseUserId) : that.releaseUserId != null)
            return false;
        if (cantJoinTime != null ? !cantJoinTime.equals(that.cantJoinTime) : that.cantJoinTime != null) return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (releaseTime != null ? !releaseTime.equals(that.releaseTime) : that.releaseTime != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = joinMax != null ? joinMax.hashCode() : 0;
        result = 31 * result + (clicks != null ? clicks.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (travelPic != null ? travelPic.hashCode() : 0);
        result = 31 * result + (joinNum != null ? joinNum.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (releaseUserId != null ? releaseUserId.hashCode() : 0);
        result = 31 * result + (cantJoinTime != null ? cantJoinTime.hashCode() : 0);
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (releaseTime != null ? releaseTime.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        return result;
    }
}
