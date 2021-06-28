package cn.tobdev.qy.weixin.sdk.api.customer;


import cn.tobdev.qy.weixin.sdk.api.BaseApi;
import cn.tobdev.qy.weixin.sdk.api.customer.param.CustomerGroupGetParam;
import cn.tobdev.qy.weixin.sdk.api.customer.param.CustomerGroupListParam;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.CustomerGroupListResp;
import cn.tobdev.qy.weixin.sdk.api.customer.resp.CustomerGroupResp;
import cn.tobdev.qy.weixin.sdk.constant.CustomerApiUris;
import feign.RequestLine;

/**
 * 客户群 相关 接口
 */
public interface CustomerGroupApi  extends BaseApi {

    /**
     * 获取 客户 群列表
     *
     * @param param 请求参数
     * @return {@link CustomerGroupListResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_LIST)
    CustomerGroupListResp list(CustomerGroupListParam param);


    /**
     * 获取 客户 群详情
     *
     * @param param 请求参数
     * @return {@link CustomerGroupListResp}
     */
    @RequestLine(CustomerApiUris.API_CUSTOMER_GROUP_CHAT_GET)
    CustomerGroupResp get(CustomerGroupGetParam param);


}