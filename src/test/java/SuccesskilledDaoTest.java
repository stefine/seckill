import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.SuccesskilledDao;
import org.seckill.entity.Successkilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 533 on 2017/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SuccesskilledDaoTest {

    @Resource
    private SuccesskilledDao successkilledDao;
    @Test
    public void insertSuccessKill() throws Exception {
        long seckillId = 1000L;
        long userPhone = 13813833967L;
        int flag = successkilledDao.insertSuccessKill(seckillId, userPhone);
        System.out.println("flag is: " + flag);
    }

    @Test
    public void findSuccessSeckillByUser() throws Exception {
        long seckillId = 1000L;
        long userPhone = 13813833967L;
        Successkilled successkill = successkilledDao.findSuccessSeckillByUser(userPhone, seckillId);
        System.out.println(successkill);
    }

}