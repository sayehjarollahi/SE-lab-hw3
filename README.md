### برنامه اول 

برای این برنامه ابتدا تست مربوط به محاسبه مساحت مستطیل را به صورت زیر می‌نویسیم. توجه داریم که هنوز کلاس مستطیل را نساخته ایم. 

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(3, 6);
        double actualArea = rectangle.computeArea();
        assertEquals(18, actualArea, 0);
    }

}
```

همانطور که در تصویر زیر مشاهده می‌کنیم،‌در کامپایل به مشکل میخوریم زیرا کلاس مستطیل وجود ندارد. 
![](images/image.png)