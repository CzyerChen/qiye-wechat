/**
 * Author:   claire
 * Date:    2022/4/15 - 9:55 上午
 * Description: 测试
 * History:
 * <author>          <time>                   <version>          <desc>
 * claire          2022/4/15 - 9:55 上午          V1.0.0          测试
 */
package chat.qiye.wechat.starter.test.customer;

import chat.qiye.wechat.sdk.api.contact.ContactDeptApi;
import chat.qiye.wechat.sdk.api.contact.ContactUserApi;
import chat.qiye.wechat.sdk.api.contact.resp.ContactUserListResp;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.api.customer.CustomerApi;
import chat.qiye.wechat.sdk.api.customer.resp.CustomerGetResp;
import chat.qiye.wechat.starter.test.BaseJunitTest;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能简述
 * 〈测试〉
 *
 * @author claire
 * @date 2022/4/15 - 9:55 上午
 * @since 1.0.0
 */
public class CustomerApiTest extends BaseJunitTest {
    @Resource
    private ContactDeptApi contactDeptApi;
    @Resource
    private ContactUserApi contactUserApi;
    @Resource
    private CustomerApi customerApi;

    @Test
    public void testGetCustomerAuto() {
        List<ContactDeptVo> departments = contactDeptApi.list(0).getDepartment();
        if (!CollectionUtils.isEmpty(departments)) {
            ContactUserListResp list = contactUserApi.list(departments.get(0).getId(), 0);
            if (!CollectionUtils.isEmpty(list.getUserlist())) {
                List<String> externalUserids = customerApi.list(list.getUserlist().get(1).getUserid()).getExternalUserid();
                List<CustomerGetResp.FollowUser> followUsers = customerApi.get(externalUserids.get(0), null).getFollowUser();
                if (!CollectionUtils.isEmpty(followUsers)) {
                    List<String> remarkMobiles = followUsers.get(0).getRemarkMobiles();
                    System.out.println("remarkMobiles:" + remarkMobiles.get(0));
                }
            }
        }
    }
}
