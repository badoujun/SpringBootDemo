package com.web.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(description = "交易实体")
public class Trade implements Serializable {
    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("商品名")
    private String trade_name;
    @ApiModelProperty("价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrade_name() {
        return trade_name;
    }

    public void setTrade_name(String trade_name) {
        this.trade_name = trade_name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Trade other = (Trade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrade_name() == null ? other.getTrade_name() == null : this.getTrade_name().equals(other.getTrade_name()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrade_name() == null) ? 0 : getTrade_name().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", trade_name=").append(trade_name);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}