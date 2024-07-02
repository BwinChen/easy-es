package com.bwin.easyes.entity;

import lombok.Data;
import org.dromara.easyes.annotation.IndexName;
import org.dromara.easyes.annotation.Settings;
import org.dromara.easyes.annotation.rely.RefreshPolicy;

/**
 * @author McAfee
 */
@IndexName(refreshPolicy = RefreshPolicy.WAIT_UNTIL)
//@Settings(refreshInterval = "1ms")
@Data
public class Document {
    /**
     * es中的唯一id
     */
    private String id;
    /**
     * 文档标题
     */
    private String title;
    /**
     * 文档内容
     */
    private String content;
}
