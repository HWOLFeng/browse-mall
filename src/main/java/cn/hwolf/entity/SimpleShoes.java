package cn.hwolf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 鞋子简略预览
 * </p>
 *
 * @author hwolf
 * @since 2018-02-08
 */
@TableName("simple_shoes")
public class SimpleShoes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 鞋子名字
     */
    private String shoeName;
    /**
     * 图片url
     */
    private String picUrl;
    /**
     * 鞋子分类
     */
    private String shoeCategory;
    /**
     * 价格
     */
    private BigDecimal shoePrice;
    /**
     * 颜色
     */
    private String color;
    /**
     * 名字编号 外键
     */
    private Integer nameCode;
    /**
     * 鞋子的编号 用来拼凑整个鞋子的款式
     */
    private Integer shoeCode;
    /**
     * 点击量 热点参考数据
     */
    private Integer clickVolume;
    /**
     * 销售量 热度计算
     */
    private Integer salesVolume;
    /**
     * 热度
     */
    private Integer popularity;
    /**
     * 逻辑删除
     */
    @TableField(value = "is_deleted")
    @TableLogic
    private Integer isDeleted;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getShoeCategory() {
        return shoeCategory;
    }

    public void setShoeCategory(String shoeCategory) {
        this.shoeCategory = shoeCategory;
    }

    public BigDecimal getShoePrice() {
        return shoePrice;
    }

    public void setShoePrice(BigDecimal shoePrice) {
        this.shoePrice = shoePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNameCode() {
        return nameCode;
    }

    public void setNameCode(Integer nameCode) {
        this.nameCode = nameCode;
    }

    public Integer getShoeCode() {
        return shoeCode;
    }

    public void setShoeCode(Integer shoeCode) {
        this.shoeCode = shoeCode;
    }

    public Integer getClickVolume() {
        return clickVolume;
    }

    public void setClickVolume(Integer clickVolume) {
        this.clickVolume = clickVolume;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "SimpleShoes{" +
        ", id=" + id +
        ", shoeName=" + shoeName +
        ", picUrl=" + picUrl +
        ", shoeCategory=" + shoeCategory +
        ", shoePrice=" + shoePrice +
        ", color=" + color +
        ", nameCode=" + nameCode +
        ", shoeCode=" + shoeCode +
        ", clickVolume=" + clickVolume +
        ", salesVolume=" + salesVolume +
        ", popularity=" + popularity +
        ", isDeleted=" + isDeleted +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}
