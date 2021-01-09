package com.cxy.monitor.bean;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
    private Integer id;

    private String keyword;

    private String title;

    private Date time;

    private String url;

    private Integer dianzan;

    private Integer zhuanfa;

    private Integer pinglun;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getDianzan() {
        return dianzan;
    }

    public void setDianzan(Integer dianzan) {
        this.dianzan = dianzan;
    }

    public Integer getZhuanfa() {
        return zhuanfa;
    }

    public void setZhuanfa(Integer zhuanfa) {
        this.zhuanfa = zhuanfa;
    }

    public Integer getPinglun() {
        return pinglun;
    }

    public void setPinglun(Integer pinglun) {
        this.pinglun = pinglun;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Event other = (Event) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getDianzan() == null ? other.getDianzan() == null : this.getDianzan().equals(other.getDianzan()))
            && (this.getZhuanfa() == null ? other.getZhuanfa() == null : this.getZhuanfa().equals(other.getZhuanfa()))
            && (this.getPinglun() == null ? other.getPinglun() == null : this.getPinglun().equals(other.getPinglun()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getDianzan() == null) ? 0 : getDianzan().hashCode());
        result = prime * result + ((getZhuanfa() == null) ? 0 : getZhuanfa().hashCode());
        result = prime * result + ((getPinglun() == null) ? 0 : getPinglun().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keyword=").append(keyword);
        sb.append(", title=").append(title);
        sb.append(", time=").append(time);
        sb.append(", url=").append(url);
        sb.append(", dianzan=").append(dianzan);
        sb.append(", zhuanfa=").append(zhuanfa);
        sb.append(", pinglun=").append(pinglun);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}