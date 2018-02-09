package cn.hwolf.service.impl;

import cn.hwolf.entity.DetailedShoes;
import cn.hwolf.mapper.DetailedShoesMapper;
import cn.hwolf.service.DetailedShoesService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 鞋子详情 服务实现类
 * </p>
 *
 * @author hwolf
 * @since 2018-02-08
 */
@Service
public class DetailedShoesServiceImpl extends ServiceImpl<DetailedShoesMapper, DetailedShoes> implements DetailedShoesService {
    @Autowired
    DetailedShoesMapper detailedShoesMapper;
    @Override
    public Page<DetailedShoes> selectShoesList(Page<DetailedShoes> page, Integer isDeleted) {
        return page.setRecords(baseMapper.selectListByLogic(page, isDeleted));
    }
}
