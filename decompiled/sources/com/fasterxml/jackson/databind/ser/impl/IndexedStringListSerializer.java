package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.C60Q;
import X.EnumC9834GiY;
import X.F60;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer A00 = new IndexedStringListSerializer();
    public static final long serialVersionUID = 1;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;LX/GlE;LX/Gii;I)V */
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, List list, int i) throws Throwable {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String strA0n = C60Q.A0n(list, i2);
                if (strA0n == null) {
                    abstractC9842Gii.A0U(abstractC9919GlE);
                } else {
                    abstractC9919GlE.A0s(strA0n);
                }
            } catch (Exception e) {
                StdSerializer.A04(abstractC9842Gii, list, e, i2);
                throw F60.createAndThrow();
            }
        }
    }

    public IndexedStringListSerializer() {
        super(List.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        List list = (List) obj;
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_ARRAY, abstractC9996GnP, list);
        abstractC9919GlE.A0i(list);
        A00(abstractC9919GlE, abstractC9842Gii, list, list.size());
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
