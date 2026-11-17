package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC9870GjI;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import X.DMu;
import X.DN7;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.NaturalOrdering;

/* loaded from: classes6.dex */
public abstract class GuavaMapDeserializer<T> extends ContainerDeserializerBase<T> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 2;
    public AbstractC9877Gjl _keyDeserializer;
    public JsonDeserializer<?> _valueDeserializer;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gn8;LX/Gqa;)V */
    public GuavaMapDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9986Gn8 abstractC9986Gn8) {
        super(abstractC9870GjI, interfaceC10165Gqa, (Boolean) null);
        this._keyDeserializer = abstractC9877Gjl;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9877Gjl abstractC9877GjlA0L = this._keyDeserializer;
        JsonDeserializer jsonDeserializerA07 = StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, this._valueDeserializer);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9877GjlA0L == null) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(this._containerType.A08());
        }
        JsonDeserializer<?> jsonDeserializerA0J = JsonDeserializer.A0J(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA07, this);
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0J);
        if (this._keyDeserializer == abstractC9877GjlA0L && this._valueDeserializer == jsonDeserializerA0J && this._valueTypeDeserializer == abstractC9986Gn8A03 && this._nullProvider == interfaceC10165GqaA0y) {
            return this;
        }
        if (this instanceof ImmutableSortedMapDeserializer) {
            return new ImmutableSortedMapDeserializer(this._containerType, jsonDeserializerA0J, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03);
        }
        boolean z = this instanceof ImmutableMapDeserializer;
        AbstractC9870GjI abstractC9870GjI = this._containerType;
        return z ? new ImmutableMapDeserializer(abstractC9870GjI, jsonDeserializerA0J, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03) : new ImmutableBiMapDeserializer(abstractC9870GjI, jsonDeserializerA0J, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final T A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        ImmutableMap.Builder builder;
        Object objA0R;
        EnumC9834GiY enumC9834GiYA1O = abstractC9916Gl7.A1O();
        if (enumC9834GiYA1O == EnumC9834GiY.START_OBJECT) {
            enumC9834GiYA1O = abstractC9916Gl7.A1P();
        }
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.FIELD_NAME;
        if (enumC9834GiYA1O != enumC9834GiY && enumC9834GiYA1O != EnumC9834GiY.END_OBJECT) {
            abstractC9904Gkk.A0X(abstractC9916Gl7, this._containerType._class);
            throw F60.createAndThrow();
        }
        GuavaImmutableMapDeserializer guavaImmutableMapDeserializer = (GuavaImmutableMapDeserializer) this;
        AbstractC9877Gjl abstractC9877Gjl = guavaImmutableMapDeserializer._keyDeserializer;
        JsonDeserializer<?> jsonDeserializer = guavaImmutableMapDeserializer._valueDeserializer;
        AbstractC9986Gn8 abstractC9986Gn8 = guavaImmutableMapDeserializer._valueTypeDeserializer;
        if (guavaImmutableMapDeserializer instanceof ImmutableSortedMapDeserializer) {
            ImmutableSortedMap<Comparable<?>, Object> immutableSortedMap = ImmutableSortedMap.A03;
            builder = new DN7(NaturalOrdering.A00);
        } else {
            builder = guavaImmutableMapDeserializer instanceof ImmutableMapDeserializer ? new ImmutableMap.Builder() : new DMu();
        }
        while (abstractC9916Gl7.A1O() == enumC9834GiY) {
            String strA1a = abstractC9916Gl7.A1a();
            String strA00 = strA1a;
            if (abstractC9877Gjl != null) {
                strA00 = abstractC9877Gjl.A00(abstractC9904Gkk, strA1a);
            }
            if (abstractC9916Gl7.A1P() != EnumC9834GiY.VALUE_NULL) {
                builder.put(strA00, JsonDeserializer.A0Q(abstractC9916Gl7, abstractC9904Gkk, jsonDeserializer, abstractC9986Gn8));
            } else if (!guavaImmutableMapDeserializer._skipNullValues && (objA0R = JsonDeserializer.A0R(abstractC9904Gkk, guavaImmutableMapDeserializer)) != null) {
                builder.put(strA00, objA0R);
            }
            abstractC9916Gl7.A1P();
        }
        return (T) builder.buildOrThrow();
    }
}
