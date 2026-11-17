package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.EnumC9834GiY;

/* loaded from: classes6.dex */
public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;LX/GnP;)V */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_STRING, abstractC9996GnP, obj);
        A0C(abstractC9919GlE, abstractC9842Gii, obj);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
