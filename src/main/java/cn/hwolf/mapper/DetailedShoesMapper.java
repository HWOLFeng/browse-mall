package cn.hwolf.mapper;

import cn.hwolf.common.mapper.SuperMapper;
import cn.hwolf.entity.DetailedShoes;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 鞋子详情 Mapper 接口
 * </p>
 *
 * @author hwolf
 * @since 2018-02-08
 */
@Repository
public interface DetailedShoesMapper extends SuperMapper<DetailedShoes> {

    /**
     * 分页，批量选择数据
     * @param page Pagination 参数current起始页数，size每页个数，pages总页数
     * @param isDeleted 查询条件：逻辑删除状态
     * @return
     */
    @Override
    List<DetailedShoes> selectListByLogic(Pagination page, @Param("isDeleted") Integer isDeleted);

}
