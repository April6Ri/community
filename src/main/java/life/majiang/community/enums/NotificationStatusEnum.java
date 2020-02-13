package life.majiang.community.enums;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/16 0016.
 */
public enum NotificationStatusEnum {
    UNREAD(0),
    READ(1);
    private int status;

    public int getStatus() { return status; }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
