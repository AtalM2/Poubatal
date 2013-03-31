package fr.univnantes.atal.poubatal.api;

import fr.univnantes.atal.poubatal.Oauth;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public class OauthTest {
    
    /**
     * Test of verifyOauth method, of class Oauth.
     */
    @Test
    public void testVerifyOauth() throws Exception {
        System.out.println("Test verifyOauth with wrong token");
        String token = "error";
        Map<String, String> expResult = null;
        Map<String, String> result = Oauth.getGoogleUser(token);
        assertEquals(expResult, result);
    }
}