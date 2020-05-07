package cn.lcl.pojo.wx;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class WxTokenResule extends WxError {

    private String access_token;

    private Integer expires_in;

}
