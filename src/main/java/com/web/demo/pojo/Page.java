package com.web.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "分页对象")
public class Page {
    @ApiModelProperty("页码,默认1")
    private Integer pageNum = 1;
    @ApiModelProperty("每页条数,默认1")
    private Integer pageSize = 1;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if(pageNum != null){
            this.pageNum = pageNum;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize != null){
            this.pageSize = pageSize;
        }
    }
}
