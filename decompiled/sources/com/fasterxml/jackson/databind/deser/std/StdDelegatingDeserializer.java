package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.InterfaceC10017Gnp;
import X.InterfaceC10183Gqt;
import X.InterfaceC9830GiT;
import X.InterfaceC9854Giz;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes6.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements InterfaceC9830GiT, InterfaceC10183Gqt {
    public static final long serialVersionUID = 1;
    public final InterfaceC9854Giz<Object, T> _converter;
    public final JsonDeserializer<Object> _delegateDeserializer;
    public final AbstractC9870GjI _delegateType;

    public StdDelegatingDeserializer(InterfaceC9854Giz<?, T> interfaceC9854Giz) {
        super((Class<?>) Object.class);
        this._converter = interfaceC9854Giz;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final T A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        Object objA0i = this._delegateDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        if (objA0i == null) {
            return null;
        }
        return this._converter.A7E(objA0i);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer == null) {
            AbstractC9870GjI abstractC9870GjIAGY = this._converter.AGY(abstractC9904Gkk.A0B());
            InterfaceC9854Giz<Object, T> interfaceC9854Giz = this._converter;
            JsonDeserializer jsonDeserializerA0G = abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjIAGY);
            AbstractC9855Gj3.A0E(StdDelegatingDeserializer.class, this, "withDelegate");
            return new StdDelegatingDeserializer(abstractC9870GjIAGY, jsonDeserializerA0G, interfaceC9854Giz);
        }
        JsonDeserializer<Object> jsonDeserializerA0I = abstractC9904Gkk.A0I(interfaceC10017Gnp, this._delegateType, jsonDeserializer);
        if (jsonDeserializerA0I == this._delegateDeserializer) {
            return this;
        }
        InterfaceC9854Giz<Object, T> interfaceC9854Giz2 = this._converter;
        AbstractC9870GjI abstractC9870GjI = this._delegateType;
        AbstractC9855Gj3.A0E(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer(abstractC9870GjI, jsonDeserializerA0I, interfaceC9854Giz2);
    }

    @Override // X.InterfaceC10183Gqt
    public final void AbV(AbstractC9904Gkk abstractC9904Gkk) {
        Object obj = this._delegateDeserializer;
        if (obj == null || !(obj instanceof InterfaceC10183Gqt)) {
            return;
        }
        ((InterfaceC10183Gqt) obj).AbV(abstractC9904Gkk);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Giz<Ljava/lang/Object;TT;>;LX/GjI;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)V */
    public StdDelegatingDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, InterfaceC9854Giz interfaceC9854Giz) {
        super(abstractC9870GjI);
        this._converter = interfaceC9854Giz;
        this._delegateType = abstractC9870GjI;
        this._delegateDeserializer = jsonDeserializer;
    }
}
