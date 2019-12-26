package life.majiang.community.mapper;

import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Annotation 发布问题接口
 * @Author ZhaoTianZe on 2019/11/27 0027
 */

@Mapper
public interface QuestionMapper {

    @Insert("INSERT INTO question(title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);

    @Select("select * from question")
    List<Question> list();
}
