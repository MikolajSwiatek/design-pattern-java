package BridgePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PcBridgeTests extends BridgeTestBase {
    @Before
    public void setUp() {
        remote = new RemoteControl(new PC());
    }

    @Test
    public void whenBuy() {
        String expected = new String("PC: off");
        Assert.assertEquals(expected, remote.checkStatus());
    }
}