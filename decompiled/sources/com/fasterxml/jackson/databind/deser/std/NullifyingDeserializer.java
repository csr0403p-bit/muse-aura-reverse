package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.EnumC9834GiY;

/* loaded from: classes6.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer A00 = new NullifyingDeserializer();
    public static final long serialVersionUID = 1;

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if (!abstractC9916Gl7.A22(EnumC9834GiY.FIELD_NAME)) {
            abstractC9916Gl7.A1j();
            return null;
        }
        while (true) {
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            if (enumC9834GiYA1P == null || enumC9834GiYA1P == EnumC9834GiY.END_OBJECT) {
                return null;
            }
            abstractC9916Gl7.A1j();
        }
    }
}
