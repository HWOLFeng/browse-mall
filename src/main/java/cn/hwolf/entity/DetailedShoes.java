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
 * 鞋子详情
 * </p>
 *
 * @author hwolf
 * @since 2018-02-08
 */
@TableName("detailed_shoes")
public class DetailedShoes implements Serializable {

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
     * 鞋子分类
     */
    private String shoeCategory;
    /**
     * 价格
     */
    private BigDecimal shoePrice;
    /**
     * 颜色款式
     */
    private String shoeStyle;
    /**
     * 名字编号
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
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 创建时间
     */
    private Date gmtCreate;


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

    public String getShoeStyle() {
        return shoeStyle;
    }

    public void setShoeStyle(String shoeStyle) {
        this.shoeStyle = shoeStyle;
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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return "DetailedShoes{" +
        ", id=" + id +
        ", shoeName=" + shoeName +
        ", shoeCategory=" + shoeCategory +
        ", shoePrice=" + shoePrice +
        ", shoeStyle=" + shoeStyle +
        ", nameCode=" + nameCode +
        ", shoeCode=" + shoeCode +
        ", clickVolume=" + clickVolume +
        ", salesVolume=" + salesVolume +
        ", popularity=" + popularity +
        ", isDeleted=" + isDeleted +
        ", gmtModified=" + gmtModified +
        ", gmtCreate=" + gmtCreate +
        "}";
    }
}
