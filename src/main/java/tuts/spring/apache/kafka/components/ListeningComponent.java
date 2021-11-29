package tuts.spring.apache.kafka.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import tuts.spring.apache.kafka.pojo.Message;

@Component
public class ListeningComponent {

  @KafkaListener(topics = "test_topic", containerFactory = "concurrentKafkaListenerContainerFactory")
  public void listener(Message message) {
    System.out.println(String.format("[name=%s, content=%s]", message.getName(), message.getContent()));
  }
}
