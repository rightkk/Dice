package com.bihell.dice.framework.core.pagination;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 可排序查询参数对象
 * @author haseochen
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("可排序查询参数对象")
public abstract class BasePageOrderParam extends BasePageParam {
    private static final long serialVersionUID = 57714391204790143L;

    @ApiModelProperty("排序")
    private List<OrderItem> pageSorts;

    @ApiModelProperty("排序的字段")
    private String field;

    @ApiModelProperty("字段排序设置")
    private String order;

    public void defaultPageSort(OrderItem orderItem) {
        this.defaultPageSorts(Arrays.asList(orderItem));
    }

    public void defaultPageSorts(List<OrderItem> pageSorts) {
        if (CollectionUtils.isEmpty(pageSorts)) {
            return;
        }
        this.pageSorts = pageSorts;
    }

}
