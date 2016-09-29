import com.github.yuriy27.config.Config;
import com.github.yuriy27.controller.DeliveryController;
import com.github.yuriy27.enums.SendResult;
import com.github.yuriy27.objects.DelMessage;
import com.github.yuriy27.objects.Delivery;
import com.github.yuriy27.objects.Sender;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestSend {

    static {
        Config.load();
    }

    private final SendResult OK = SendResult.SUCCESS;
    private DeliveryController controller = new DeliveryController();

    @Test
    public void testOneMessage() {
        DelMessage message = new DelMessage("subject", "some mail", "yurakuchevskiy@mail.ru");
        assertEquals(controller.sendMessage(message), OK);
    }

    @Test
    public void testDeliveryWithOneMessage() {
        Delivery delivery = new Delivery();
        ArrayList<String> rec = new ArrayList<String>();
        rec.add("yurakuchevskiy@mail.ru");
        delivery.setRecepiens(rec);
        DelMessage mess = new DelMessage();
        mess.setSubject("delivery subject");
        mess.setText("delText");
        assertEquals(controller.sendDelivery(delivery, mess), OK);
    }

    @Test
    public void testDeliveryWithManyMessages() {
        Delivery delivery = new Delivery();
        ArrayList<String> rec = new ArrayList<String>();
        rec.add("yurakuchevskiy@mail.ru");
        rec.add("yurakuchevskiy@mail.ru");
        rec.add("yura27kuchevskiy@gmail.com");
        delivery.setRecepiens(rec);
        DelMessage mess = new DelMessage();
        mess.setSubject("many delivery subject");
        mess.setText("many delText");
        assertEquals(controller.sendDelivery(delivery, mess), OK);
    }

}
