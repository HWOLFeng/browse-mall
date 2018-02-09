package cn.hwolf.service;

import cn.hwolf.entity.DetailedShoes;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 鞋子详情 服务类
 * </p>
 *
 * @author hwolf
 * @since 2018-02-08
 */
public interface DetailedShoesService extends IService<DetailedShoes> {

    /**
     * 封装返回指定鞋子分页数据
     * @param page 分页
     * @param isDeleted 条件
     * @return
     */
    Page<DetailedShoes> selectShoesList(Page<DetailedShoes> page, Integer isDeleted);
}
