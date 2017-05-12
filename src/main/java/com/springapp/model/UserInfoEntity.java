package com.springapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ÞÈ•D on 2017/5/12.
 */
@Entity
@Table(name = "user_info", schema = "", catalog = "confession_wall")
public class UserInfoEntity {
    private String universities;
    private String sex;
    private String nickname;
    private String username;
    private String emailVerified;
    private String avatar;
    private String mobilePhoneNumber;
    private String mobilePhoneVerified;
    private String objectId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Basic
    @Column(name = "universities", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUniversities() {
        return universities;
    }

    public void setUniversities(String universities) {
        this.universities = universities;
    }

    @Basic
    @Column(name = "sex", nullable = true, insertable = true, updatable = true, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "nickname", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "username", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "emailVerified", nullable = true, insertable = true, updatable = true, length = 255)
    public String getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(String emailVerified) {
        this.emailVerified = emailVerified;
    }

    @Basic
    @Column(name = "avatar", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "mobilePhoneNumber", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @Basic
    @Column(name = "mobilePhoneVerified", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMobilePhoneVerified() {
        return mobilePhoneVerified;
    }

    public void setMobilePhoneVerified(String mobilePhoneVerified) {
        this.mobilePhoneVerified = mobilePhoneVerified;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfoEntity that = (UserInfoEntity) o;

        if (universities != null ? !universities.equals(that.universities) : that.universities != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (emailVerified != null ? !emailVerified.equals(that.emailVerified) : that.emailVerified != null)
            return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (mobilePhoneNumber != null ? !mobilePhoneNumber.equals(that.mobilePhoneNumber) : that.mobilePhoneNumber != null)
            return false;
        if (mobilePhoneVerified != null ? !mobilePhoneVerified.equals(that.mobilePhoneVerified) : that.mobilePhoneVerified != null)
            return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = universities != null ? universities.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (emailVerified != null ? emailVerified.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (mobilePhoneNumber != null ? mobilePhoneNumber.hashCode() : 0);
        result = 31 * result + (mobilePhoneVerified != null ? mobilePhoneVerified.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
