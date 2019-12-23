package com.lr.test.entity.ext;

import com.lr.test.entity.User;
import lombok.Data;
import lombok.ToString;

/**
 * @author kenny.cai
 */
@Data
@ToString
public class UserExt extends User {
    private String noAndName;
}
