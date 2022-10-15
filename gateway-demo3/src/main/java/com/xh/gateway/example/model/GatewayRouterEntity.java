package com.xh.gateway.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 网关路由配置
 * </p>
 *
 * @author H.Yang
 * @since 2022-10-14
 */
@Getter
@Setter
@TableName("gateway_router")
public class GatewayRouterEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 路由地址
     */
    private String uri;

    /**
     * 路由顺序
     */
    private Integer sort;

    /**
     * 类型：1-lb模式(默认)，2-http模式
     */
    private Integer type;

    /**
     * 说明
     */
    private String memo;

    /**
     * 启用状态：0禁用(默认)，1启动
     */
    private Boolean valid;

    /**
     * 逻辑删除：1-删除
     */
    private Boolean deleted;

    private Date createAt;

    private Date updateAt;


}
