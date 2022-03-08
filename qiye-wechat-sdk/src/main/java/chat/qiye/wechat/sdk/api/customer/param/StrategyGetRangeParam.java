package chat.qiye.wechat.sdk.api.customer.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 获取规则详情 参数
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2022/3/8
 */
@Data
public class StrategyGetRangeParam implements Serializable {


    @JsonProperty("cursor")
    private String cursor;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("strategy_id")
    private int strategyId;
}