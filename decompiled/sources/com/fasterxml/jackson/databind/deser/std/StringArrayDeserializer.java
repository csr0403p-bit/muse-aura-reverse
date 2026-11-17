package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7608F5v;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AnonymousClass002;
import X.C10119Gpk;
import X.C6xC;
import X.C9828GiO;
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
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 2;
    public JsonDeserializer<String> _elementDeserializer;
    public final InterfaceC10165Gqa _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;
    public static final String[] A01 = new String[0];
    public static final StringArrayDeserializer A00 = new StringArrayDeserializer();

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String[] A01(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4, com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer r5) {
        /*
            java.lang.Boolean r1 = r5._unwrapSingle
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L14
            if (r1 != 0) goto L6e
            X.Gmd r0 = X.EnumC9965Gmd.A04
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L6e
        L14:
            boolean r0 = X.AbstractC7607F5u.A1W(r3)
            if (r0 == 0) goto L27
            X.Gqa r0 = r5._nullProvider
            java.lang.Object r0 = r0.AIA(r4)
        L20:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            return r0
        L27:
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r3.A22(r0)
            if (r0 == 0) goto L67
            java.lang.String r1 = r3.A1c()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L54
            X.GnW r2 = X.EnumC10000GnW.Array
            java.lang.Class r1 = r5.A0h()
            java.lang.Integer r0 = X.C79.A0c
            X.Got r1 = r4.A0O(r2, r1, r0)
            X.Got r0 = X.EnumC10072Got.Fail
        L47:
            if (r1 == r0) goto L67
            java.lang.Class r0 = r5.A0h()
            java.lang.Object r0 = r5.A18(r4, r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L7a
        L54:
            boolean r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0F(r1)
            if (r0 == 0) goto L67
            X.GnW r2 = X.EnumC10000GnW.Array
            java.lang.Class r1 = r5.A0h()
            X.Got r0 = X.EnumC10072Got.Fail
            X.Got r1 = r4.A0N(r0, r2, r1)
            goto L47
        L67:
            X.Gqa r0 = r5._nullProvider
            java.lang.String r0 = r5.A1A(r3, r4, r0)
            goto L20
        L6e:
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r3.A22(r0)
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r5.A17(r3, r4)
        L7a:
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L7d:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r3, r4, r5)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.A01(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer):java.lang.String[]");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer jsonDeserializerA07 = StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, this._elementDeserializer);
        AbstractC9870GjI abstractC9870GjIA0R = AbstractC7608F5v.A0R(abstractC9904Gkk._config, String.class);
        JsonDeserializer<String> jsonDeserializerA0G = jsonDeserializerA07 == null ? abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjIA0R) : abstractC9904Gkk.A0I(interfaceC10017Gnp, abstractC9870GjIA0R, jsonDeserializerA07);
        Boolean boolA10 = A10(EnumC10062Goj.A01, interfaceC10017Gnp, abstractC9904Gkk, String[].class);
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0G);
        if (jsonDeserializerA0G != null && AbstractC9855Gj3.A0K(jsonDeserializerA0G)) {
            jsonDeserializerA0G = null;
        }
        return (this._elementDeserializer == jsonDeserializerA0G && C6xC.A00(this._unwrapSingle, boolA10) && this._nullProvider == interfaceC10165GqaA0y) ? this : new StringArrayDeserializer(jsonDeserializerA0G, interfaceC10165GqaA0y, boolA10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
        int i;
        if (!abstractC9916Gl7.A1x()) {
            return A01(abstractC9916Gl7, abstractC9904Gkk, this);
        }
        if (this._elementDeserializer != null) {
            return A02(abstractC9916Gl7, abstractC9904Gkk, this, null);
        }
        C9828GiO c9828GiOA0S = abstractC9904Gkk.A0S();
        Object[] objArrA0a = JsonDeserializer.A0a(c9828GiOA0S);
        int i2 = 0;
        while (true) {
            try {
                String strA1e = abstractC9916Gl7.A1e();
                try {
                    if (strA1e == null) {
                        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
                        if (enumC9834GiYA1N == EnumC9834GiY.END_ARRAY) {
                            String[] strArr = (String[]) c9828GiOA0S.A04(objArrA0a, i2, String.class);
                            abstractC9904Gkk.A0h(c9828GiOA0S);
                            return strArr;
                        }
                        if (enumC9834GiYA1N != EnumC9834GiY.VALUE_NULL) {
                            strA1e = A1A(abstractC9916Gl7, abstractC9904Gkk, this._nullProvider);
                        } else if (this._skipNullValues) {
                            continue;
                        } else {
                            strA1e = (String) this._nullProvider.AIA(abstractC9904Gkk);
                        }
                    }
                    objArrA0a[i2] = strA1e;
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
    }

    public static final String[] A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, StringArrayDeserializer stringArrayDeserializer, String[] strArr) throws JsonMappingException {
        int length;
        Object[] objArrA03;
        String strA0i;
        int i;
        C9828GiO c9828GiOA0S = abstractC9904Gkk.A0S();
        if (strArr == null) {
            objArrA03 = JsonDeserializer.A0a(c9828GiOA0S);
            length = 0;
        } else {
            length = strArr.length;
            objArrA03 = c9828GiOA0S.A03(strArr, length);
        }
        JsonDeserializer<String> jsonDeserializer = stringArrayDeserializer._elementDeserializer;
        while (true) {
            try {
                try {
                    if (abstractC9916Gl7.A1e() == null) {
                        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
                        if (enumC9834GiYA1N == EnumC9834GiY.END_ARRAY) {
                            String[] strArr2 = (String[]) c9828GiOA0S.A04(objArrA03, length, String.class);
                            abstractC9904Gkk.A0h(c9828GiOA0S);
                            return strArr2;
                        }
                        if (enumC9834GiYA1N != EnumC9834GiY.VALUE_NULL) {
                            strA0i = jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
                        } else if (stringArrayDeserializer._skipNullValues) {
                            continue;
                        } else {
                            strA0i = (String) stringArrayDeserializer._nullProvider.AIA(abstractC9904Gkk);
                        }
                    } else {
                        strA0i = jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
                    }
                    objArrA03[length] = strA0i;
                    length = i;
                } catch (Exception e) {
                    e = e;
                    length = i;
                    throw JsonMappingException.A03(String.class, e, length);
                }
                if (length >= objArrA03.length) {
                    objArrA03 = c9828GiOA0S.A02(objArrA03);
                    length = 0;
                }
                i = length + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(JsonDeserializer<?> jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._nullProvider = interfaceC10165Gqa;
        this._unwrapSingle = bool;
        this._skipNullValues = AnonymousClass002.A1Z(interfaceC10165Gqa, C10119Gpk.A01);
    }
}
