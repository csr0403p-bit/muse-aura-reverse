package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class ByteArraySerializer extends StdSerializer<byte[]> {
    public static final long serialVersionUID = 1;

    public ByteArraySerializer() {
        super(byte[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws IOException {
        byte[] bArr = (byte[]) obj;
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_EMBEDDED_OBJECT, abstractC9996GnP, bArr);
        abstractC9919GlE.A0a(abstractC9842Gii._config._base._defaultBase64, bArr, 0, bArr.length);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
