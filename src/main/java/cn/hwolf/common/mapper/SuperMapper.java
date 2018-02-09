package cn.hwolf.common.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 公有Mapper，定义一些通用的方法
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/8.
 */
public interface SuperMapper<T> extends BaseMapper<T> {
    /**
     * 分页，批量选择数据
     * @param page Pagination 参数current起始页数，size每页个数，pages总页数
     * @param isDeleted 查询条件：逻辑删除状态
     * @return
     */
    List<T> selectListByLogic(Pagination page, @Param("isDeleted") Integer isDeleted);

}
