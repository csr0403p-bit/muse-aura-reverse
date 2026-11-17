package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC7609F5w;
import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

/* loaded from: classes6.dex */
public final class TypeWrappedSerializer extends JsonSerializer<Object> implements InterfaceC9833GiW {
    public final JsonSerializer<Object> A00;
    public final AbstractC9996GnP A01;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException {
        this.A00.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        JsonSerializer<Object> jsonSerializerA0b = this.A00;
        boolean z = jsonSerializerA0b instanceof InterfaceC9833GiW;
        if (z && jsonSerializerA0b != null) {
            jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, z ? 1 : 0);
        }
        return jsonSerializerA0b == jsonSerializerA0b ? this : new TypeWrappedSerializer(jsonSerializerA0b, this.A01);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;)V */
    public TypeWrappedSerializer(JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP) {
        this.A01 = abstractC9996GnP;
        this.A00 = jsonSerializer;
    }
}
