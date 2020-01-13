package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2020/1/13 0013.
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
