package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.BV4;
import X.C10091GpF;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.net.InetAddress;

/* loaded from: classes6.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements InterfaceC9833GiW {
    public final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    public static final void A00(AbstractC9919GlE abstractC9919GlE, InetAddressSerializer inetAddressSerializer, InetAddress inetAddress) {
        String strTrim;
        if (inetAddressSerializer._asNumeric) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : BV4.A0j(strTrim, iIndexOf);
            }
        }
        abstractC9919GlE.A0s(strTrim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        C10091GpF c10091GpFA06 = JsonSerializer.A06(abstractC9919GlE, abstractC9996GnP, InetAddress.class, inetAddress);
        A00(abstractC9919GlE, this, inetAddress);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA06);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r3, X.AbstractC9842Gii r4) {
        /*
            r2 = this;
            java.lang.Class<T> r0 = r2._handledType
            X.GkV r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r3, r4, r0)
            if (r0 == 0) goto L1f
            X.GoQ r1 = r0._shape
            boolean r0 = r1.A00()
            if (r0 != 0) goto L14
            X.GoQ r0 = X.EnumC10046GoQ.ARRAY
            if (r1 != r0) goto L1f
        L14:
            r1 = 1
        L15:
            boolean r0 = r2._asNumeric
            if (r1 == r0) goto L21
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r0 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r0.<init>(r1)
            return r0
        L1f:
            r1 = 0
            goto L15
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this._asNumeric = z;
    }
}
