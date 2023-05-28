package com.jm.thub.xcx.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author caozhenhao
 * @since 2023-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ThUser对象", description="")
public class ThUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "名称")
    private String name;


}
