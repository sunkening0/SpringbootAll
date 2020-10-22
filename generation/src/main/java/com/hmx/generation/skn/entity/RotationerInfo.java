package com.hmx.generation.skn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 值班信息
 * </p>
 *
 * @author hmx
 * @since 2020-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RotationerInfo对象", description="值班信息")
public class RotationerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "省份名称")
    private String provName;

    @ApiModelProperty(value = "省份编码")
    private String provCode;

    @ApiModelProperty(value = "值班时段")
    private String rotationInterval;

    @ApiModelProperty(value = "岗位/职务")
    private String position;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "值班日期")
    private Date rotationDate;

    @ApiModelProperty(value = "是否白班（0：夜班 1：白班）")
    private Integer isWhite;

    @ApiModelProperty(value = "是否领导（0：否 1：是）")
    private Integer isLeader;

    @ApiModelProperty(value = "备用电话")
    private String phoneNumberBackup;

    @ApiModelProperty(value = "是否删除（0：否 1：是）")
    private Integer isDelete;

    @ApiModelProperty(value = "修改时间")
    private Date opDate;

    @ApiModelProperty(value = "创建时间")
    private Date crtDate;


}
