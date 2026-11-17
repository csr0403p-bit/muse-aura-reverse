package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9869GjH;
import X.AbstractC9870GjI;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import X.AnonymousClass007;
import X.BV5;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.AbstractMap;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final AbstractC9877Gjl _keyDeserializer;
    public final JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;)V */
    public MapEntryDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, AbstractC9986Gn8 abstractC9986Gn8) {
        super(abstractC9870GjI, (InterfaceC10165Gqa) null, (Boolean) null);
        if (((AbstractC9869GjH) abstractC9870GjI)._bindings._types.length != 2) {
            throw BV5.A0O(abstractC9870GjI, "Missing generic type information for ");
        }
        this._keyDeserializer = abstractC9877Gjl;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9877Gjl abstractC9877GjlA0L = this._keyDeserializer;
        if (abstractC9877GjlA0L == null) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(this._containerType.A0B(0));
        }
        JsonDeserializer jsonDeserializerA07 = StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, this._valueDeserializer);
        AbstractC9870GjI abstractC9870GjIA0B = this._containerType.A0B(1);
        JsonDeserializer<Object> jsonDeserializerA0G = jsonDeserializerA07 == null ? abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjIA0B) : abstractC9904Gkk.A0I(interfaceC10017Gnp, abstractC9870GjIA0B, jsonDeserializerA07);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        return (this._keyDeserializer == abstractC9877GjlA0L && this._valueDeserializer == jsonDeserializerA0G && abstractC9986Gn8A03 == abstractC9986Gn8A03) ? this : new MapEntryDeserializer((MapEntryDeserializer) jsonDeserializerA0G, abstractC9877GjlA0L, (JsonDeserializer<Object>) this, abstractC9986Gn8A03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<Object, Object> A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        String strA0a;
        Object[] objArr;
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N != EnumC9834GiY.START_OBJECT) {
            if (enumC9834GiYA1N != EnumC9834GiY.FIELD_NAME && enumC9834GiYA1N != EnumC9834GiY.END_OBJECT) {
                if (enumC9834GiYA1N == EnumC9834GiY.START_ARRAY) {
                    return (Map.Entry) A16(abstractC9916Gl7, abstractC9904Gkk);
                }
                JsonDeserializer.A0S(abstractC9916Gl7, abstractC9904Gkk, this);
            }
            throw F60.createAndThrow();
        }
        enumC9834GiYA1N = abstractC9916Gl7.A1P();
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.FIELD_NAME;
        if (enumC9834GiYA1N == enumC9834GiY) {
            AbstractC9877Gjl abstractC9877Gjl = this._keyDeserializer;
            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
            AbstractC9986Gn8 abstractC9986Gn8 = this._valueTypeDeserializer;
            String strA1a = abstractC9916Gl7.A1a();
            Object objA00 = abstractC9877Gjl.A00(abstractC9904Gkk, strA1a);
            try {
                Object objAIA = abstractC9916Gl7.A1P() == EnumC9834GiY.VALUE_NULL ? jsonDeserializer.AIA(abstractC9904Gkk) : abstractC9986Gn8 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
                EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                if (enumC9834GiYA1P == EnumC9834GiY.END_OBJECT) {
                    return new AbstractMap.SimpleEntry(objA00, objAIA);
                }
                if (enumC9834GiYA1P == enumC9834GiY) {
                    objArr = new Object[]{abstractC9916Gl7.A1a()};
                    strA0a = "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')";
                    abstractC9904Gkk.A0c(this, strA0a, objArr);
                    throw F60.createAndThrow();
                }
                strA0a = AnonymousClass007.A0a("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ", enumC9834GiYA1P);
            } catch (Exception e) {
                ContainerDeserializerBase.A05(abstractC9904Gkk, Map.Entry.class, strA1a, e);
                throw F60.createAndThrow();
            }
        } else {
            if (enumC9834GiYA1N != EnumC9834GiY.END_OBJECT) {
                abstractC9904Gkk.A0X(abstractC9916Gl7, A0h());
                throw F60.createAndThrow();
            }
            strA0a = "Cannot deserialize a Map.Entry out of empty JSON Object";
        }
        objArr = new Object[0];
        abstractC9904Gkk.A0c(this, strA0a, objArr);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, AbstractC9877Gjl abstractC9877Gjl, JsonDeserializer<Object> jsonDeserializer, AbstractC9986Gn8 abstractC9986Gn8) {
        super((ContainerDeserializerBase<?>) jsonDeserializer._nullProvider, jsonDeserializer, jsonDeserializer._unwrapSingle);
        this._keyDeserializer = abstractC9877Gjl;
        this._valueDeserializer = mapEntryDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
    }
}
