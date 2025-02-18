package it.euris.javaacademy.teslabattery.config.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "whitelist")
public class WhiteListConfiguration {

    String[] urls;
}
