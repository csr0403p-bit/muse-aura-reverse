package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.C6xC;
import X.C9894GkV;
import X.EnumC10046GoQ;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.UUID;

/* loaded from: classes6.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> implements InterfaceC9833GiW {
    public static final char[] A00 = ManagedBrowserSitePolicy.HEX.toCharArray();
    public final Boolean _asBinary;

    public UUIDSerializer() {
        this(null);
    }

    public static final void A00(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void A01(char[] cArr, int i, int i2) {
        char[] cArr2 = A00;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        Boolean boolValueOf;
        boolean z;
        C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType);
        if (c9894GkVA02 == null) {
            boolValueOf = null;
        } else {
            EnumC10046GoQ enumC10046GoQ = c9894GkVA02._shape;
            if (enumC10046GoQ != EnumC10046GoQ.BINARY) {
                z = enumC10046GoQ != EnumC10046GoQ.STRING;
                boolValueOf = null;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        return !C6xC.A00(boolValueOf, this._asBinary) ? new UUIDSerializer(boolValueOf) : this;
    }

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }
}
