package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NullSerializer extends StdSerializer<Object> {
    public static final NullSerializer A00 = new NullSerializer();

    public NullSerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        abstractC9919GlE.A0R();
    }
}
