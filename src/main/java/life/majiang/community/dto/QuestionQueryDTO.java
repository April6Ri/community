package life.majiang.community.dto;

import lombok.Data;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/2/26 0026.
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
