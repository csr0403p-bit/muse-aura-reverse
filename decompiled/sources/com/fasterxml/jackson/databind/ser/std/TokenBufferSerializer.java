package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.C9913Gl1;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class TokenBufferSerializer extends StdSerializer<C9913Gl1> {
    public TokenBufferSerializer() {
        super(C9913Gl1.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws IOException {
        C9913Gl1 c9913Gl1 = (C9913Gl1) obj;
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_EMBEDDED_OBJECT, abstractC9996GnP, c9913Gl1);
        c9913Gl1.A12(abstractC9919GlE);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
