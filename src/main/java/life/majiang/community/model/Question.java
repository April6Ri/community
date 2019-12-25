package life.majiang.community.model;

import lombok.Data;

/**
 * @Annotation
 * @Author ZhaoTianZe on 2019/11/27 0027
 */

@Data
public class Question {
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
}
