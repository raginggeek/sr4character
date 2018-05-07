package com.raginggeek.sr4character.gear;

import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixAttributesTest {

    @Test
    public void getBaseSignalTest() {
        MatrixAttributes testMA = new MatrixAttributes();
        assertEquals(0, testMA.getSignal());
    }

    @Test
    public void getBaseResponseTest(){
        MatrixAttributes testMA = new MatrixAttributes();
        assertEquals(0, testMA.getResponse());
    }

    @Test
    public void getBaseSystemTest(){
        MatrixAttributes testMA = new MatrixAttributes();
        assertEquals(0, testMA.getSystem());
    }

    @Test
    public void getBaseFirewallTest(){
        MatrixAttributes testMA = new MatrixAttributes();
        assertEquals(0, testMA.getFirewall());
    }

    @Test
    public void getCustomSignalTest() {
        MatrixAttributes testMA = new MatrixAttributes(3,0,0,0);
        assertEquals(3, testMA.getSignal());
    }

    @Test
    public void getCustomResponseTest() {
        MatrixAttributes testMA = new MatrixAttributes(0,3,0,0);
        assertEquals(3, testMA.getResponse());
    }

    @Test
    public void getCustomSystemTest() {
        MatrixAttributes testMA = new MatrixAttributes(0,0,3,0);
        assertEquals(3, testMA.getSystem());
    }

    @Test
    public void getCustomFirewallTest() {
        MatrixAttributes testMA = new MatrixAttributes(0,0,0,3);
        assertEquals(3, testMA.getFirewall());
    }

    @Test
    public void getModifiedSignal() {
        MatrixAttributes testMA = new MatrixAttributes(2,0,0,3);
        testMA.modifySignal(3);
        assertEquals(5, testMA.getSignal());
    }

    @Test
    public void getModifiedResponse() {
        MatrixAttributes testMA = new MatrixAttributes(2,4,1,6);
        testMA.modifyResponse(2);
        assertEquals(6, testMA.getResponse());
    }

    @Test
    public void getModifiedSystem() {
        MatrixAttributes testMA = new MatrixAttributes(2,4,1,6);
        testMA.modifySystem(3);
        assertEquals(4, testMA.getSystem());
    }

    @Test
    public void getModifiedFirewall() {
        MatrixAttributes testMA = new MatrixAttributes(2,4,1,6);
        testMA.modifyFirewall(-3);
        assertEquals(3, testMA.getFirewall());
    }


}
