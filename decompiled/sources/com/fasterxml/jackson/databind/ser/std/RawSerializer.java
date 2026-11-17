package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.EnumC9834GiY;
import java.io.IOException;

/* loaded from: classes6.dex */
public class RawSerializer<T> extends StdSerializer<T> {
    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;LX/GnP;)V */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws IOException {
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_EMBEDDED_OBJECT, abstractC9996GnP, obj);
        abstractC9919GlE.A0r(obj.toString());
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
