package com.will.example.spring.refreshproperties;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hujunzheng
 * @create 2018-06-28 11:37
 **/
@ConfigurationProperties(prefix = "message.center")
public class MessageCenterConstants {

  private List<Business> businesses;

  private List<Channel> channels;

  private Map<String, String> businesses2Channels;

  private Map<String, String> bizTypeForMsgType;

  public void setBusinesses(List<Business> businesses) {
    this.businesses = businesses;
  }

  public void setChannels(List<Channel> channels) {
    this.channels = channels;
  }

  public List<Business> getBusinesses() {
    return businesses;
  }

  public List<Channel> getChannels() {
    return channels;
  }

  public Map<String, String> getBusinesses2Channels() {
    return businesses2Channels;
  }

  public void setBusinesses2Channels(Map<String, String> businesses2Channels) {
    this.businesses2Channels = businesses2Channels;
  }

  public Map<String, String> getBizTypeForMsgType() {
    return bizTypeForMsgType;
  }

  public void setBizTypeForMsgType(Map<String, String> bizTypeForMsgType) {
    this.bizTypeForMsgType = bizTypeForMsgType;
  }

  public static class Business implements Comparable<Business> {
    //业务类型
    private String type;
    //业务描述
    private String desc;
    //对应 kafka 的 topic
    private String topic;

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getDesc() {
      return desc;
    }

    public void setDesc(String desc) {
      this.desc = desc;
    }

    public String getTopic() {
      return topic;
    }

    public void setTopic(String topic) {
      this.topic = topic;
    }

    @Override
    public int compareTo(Business o) {
      if (type.compareTo(o.type) == 0 || topic.compareTo(o.topic) == 0) {
        return 0;
      }
      return Objects.hash(type, topic);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Business business = (Business) o;
      return Objects.equals(type, business.type) ||
          Objects.equals(topic, business.topic);
    }

    @Override
    public int hashCode() {
      return Objects.hash(type, topic);
    }

    @Override
    public String toString() {
      return "Business{" +
          "type='" + type + '\'' +
          ", desc='" + desc + '\'' +
          ", topic='" + topic + '\'' +
          '}';
    }
  }

  public static class Channel implements Comparable<Channel> {

    //渠道类型
    private String type;
    //渠道描述
    private String desc;

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getDesc() {
      return desc;
    }

    public void setDesc(String desc) {
      this.desc = desc;
    }

    @Override
    public int compareTo(Channel o) {
      return this.type.compareTo(o.type);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Channel channel = (Channel) o;
      return Objects.equals(type, channel.type);
    }

    @Override
    public int hashCode() {
      return Objects.hash(type);
    }

    @Override
    public String toString() {
      return "Channel{" +
          "type='" + type + '\'' +
          ", desc='" + desc + '\'' +
          '}';
    }
  }
}