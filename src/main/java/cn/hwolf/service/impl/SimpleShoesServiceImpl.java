package cn.hwolf.service.impl;

import cn.hwolf.entity.SimpleShoes;
import cn.hwolf.mapper.SimpleShoesMapper;
import cn.hwolf.service.SimpleShoesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 鞋子简略预览 服务实现类
 * </p>
 *
 * @author hwolf
 * @since 2018-02-08
 */
@Service
public class SimpleShoesServiceImpl extends ServiceImpl<SimpleShoesMapper, SimpleShoes> implements SimpleShoesService {
    @Autowired
    private SimpleShoesMapper simpleShoesMapper;

}
