package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.C9894GkV;
import X.EnumC10067Goo;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public abstract class NumberSerializers$Base<T> extends StdScalarSerializer<T> implements InterfaceC9833GiW {
    public final boolean _isInt;
    public final EnumC10067Goo _numberType;
    public final String _schemaType;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Goo;Ljava/lang/String;)V */
    public NumberSerializers$Base(EnumC10067Goo enumC10067Goo, Class cls, String str) {
        super(cls);
        this._numberType = enumC10067Goo;
        this._schemaType = str;
        this._isInt = enumC10067Goo == EnumC10067Goo.INT || enumC10067Goo == EnumC10067Goo.LONG;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType);
        return (c9894GkVA02 == null || c9894GkVA02._shape.ordinal() != 8) ? this : this._handledType == BigDecimal.class ? NumberSerializer.BigDecimalAsStringSerializer.A00 : ToStringSerializer.A00;
    }
}
