
import com.ray.design.Builder;
import com.ray.design.IMenu;
import org.junit.Test;

/**
 * @author ray_jone@163.com
 * @date 2021/7/24 10:06
 */
public class BuilderTest {
    @Test
    public void test() throws Exception {
        IMenu iMenu = new Builder().levelOne(138.00);
        System.out.println(iMenu.getDetail());

        IMenu iMenu2 = new Builder().levelTwo(138.00);
        System.out.println(iMenu2.getDetail());

        IMenu iMenu3 = new Builder().levelThree(138.00);
        System.out.println(iMenu3.getDetail());
    }
}
