package mail;

import com.github.yuriy27.config.Config;
import com.github.yuriy27.objects.Sender;

/**
 * Created by Юра on 05.09.2016.
 */
public class TestMail {

    private static Sender tls;

    public static void main(String[] args) {
        Config.load();
        //tls = new Sender(Config.MAIL, Config.PASSWORD);
       // tls.send("Test spam", "Hello Eugene. This letter written by spam bot. The owner of this program names Yurchik.", Config.MAIL, "wertblek1@yandex.ua");
    }

}
