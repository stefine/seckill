import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.excutionResult;
import org.seckill.dto.exposeResult;
import org.seckill.entity.Seckill;
import org.seckill.service.SeckillService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.io.PrintStream;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {
    @Resource
    SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> seckillList = seckillService.getSeckillList();
        for (Seckill item : seckillList){
            System.out.println(" List 為：" + item);
        }
    }

    @Test
    public void exposeSecKill() throws Exception {
        long skillId = 1001L;
        exposeResult exposeResult = seckillService.exposeSecKill(skillId);
        System.out.println("exposeResult is: " + exposeResult);
    }

    @Test
    public void excuteSecKill() throws Exception {
        long skillId = 1001L;
        long userPhone = 13813833967L;
        excutionResult excutionResult = seckillService.excuteSecKill(skillId, userPhone);
        System.out.println("excutionResult is: " + excutionResult);
    }
}