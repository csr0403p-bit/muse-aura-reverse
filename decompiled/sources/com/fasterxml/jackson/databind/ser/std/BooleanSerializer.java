package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C9894GkV;
import X.EnumC10046GoQ;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class BooleanSerializer extends StdScalarSerializer<Object> implements InterfaceC9833GiW {
    public static final long serialVersionUID = 1;
    public final boolean _forPrimitive;

    public final class AsNumber extends StdScalarSerializer<Object> implements InterfaceC9833GiW {
        public static final long serialVersionUID = 1;
        public final boolean _forPrimitive;

        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class);
            this._forPrimitive = z;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
            abstractC9919GlE.A0w(Boolean.TRUE.equals(obj));
        }

        /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
        @Override // X.InterfaceC9833GiW
        public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
            C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, Boolean.class);
            return (c9894GkVA02 == null || c9894GkVA02._shape.A00()) ? this : new BooleanSerializer(this._forPrimitive);
        }
    }

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class);
        this._forPrimitive = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        abstractC9919GlE.A0w(Boolean.TRUE.equals(obj));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType);
        if (c9894GkVA02 != null) {
            EnumC10046GoQ enumC10046GoQ = c9894GkVA02._shape;
            if (enumC10046GoQ.A00()) {
                return new AsNumber(this._forPrimitive);
            }
            if (enumC10046GoQ == EnumC10046GoQ.STRING) {
                return new ToStringSerializer(this._handledType, false);
            }
        }
        return this;
    }
}
