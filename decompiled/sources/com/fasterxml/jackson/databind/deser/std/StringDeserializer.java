package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer A00 = new StringDeserializer();
    public static final long serialVersionUID = 1;

    public StringDeserializer() {
        super(String.class);
    }

    public static final String A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, StringDeserializer stringDeserializer) {
        return abstractC9916Gl7.A22(EnumC9834GiY.VALUE_STRING) ? abstractC9916Gl7.A1c() : abstractC9916Gl7.A22(EnumC9834GiY.START_ARRAY) ? (String) stringDeserializer.A16(abstractC9916Gl7, abstractC9904Gkk) : stringDeserializer.A1A(abstractC9916Gl7, abstractC9904Gkk, stringDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        return A00(abstractC9916Gl7, abstractC9904Gkk, this);
    }
}
