package chat.qiye.wechat.sdk.api.oa.resp;

import chat.qiye.wechat.sdk.common.RespStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/9
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MeetingRoomAddResp extends RespStatus {

    @JsonProperty("meetingroom_id")
    private Integer meetingroomId;
}