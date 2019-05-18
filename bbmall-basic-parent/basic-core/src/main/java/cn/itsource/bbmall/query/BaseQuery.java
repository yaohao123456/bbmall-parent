package cn.itsource.bbmall.query;

/**
 * @author yh
 * @version V1.0
 * @className BaseQuery
 * @date 2019/5/19
 */

public class BaseQuery {
    private Integer page = 1;

    private Integer size = 10;

    private String keyword;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
