package com.raginggeek.sr4character.gear;

import com.raginggeek.sr4character.Attribute;

public class MatrixAttributes {
    private static final String SIGNAL_ATTRIBUTE_NAME = "Signal";
    private static final String RESPONSE_ATTRIBUTE_NAME = "Response";
    private static final String SYSTEM_ATTRIBUTE_NAME = "System";
    private static final String FIREWALL_ATTRIBUTE_NAME = "Firewall";
    public static final int DEFAULT_SIGNAL = 0;
    public static final int DEFAULT_RESPONSE = 0;
    public static final int DEFAULT_SYSTEM = 0;
    public static final int DEFAULT_FIREWALL = 0;
    protected Attribute signal;
    protected Attribute response;
    protected Attribute system;
    protected Attribute firewall;


    public MatrixAttributes() {
        this(DEFAULT_SIGNAL, DEFAULT_RESPONSE, DEFAULT_SYSTEM, DEFAULT_FIREWALL);
    }

    public MatrixAttributes(int signal, int response, int system, int firewall) {
        this.signal = new Attribute(SIGNAL_ATTRIBUTE_NAME, signal);
        this.response = new Attribute(RESPONSE_ATTRIBUTE_NAME, response);
        this.system = new Attribute(SYSTEM_ATTRIBUTE_NAME, system);
        this.firewall = new Attribute(FIREWALL_ATTRIBUTE_NAME, firewall);
    }

    public void modifySignal(int amount) {
        this.signal.applyModifier(amount);
    }

    public int getSignal() {
        return this.signal.getModified();
    }

    public void modifyResponse(int amount) {
        this.response.applyModifier(amount);
    }

    public int getResponse() {
        return this.response.getModified();
    }

    public void modifySystem(int amount) {
        this.system.applyModifier(amount);
    }

    public int getSystem() {
        return this.system.getModified();
    }

    public void modifyFirewall(int amount) {
        this.firewall.applyModifier(amount);
    }

    public int getFirewall() {
        return this.firewall.getModified();
    }
}
