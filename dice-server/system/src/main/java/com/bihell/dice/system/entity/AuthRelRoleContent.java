package com.bihell.dice.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.bihell.dice.framework.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author haseochen
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@Deprecated
public class AuthRelRoleContent extends BaseEntity<AuthRelRoleContent> {

    @TableId
    private Integer id;

    private Integer roleId;

    private Integer contentId;

}
