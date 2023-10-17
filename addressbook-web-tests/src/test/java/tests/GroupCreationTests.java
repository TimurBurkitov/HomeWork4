package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
  public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupsHelper().getCroupCount();
        app.getGroupsHelper().createGroup(new GroupData("test1", null, null));
        int after = app.getGroupsHelper().getCroupCount();
        Assert.assertEquals(after, before + 1);

    }


}
