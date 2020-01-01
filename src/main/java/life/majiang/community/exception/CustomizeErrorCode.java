package life.majiang.community.exception;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/1 0001.
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("你找的问题被狗吃了，要不要换个试一试？");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
