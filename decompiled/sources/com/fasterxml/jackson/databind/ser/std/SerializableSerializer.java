package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.InterfaceC9786Ggu;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class SerializableSerializer extends StdSerializer<InterfaceC9786Ggu> {
    public static final SerializableSerializer A00 = new SerializableSerializer();

    public SerializableSerializer() {
        super(InterfaceC9786Ggu.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        ((InterfaceC9786Ggu) obj).AcZ(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP);
    }
}
