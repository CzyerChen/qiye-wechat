package cn.tobdev.qy.weixin.sdk.api.contact.resp;

import java.io.Serializable;

import cn.tobdev.qy.weixin.sdk.common.BaseResp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactDeptCreateResp extends BaseResp implements Serializable {
  private Integer id;
}
