package tuts.spring.apache.kafka.pojo;

public class Message {

  private String name;
  private String content;

  public Message(final String name, final String content) {
    this.name = name;
    this.content = content;
  }

  public String getName() {
    return this.name;
  }

  public String getContent() {
    return this.content;
  }
}
