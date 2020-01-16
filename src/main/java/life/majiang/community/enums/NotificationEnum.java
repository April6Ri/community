package life.majiang.community.enums;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/16 0016.
 */
public enum  NotificationEnum {
    REPLY_Question(1,"回复了问题")
    ;
    private int status;
    private String name;

    NotificationEnum(int status, String name) {
        this.status = status;
        this.name = name;
    }
}
