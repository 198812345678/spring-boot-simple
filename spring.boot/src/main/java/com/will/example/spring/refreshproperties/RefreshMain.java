package com.will.example.spring.refreshproperties;

import com.google.common.collect.Maps;
import com.will.example.spring.refreshproperties.MessageCenterConstants.Business;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

@Configuration
public class RefreshMain {

  @Bean
  public MergedProperties kafkaMessageMergedProperties() {
    return ConfigCenterUtils.createToRefreshPropertiesBean(MergedProperties.class);
  }

  public static class MergedProperties {
    private Map<String, Business> businesses;
    private Map<String, MessageCenterConstants.Channel> channels;
    //业务映射渠道
    private Map<String, String> businesses2Channels;
    //消息类型映射业务类型
    private Map<String, String> msgType2BizType;

    public MergedProperties() throws Exception {
      this.refreshProperties();
    }

    private void refreshProperties() throws Exception {
      //获取到配置中心最新的propertySource
      PropertySource propertySource = new PropertiesPropertySource("111111111", new Properties());
      MessageCenterConstants messageCenterConstants = null;
      //判断属性是否刷新
      if (ConfigCenterUtils.propertySourceRefresh(propertySource)) {
        //将属性binding到带有@ConfigurationProperties注解的类中
        MessageCenterConstants constants = new MessageCenterConstants();
        messageCenterConstants = constants;
        constants.setBizTypeForMsgType(Maps.newHashMap());
      }
      if (!Objects.isNull(messageCenterConstants)) {
        this.setMsgType2BizType(messageCenterConstants.getBizTypeForMsgType());
      }

    }

    //刷新方法
    private void catchRefreshProperties() {
      try {
        this.refreshProperties();
      } catch (Exception e) {
//        LOGGER.error("KafkaMessageConfig 配置中心属性刷新失败", e);
      }
    }

    //get方法上指定刷新属性
    @ToRefresh(method = "catchRefreshProperties")
    public Map<String, MessageCenterConstants.Business> getBusinesses() {
      return businesses;
    }

    public void setBusinesses(Map<String, MessageCenterConstants.Business> businesses) {
      this.businesses = businesses;
    }

    @ToRefresh(method = "catchRefreshProperties")
    public Map<String, MessageCenterConstants.Channel> getChannels() {
      return channels;
    }

    public void setChannels(Map<String, MessageCenterConstants.Channel> channels) {
      this.channels = channels;
    }

    @ToRefresh(method = "catchRefreshProperties")
    public Map<String, String> getBusinesses2Channels() {
      return businesses2Channels;
    }

    public void setBusinesses2Channels(Map<String, String> businesses2Channels) {
      this.businesses2Channels = businesses2Channels;
    }

    @ToRefresh(method = "catchRefreshProperties")
    public Map<String, String> getMsgType2BizType() {
      return msgType2BizType;
    }

    public void setMsgType2BizType(Map<String, String> msgType2BizType) {
      this.msgType2BizType = msgType2BizType;
    }
  }

}
