package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC9849Git;
import X.AbstractC9850Giu;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9910Gks;
import X.AbstractC9916Gl7;
import X.AbstractC9944Glx;
import X.AbstractC9970Gmj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C10002GnY;
import X.C10009Gnh;
import X.C10119Gpk;
import X.C3cG;
import X.C60O;
import X.C79;
import X.C9801GhN;
import X.C9802GhO;
import X.C9888GkO;
import X.C9894GkV;
import X.C9898Gke;
import X.C9921GlI;
import X.EnumC10000GnW;
import X.EnumC10051GoV;
import X.EnumC10062Goj;
import X.EnumC10067Goo;
import X.EnumC10072Got;
import X.EnumC10073Gou;
import X.EnumC10102GpQ;
import X.EnumC9834GiY;
import X.EnumC9951GmA;
import X.EnumC9965Gmd;
import X.F60;
import X.HlV;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9854Giz;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class StdDeserializer extends JsonDeserializer implements Serializable {
    public static final int A00 = EnumC9965Gmd.A0O._mask | EnumC9965Gmd.A0Q._mask;
    public static final long serialVersionUID = 1;
    public final Class<?> _valueClass;
    public final AbstractC9870GjI _valueType;

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;Ljava/lang/String;LX/GnW;Ljava/lang/Class<*>;)LX/Got; */
    private final EnumC10072Got A08(AbstractC9904Gkk abstractC9904Gkk, EnumC10000GnW enumC10000GnW, Class cls, String str) throws InvalidFormatException {
        EnumC10072Got enumC10072GotA0O;
        String str2;
        if (str.isEmpty()) {
            enumC10072GotA0O = abstractC9904Gkk.A0O(enumC10000GnW, cls, C79.A0c);
            str2 = "empty String (\"\")";
        } else {
            if (!A0F(str)) {
                if (AbstractC7609F5w.A1U(EnumC10051GoV.UNTYPED_SCALARS._mask, abstractC9904Gkk._readCapabilities._enabled)) {
                    return EnumC10072Got.TryConvert;
                }
                enumC10072GotA0O = abstractC9904Gkk.A0O(enumC10000GnW, cls, C79.A0T);
                if (enumC10072GotA0O == EnumC10072Got.Fail) {
                    abstractC9904Gkk.A0c(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, A19());
                    throw F60.createAndThrow();
                }
                return enumC10072GotA0O;
            }
            enumC10072GotA0O = abstractC9904Gkk.A0N(EnumC10072Got.Fail, enumC10000GnW, cls);
            str2 = "blank String (all whitespace)";
        }
        A1G(abstractC9904Gkk, enumC10072GotA0O, cls, str, str2);
        return enumC10072GotA0O;
    }

    public static final boolean A0G(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'f') {
            return "false".equals(str);
        }
        if (cCharAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public static final boolean A0H(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 't') {
            return "true".equals(str);
        }
        if (cCharAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public final Object A18(AbstractC9904Gkk abstractC9904Gkk, EnumC10072Got enumC10072Got, Class cls) throws InvalidFormatException {
        int iOrdinal = enumC10072Got.ordinal();
        if (iOrdinal == 3) {
            return A0m(abstractC9904Gkk);
        }
        if (iOrdinal != 0) {
            return null;
        }
        A1G(abstractC9904Gkk, enumC10072Got, cls, "", "empty String (\"\")");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r1 != 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date A1B(X.AbstractC9916Gl7 r9, X.AbstractC9904Gkk r10) throws java.io.IOException {
        /*
            r8 = this;
            r6 = r9
            int r1 = r9.A1B()
            r0 = 1
            r5 = r10
            if (r1 == r0) goto La8
            r4 = 3
            if (r1 == r4) goto L41
            r0 = 11
            if (r1 == r0) goto L99
            r0 = 6
            if (r1 == r0) goto L34
            r0 = 7
            if (r1 != r0) goto La8
            long r1 = r9.A1G()     // Catch: com.fasterxml.jackson.core.exc.StreamReadException -> L20
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            return r0
        L20:
            java.lang.Class<?> r3 = r8._valueClass
            java.lang.Number r2 = r9.A1U()
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "not a valid 64-bit `long` for creating `java.util.Date`"
            r10.A0i(r3, r2, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L34:
            java.lang.String r0 = r9.A1c()
            java.lang.String r0 = r0.trim()
            java.util.Date r0 = r8.A1C(r10, r0)
            return r0
        L41:
            X.GnW r2 = r8.A0e()
            java.lang.Class r1 = r8.A0h()
            java.lang.Integer r0 = X.C79.A0Y
            X.Got r3 = r10.A0O(r2, r1, r0)
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r10._featureFlags
            int r0 = r0._mask
            boolean r2 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r2 != 0) goto L5f
            X.Got r0 = X.EnumC10072Got.Fail
            if (r3 == r0) goto L73
        L5f:
            X.GiY r1 = r9.A1P()
            X.GiY r0 = X.EnumC9834GiY.END_ARRAY
            if (r1 != r0) goto L8a
            int r1 = r3.ordinal()
            if (r1 == r4) goto L94
            r0 = 2
            if (r1 == r0) goto L99
            r0 = 1
            if (r1 == r0) goto L99
        L73:
            java.lang.Class<?> r1 = r8._valueClass
            X.GiY r7 = X.EnumC9834GiY.START_ARRAY
            java.lang.Object[] r10 = X.BV4.A1W()
            r9 = 0
            if (r1 != 0) goto L83
            r8 = 0
        L7f:
            r5.A0U(r6, r7, r8, r9, r10)
            goto Lab
        L83:
            X.Gke r0 = r5._config
            X.GjI r8 = X.AbstractC7608F5v.A0R(r0, r1)
            goto L7f
        L8a:
            if (r2 == 0) goto L73
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto La0
            r8.A0D(r9, r10)
            goto Lab
        L94:
            java.lang.Object r0 = r8.A0m(r10)
            goto L9d
        L99:
            java.lang.Object r0 = r8.AIA(r10)
        L9d:
            java.util.Date r0 = (java.util.Date) r0
            return r0
        La0:
            java.util.Date r0 = r8.A1B(r9, r10)
            r8.A0C(r9, r10)
            return r0
        La8:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r9, r10, r8)
        Lab:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A1B(X.Gl7, X.Gkk):java.util.Date");
    }

    public final Date A1C(AbstractC9904Gkk abstractC9904Gkk, String str) {
        try {
            if (str.isEmpty()) {
                if (A0x(abstractC9904Gkk, str).ordinal() == 3) {
                    return new Date(0L);
                }
                return null;
            }
            if (HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(str)) {
                return null;
            }
            return abstractC9904Gkk.A0T(str);
        } catch (IllegalArgumentException e) {
            abstractC9904Gkk.A0k(this._valueClass, str, "not a valid representation (error: %s)", AbstractC9855Gj3.A0A(e));
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;LX/Gou;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)LX/Gqa; */
    public static final InterfaceC10165Gqa A09(EnumC10073Gou enumC10073Gou, InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk, JsonDeserializer jsonDeserializer) throws IOException {
        AbstractC9870GjI abstractC9870GjIAM9;
        C10009Gnh c10009GnhAFv;
        Class<?> clsA0h;
        if (enumC10073Gou == EnumC10073Gou.FAIL) {
            if (interfaceC10017Gnp == null) {
                if (jsonDeserializer == null) {
                    clsA0h = Object.class;
                } else {
                    clsA0h = jsonDeserializer.A0h();
                    if (clsA0h == null) {
                        abstractC9870GjIAM9 = null;
                    }
                    c10009GnhAFv = null;
                }
                abstractC9870GjIAM9 = AbstractC7608F5v.A0R(abstractC9904Gkk._config, clsA0h);
                c10009GnhAFv = null;
            } else {
                abstractC9870GjIAM9 = interfaceC10017Gnp.AM9();
                c10009GnhAFv = interfaceC10017Gnp.AFv();
            }
            return new C9801GhN(abstractC9870GjIAM9, c10009GnhAFv);
        }
        if (enumC10073Gou == EnumC10073Gou.AS_EMPTY) {
            if (jsonDeserializer != null) {
                if (jsonDeserializer instanceof BeanDeserializerBase) {
                    BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
                    if (!beanDeserializerBase._valueInstantiator.A09()) {
                        AbstractC9870GjI abstractC9870GjIAM92 = interfaceC10017Gnp == null ? beanDeserializerBase._beanType : interfaceC10017Gnp.AM9();
                        AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjIAM92, "Cannot create empty instance of %s, no default Creator", new Object[]{abstractC9870GjIAM92});
                        throw F60.createAndThrow();
                    }
                }
                EnumC10102GpQ enumC10102GpQA0f = jsonDeserializer.A0f();
                if (enumC10102GpQA0f != EnumC10102GpQ.ALWAYS_NULL) {
                    if (enumC10102GpQA0f != EnumC10102GpQ.CONSTANT) {
                        return new C9802GhO(jsonDeserializer);
                    }
                    Object objA0m = jsonDeserializer.A0m(abstractC9904Gkk);
                    if (objA0m != null) {
                        return new C10119Gpk(objA0m);
                    }
                }
                return C10119Gpk.A00;
            }
        } else if (enumC10073Gou == EnumC10073Gou.SKIP) {
            return C10119Gpk.A01;
        }
        return null;
    }

    private final Boolean A0A(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Class<?> cls) throws InvalidFormatException {
        EnumC10072Got enumC10072GotA0O = abstractC9904Gkk.A0O(EnumC10000GnW.Boolean, cls, C79.A0C);
        int iOrdinal = enumC10072GotA0O.ordinal();
        boolean z = true;
        if (iOrdinal != 3) {
            if (iOrdinal == 2) {
                return null;
            }
            if (iOrdinal != 0) {
                if (abstractC9916Gl7.A1L() != EnumC10067Goo.INT) {
                    z = !HatchPriceImpressionEventDataKt.NO_DISCOUNT.equals(abstractC9916Gl7.A1c());
                } else if (abstractC9916Gl7.A1C() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            A1G(abstractC9904Gkk, enumC10072GotA0O, cls, abstractC9916Gl7.A1U(), C60O.A0r("Integer value (", abstractC9916Gl7.A1c()));
        }
        return Boolean.FALSE;
    }

    public static final Object A0B(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0O._mask, abstractC9904Gkk._featureFlags)) {
            return abstractC9916Gl7.A1g();
        }
        return AbstractC7609F5w.A1U(EnumC9965Gmd.A0Q._mask, abstractC9904Gkk._featureFlags) ? Long.valueOf(abstractC9916Gl7.A1G()) : abstractC9916Gl7.A1U();
    }

    private final void A0D(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException {
        String str = String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", AbstractC9855Gj3.A06(this._valueClass), EnumC9834GiY.START_ARRAY, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
        abstractC9904Gkk.A0U(abstractC9916Gl7, abstractC9916Gl7.A1N(), A0u(abstractC9904Gkk), str, new Object[0]);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A0E(AbstractC9904Gkk abstractC9904Gkk, String str) {
        boolean z;
        EnumC9951GmA enumC9951GmA;
        EnumC9951GmA enumC9951GmA2 = EnumC9951GmA.A04;
        if (abstractC9904Gkk._config.A09(enumC9951GmA2)) {
            EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0B;
            if (!AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                return;
            }
            z = false;
            enumC9951GmA = enumC9965Gmd;
        } else {
            z = true;
            enumC9951GmA = enumC9951GmA2;
        }
        abstractC9904Gkk.A0c(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str), A19(), z ? "enable" : "disable", enumC9951GmA.getDeclaringClass().getSimpleName(), enumC9951GmA.name());
        throw F60.createAndThrow();
    }

    public final AbstractC9870GjI A0u(AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9870GjI abstractC9870GjI = this._valueType;
        if (abstractC9870GjI != null) {
            return abstractC9870GjI;
        }
        Class<?> cls = this._valueClass;
        if (cls == null) {
            return null;
        }
        return AbstractC7608F5v.A0R(abstractC9904Gkk._config, cls);
    }

    public final EnumC10072Got A0v(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Class<?> cls) throws InvalidFormatException {
        EnumC10072Got enumC10072GotA0O = abstractC9904Gkk.A0O(EnumC10000GnW.Integer, cls, C79.A0K);
        if (enumC10072GotA0O != EnumC10072Got.Fail) {
            return enumC10072GotA0O;
        }
        A1G(abstractC9904Gkk, enumC10072GotA0O, cls, abstractC9916Gl7.A1U(), C60O.A0r("Floating-point value (", abstractC9916Gl7.A1c()));
        throw F60.createAndThrow();
    }

    public final EnumC10072Got A0w(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Class<?> cls) throws InvalidFormatException {
        EnumC10072Got enumC10072GotA0O = abstractC9904Gkk.A0O(EnumC10000GnW.Float, cls, C79.A0C);
        if (enumC10072GotA0O != EnumC10072Got.Fail) {
            return enumC10072GotA0O;
        }
        A1G(abstractC9904Gkk, enumC10072GotA0O, cls, abstractC9916Gl7.A1U(), C60O.A0r("Integer value (", abstractC9916Gl7.A1c()));
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)LX/Gqa; */
    public final InterfaceC10165Gqa A0y(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk, JsonDeserializer jsonDeserializer) {
        AbstractC9870GjI abstractC9870GjIA07;
        C10009Gnh c10009GnhAFv;
        EnumC10073Gou enumC10073Gou = interfaceC10017Gnp != null ? interfaceC10017Gnp.AHh()._contentNulls : abstractC9904Gkk._config._configOverrides._defaultSetterInfo._contentNulls;
        if (enumC10073Gou == EnumC10073Gou.SKIP) {
            return C10119Gpk.A01;
        }
        if (enumC10073Gou != EnumC10073Gou.FAIL) {
            InterfaceC10165Gqa interfaceC10165GqaA09 = A09(enumC10073Gou, interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializer);
            return interfaceC10165GqaA09 == null ? jsonDeserializer : interfaceC10165GqaA09;
        }
        if (interfaceC10017Gnp == null) {
            Class<?> clsA0h = jsonDeserializer.A0h();
            abstractC9870GjIA07 = clsA0h == null ? null : AbstractC7608F5v.A0R(abstractC9904Gkk._config, clsA0h);
            if (abstractC9870GjIA07.A0R()) {
                abstractC9870GjIA07 = abstractC9870GjIA07.A07();
            }
            c10009GnhAFv = null;
        } else {
            abstractC9870GjIA07 = interfaceC10017Gnp.AM9().A07();
            c10009GnhAFv = interfaceC10017Gnp.AFv();
        }
        return new C9801GhN(abstractC9870GjIA07, c10009GnhAFv);
    }

    public final AbstractC9944Glx A0z() {
        if (this instanceof ReferenceTypeDeserializer) {
            return ((ReferenceTypeDeserializer) this)._valueInstantiator;
        }
        if (this instanceof FactoryBasedEnumDeserializer) {
            return ((FactoryBasedEnumDeserializer) this)._valueInstantiator;
        }
        if (this instanceof StringCollectionDeserializer) {
            return ((StringCollectionDeserializer) this)._valueInstantiator;
        }
        if (this instanceof MapDeserializer) {
            return ((MapDeserializer) this)._valueInstantiator;
        }
        if (this instanceof EnumMapDeserializer) {
            return ((EnumMapDeserializer) this)._valueInstantiator;
        }
        if (this instanceof CollectionDeserializer) {
            return ((CollectionDeserializer) this)._valueInstantiator;
        }
        if (this instanceof BeanDeserializerBase) {
            return ((BeanDeserializerBase) this)._valueInstantiator;
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;Ljava/lang/Class<*>;LX/Goj;)Ljava/lang/Boolean; */
    public final Boolean A10(EnumC10062Goj enumC10062Goj, InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk, Class cls) {
        C9898Gke c9898Gke = abstractC9904Gkk._config;
        C9894GkV c9894GkVABX = interfaceC10017Gnp != null ? interfaceC10017Gnp.ABX(c9898Gke, cls) : c9898Gke.A00(cls);
        if (c9894GkVABX != null) {
            return c9894GkVABX.A01(enumC10062Goj);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        if (r1 != 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r12.A1P() != r1) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [T] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A16(X.AbstractC9916Gl7 r12, X.AbstractC9904Gkk r13) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A16(X.Gl7, X.Gkk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A19() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer
            if (r0 == 0) goto L5c
            r0 = r3
            com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer r0 = (com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer) r0
            X.GjI r2 = r0._rangeType
        L9:
            if (r2 == 0) goto L39
            java.lang.Class<?> r0 = r2._class
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L39
            boolean r0 = r2.A0R()
            if (r0 != 0) goto L20
            boolean r0 = r2.A06()
            r1 = 0
            if (r0 == 0) goto L21
        L20:
            r1 = 1
        L21:
            java.lang.String r2 = X.AbstractC9855Gj3.A04(r2)
        L25:
            if (r1 == 0) goto L32
            java.lang.String r0 = "element of "
            java.lang.StringBuilder r0 = X.C60O.A0x(r0)
        L2d:
            java.lang.String r0 = X.AnonymousClass001.A0v(r2, r0)
            return r0
        L32:
            java.lang.StringBuilder r0 = X.C3cG.A0g(r2)
            java.lang.String r2 = " value"
            goto L2d
        L39:
            java.lang.Class r2 = r3.A0h()
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            boolean r0 = r2.isArray()
            r1 = 1
            if (r0 != 0) goto L57
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L57
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L57
            r1 = 0
        L57:
            java.lang.String r2 = X.AbstractC9855Gj3.A08(r2)
            goto L25
        L5c:
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
            if (r0 == 0) goto L66
            r0 = r3
            com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer r0 = (com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer) r0
            X.GjI r2 = r0._fullType
            goto L9
        L66:
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
            if (r0 == 0) goto L70
            r0 = r3
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase r0 = (com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase) r0
            X.GjI r2 = r0._containerType
            goto L9
        L70:
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.BeanDeserializerBase
            if (r0 == 0) goto L7a
            r0 = r3
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r0 = (com.fasterxml.jackson.databind.deser.BeanDeserializerBase) r0
            X.GjI r2 = r0._beanType
            goto L9
        L7a:
            X.GjI r2 = r3._valueType
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A19():java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A1A(X.AbstractC9916Gl7 r9, X.AbstractC9904Gkk r10, X.InterfaceC10165Gqa r11) {
        /*
            r8 = this;
            X.Got r6 = X.EnumC10072Got.TryConvert
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            int r1 = r9.A1B()
            r0 = 1
            r5 = r10
            if (r1 == r0) goto L5f
            r0 = 12
            if (r1 == r0) goto L8e
            r4 = r8
            switch(r1) {
                case 6: goto L89;
                case 7: goto L63;
                case 8: goto L4c;
                case 9: goto L35;
                case 10: goto L35;
                default: goto L14;
            }
        L14:
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r6 != r0) goto L1f
            java.lang.Object r0 = r11.AIA(r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1f:
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r6 != r0) goto L26
            java.lang.String r0 = ""
            return r0
        L26:
            X.GiY r0 = r9.A1N()
            boolean r0 = r0._isScalar
            if (r0 == 0) goto L5f
            java.lang.String r0 = r9.A27()
            if (r0 == 0) goto L5f
            return r0
        L35:
            boolean r0 = r9.A1r()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r1 = X.C79.A0P
            X.GnW r0 = X.EnumC10000GnW.Textual
            X.Got r6 = r10.A0O(r0, r7, r1)
            X.Got r0 = X.EnumC10072Got.Fail
            if (r6 != r0) goto L14
            java.lang.String r3 = "Boolean"
            goto L75
        L4c:
            java.lang.Number r8 = r9.A1U()
            java.lang.Integer r1 = X.C79.A0K
            X.GnW r0 = X.EnumC10000GnW.Textual
            X.Got r6 = r10.A0O(r0, r7, r1)
            X.Got r0 = X.EnumC10072Got.Fail
            if (r6 != r0) goto L14
            java.lang.String r3 = "Float"
            goto L75
        L5f:
            r10.A0X(r9, r7)
            goto L84
        L63:
            java.lang.Number r8 = r9.A1U()
            java.lang.Integer r1 = X.C79.A0C
            X.GnW r0 = X.EnumC10000GnW.Textual
            X.Got r6 = r10.A0O(r0, r7, r1)
            X.Got r0 = X.EnumC10072Got.Fail
            if (r6 != r0) goto L14
            java.lang.String r3 = "Integer"
        L75:
            java.lang.String r2 = " value ("
            java.lang.String r1 = r9.A1c()
            java.lang.String r0 = ")"
            java.lang.String r9 = X.FGI.A0d(r3, r2, r1, r0)
            r4.A1G(r5, r6, r7, r8, r9)
        L84:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L89:
            java.lang.String r0 = r9.A1c()
            return r0
        L8e:
            java.lang.Object r1 = r9.A1V()
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto La3
            X.Gke r0 = r10._config
            X.GkY r0 = r0._base
            X.Gn1 r0 = r0._defaultBase64
            byte[] r1 = (byte[]) r1
            java.lang.String r0 = r0.A06(r1)
            return r0
        La3:
            if (r1 != 0) goto La7
            r0 = 0
            return r0
        La7:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A1A(X.Gl7, X.Gkk, X.Gqa):java.lang.String");
    }

    public final void A1E(AbstractC9904Gkk abstractC9904Gkk) {
        EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0B;
        if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
            abstractC9904Gkk.A0c(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", A19());
            throw F60.createAndThrow();
        }
    }

    public final void A1F(AbstractC9904Gkk abstractC9904Gkk) {
        abstractC9904Gkk.A0Z(EnumC9834GiY.END_ARRAY, this, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", A0h().getName());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gkk;LX/Got;Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/String;)LX/Got; */
    public final void A1G(AbstractC9904Gkk abstractC9904Gkk, EnumC10072Got enumC10072Got, Class cls, Object obj, String str) throws InvalidFormatException {
        StringBuilder sbA0x;
        if (enumC10072Got == EnumC10072Got.Fail) {
            String strA08 = AbstractC9855Gj3.A08(cls);
            if (cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                sbA0x = C60O.A0x("element of ");
            } else {
                sbA0x = C3cG.A0g(strA08);
                strA08 = " value";
            }
            throw new InvalidFormatException(abstractC9904Gkk.A00, cls, obj, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, AnonymousClass001.A0v(strA08, sbA0x)));
        }
    }

    public final void A1H(AbstractC9904Gkk abstractC9904Gkk, String str) throws StreamConstraintsException {
        C10002GnY c10002GnYA1R;
        AbstractC9916Gl7 abstractC9916Gl7 = abstractC9904Gkk.A00;
        if (abstractC9916Gl7 == null || (c10002GnYA1R = abstractC9916Gl7.A1R()) == null) {
            c10002GnYA1R = C10002GnY.A00;
        }
        int length = str.length();
        int i = c10002GnYA1R._maxNumLen;
        if (length > i) {
            throw new StreamConstraintsException(String.format("Date/time value length (%d) exceeds the maximum allowed (%d, from `StreamReadConstraints.getMaxNumberLength()`)", BV5.A1Z(length, i)));
        }
    }

    public final boolean A1J(AbstractC9904Gkk abstractC9904Gkk, String str) {
        if (!HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(str)) {
            return false;
        }
        EnumC9951GmA enumC9951GmA = EnumC9951GmA.A04;
        if (abstractC9904Gkk._config.A09(enumC9951GmA)) {
            return true;
        }
        abstractC9904Gkk.A0c(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", "String \"null\"", A19(), "enable", enumC9951GmA.getDeclaringClass().getSimpleName(), enumC9951GmA.name());
        throw F60.createAndThrow();
    }

    public StdDeserializer(AbstractC9870GjI abstractC9870GjI) {
        this._valueClass = abstractC9870GjI == null ? Object.class : abstractC9870GjI._class;
        this._valueType = abstractC9870GjI;
    }

    private final int A06(AbstractC9904Gkk abstractC9904Gkk, String str) {
        try {
            int length = str.length();
            if (length <= 9) {
                return HlV.A04(str);
            }
            abstractC9904Gkk.A00.A1R().A03(length);
            long jA07 = HlV.A07(str);
            if (jA07 >= AuraImpressionTimeTracker.UNKNOWN_TIME && jA07 <= 2147483647L) {
                return (int) jA07;
            }
            abstractC9904Gkk.A0k(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            JsonDeserializer.A0X(abstractC9904Gkk, Integer.TYPE, str, "not a valid `int` value");
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    public static final JsonDeserializer A07(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk, JsonDeserializer jsonDeserializer) {
        AbstractC9970Gmj abstractC9970GmjAHe;
        JsonDeserialize jsonDeserialize;
        Class<? extends InterfaceC9854Giz> clsContentConverter;
        AbstractC9910Gks abstractC9910GksA02 = AbstractC9849Git.A02(abstractC9904Gkk);
        if (abstractC9910GksA02 == null || interfaceC10017Gnp == null || (abstractC9970GmjAHe = interfaceC10017Gnp.AHe()) == null || !(abstractC9910GksA02 instanceof C9888GkO) || (jsonDeserialize = (JsonDeserialize) abstractC9970GmjAHe.A0A(JsonDeserialize.class)) == null || (clsContentConverter = jsonDeserialize.contentConverter()) == null || AbstractC9855Gj3.A0I(clsContentConverter) || clsContentConverter == AbstractC9850Giu.class) {
            return jsonDeserializer;
        }
        InterfaceC9854Giz interfaceC9854GizA0C = abstractC9904Gkk.A0C(clsContentConverter);
        AbstractC9870GjI abstractC9870GjIAGY = interfaceC9854GizA0C.AGY(abstractC9904Gkk.A0B());
        if (jsonDeserializer == null) {
            jsonDeserializer = abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjIAGY);
        }
        return new StdDelegatingDeserializer(abstractC9870GjIAGY, jsonDeserializer, interfaceC9854GizA0C);
    }

    private final void A0C(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if (abstractC9916Gl7.A1P() != EnumC9834GiY.END_ARRAY) {
            A1F(abstractC9904Gkk);
            throw F60.createAndThrow();
        }
    }

    public static final boolean A0F(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0I(String str) {
        int i;
        int length = str.length();
        if (length > 0) {
            char cCharAt = str.charAt(0);
            if (cCharAt == '-' || cCharAt == '+') {
                i = length != 1 ? 1 : 0;
            }
            do {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 <= '9' && cCharAt2 >= '0') {
                    i++;
                }
            } while (i < length);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r1 != X.EnumC10072Got.AsEmpty) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte A0p(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r4 = this;
            int r1 = r5.A1B()
            r0 = 1
            r3 = 0
            if (r1 == r0) goto L7a
            r0 = 3
            if (r1 == r0) goto L80
            r0 = 11
            if (r1 == r0) goto L76
            r0 = 6
            if (r1 == r0) goto L28
            r0 = 7
            if (r1 == r0) goto L4c
            r0 = 8
            if (r1 != r0) goto L9c
            java.lang.Class r0 = java.lang.Byte.TYPE
            X.Got r1 = r4.A0v(r5, r6, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L27
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L4c
        L27:
            return r3
        L28:
            java.lang.String r2 = r5.A1c()
            X.GnW r1 = X.EnumC10000GnW.Integer
            java.lang.Class r0 = java.lang.Byte.TYPE
            X.Got r1 = r4.A08(r6, r1, r0, r2)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L76
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L27
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            r4.A0E(r6, r2)
            return r3
        L4c:
            byte r3 = r5.A16()
            return r3
        L51:
            com.fasterxml.jackson.databind.JsonDeserializer.A0U(r5, r2)
            int r1 = X.HlV.A04(r2)     // Catch: java.lang.IllegalArgumentException -> L6a
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L62
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L62
            byte r3 = (byte) r1     // Catch: java.lang.IllegalArgumentException -> L6a
            return r3
        L62:
            java.lang.Class<?> r1 = r4._valueClass
            java.lang.String r0 = "overflow, value cannot be represented as 8-bit value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r6, r1, r2, r0)
            goto L97
        L6a:
            java.lang.Class<?> r1 = r4._valueClass
            java.lang.String r0 = "not a valid `byte` value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r6, r1, r2, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L76:
            r4.A1E(r6)
            return r3
        L7a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            r6.A0X(r5, r0)
            goto L97
        L80:
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r6._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L9c
            X.GiY r1 = r5.A1P()
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto Lac
            r4.A0D(r5, r6)
        L97:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L9c:
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r1 != 0) goto La5
            r0 = 0
        La1:
            r6.A0V(r5, r0)
            goto L97
        La5:
            X.Gke r0 = r6._config
            X.GjI r0 = X.AbstractC7608F5v.A0R(r0, r1)
            goto La1
        Lac:
            byte r3 = r4.A0p(r5, r6)
            r4.A0C(r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0p(X.Gl7, X.Gkk):byte");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (r1 != 8) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double A0q(X.AbstractC9916Gl7 r7, X.AbstractC9904Gkk r8) {
        /*
            r6 = this;
            int r1 = r7.A1B()
            r0 = 1
            r2 = 0
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L24
            r0 = 11
            if (r1 == r0) goto L98
            r0 = 6
            if (r1 == r0) goto L50
            r0 = 7
            if (r1 == r0) goto L3c
            r0 = 8
            if (r1 == r0) goto L4b
        L1a:
            java.lang.Class r0 = java.lang.Double.TYPE
            r8.A0X(r7, r0)
        L1f:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L24:
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r8._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L1a
            X.GiY r1 = r7.A1P()
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto L9c
            r6.A0D(r7, r8)
            goto L1f
        L3c:
            java.lang.Class r0 = java.lang.Double.TYPE
            X.Got r1 = r6.A0w(r7, r8, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L5e
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L4b
            return r2
        L4b:
            double r2 = r7.A17()
            return r2
        L50:
            java.lang.String r4 = r7.A1c()
            java.lang.Double r0 = r6.A12(r4)
            if (r0 == 0) goto L5f
            double r2 = r0.doubleValue()
        L5e:
            return r2
        L5f:
            X.GnW r0 = X.EnumC10000GnW.Integer
            java.lang.Class r5 = java.lang.Double.TYPE
            X.Got r1 = r6.A08(r8, r0, r5, r4)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L98
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L5e
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7f
            r6.A0E(r8, r4)
            return r2
        L7f:
            X.Gnl r0 = X.EnumC10013Gnl.A02     // Catch: java.lang.IllegalArgumentException -> L8a
            boolean r0 = r7.A23(r0)     // Catch: java.lang.IllegalArgumentException -> L8a
            double r2 = X.HlV.A00(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L8a
            return r2
        L8a:
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "not a valid `double` value (as String to convert)"
            r8.A0k(r5, r4, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L98:
            r6.A1E(r8)
            return r2
        L9c:
            double r2 = r6.A0q(r7, r8)
            r6.A0C(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0q(X.Gl7, X.Gkk):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r1 != 8) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A0r(X.AbstractC9916Gl7 r6, X.AbstractC9904Gkk r7) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r5 = this;
            int r1 = r6.A1B()
            r0 = 1
            r2 = 0
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L23
            r0 = 11
            if (r1 == r0) goto La2
            r0 = 6
            if (r1 == r0) goto L4f
            r0 = 7
            if (r1 == r0) goto L3b
            r0 = 8
            if (r1 == r0) goto L4a
        L19:
            java.lang.Class r0 = java.lang.Float.TYPE
            r7.A0X(r6, r0)
        L1e:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L23:
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r7._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L19
            X.GiY r1 = r6.A1P()
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto La6
            r5.A0D(r6, r7)
            goto L1e
        L3b:
            java.lang.Class r0 = java.lang.Float.TYPE
            X.Got r1 = r5.A0w(r6, r7, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L5d
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L4a
            return r2
        L4a:
            float r2 = r6.A1A()
            return r2
        L4f:
            java.lang.String r3 = r6.A1c()
            java.lang.Float r0 = r5.A13(r3)
            if (r0 == 0) goto L5e
            float r2 = r0.floatValue()
        L5d:
            return r2
        L5e:
            X.GnW r0 = X.EnumC10000GnW.Integer
            java.lang.Class r4 = java.lang.Float.TYPE
            X.Got r1 = r5.A08(r7, r0, r4, r3)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto La2
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L5d
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L7e
            r5.A0E(r7, r3)
            return r2
        L7e:
            boolean r0 = X.HlV.A0A(r3)
            if (r0 == 0) goto L94
            X.Gl7 r0 = r7.A00
            com.fasterxml.jackson.databind.JsonDeserializer.A0V(r0, r3)
            X.Gnl r0 = X.EnumC10013Gnl.A02     // Catch: java.lang.IllegalArgumentException -> L94
            boolean r0 = r6.A23(r0)     // Catch: java.lang.IllegalArgumentException -> L94
            float r2 = X.HlV.A02(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L94
            return r2
        L94:
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "not a valid `float` value"
            r7.A0k(r4, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        La2:
            r5.A1E(r7)
            return r2
        La6:
            float r2 = r5.A0r(r6, r7)
            r5.A0C(r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0r(X.Gl7, X.Gkk):float");
    }

    public final int A0s(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B == 1) {
            abstractC9904Gkk.A0X(abstractC9916Gl7, Integer.TYPE);
        } else {
            if (iA1B != 3) {
                if (iA1B != 11) {
                    if (iA1B == 6) {
                        String strA1c = abstractC9916Gl7.A1c();
                        EnumC10072Got enumC10072GotA08 = A08(abstractC9904Gkk, EnumC10000GnW.Integer, Integer.TYPE, strA1c);
                        if (enumC10072GotA08 != EnumC10072Got.AsNull) {
                            if (enumC10072GotA08 == EnumC10072Got.AsEmpty) {
                                return 0;
                            }
                            String strTrim = strA1c.trim();
                            if (!HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strTrim)) {
                                return A06(abstractC9904Gkk, strTrim);
                            }
                            A0E(abstractC9904Gkk, strTrim);
                            return 0;
                        }
                    } else {
                        if (iA1B == 7) {
                            return abstractC9916Gl7.A1C();
                        }
                        if (iA1B == 8) {
                            EnumC10072Got enumC10072GotA0v = A0v(abstractC9916Gl7, abstractC9904Gkk, Integer.TYPE);
                            if (enumC10072GotA0v == EnumC10072Got.AsNull || enumC10072GotA0v == EnumC10072Got.AsEmpty) {
                                return 0;
                            }
                            return abstractC9916Gl7.A26();
                        }
                    }
                }
                A1E(abstractC9904Gkk);
                return 0;
            }
            EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0M;
            if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                if (abstractC9916Gl7.A1P() != EnumC9834GiY.START_ARRAY) {
                    int iA0s = A0s(abstractC9916Gl7, abstractC9904Gkk);
                    A0C(abstractC9916Gl7, abstractC9904Gkk);
                    return iA0s;
                }
                A0D(abstractC9916Gl7, abstractC9904Gkk);
            }
            abstractC9904Gkk.A0X(abstractC9916Gl7, Integer.TYPE);
        }
        throw F60.createAndThrow();
    }

    public final long A0t(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException {
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B == 1) {
            abstractC9904Gkk.A0X(abstractC9916Gl7, Long.TYPE);
        } else {
            if (iA1B != 3) {
                if (iA1B != 11) {
                    if (iA1B == 6) {
                        String strA1c = abstractC9916Gl7.A1c();
                        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Integer;
                        Class cls = Long.TYPE;
                        EnumC10072Got enumC10072GotA08 = A08(abstractC9904Gkk, enumC10000GnW, cls, strA1c);
                        if (enumC10072GotA08 != EnumC10072Got.AsNull) {
                            if (enumC10072GotA08 == EnumC10072Got.AsEmpty) {
                                return 0L;
                            }
                            String strTrim = strA1c.trim();
                            if (HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strTrim)) {
                                A0E(abstractC9904Gkk, strTrim);
                                return 0L;
                            }
                            JsonDeserializer.A0U(abstractC9904Gkk.A00, strTrim);
                            try {
                                return HlV.A07(strTrim);
                            } catch (IllegalArgumentException unused) {
                                abstractC9904Gkk.A0k(cls, strTrim, "not a valid `long` value", BV4.A1W());
                                throw F60.createAndThrow();
                            }
                        }
                    } else {
                        if (iA1B == 7) {
                            return abstractC9916Gl7.A1G();
                        }
                        if (iA1B == 8) {
                            EnumC10072Got enumC10072GotA0v = A0v(abstractC9916Gl7, abstractC9904Gkk, Long.TYPE);
                            if (enumC10072GotA0v == EnumC10072Got.AsNull || enumC10072GotA0v == EnumC10072Got.AsEmpty) {
                                return 0L;
                            }
                            return abstractC9916Gl7.A1H();
                        }
                    }
                }
                A1E(abstractC9904Gkk);
                return 0L;
            }
            EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0M;
            if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                if (abstractC9916Gl7.A1P() != EnumC9834GiY.START_ARRAY) {
                    long jA0t = A0t(abstractC9916Gl7, abstractC9904Gkk);
                    A0C(abstractC9916Gl7, abstractC9904Gkk);
                    return jA0t;
                }
                A0D(abstractC9916Gl7, abstractC9904Gkk);
            }
            abstractC9904Gkk.A0X(abstractC9916Gl7, Long.TYPE);
        }
        throw F60.createAndThrow();
    }

    public final EnumC10072Got A0x(AbstractC9904Gkk abstractC9904Gkk, String str) {
        return A08(abstractC9904Gkk, A0e(), A0h(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (A0H(r3) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A11(X.AbstractC9916Gl7 r7, X.AbstractC9904Gkk r8, java.lang.Class<?> r9) throws com.fasterxml.jackson.databind.exc.InvalidFormatException {
        /*
            r6 = this;
            int r2 = r7.A1B()
            r0 = 0
            r1 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r1 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            if (r2 == r1) goto L1d
            r1 = 3
            if (r2 == r1) goto L65
            r1 = 6
            if (r2 == r1) goto L25
            r1 = 7
            if (r2 == r1) goto L5f
            switch(r2) {
                case 9: goto L48;
                case 10: goto L64;
                case 11: goto L6b;
                default: goto L1d;
            }
        L1d:
            r8.A0X(r7, r9)
        L20:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L25:
            java.lang.String r3 = r7.A1c()
            X.GnW r1 = X.EnumC10000GnW.Boolean
            X.Got r2 = r6.A08(r8, r1, r9, r3)
            X.Got r1 = X.EnumC10072Got.AsNull
            if (r2 == r1) goto L6b
            X.Got r1 = X.EnumC10072Got.AsEmpty
            if (r2 == r1) goto L64
            java.lang.String r3 = r3.trim()
            int r2 = r3.length()
            r1 = 4
            if (r2 != r1) goto L49
            boolean r1 = A0H(r3)
            if (r1 == 0) goto L53
        L48:
            return r4
        L49:
            r1 = 5
            if (r2 != r1) goto L53
            boolean r1 = A0G(r3)
            if (r1 == 0) goto L53
            return r5
        L53:
            boolean r1 = r6.A1J(r8, r3)
            if (r1 != 0) goto L6b
            java.lang.String r0 = "only \"true\" or \"false\" recognized"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r8, r9, r3, r0)
            goto L20
        L5f:
            java.lang.Boolean r0 = r6.A0A(r7, r8, r9)
            return r0
        L64:
            return r5
        L65:
            java.lang.Object r0 = r6.A16(r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A11(X.Gl7, X.Gkk, java.lang.Class):java.lang.Boolean");
    }

    public final Double A12(String str) {
        double d;
        if (str.isEmpty()) {
            return null;
        }
        char cA00 = AbstractC7607F5u.A00(str);
        if (cA00 != '-') {
            if (cA00 != 'I') {
                if (cA00 != 'N' || !"NaN".equals(str)) {
                    return null;
                }
                d = Double.NaN;
            } else {
                if (!"Infinity".equals(str) && !"INF".equals(str)) {
                    return null;
                }
                d = Double.POSITIVE_INFINITY;
            }
        } else {
            if (!"-Infinity".equals(str) && !"-INF".equals(str)) {
                return null;
            }
            d = Double.NEGATIVE_INFINITY;
        }
        return Double.valueOf(d);
    }

    public final Float A13(String str) {
        float f;
        if (str.isEmpty()) {
            return null;
        }
        char cA00 = AbstractC7607F5u.A00(str);
        if (cA00 != '-') {
            if (cA00 != 'I') {
                if (cA00 != 'N' || !"NaN".equals(str)) {
                    return null;
                }
                f = Float.NaN;
            } else {
                if (!"Infinity".equals(str) && !"INF".equals(str)) {
                    return null;
                }
                f = Float.POSITIVE_INFINITY;
            }
        } else {
            if (!"-Infinity".equals(str) && !"-INF".equals(str)) {
                return null;
            }
            f = Float.NEGATIVE_INFINITY;
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A14(X.AbstractC9916Gl7 r6, X.AbstractC9904Gkk r7, java.lang.Class<?> r8) throws java.io.IOException {
        /*
            r5 = this;
            int r1 = r6.A1B()
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 3
            if (r1 == r0) goto Lbc
            r0 = 11
            if (r1 == r0) goto Lc1
            r0 = 6
            if (r1 == r0) goto L3e
            r0 = 7
            if (r1 == r0) goto L35
            r0 = 8
            if (r1 == r0) goto L24
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r6, r7, r5)
        L1b:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L20:
            r7.A0X(r6, r8)
            goto L1b
        L24:
            X.Got r1 = r5.A0v(r6, r7, r8)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto Lc1
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto Lb7
            int r0 = r6.A26()
            goto L39
        L35:
            int r0 = r6.A1C()
        L39:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L3e:
            java.lang.String r2 = r6.A1c()
            X.Got r1 = r5.A0x(r7, r2)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto Lc1
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto Lb7
            java.lang.String r4 = r2.trim()
            boolean r0 = r5.A1J(r7, r4)
            if (r0 != 0) goto Lc1
            int r1 = r4.length()     // Catch: java.lang.IllegalArgumentException -> Lab
            r0 = 9
            if (r1 <= r0) goto La2
            X.Gl7 r0 = r7.A00     // Catch: java.lang.IllegalArgumentException -> Lab
            X.GnY r0 = r0.A1R()     // Catch: java.lang.IllegalArgumentException -> Lab
            r0.A03(r1)     // Catch: java.lang.IllegalArgumentException -> Lab
            long r2 = X.HlV.A07(r4)     // Catch: java.lang.IllegalArgumentException -> Lab
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L7c
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L7d
        L7c:
            r0 = 1
        L7d:
            if (r0 == 0) goto L9c
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.String r2 = "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)"
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> Lab
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> Lab
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r1, r0}     // Catch: java.lang.IllegalArgumentException -> Lab
            r7.A0k(r3, r4, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Lab
            X.F60 r0 = X.F60.createAndThrow()     // Catch: java.lang.IllegalArgumentException -> Lab
            throw r0     // Catch: java.lang.IllegalArgumentException -> Lab
        L9c:
            int r0 = (int) r2     // Catch: java.lang.IllegalArgumentException -> Lab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> Lab
            return r0
        La2:
            int r0 = X.HlV.A04(r4)     // Catch: java.lang.IllegalArgumentException -> Lab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> Lab
            return r0
        Lab:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.String r0 = "not a valid `java.lang.Integer` value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r7, r1, r4, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Lb7:
            java.lang.Object r0 = r5.A0m(r7)
            goto Lc5
        Lbc:
            java.lang.Object r0 = r5.A16(r6, r7)
            goto Lc5
        Lc1:
            java.lang.Object r0 = r5.AIA(r7)
        Lc5:
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A14(X.Gl7, X.Gkk, java.lang.Class):java.lang.Integer");
    }

    public final Long A15(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Class<?> cls) throws IOException {
        Object objA16;
        long jA1G;
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B != 1) {
            if (iA1B == 3) {
                objA16 = A16(abstractC9916Gl7, abstractC9904Gkk);
            } else if (iA1B == 11) {
                objA16 = AIA(abstractC9904Gkk);
            } else {
                if (iA1B != 6) {
                    if (iA1B == 7) {
                        jA1G = abstractC9916Gl7.A1G();
                    } else if (iA1B != 8) {
                        JsonDeserializer.A0S(abstractC9916Gl7, abstractC9904Gkk, this);
                    } else {
                        EnumC10072Got enumC10072GotA0v = A0v(abstractC9916Gl7, abstractC9904Gkk, cls);
                        if (enumC10072GotA0v != EnumC10072Got.AsNull) {
                            if (enumC10072GotA0v != EnumC10072Got.AsEmpty) {
                                jA1G = abstractC9916Gl7.A1H();
                            }
                            objA16 = A0m(abstractC9904Gkk);
                        }
                        objA16 = AIA(abstractC9904Gkk);
                    }
                    return Long.valueOf(jA1G);
                }
                String strA1c = abstractC9916Gl7.A1c();
                EnumC10072Got enumC10072GotA0x = A0x(abstractC9904Gkk, strA1c);
                if (enumC10072GotA0x != EnumC10072Got.AsNull) {
                    if (enumC10072GotA0x != EnumC10072Got.AsEmpty) {
                        String strTrim = strA1c.trim();
                        if (!A1J(abstractC9904Gkk, strTrim)) {
                            JsonDeserializer.A0U(abstractC9904Gkk.A00, strTrim);
                            try {
                                return Long.valueOf(HlV.A07(strTrim));
                            } catch (IllegalArgumentException unused) {
                                abstractC9904Gkk.A0k(Long.class, strTrim, "not a valid `java.lang.Long` value", BV4.A1W());
                                throw F60.createAndThrow();
                            }
                        }
                    }
                    objA16 = A0m(abstractC9904Gkk);
                }
                objA16 = AIA(abstractC9904Gkk);
            }
            return (Long) objA16;
        }
        abstractC9904Gkk.A0X(abstractC9916Gl7, cls);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, java.lang.Object] */
    public final T A17(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9944Glx abstractC9944GlxA0z = A0z();
        Class<?> clsA0h = A0h();
        String strA27 = abstractC9916Gl7.A27();
        if (abstractC9944GlxA0z != null && abstractC9944GlxA0z.A07()) {
            return abstractC9944GlxA0z.A0I(abstractC9904Gkk, strA27);
        }
        if (strA27.isEmpty()) {
            return A18(abstractC9904Gkk, abstractC9904Gkk.A0O(A0e(), clsA0h, C79.A0c), clsA0h);
        }
        if (A0F(strA27)) {
            return A18(abstractC9904Gkk, abstractC9904Gkk.A0N(EnumC10072Got.Fail, A0e(), clsA0h), clsA0h);
        }
        if (abstractC9944GlxA0z != null) {
            strA27 = strA27.trim();
            boolean z = abstractC9944GlxA0z instanceof C9921GlI;
            if ((z ? AnonymousClass002.A1X(((C9921GlI) abstractC9944GlxA0z)._fromIntCreator) : false) && abstractC9904Gkk.A0O(EnumC10000GnW.Integer, Integer.class, C79.A0T) == EnumC10072Got.TryConvert) {
                return abstractC9944GlxA0z.A0G(abstractC9904Gkk, A06(abstractC9904Gkk, strA27));
            }
            if ((z ? AnonymousClass002.A1X(((C9921GlI) abstractC9944GlxA0z)._fromLongCreator) : false) && abstractC9904Gkk.A0O(EnumC10000GnW.Integer, Long.class, C79.A0T) == EnumC10072Got.TryConvert) {
                JsonDeserializer.A0U(abstractC9904Gkk.A00, strA27);
                try {
                    return abstractC9944GlxA0z.A0H(abstractC9904Gkk, HlV.A07(strA27));
                } catch (IllegalArgumentException unused) {
                    abstractC9904Gkk.A0k(Long.TYPE, strA27, "not a valid `long` value", new Object[0]);
                    throw F60.createAndThrow();
                }
            }
            if ((z ? AnonymousClass002.A1X(((C9921GlI) abstractC9944GlxA0z)._fromBooleanCreator) : false) && abstractC9904Gkk.A0O(EnumC10000GnW.Boolean, Boolean.class, C79.A0T) == EnumC10072Got.TryConvert) {
                String strTrim = strA27.trim();
                if ("true".equals(strTrim)) {
                    return abstractC9944GlxA0z.A0L(abstractC9904Gkk, true);
                }
                if ("false".equals(strTrim)) {
                    return abstractC9944GlxA0z.A0L(abstractC9904Gkk, false);
                }
            }
        }
        abstractC9904Gkk.A0d(abstractC9944GlxA0z, clsA0h, "no String-argument constructor/factory method to deserialize from String value ('%s')", strA27);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r1 != X.EnumC10072Got.AsEmpty) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short A1D(X.AbstractC9916Gl7 r6, X.AbstractC9904Gkk r7) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r5 = this;
            int r1 = r6.A1B()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L76
            r0 = 3
            if (r1 == r0) goto L7c
            r0 = 11
            if (r1 == r0) goto L72
            r0 = 6
            if (r1 == r0) goto L28
            r0 = 7
            if (r1 == r0) goto L4c
            r0 = 8
            if (r1 != r0) goto L98
            java.lang.Class r0 = java.lang.Short.TYPE
            X.Got r1 = r5.A0v(r6, r7, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L27
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L4c
        L27:
            return r4
        L28:
            java.lang.String r2 = r6.A1c()
            X.GnW r0 = X.EnumC10000GnW.Integer
            java.lang.Class r3 = java.lang.Short.TYPE
            X.Got r1 = r5.A08(r7, r0, r3, r2)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L72
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L27
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            r5.A0E(r7, r2)
            return r4
        L4c:
            short r4 = r6.A1h()
            return r4
        L51:
            com.fasterxml.jackson.databind.JsonDeserializer.A0U(r6, r2)
            int r1 = X.HlV.A04(r2)     // Catch: java.lang.IllegalArgumentException -> L68
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L62
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 > r0) goto L62
            short r4 = (short) r1     // Catch: java.lang.IllegalArgumentException -> L68
            return r4
        L62:
            java.lang.String r0 = "overflow, value cannot be represented as 16-bit value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r7, r3, r2, r0)
            goto L93
        L68:
            java.lang.String r0 = "not a valid `short` value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r7, r3, r2, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L72:
            r5.A1E(r7)
            return r4
        L76:
            java.lang.Class r0 = java.lang.Short.TYPE
            r7.A0X(r6, r0)
            goto L93
        L7c:
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r7._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L98
            X.GiY r1 = r6.A1P()
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto La8
            r5.A0D(r6, r7)
        L93:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L98:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r1 != 0) goto La1
            r0 = 0
        L9d:
            r7.A0V(r6, r0)
            goto L93
        La1:
            X.Gke r0 = r7._config
            X.GjI r0 = X.AbstractC7608F5v.A0R(r0, r1)
            goto L9d
        La8:
            short r4 = r5.A1D(r6, r7)
            r5.A0C(r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A1D(X.Gl7, X.Gkk):short");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (A0H(r2) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1I(X.AbstractC9916Gl7 r7, X.AbstractC9904Gkk r8) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r6 = this;
            int r1 = r7.A1B()
            r5 = 0
            r4 = 1
            if (r1 == r4) goto L14
            r0 = 3
            if (r1 == r0) goto L60
            r0 = 6
            if (r1 == r0) goto L1e
            r0 = 7
            if (r1 == r0) goto L78
            switch(r1) {
                case 9: goto L43;
                case 10: goto L88;
                case 11: goto L85;
                default: goto L14;
            }
        L14:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r8.A0X(r7, r0)
        L19:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1e:
            java.lang.String r2 = r7.A1c()
            X.GnW r0 = X.EnumC10000GnW.Boolean
            java.lang.Class r3 = java.lang.Boolean.TYPE
            X.Got r1 = r6.A08(r8, r0, r3, r2)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L85
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L88
            java.lang.String r2 = r2.trim()
            int r1 = r2.length()
            r0 = 4
            if (r1 != r0) goto L44
            boolean r0 = A0H(r2)
            if (r0 == 0) goto L4e
        L43:
            return r4
        L44:
            r0 = 5
            if (r1 != r0) goto L4e
            boolean r0 = A0G(r2)
            if (r0 == 0) goto L4e
            return r5
        L4e:
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5a
            r6.A0E(r8, r2)
            return r5
        L5a:
            java.lang.String r0 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r8, r3, r2, r0)
            goto L19
        L60:
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r8._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L14
            X.GiY r1 = r7.A1P()
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto L89
            r6.A0D(r7, r8)
            goto L19
        L78:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Boolean r0 = r6.A0A(r7, r8, r0)
            boolean r0 = r1.equals(r0)
            return r0
        L85:
            r6.A1E(r8)
        L88:
            return r5
        L89:
            boolean r5 = r6.A1I(r7, r8)
            r6.A0C(r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A1I(X.Gl7, X.Gkk):boolean");
    }

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }
}
