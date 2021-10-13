package com.inonity.justpay;

import com.inonity.justpay.account.application.service.MoneyTransferProperties;
import com.inonity.justpay.account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JustPayConfigurationProperties.class)
public class JustPayConfiguration {

  /**
   * Adds a use-case-specific {@link MoneyTransferProperties} object to the application context. The properties
   * are read from the Spring-Boot-specific {@link JustPayConfigurationProperties} object.
   */
  @Bean
  public MoneyTransferProperties moneyTransferProperties(JustPayConfigurationProperties justPayConfigurationProperties){
    return new MoneyTransferProperties(Money.of(justPayConfigurationProperties.getTransferThreshold()));
  }

}
