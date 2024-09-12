package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 社区活动预约
 *
 * @author 
 * @email
 */
@TableName("shequhuodong_order")
public class ShequhuodongOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShequhuodongOrderEntity() {

	}

	public ShequhuodongOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 预约编号
     */
    @TableField(value = "shequhuodong_order_uuid_number")

    private String shequhuodongOrderUuidNumber;


    /**
     * 社区活动
     */
    @TableField(value = "shequhuodong_id")

    private Integer shequhuodongId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 审核状态
     */
    @TableField(value = "shequhuodong_order_yesno_types")

    private Integer shequhuodongOrderYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "shequhuodong_order_yesno_text")

    private String shequhuodongOrderYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：预约编号
	 */
    public String getShequhuodongOrderUuidNumber() {
        return shequhuodongOrderUuidNumber;
    }
    /**
	 * 获取：预约编号
	 */

    public void setShequhuodongOrderUuidNumber(String shequhuodongOrderUuidNumber) {
        this.shequhuodongOrderUuidNumber = shequhuodongOrderUuidNumber;
    }
    /**
	 * 设置：社区活动
	 */
    public Integer getShequhuodongId() {
        return shequhuodongId;
    }
    /**
	 * 获取：社区活动
	 */

    public void setShequhuodongId(Integer shequhuodongId) {
        this.shequhuodongId = shequhuodongId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getShequhuodongOrderYesnoTypes() {
        return shequhuodongOrderYesnoTypes;
    }
    /**
	 * 获取：审核状态
	 */

    public void setShequhuodongOrderYesnoTypes(Integer shequhuodongOrderYesnoTypes) {
        this.shequhuodongOrderYesnoTypes = shequhuodongOrderYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getShequhuodongOrderYesnoText() {
        return shequhuodongOrderYesnoText;
    }
    /**
	 * 获取：审核意见
	 */

    public void setShequhuodongOrderYesnoText(String shequhuodongOrderYesnoText) {
        this.shequhuodongOrderYesnoText = shequhuodongOrderYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ShequhuodongOrder{" +
            "id=" + id +
            ", shequhuodongOrderUuidNumber=" + shequhuodongOrderUuidNumber +
            ", shequhuodongId=" + shequhuodongId +
            ", yonghuId=" + yonghuId +
            ", shequhuodongOrderYesnoTypes=" + shequhuodongOrderYesnoTypes +
            ", shequhuodongOrderYesnoText=" + shequhuodongOrderYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
