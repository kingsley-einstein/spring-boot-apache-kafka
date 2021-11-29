package tuts.spring.apache.kafka.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tuts.spring.apache.kafka.pojo.Message;

@RestController
@RequestMapping("/api/v1")
public class KafkaAppController {

  @Autowired
  private KafkaTemplate<String, Message> template;

  @PostMapping("/publish")
  public Message sendMessage(@RequestBody Map<String, String> body) {
    Message message = new Message(body.get("name"), body.get("content"));
    template.send("test_topic", message);
    return message;
  }
}
