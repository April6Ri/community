package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Annotation 分页
 * @Author ZhaoTianZe on 2019/12/27 0027
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious; //【分页】向前一页按钮
    private boolean showFirstPage;//【分页】第一页按钮
    private boolean showNext;     //【分页】向后一页按钮
    private boolean showEndPage;  //【分页】最后一页按钮
    private Integer page;         //【分页】当前页
    private List<Integer> pages = new ArrayList<>();  //【分页】当前页集合
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {

        this.totalPage = totalPage;

        this.page = page;

        //向前向后各展示3个页码
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }

        //是否展示前一页按钮
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }

        //是否展示后一页按钮
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }

        //是否展示第一页按钮
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        //是否展示最后一页按钮
        if ((pages.contains(totalPage))) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
