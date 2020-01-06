package anger_pike.chat;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/hello")
public class App {

    @OnMessage
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
