package life.majiang.community.dto;

import lombok.Data;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/16 0016.
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
