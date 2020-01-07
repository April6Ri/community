package life.majiang.community.enums;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/2 0002.
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            return true;
        }
        return false;
    }
}
