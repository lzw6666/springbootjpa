package org.lzw.pojo;

import javax.persistence.*;

@Table(name = "cus_sms")
@Entity
public class CusSms {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long cid;
    private String cname;
    private String token;

    //江西理工大学lzw

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
