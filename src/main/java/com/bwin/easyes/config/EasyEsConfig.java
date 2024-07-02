package com.bwin.easyes.config;

import org.dromara.easyes.starter.register.EsMapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author McAfee
 */
@Configuration
@EsMapperScan("com.bwin.easyes.mapper")
public class EasyEsConfig {
}
