package life.majiang.community.dto;

import lombok.Data;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/2 0002.
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
