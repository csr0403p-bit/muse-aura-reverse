package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.C9894GkV;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberSerializer extends StdScalarSerializer<Number> implements InterfaceC9833GiW {
    public static final NumberSerializer A00 = new NumberSerializer(Number.class);
    public final boolean _isInt;

    public final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer A00 = new BigDecimalAsStringSerializer();

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class, false);
        }
    }

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls);
        this._isInt = cls == BigInteger.class;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType);
        return (c9894GkVA02 == null || c9894GkVA02._shape.ordinal() != 8) ? this : this._handledType == BigDecimal.class ? BigDecimalAsStringSerializer.A00 : ToStringSerializer.A00;
    }
}
