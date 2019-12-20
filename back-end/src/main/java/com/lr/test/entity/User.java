package com.lr.test.entity;

import java.io.Serializable;
import java.util.Date;

import com.lr.test.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity implements Serializable {
    private String id;

    private String companyId;

    private String officeId;

    private String loginName;

    private String password;

    private String refundPassword;

    private String no;

    private String name;

    private String email;

    private String phone;

    private String mobile;

    private String userType;

    private String photo;

    private String loginIp;

    private Date loginDate;

    private String loginFlag;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private static final long serialVersionUID = 1L;
}