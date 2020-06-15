import com.jiangbei.test.dao.BaseDao;
import com.jiangbei.test.pojo.Dict;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 19:11
 * @Version: 1.0
 * @Description:
 */
public class testMybatis {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        BaseDao baseDao = (BaseDao)context.getBean("BaseDao");
        Dict dict = baseDao.selectById(10);
        System.out.println(dict);
    }
}
