package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2019/12/25 0025
 */
@Data
public class QuestionDTO {
    private int id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
