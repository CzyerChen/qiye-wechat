/**
 * Author:   claire
 * Date:    2022/4/15 - 8:23 上午
 * Description: 通讯录测试类
 * History:
 * <author>          <time>                   <version>          <desc>
 * claire          2022/4/15 - 8:23 上午          V1.0.0          通讯录测试类
 */
package chat.qiye.wechat.starter.test.contact;

import chat.qiye.wechat.sdk.api.contact.ContactDeptApi;
import chat.qiye.wechat.sdk.api.contact.vo.ContactDeptVo;
import chat.qiye.wechat.sdk.service.ApiConfigurationDefaultProvider;
import chat.qiye.wechat.sdk.service.ApiFactory;
import chat.qiye.wechat.starter.test.BaseJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能简述 
 * 〈通讯录测试类〉
 *
 * @author claire
 * @date 2022/4/15 - 8:23 上午
 * @since 1.0.0
 */
public class ContactApiTest extends BaseJunitTest {
    @Resource
    private  ContactDeptApi contactDeptApi;

    @Test
    public void testGetDept(){
//        // 获取Api实例， 所有封装的Api 都在 chat.qiye.wechat.sdk.api 包下，并以Api结尾
//        ContactDeptApi contactDeptApi = ApiFactory.getApiBean(ContactDeptApi.class, new ApiConfigurationDefaultProvider());
//        // 查询 通讯录 部门列表
//        List<ContactDeptVo> deptVoList = contactDeptApi.list(0).getDepartment();
//        System.out.println("DeptList:" + deptVoList);
        List<ContactDeptVo> departments = contactDeptApi.list(0).getDepartment();
        System.out.println("DeptList:" + departments);
    }
}
