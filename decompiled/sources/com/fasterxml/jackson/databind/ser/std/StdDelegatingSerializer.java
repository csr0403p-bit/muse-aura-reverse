package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC7609F5w;
import X.AbstractC9842Gii;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.AnonymousClass002;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import X.InterfaceC9844Gim;
import X.InterfaceC9854Giz;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

/* loaded from: classes6.dex */
public class StdDelegatingSerializer extends StdSerializer implements InterfaceC9833GiW, InterfaceC9844Gim {
    public final InterfaceC9854Giz<Object, ?> _converter;
    public final JsonSerializer<Object> _delegateSerializer;
    public final AbstractC9870GjI _delegateType;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException {
        Object objA7E = this._converter.A7E(obj);
        if (objA7E == null) {
            abstractC9842Gii.A0U(abstractC9919GlE);
            return;
        }
        JsonSerializer jsonSerializer = this._delegateSerializer;
        JsonSerializer jsonSerializerA7f = jsonSerializer;
        if (jsonSerializer == null) {
            JsonSerializer<Object> jsonSerializerA0R = abstractC9842Gii.A0R(objA7E.getClass());
            boolean z = jsonSerializerA0R instanceof InterfaceC9833GiW;
            jsonSerializerA7f = jsonSerializerA0R;
            if (z) {
                jsonSerializerA7f = ((InterfaceC9833GiW) jsonSerializerA0R).A7f(null, abstractC9842Gii);
            }
        }
        jsonSerializerA7f.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, objA7E);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerA0b = this._delegateSerializer;
        AbstractC9870GjI abstractC9870GjIAIN = this._delegateType;
        if (jsonSerializerA0b == null) {
            if (abstractC9870GjIAIN == null) {
                abstractC9870GjIAIN = this._converter.AIN(abstractC9842Gii.A0B());
            }
            if (!AnonymousClass002.A1Z(abstractC9870GjIAIN._class, Object.class)) {
                jsonSerializerA0b = abstractC9842Gii.A0P(abstractC9870GjIAIN);
            }
        }
        boolean z = jsonSerializerA0b instanceof InterfaceC9833GiW;
        if (z && jsonSerializerA0b != null) {
            jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, z ? 1 : 0);
        }
        if (jsonSerializerA0b == this._delegateSerializer && abstractC9870GjIAIN == this._delegateType) {
            return this;
        }
        InterfaceC9854Giz<Object, ?> interfaceC9854Giz = this._converter;
        AbstractC9855Gj3.A0E(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(abstractC9870GjIAIN, jsonSerializerA0b, interfaceC9854Giz);
    }

    @Override // X.InterfaceC9844Gim
    public final void AbW(AbstractC9842Gii abstractC9842Gii) {
        Object obj = this._delegateSerializer;
        if (obj == null || !(obj instanceof InterfaceC9844Gim)) {
            return;
        }
        ((InterfaceC9844Gim) obj).AbW(abstractC9842Gii);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Giz<Ljava/lang/Object;*>;LX/GjI;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;)V */
    public StdDelegatingSerializer(AbstractC9870GjI abstractC9870GjI, JsonSerializer jsonSerializer, InterfaceC9854Giz interfaceC9854Giz) {
        super(abstractC9870GjI);
        this._converter = interfaceC9854Giz;
        this._delegateType = abstractC9870GjI;
        this._delegateSerializer = jsonSerializer;
    }
}
