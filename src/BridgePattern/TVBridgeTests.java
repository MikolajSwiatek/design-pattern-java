package BridgePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TVBridgeTests extends BridgeTestBase {
    @Before
    public void setUp() {
        remote = new RemoteControl(new TV());
    }

    @Test
    public void whenBuy() {
        String expected = new String("TV: off");
        Assert.assertEquals(expected, remote.checkStatus());
    }
}