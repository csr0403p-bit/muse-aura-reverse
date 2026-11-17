package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC6798Ea9;
import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.BV6;
import X.C10091GpF;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberSerializers$DoubleSerializer extends NumberSerializers$Base<Object> {
    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws IOException {
        double dA00 = BV6.A00(obj);
        String[] strArr = AbstractC6798Ea9.A04;
        if (!Double.isInfinite(dA00) && !Double.isNaN(dA00)) {
            abstractC9919GlE.A0V(dA00);
            return;
        }
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_NUMBER_FLOAT, abstractC9996GnP, obj);
        abstractC9919GlE.A0V(dA00);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
