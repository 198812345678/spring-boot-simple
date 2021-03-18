package com.will.example.spring;

import com.will.example.spring.boot.spring.boot.Application;
import com.will.example.spring.refreshproperties.RefreshMain;
import com.will.example.spring.refreshproperties.RefreshMain.MergedProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

  @Autowired
  private MergedProperties mergedProperties;

  @Autowired
  private RefreshMain refreshMain;

  @Test
  public void test() {
    mergedProperties.getMsgType2BizType();
    mergedProperties.getMsgType2BizType();
  }
}
