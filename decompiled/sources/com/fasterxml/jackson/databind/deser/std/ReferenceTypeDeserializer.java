package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9944Glx;
import X.AbstractC9986Gn8;
import X.BV4;
import X.C9871GjJ;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import com.google.common.base.Absent;
import com.google.common.base.Present;

/* loaded from: classes6.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 2;
    public final AbstractC9870GjI _fullType;
    public final JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9944Glx _valueInstantiator;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final T A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
        if (abstractC9944Glx != null) {
            return (T) A0l(abstractC9916Gl7, abstractC9904Gkk, abstractC9944Glx.A0D(abstractC9904Gkk));
        }
        Object objA0Q = JsonDeserializer.A0Q(abstractC9916Gl7, abstractC9904Gkk, this._valueDeserializer, this._valueTypeDeserializer);
        return this instanceof GuavaOptionalDeserializer ? objA0Q == null ? (T) Absent.INSTANCE : (T) new Present(objA0Q) : (T) BV4.A16(objA0Q);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializerA0I;
        JsonDeserializer jsonDeserializerA07 = StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, this._valueDeserializer);
        AbstractC9870GjI abstractC9870GjI = this._fullType;
        boolean z = abstractC9870GjI instanceof C9871GjJ;
        if (jsonDeserializerA07 == null) {
            jsonDeserializerA0I = abstractC9904Gkk.A0G(interfaceC10017Gnp, z ? ((C9871GjJ) abstractC9870GjI)._referencedType : null);
        } else {
            jsonDeserializerA0I = abstractC9904Gkk.A0I(interfaceC10017Gnp, z ? ((C9871GjJ) abstractC9870GjI)._referencedType : null, jsonDeserializerA07);
        }
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        if (jsonDeserializerA0I == this._valueDeserializer && abstractC9986Gn8A03 == abstractC9986Gn8A03) {
            return this;
        }
        boolean z2 = this instanceof GuavaOptionalDeserializer;
        AbstractC9870GjI abstractC9870GjI2 = this._fullType;
        AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
        return z2 ? new GuavaOptionalDeserializer(abstractC9870GjI2, jsonDeserializerA0I, abstractC9944Glx, abstractC9986Gn8A03) : new AtomicReferenceDeserializer(abstractC9870GjI2, jsonDeserializerA0I, abstractC9944Glx, abstractC9986Gn8A03);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Glx;LX/Gn8;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)V */
    public ReferenceTypeDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9944Glx abstractC9944Glx, AbstractC9986Gn8 abstractC9986Gn8) {
        super(abstractC9870GjI);
        this._valueInstantiator = abstractC9944Glx;
        this._fullType = abstractC9870GjI;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
    }
}
