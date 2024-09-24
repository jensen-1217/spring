package cn.itcast.mq.listener;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;


//将当前类放到SpringIOC容器中
@Component
public class SpringRabbitListener {


//  @RabbitListener(queues="simple.queue")
//public void listenSimpleMessage(String msg){
//        System.out.println("消费者接收到了生产者发送的消息："+msg);
//}

//    @RabbitListener(queues = "simple.queue")
//public void listenWork1Message(String msg) throws InterruptedException {
//    System.out.println("消费者1接收到了生产者发送的消息："+msg);
//    Thread.sleep(20);
//}
//
//    @RabbitListener(queues = "simple.queue")
//    public void listenWork2Message(String msg) throws InterruptedException {
//        System.out.println("消费者2接收到了生产者发送的消息："+msg);
//        Thread.sleep(100);
//    }

//        @RabbitListener(queues = "fanout.queue1")
//    public void listenFanout1Message(String msg) {
//        System.out.println("消费者1接收到了生产者发送的消息："+msg);
//    }
//
//    @RabbitListener(queues = "fanout.queue2")
//    public void listenFanout2Message(String msg) {
//        System.out.println("消费者2接收到了生产者发送的消息："+msg);
//    }

//    @RabbitListener(bindings = {@QueueBinding(
//            value = @Queue(name = "direct.queue1"),
//            exchange = @Exchange(name="itcast.direct",type = ExchangeTypes.DIRECT),
//            key = {"blue","red","blue1"}
//    )})
//    public void listenDirectQueue1(String msg){
//        System.out.println("消费者1接收到了生产者发送的消息："+msg);
//    }
//
//    @RabbitListener(bindings = {@QueueBinding(
//            value = @Queue(name = "direct.queue2"),
//            exchange = @Exchange(name="itcast.direct",type = ExchangeTypes.DIRECT),
//            key = {"yellow","red"}
//    )})
//    public void listenDirectQueue2(String msg){
//        System.out.println("消费者2接收到了生产者发送的消息："+msg);
//    }

//    @RabbitListener(bindings = {@QueueBinding(
//            value = @Queue(name = "topic.queue1"),
//            exchange = @Exchange(name="itcast.topic",type = ExchangeTypes.TOPIC),
//            key = "china.#"
//    )})
//    public void listenTopQueue1(String msg){
//        System.out.println("消费者1接收到了topic.queue1发送的消息："+msg);
//    }
//
//    @RabbitListener(bindings = {@QueueBinding(
//            value = @Queue(name = "topic.queue2"),
//            exchange = @Exchange(name="itcast.topic",type = ExchangeTypes.TOPIC),
//            key = "#.news"
//    )})
//    public void listenTopQueue2(String msg){
//        System.out.println("消费者2接收到了topic.queue2发送的消息："+msg);
//    }

    @RabbitListener(queues = "object.queue")
        public void listenObjectMessage(HashMap<String,String > map){
        System.out.println("消费者接收到了生产者发送的消息："+map);
    }

}
