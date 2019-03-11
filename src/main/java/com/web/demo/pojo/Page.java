package com.web.demo.pojo;

import com.terran4j.commons.api2doc.annotations.ApiComment;
@ApiComment(value = "分页")
public class Page {
    @ApiComment(value = "页码", sample = "1")
    private Integer pageNum = 1;
    @ApiComment(value = "每页条数", sample = "2")
    private Integer pageSize = 1;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
