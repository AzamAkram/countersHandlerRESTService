package com.counters;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.counters.CounterManager;

public class CounterManagerTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(CounterManager.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final String responseMsg = target().path("countermanager").request().get(String.class);

        assertEquals("Hello, Heroku!", responseMsg);
    }
}
