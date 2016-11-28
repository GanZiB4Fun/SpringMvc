package com.ganzib.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by GanZiB on 16/11/28.
 */
@Entity
@Table(name = "cms_news", schema = "springdemo", catalog = "")
public class CmsNewsEntity {
    private int cmsNewsId;
    private String title;
    private String category;
    private String source;
    private Timestamp publish;
    private String author;
    private String jumpurl;
    private String summary;
    private String imgUri;
    private String content;
    private int sticky;
    private int hits;
    private String seoDescription;
    private String seoKeywords;
    private String seoTitle;
    private String status;
    private int employeeId;
    private Timestamp addtime;
    private String addip;
    private String tags;
    private String tipImg;

    @Id
    @Column(name = "cms_news_id", nullable = false)
    public int getCmsNewsId() {
        return cmsNewsId;
    }

    public void setCmsNewsId(int cmsNewsId) {
        this.cmsNewsId = cmsNewsId;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "category", nullable = false, length = 10)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "source", nullable = false, length = 20)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "publish", nullable = false)
    public Timestamp getPublish() {
        return publish;
    }

    public void setPublish(Timestamp publish) {
        this.publish = publish;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 30)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "jumpurl", nullable = true, length = 80)
    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl;
    }

    @Basic
    @Column(name = "summary", nullable = false, length = 255)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "img_uri", nullable = true, length = 120)
    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "sticky", nullable = false)
    public int getSticky() {
        return sticky;
    }

    public void setSticky(int sticky) {
        this.sticky = sticky;
    }

    @Basic
    @Column(name = "hits", nullable = false)
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Basic
    @Column(name = "seo_description", nullable = true, length = 255)
    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    @Basic
    @Column(name = "seo_keywords", nullable = true, length = 255)
    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    @Basic
    @Column(name = "seo_title", nullable = true, length = 255)
    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "employee_id", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "addtime", nullable = false)
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Basic
    @Column(name = "addip", nullable = false, length = 50)
    public String getAddip() {
        return addip;
    }

    public void setAddip(String addip) {
        this.addip = addip;
    }

    @Basic
    @Column(name = "tags", nullable = true, length = 255)
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Basic
    @Column(name = "tip_img", nullable = true, length = 200)
    public String getTipImg() {
        return tipImg;
    }

    public void setTipImg(String tipImg) {
        this.tipImg = tipImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsNewsEntity that = (CmsNewsEntity) o;

        if (cmsNewsId != that.cmsNewsId) return false;
        if (sticky != that.sticky) return false;
        if (hits != that.hits) return false;
        if (employeeId != that.employeeId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (publish != null ? !publish.equals(that.publish) : that.publish != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (jumpurl != null ? !jumpurl.equals(that.jumpurl) : that.jumpurl != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (imgUri != null ? !imgUri.equals(that.imgUri) : that.imgUri != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (seoDescription != null ? !seoDescription.equals(that.seoDescription) : that.seoDescription != null)
            return false;
        if (seoKeywords != null ? !seoKeywords.equals(that.seoKeywords) : that.seoKeywords != null) return false;
        if (seoTitle != null ? !seoTitle.equals(that.seoTitle) : that.seoTitle != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (addip != null ? !addip.equals(that.addip) : that.addip != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (tipImg != null ? !tipImg.equals(that.tipImg) : that.tipImg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cmsNewsId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (publish != null ? publish.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (jumpurl != null ? jumpurl.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (imgUri != null ? imgUri.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + sticky;
        result = 31 * result + hits;
        result = 31 * result + (seoDescription != null ? seoDescription.hashCode() : 0);
        result = 31 * result + (seoKeywords != null ? seoKeywords.hashCode() : 0);
        result = 31 * result + (seoTitle != null ? seoTitle.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + employeeId;
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        result = 31 * result + (addip != null ? addip.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (tipImg != null ? tipImg.hashCode() : 0);
        return result;
    }
}
