package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import X.AnonymousClass002;
import X.C6xC;
import X.C9828GiO;
import X.C9872GjK;
import X.EnumC10062Goj;
import X.EnumC9834GiY;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final Class<?> _elementClass;
    public JsonDeserializer<Object> _elementDeserializer;
    public final AbstractC9986Gn8 _elementTypeDeserializer;
    public final Object[] _emptyValue;
    public final boolean _untyped;

    public ObjectArrayDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer<Object> jsonDeserializer, AbstractC9986Gn8 abstractC9986Gn8) {
        super(abstractC9870GjI, (InterfaceC10165Gqa) null, (Boolean) null);
        C9872GjK c9872GjK = (C9872GjK) abstractC9870GjI;
        Class<?> cls = c9872GjK._componentType._class;
        this._elementClass = cls;
        this._untyped = AnonymousClass002.A1Z(cls, Object.class);
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = abstractC9986Gn8;
        this._emptyValue = (Object[]) c9872GjK._emptyArray;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializer = this._elementDeserializer;
        Boolean boolA10 = A10(EnumC10062Goj.A01, interfaceC10017Gnp, abstractC9904Gkk, this._containerType._class);
        JsonDeserializer<Object> jsonDeserializerA0J = JsonDeserializer.A0J(interfaceC10017Gnp, abstractC9904Gkk, StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializer), this);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._elementTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0J);
        return (C6xC.A00(boolA10, this._unwrapSingle) && interfaceC10165GqaA0y == this._nullProvider && jsonDeserializerA0J == this._elementDeserializer && abstractC9986Gn8A03 == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(jsonDeserializerA0J, interfaceC10165GqaA0y, this, abstractC9986Gn8A03, boolA10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A04._mask, r4._featureFlags) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4, com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer r5) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            java.lang.Boolean r1 = r5._unwrapSingle
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L14
            if (r1 != 0) goto L80
            X.Gmd r0 = X.EnumC9965Gmd.A04
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L80
        L14:
            boolean r0 = X.AbstractC7607F5u.A1W(r3)
            if (r0 == 0) goto L21
            boolean r0 = r5._skipNullValues
            if (r0 == 0) goto L68
            java.lang.Object[] r0 = r5._emptyValue
            return r0
        L21:
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r3.A22(r0)
            if (r0 == 0) goto L5f
            java.lang.String r1 = r3.A1c()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L4c
            X.GnW r2 = X.EnumC10000GnW.Array
            java.lang.Class r1 = r5.A0h()
            java.lang.Integer r0 = X.C79.A0c
            X.Got r1 = r4.A0O(r2, r1, r0)
            X.Got r0 = X.EnumC10072Got.Fail
        L41:
            if (r1 == r0) goto L5f
            java.lang.Class r0 = r5.A0h()
            java.lang.Object r0 = r5.A18(r4, r1, r0)
            return r0
        L4c:
            boolean r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0F(r1)
            if (r0 == 0) goto L5f
            X.GnW r2 = X.EnumC10000GnW.Array
            java.lang.Class r1 = r5.A0h()
            X.Got r0 = X.EnumC10072Got.Fail
            X.Got r1 = r4.A0N(r0, r2, r1)
            goto L41
        L5f:
            X.Gn8 r1 = r5._elementTypeDeserializer
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r5._elementDeserializer
            java.lang.Object r2 = com.fasterxml.jackson.databind.JsonDeserializer.A0Q(r3, r4, r0, r1)
            goto L6c
        L68:
            java.lang.Object r2 = com.fasterxml.jackson.databind.JsonDeserializer.A0R(r4, r5)
        L6c:
            boolean r0 = r5._untyped
            r1 = 1
            if (r0 == 0) goto L77
            java.lang.Object[] r0 = new java.lang.Object[r1]
        L73:
            r1 = 0
            r0[r1] = r2
            return r0
        L77:
            java.lang.Class<?> r0 = r5._elementClass
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L73
        L80:
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r3.A22(r0)
            if (r0 == 0) goto Laf
            java.lang.Class<?> r1 = r5._elementClass
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 != r0) goto Laa
            X.Gke r0 = r4._config
            X.GkY r0 = r0._base
            X.Gn1 r0 = r0._defaultBase64
            byte[] r4 = r3.A24(r0)
            int r3 = r4.length
            java.lang.Byte[] r2 = new java.lang.Byte[r3]
            r1 = 0
        L9c:
            if (r1 >= r3) goto La9
            r0 = r4[r1]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L9c
        La9:
            return r2
        Laa:
            java.lang.Object r0 = r5.A17(r3, r4)
            return r0
        Laf:
            X.GjI r0 = r5._containerType
            r4.A0V(r3, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer.A00(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
        Object[] objArrA04;
        Object objA0i;
        int i;
        if (!abstractC9916Gl7.A1x()) {
            return A00(abstractC9916Gl7, abstractC9904Gkk, this);
        }
        C9828GiO c9828GiOA0S = abstractC9904Gkk.A0S();
        Object[] objArrA0a = JsonDeserializer.A0a(c9828GiOA0S);
        AbstractC9986Gn8 abstractC9986Gn8 = this._elementTypeDeserializer;
        int i2 = 0;
        while (true) {
            try {
                EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                    break;
                }
                try {
                    if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL) {
                        JsonDeserializer<Object> jsonDeserializer = this._elementDeserializer;
                        objA0i = abstractC9986Gn8 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
                    } else if (this._skipNullValues) {
                        continue;
                    } else {
                        objA0i = JsonDeserializer.A0R(abstractC9904Gkk, this);
                    }
                    objArrA0a[i2] = objA0i;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw JsonMappingException.A03(objArrA0a, e, c9828GiOA0S.A00 + i2);
                }
                if (i2 >= objArrA0a.length) {
                    objArrA0a = c9828GiOA0S.A02(objArrA0a);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            int i3 = c9828GiOA0S.A00 + i2;
            objArrA04 = new Object[i3];
            C9828GiO.A01(c9828GiOA0S, objArrA04, objArrA0a, i3, i2);
            C9828GiO.A00(c9828GiOA0S);
        } else {
            objArrA04 = c9828GiOA0S.A04(objArrA0a, i2, this._elementClass);
        }
        abstractC9904Gkk.A0h(c9828GiOA0S);
        return objArrA04;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/deser/std/ObjectArrayDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;LX/Gqa;Ljava/lang/Boolean;)V */
    public ObjectArrayDeserializer(JsonDeserializer jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, ObjectArrayDeserializer objectArrayDeserializer, AbstractC9986Gn8 abstractC9986Gn8, Boolean bool) {
        super((ContainerDeserializerBase<?>) interfaceC10165Gqa, objectArrayDeserializer, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = abstractC9986Gn8;
    }
}
