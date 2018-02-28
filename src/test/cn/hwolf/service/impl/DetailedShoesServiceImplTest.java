package cn.hwolf.service.impl;

import cn.hwolf.BrowseMallApplication;
import cn.hwolf.entity.DetailedShoes;
import cn.hwolf.mapper.DetailedShoesMapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * DetailedShoesServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>二月 8, 2018</pre>
 */
@SpringBootTest(classes = BrowseMallApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
public class DetailedShoesServiceImplTest {

    @Autowired
    DetailedShoesMapper detailedShoesMapper;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: selectListByLogic(Page<DetailedShoes> page, Integer isDeleted)
     */
    @Test
    public void testSelectShoesList() throws Exception {
        Page<DetailedShoes> page = new Page<>(1, 2);
        Page<DetailedShoes> page1 = new Page<>(1, 3);
        Page<DetailedShoes> page2 = new Page<>(1, 5);
        System.out.println(page.getCurrent());
        System.out.println("============================");
        List<DetailedShoes> shoesListIn = detailedShoesMapper.selectListByLogic(page1, 0);
        for (DetailedShoes detailedShoes : shoesListIn) {
            System.out.println(detailedShoes);
        }
        System.out.println("=============================");
        List<DetailedShoes> shoesListOff = detailedShoesMapper.selectListByLogic(page, 1);
        for (DetailedShoes detailedShoes : shoesListOff) {
            System.out.println(detailedShoes);
        }
    }


}
