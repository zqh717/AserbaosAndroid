package com.aserbao.aserbaosandroid.functions.database.greenDao.beans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Property;

/**
 * 主要功能:
 * author aserbao
 * date : On 2018/9/26
 * email: 1142803753@qq.com
 */
@Entity
public class Thing {
    @Id(autoincrement = true)
    Long id;

    @Property(nameInDb="message")
            @Index(unique = true)
    String message;

    long time;

    @Generated(hash = 1981866127)
    public Thing() {
    }

    public Thing(String message, long time) {
        this.message = message;
        this.time = time;
    }


    @Generated(hash = 19372714)
    public Thing(Long id, String message, long time) {
        this.id = id;
        this.message = message;
        this.time = time;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


}
