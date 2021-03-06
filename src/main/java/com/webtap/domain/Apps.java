package com.webtap.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "apps")
public class Apps  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "group_id")
	private Long groupId;

	@Column(name = "logo_url")
	private String logoUrl;

	private String url;

	private String title;

	private String description;

	@Column(name = "create_time")
	private Long createTime;

	@Column(name = "last_modify_time")
	private Long lastModifyTime;

	@Column(name = "is_delete")
	private Long isDelete;

	@Column(name = "sec_content")
	private String secContent;

	@Column(name = "sort_num")
	private Long sortNum;



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public Long getLastModifyTime() {
    return lastModifyTime;
  }

  public void setLastModifyTime(Long lastModifyTime) {
    this.lastModifyTime = lastModifyTime;
  }


  public Long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Long isDelete) {
    this.isDelete = isDelete;
  }


  public String getSecContent() {
    return secContent;
  }

  public void setSecContent(String secContent) {
    this.secContent = secContent;
  }


  public Long getSortNum() {
    return sortNum;
  }

  public void setSortNum(Long sortNum) {
    this.sortNum = sortNum;
  }

}
