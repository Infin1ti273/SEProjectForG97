package data;

import bin.UserManage;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Vector;


class UserListTest extends AppData {

    /**
     * Test register a new user to user list
     */
    @Test
    void testRegistration() {
        System.out.println(UserManage.registration(100000000,"aaa","ccc@se16.qmul.uk"));
        for (User user: users) {
            System.out.println(user.getQmNumber());
        }
    }
}
