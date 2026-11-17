package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class ToEmptyObjectSerializer extends StdSerializer<Object> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        abstractC9996GnP.A03(abstractC9919GlE, AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_OBJECT, abstractC9996GnP, obj));
    }
}
