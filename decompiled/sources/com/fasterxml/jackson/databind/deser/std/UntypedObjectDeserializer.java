package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C60O;
import X.C9828GiO;
import X.C9829GiP;
import X.C9860Gj8;
import X.C9866GjE;
import X.EnumC10051GoV;
import X.EnumC9834GiY;
import X.EnumC9965Gmd;
import X.F60;
import X.InterfaceC10183Gqt;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements InterfaceC10183Gqt, InterfaceC9830GiT {
    public static final Object[] A00 = BV4.A1W();
    public static final long serialVersionUID = 1;
    public JsonDeserializer<Object> _listDeserializer;
    public AbstractC9870GjI _listType;
    public JsonDeserializer<Object> _mapDeserializer;
    public AbstractC9870GjI _mapType;
    public final boolean _nonMerging;
    public JsonDeserializer<Object> _numberDeserializer;
    public JsonDeserializer<Object> _stringDeserializer;

    @Deprecated
    public UntypedObjectDeserializer() {
        this((AbstractC9870GjI) null, (AbstractC9870GjI) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (map instanceof List) {
            ((List) map).add(str);
            obj2.put(obj, map);
        } else {
            ArrayList arrayListA0u = BV5.A0u(map);
            arrayListA0u.add(str);
            obj2.put(obj, arrayListA0u);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0013  */
    @Override // X.InterfaceC9830GiT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer A7e(X.InterfaceC10017Gnp r4, X.AbstractC9904Gkk r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L13
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            X.Gke r1 = r5._config
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Boolean r0 = r1.A0C(r0)
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 != 0) goto L14
        L13:
            r2 = 0
        L14:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r3._stringDeserializer
            if (r0 != 0) goto L38
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r3._numberDeserializer
            if (r0 != 0) goto L38
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r3._mapDeserializer
            if (r0 != 0) goto L38
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r3._listDeserializer
            if (r0 != 0) goto L38
            java.lang.Class r1 = r3.getClass()
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            if (r1 != r0) goto L38
            if (r2 == 0) goto L35
            r1 = 1
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR
            r0.<init>(r1)
            return r0
        L35:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.A00
            return r0
        L38:
            boolean r0 = r3._nonMerging
            if (r2 == r0) goto L42
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r0.<init>(r3, r2)
            return r0
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.A7e(X.Gnp, X.Gkk):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // X.InterfaceC10183Gqt
    public final void AbV(AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9870GjI abstractC9870GjIA0R = AbstractC7608F5v.A0R(abstractC9904Gkk._config, Object.class);
        AbstractC9870GjI abstractC9870GjIA0R2 = AbstractC7608F5v.A0R(abstractC9904Gkk._config, String.class);
        C9860Gj8 c9860Gj8A0B = abstractC9904Gkk.A0B();
        AbstractC9870GjI abstractC9870GjI = this._listType;
        this._listDeserializer = abstractC9870GjI == null ? JsonDeserializer.A0K(abstractC9904Gkk, c9860Gj8A0B.A0A(abstractC9870GjIA0R, List.class)) : abstractC9904Gkk._cache.A02(abstractC9904Gkk, abstractC9870GjI, abstractC9904Gkk._factory);
        AbstractC9870GjI abstractC9870GjI2 = this._mapType;
        this._mapDeserializer = abstractC9870GjI2 == null ? JsonDeserializer.A0K(abstractC9904Gkk, c9860Gj8A0B.A0B(abstractC9870GjIA0R2, abstractC9870GjIA0R, Map.class)) : abstractC9904Gkk._cache.A02(abstractC9904Gkk, abstractC9870GjI2, abstractC9904Gkk._factory);
        this._stringDeserializer = JsonDeserializer.A0K(abstractC9904Gkk, abstractC9870GjIA0R2);
        this._numberDeserializer = JsonDeserializer.A0K(abstractC9904Gkk, c9860Gj8A0B.A09(Number.class));
        C9866GjE c9866GjE = C9860Gj8.A05;
        this._mapDeserializer = abstractC9904Gkk.A0I(null, c9866GjE, this._mapDeserializer);
        this._listDeserializer = abstractC9904Gkk.A0I(null, c9866GjE, this._listDeserializer);
        this._stringDeserializer = abstractC9904Gkk.A0I(null, c9866GjE, this._stringDeserializer);
        this._numberDeserializer = abstractC9904Gkk.A0I(null, c9866GjE, this._numberDeserializer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A0N._mask, r4._featureFlags) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4) {
        /*
            java.lang.Integer r2 = r3.A1T()
            java.lang.Integer r0 = X.C79.A0K
            if (r2 == r0) goto L1a
            boolean r0 = r3.A1z()
            if (r0 != 0) goto L1f
            X.Gmd r0 = X.EnumC9965Gmd.A0N
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L1f
        L1a:
            java.math.BigDecimal r0 = r3.A1f()
            return r0
        L1f:
            java.lang.Integer r0 = X.C79.A01
            if (r2 != r0) goto L2c
            float r0 = r3.A1A()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L2c:
            double r0 = r3.A17()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.A00(X.Gl7, X.Gkk):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, UntypedObjectDeserializer untypedObjectDeserializer) {
        int i;
        int i2;
        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.END_ARRAY;
        int i3 = 2;
        if (enumC9834GiYA1P == enumC9834GiY) {
            return C60O.A11(2);
        }
        Object objA0i = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        if (abstractC9916Gl7.A1P() == enumC9834GiY) {
            ArrayList arrayListA11 = C60O.A11(2);
            arrayListA11.add(objA0i);
            return arrayListA11;
        }
        Object objA0i2 = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        if (abstractC9916Gl7.A1P() == enumC9834GiY) {
            ArrayList arrayListA112 = C60O.A11(2);
            arrayListA112.add(objA0i);
            arrayListA112.add(objA0i2);
            return arrayListA112;
        }
        C9828GiO c9828GiOA0S = abstractC9904Gkk.A0S();
        Object[] objArrA0a = JsonDeserializer.A0a(c9828GiOA0S);
        objArrA0a[0] = objA0i;
        objArrA0a[1] = objA0i2;
        int i4 = 2;
        while (true) {
            Object objA0i3 = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
            i3++;
            if (i4 >= objArrA0a.length) {
                objArrA0a = c9828GiOA0S.A02(objArrA0a);
                i4 = 0;
            }
            i = i4 + 1;
            objArrA0a[i4] = objA0i3;
            if (abstractC9916Gl7.A1P() == enumC9834GiY) {
                break;
            }
            i4 = i;
        }
        ArrayList arrayListA113 = C60O.A11(i3);
        C9829GiP c9829GiP = c9828GiOA0S.A01;
        while (true) {
            i2 = 0;
            if (c9829GiP == null) {
                break;
            }
            Object[] objArr = (Object[]) c9829GiP.A01;
            int length = objArr.length;
            while (i2 < length) {
                arrayListA113.add(objArr[i2]);
                i2++;
            }
            c9829GiP = c9829GiP.A00;
        }
        while (i2 < i) {
            arrayListA113.add(objArrA0a[i2]);
            i2++;
        }
        C9828GiO.A00(c9828GiOA0S);
        abstractC9904Gkk.A0h(c9828GiOA0S);
        return arrayListA113;
    }

    public static final LinkedHashMap A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, UntypedObjectDeserializer untypedObjectDeserializer) {
        String strA1a;
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == EnumC9834GiY.START_OBJECT) {
            strA1a = abstractC9916Gl7.A1d();
        } else if (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
            strA1a = abstractC9916Gl7.A1a();
        } else {
            if (enumC9834GiYA1N != EnumC9834GiY.END_OBJECT) {
                abstractC9904Gkk.A0X(abstractC9916Gl7, untypedObjectDeserializer.A0h());
                throw F60.createAndThrow();
            }
            strA1a = null;
        }
        if (strA1a == null) {
            return C60O.A15(2);
        }
        abstractC9916Gl7.A1P();
        Object objA0i = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        String strA1d = abstractC9916Gl7.A1d();
        if (strA1d == null) {
            LinkedHashMap linkedHashMapA15 = C60O.A15(2);
            linkedHashMapA15.put(strA1a, objA0i);
            return linkedHashMapA15;
        }
        abstractC9916Gl7.A1P();
        Object objA0i2 = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        String strA1d2 = abstractC9916Gl7.A1d();
        if (strA1d2 == null) {
            LinkedHashMap linkedHashMapA152 = C60O.A15(4);
            linkedHashMapA152.put(strA1a, objA0i);
            if (linkedHashMapA152.put(strA1d, objA0i2) == null) {
                return linkedHashMapA152;
            }
            if (!AbstractC7609F5w.A1U(EnumC10051GoV.DUPLICATE_PROPERTIES._mask, abstractC9904Gkk._readCapabilities._enabled)) {
                return linkedHashMapA152;
            }
            A03(objA0i, objA0i2, strA1a, linkedHashMapA152);
            return linkedHashMapA152;
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.put(strA1a, objA0i);
        if (linkedHashMapA0j.put(strA1d, objA0i2) != null) {
            boolean zA1U = AbstractC7609F5w.A1U(EnumC10051GoV.DUPLICATE_PROPERTIES._mask, abstractC9904Gkk._readCapabilities._enabled);
            if (zA1U) {
                A03(objA0i, objA0i2, strA1a, linkedHashMapA0j);
            }
            do {
                abstractC9916Gl7.A1P();
                Object objA0i3 = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
                Object objPut = linkedHashMapA0j.put(strA1d2, objA0i3);
                if (objPut != null && zA1U) {
                    A03(objPut, objA0i3, strA1a, linkedHashMapA0j);
                }
                strA1d2 = abstractC9916Gl7.A1d();
            } while (strA1d2 != null);
            return linkedHashMapA0j;
        }
        do {
            abstractC9916Gl7.A1P();
            Object objA0i4 = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
            Object objPut2 = linkedHashMapA0j.put(strA1d2, objA0i4);
            if (objPut2 != null) {
                String strA1d3 = abstractC9916Gl7.A1d();
                boolean zA1U2 = AbstractC7609F5w.A1U(EnumC10051GoV.DUPLICATE_PROPERTIES._mask, abstractC9904Gkk._readCapabilities._enabled);
                if (zA1U2) {
                    A03(objPut2, objA0i4, strA1d2, linkedHashMapA0j);
                }
                while (strA1d3 != null) {
                    abstractC9916Gl7.A1P();
                    Object objA0i5 = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
                    Object objPut3 = linkedHashMapA0j.put(strA1d3, objA0i5);
                    if (objPut3 != null && zA1U2) {
                        A03(objPut3, objA0i5, strA1d2, linkedHashMapA0j);
                    }
                    strA1d3 = abstractC9916Gl7.A1d();
                }
                return linkedHashMapA0j;
            }
            strA1d2 = abstractC9916Gl7.A1d();
        } while (strA1d2 != null);
        return linkedHashMapA0j;
    }

    public static final Object[] A04(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, UntypedObjectDeserializer untypedObjectDeserializer) {
        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.END_ARRAY;
        if (enumC9834GiYA1P == enumC9834GiY) {
            return A00;
        }
        C9828GiO c9828GiOA0S = abstractC9904Gkk.A0S();
        Object[] objArrA0a = JsonDeserializer.A0a(c9828GiOA0S);
        int i = 0;
        while (true) {
            Object objA0i = untypedObjectDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
            if (i >= objArrA0a.length) {
                objArrA0a = c9828GiOA0S.A02(objArrA0a);
                i = 0;
            }
            int i2 = i + 1;
            objArrA0a[i] = objA0i;
            if (abstractC9916Gl7.A1P() == enumC9834GiY) {
                int i3 = c9828GiOA0S.A00 + i2;
                Object[] objArr = new Object[i3];
                C9828GiO.A01(c9828GiOA0S, objArr, objArrA0a, i3, i2);
                C9828GiO.A00(c9828GiOA0S);
                abstractC9904Gkk.A0h(c9828GiOA0S);
                return objArr;
            }
            i = i2;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        switch (abstractC9916Gl7.A1B()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer<Object> jsonDeserializer = this._mapDeserializer;
                return jsonDeserializer != null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : A02(abstractC9916Gl7, abstractC9904Gkk, this);
            case 3:
                if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0P._mask, abstractC9904Gkk._featureFlags)) {
                    return A04(abstractC9916Gl7, abstractC9904Gkk, this);
                }
                JsonDeserializer<Object> jsonDeserializer2 = this._listDeserializer;
                return jsonDeserializer2 != null ? jsonDeserializer2.A0i(abstractC9916Gl7, abstractC9904Gkk) : A01(abstractC9916Gl7, abstractC9904Gkk, this);
            case 4:
            default:
                abstractC9904Gkk.A0X(abstractC9916Gl7, Object.class);
                throw F60.createAndThrow();
            case 6:
                JsonDeserializer<Object> jsonDeserializer3 = this._stringDeserializer;
                return jsonDeserializer3 != null ? jsonDeserializer3.A0i(abstractC9916Gl7, abstractC9904Gkk) : abstractC9916Gl7.A1c();
            case 7:
                JsonDeserializer<Object> jsonDeserializer4 = this._numberDeserializer;
                return jsonDeserializer4 != null ? jsonDeserializer4.A0i(abstractC9916Gl7, abstractC9904Gkk) : (StdDeserializer.A00 & abstractC9904Gkk._featureFlags) != 0 ? StdDeserializer.A0B(abstractC9916Gl7, abstractC9904Gkk) : abstractC9916Gl7.A1U();
            case 8:
                JsonDeserializer<Object> jsonDeserializer5 = this._numberDeserializer;
                return jsonDeserializer5 != null ? jsonDeserializer5.A0i(abstractC9916Gl7, abstractC9904Gkk) : A00(abstractC9916Gl7, abstractC9904Gkk);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return abstractC9916Gl7.A1V();
        }
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super((Class<?>) Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    public UntypedObjectDeserializer(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2) {
        super((Class<?>) Object.class);
        this._listType = abstractC9870GjI;
        this._mapType = abstractC9870GjI2;
        this._nonMerging = false;
    }
}
