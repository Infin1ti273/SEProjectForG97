package bin;

import data.AppData;
import org.junit.jupiter.api.Test;

/**
 * Class for testing UserManage's function
 */
class testUserManage extends AppData {

    /**
     * Test registration function
     * true: register completed, false: register failed
     */
    @Test
    void testRegistration() {
    	assertTrue(UserManage.registration(161187718,"Ruyang Liu","jp2016213460@qmul.ac.uk"));
    }

    /**
     * test ifDuplicate function
     */
    @Test
    void testIfDuplicate() {
    	assertTrue(UserManage.isDuplicate(161187718,"jp2016213460@qmul.ac.uk"));
    }

    /**
     * test function of judging format of QM number, email and full name
     */
    @Test
    void testCorrectFormat() {
        //qm number
        assertEquals(1, FormatCheck.isID("161188623"));
        assertNotEquals(1, FormatCheck.isID("123456"));

        //full name
        assertEquals(1, FormatCheck.isName("Shizun Wang"));
        assertNotEquals(1, FormatCheck.isName("Weipeng_Shen"));

        //email
        assertEquals(1, FormatCheck.isAddress("jp2016213556@qmul.ac.uk"));
        assertNotEquals(1, FormatCheck.isID("123456@gmail.com"));
    }

}
