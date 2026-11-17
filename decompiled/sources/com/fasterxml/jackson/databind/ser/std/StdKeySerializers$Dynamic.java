package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10109Gpa;
import X.C10110Gpb;

/* loaded from: classes6.dex */
public class StdKeySerializers$Dynamic extends StdSerializer<Object> {
    public transient AbstractC10109Gpa A00;

    public StdKeySerializers$Dynamic() {
        super(String.class, false);
        this.A00 = C10110Gpb.A00;
    }

    public Object readResolve() {
        this.A00 = C10110Gpb.A00;
        return this;
    }
}
