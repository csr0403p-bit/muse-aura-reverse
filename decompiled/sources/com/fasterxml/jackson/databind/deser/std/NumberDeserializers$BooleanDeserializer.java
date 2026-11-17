package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.EnumC10000GnW;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Boolean> {
    public static final NumberDeserializers$BooleanDeserializer A00;
    public static final NumberDeserializers$BooleanDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.FALSE;
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Boolean;
        A00 = new NumberDeserializers$BooleanDeserializer(enumC10000GnW, cls, bool, bool);
        A01 = new NumberDeserializers$BooleanDeserializer(enumC10000GnW, Boolean.class, null, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        return enumC9834GiYA1N == EnumC9834GiY.VALUE_TRUE ? Boolean.TRUE : enumC9834GiYA1N == EnumC9834GiY.VALUE_FALSE ? Boolean.FALSE : this._primitive ? Boolean.valueOf(A1I(abstractC9916Gl7, abstractC9904Gkk)) : A11(abstractC9916Gl7, abstractC9904Gkk, this._valueClass);
    }
}
