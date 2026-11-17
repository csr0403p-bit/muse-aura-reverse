package com.fasterxml.jackson.databind.deser;

import X.AbstractC10187Gqy;
import X.AbstractC7609F5w;
import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9915Gl5;
import X.AbstractC9916Gl7;
import X.AbstractC9930GlR;
import X.AbstractC9944Glx;
import X.BV4;
import X.C9829GiP;
import X.C9913Gl1;
import X.C9918GlC;
import X.C9926GlN;
import X.EnumC9834GiY;
import X.EnumC9965Gmd;
import X.F60;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public static final long serialVersionUID = 1;
    public transient Exception A00;
    public volatile transient AbstractC10187Gqy A01;

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;Ljava/lang/Object;Ljava/lang/Class<*>;)Ljava/lang/Object; */
    public static final void A03(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BeanDeserializer beanDeserializer, Class cls, Object obj) {
        if (abstractC9916Gl7.A21(5)) {
            String strA1a = abstractC9916Gl7.A1a();
            do {
                AbstractC9915Gl5 abstractC9915Gl5A0L = JsonDeserializer.A0L(abstractC9916Gl7, beanDeserializer, strA1a);
                if (abstractC9915Gl5A0L == null) {
                    beanDeserializer.A1Z(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                } else if (abstractC9915Gl5A0L.A0R(cls)) {
                    try {
                        abstractC9915Gl5A0L.A0K(obj, abstractC9916Gl7, abstractC9904Gkk);
                    } catch (Exception e) {
                        beanDeserializer.A1b(abstractC9904Gkk, obj, strA1a, e);
                        throw F60.createAndThrow();
                    }
                } else {
                    EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0F;
                    if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                        Class<?> cls2 = beanDeserializer._beanType._class;
                        throw AbstractC9849Git.A04(abstractC9904Gkk, cls2, "Input mismatch while deserializing %s. Property '%s' is not part of current active view '%s' (disable 'DeserializationFeature.FAIL_ON_UNEXPECTED_VIEW_PROPERTIES' to allow)", new Object[]{AbstractC9855Gj3.A06(cls2), abstractC9915Gl5A0L._propName._simpleName, cls.getName()});
                    }
                    abstractC9916Gl7.A1j();
                }
                strA1a = abstractC9916Gl7.A1d();
            } while (strA1a != null);
        }
    }

    private final Object A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        Object objA0D = this._valueInstantiator.A0D(abstractC9904Gkk);
        if (abstractC9916Gl7.A21(5)) {
            abstractC9916Gl7.A1o(objA0D);
            String strA1a = abstractC9916Gl7.A1a();
            do {
                AbstractC9915Gl5 abstractC9915Gl5A0L = JsonDeserializer.A0L(abstractC9916Gl7, this, strA1a);
                if (abstractC9915Gl5A0L != null) {
                    try {
                        abstractC9915Gl5A0L.A0K(objA0D, abstractC9916Gl7, abstractC9904Gkk);
                    } catch (Exception e) {
                        A1b(abstractC9904Gkk, objA0D, strA1a, e);
                        throw F60.createAndThrow();
                    }
                } else {
                    A1Z(abstractC9916Gl7, abstractC9904Gkk, objA0D, strA1a);
                }
                strA1a = abstractC9916Gl7.A1d();
            } while (strA1a != null);
        }
        return objA0D;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x03f0: INVOKE 
  (r10v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r9v0 ?? I:X.Gkk)
  (r0v17 ?? I:java.lang.Object)
  (r2 I:java.lang.String)
  (r1 I:java.lang.Throwable)
 VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:1008), block:B:229:0x03ec */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040a A[Catch: Exception -> 0x040e, TryCatch #0 {Exception -> 0x040e, blocks: (B:191:0x032e, B:201:0x036b, B:65:0x00f0, B:68:0x00fe, B:70:0x0108, B:96:0x01a3, B:99:0x01ab, B:100:0x01b0, B:102:0x01b4, B:106:0x01be, B:108:0x01c4, B:111:0x01d0, B:112:0x01e9, B:113:0x01ec, B:74:0x0114, B:76:0x011a, B:78:0x0129, B:80:0x0131, B:83:0x0139, B:230:0x03f4, B:231:0x0402, B:233:0x040a, B:234:0x040d, B:84:0x013f, B:86:0x0145, B:95:0x01a1, B:89:0x0155, B:94:0x018d, B:90:0x0166, B:92:0x0172, B:93:0x0182, B:114:0x01f0, B:117:0x01f9, B:119:0x01ff, B:125:0x0211, B:122:0x0206, B:124:0x020c), top: B:323:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:? A[Catch: Exception -> 0x040e, SYNTHETIC, TRY_LEAVE, TryCatch #0 {Exception -> 0x040e, blocks: (B:191:0x032e, B:201:0x036b, B:65:0x00f0, B:68:0x00fe, B:70:0x0108, B:96:0x01a3, B:99:0x01ab, B:100:0x01b0, B:102:0x01b4, B:106:0x01be, B:108:0x01c4, B:111:0x01d0, B:112:0x01e9, B:113:0x01ec, B:74:0x0114, B:76:0x011a, B:78:0x0129, B:80:0x0131, B:83:0x0139, B:230:0x03f4, B:231:0x0402, B:233:0x040a, B:234:0x040d, B:84:0x013f, B:86:0x0145, B:95:0x01a1, B:89:0x0155, B:94:0x018d, B:90:0x0166, B:92:0x0172, B:93:0x0182, B:114:0x01f0, B:117:0x01f9, B:119:0x01ff, B:125:0x0211, B:122:0x0206, B:124:0x020c), top: B:323:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0145 A[Catch: Exception -> 0x040e, TryCatch #0 {Exception -> 0x040e, blocks: (B:191:0x032e, B:201:0x036b, B:65:0x00f0, B:68:0x00fe, B:70:0x0108, B:96:0x01a3, B:99:0x01ab, B:100:0x01b0, B:102:0x01b4, B:106:0x01be, B:108:0x01c4, B:111:0x01d0, B:112:0x01e9, B:113:0x01ec, B:74:0x0114, B:76:0x011a, B:78:0x0129, B:80:0x0131, B:83:0x0139, B:230:0x03f4, B:231:0x0402, B:233:0x040a, B:234:0x040d, B:84:0x013f, B:86:0x0145, B:95:0x01a1, B:89:0x0155, B:94:0x018d, B:90:0x0166, B:92:0x0172, B:93:0x0182, B:114:0x01f0, B:117:0x01f9, B:119:0x01ff, B:125:0x0211, B:122:0x0206, B:124:0x020c), top: B:323:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166 A[Catch: Exception -> 0x040e, TryCatch #0 {Exception -> 0x040e, blocks: (B:191:0x032e, B:201:0x036b, B:65:0x00f0, B:68:0x00fe, B:70:0x0108, B:96:0x01a3, B:99:0x01ab, B:100:0x01b0, B:102:0x01b4, B:106:0x01be, B:108:0x01c4, B:111:0x01d0, B:112:0x01e9, B:113:0x01ec, B:74:0x0114, B:76:0x011a, B:78:0x0129, B:80:0x0131, B:83:0x0139, B:230:0x03f4, B:231:0x0402, B:233:0x040a, B:234:0x040d, B:84:0x013f, B:86:0x0145, B:95:0x01a1, B:89:0x0155, B:94:0x018d, B:90:0x0166, B:92:0x0172, B:93:0x0182, B:114:0x01f0, B:117:0x01f9, B:119:0x01ff, B:125:0x0211, B:122:0x0206, B:124:0x020c), top: B:323:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A1d(X.AbstractC9916Gl7 r17, X.AbstractC9904Gkk r18) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.A1d(X.Gl7, X.Gkk):java.lang.Object");
    }

    public static final Object A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BeanDeserializer beanDeserializer, AbstractC9915Gl5 abstractC9915Gl5) {
        try {
            return abstractC9915Gl5.A0C(abstractC9916Gl7, abstractC9904Gkk);
        } catch (Exception e) {
            beanDeserializer.A1b(abstractC9904Gkk, beanDeserializer._beanType._class, abstractC9915Gl5._propName._simpleName, e);
            throw F60.createAndThrow();
        }
    }

    public static final void A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BeanDeserializer beanDeserializer, C9918GlC c9918GlC, Object obj) {
        Class<?> clsA0O = JsonDeserializer.A0O(abstractC9904Gkk, beanDeserializer);
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        while (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
            String strA1a = abstractC9916Gl7.A1a();
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            AbstractC9915Gl5 abstractC9915Gl5A02 = beanDeserializer._beanProperties.A02(strA1a);
            if (abstractC9915Gl5A02 != null) {
                if (enumC9834GiYA1P._isScalar) {
                    c9918GlC.A01(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                }
                if (clsA0O == null || abstractC9915Gl5A02.A0R(clsA0O)) {
                    try {
                        abstractC9915Gl5A02.A0K(obj, abstractC9916Gl7, abstractC9904Gkk);
                    } catch (Exception e) {
                        beanDeserializer.A1b(abstractC9904Gkk, obj, strA1a, e);
                        throw F60.createAndThrow();
                    }
                } else {
                    abstractC9916Gl7.A1j();
                }
            } else if (JsonDeserializer.A0Z(beanDeserializer, strA1a)) {
                beanDeserializer.A1X(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
            } else if (!c9918GlC.A03(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a)) {
                AbstractC9930GlR abstractC9930GlR = beanDeserializer._anySetter;
                if (abstractC9930GlR != null) {
                    abstractC9930GlR.A03(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                } else {
                    beanDeserializer.A1Y(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                }
            }
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
        }
        c9918GlC.A02(obj, abstractC9916Gl7, abstractC9904Gkk);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws InvalidFormatException, JsonGenerationException {
        if (!abstractC9916Gl7.A1y()) {
            EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
            if (enumC9834GiYA1N != null) {
                switch (enumC9834GiYA1N.ordinal()) {
                    case 2:
                    case 5:
                        if (this._vanillaProcessing) {
                            return A00(abstractC9916Gl7, abstractC9904Gkk);
                        }
                        break;
                    case 3:
                        return A16(abstractC9916Gl7, abstractC9904Gkk);
                    case 6:
                        if (this._objectIdReader != null) {
                            return A1T(abstractC9916Gl7, abstractC9904Gkk);
                        }
                        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
                        if (jsonDeserializer != null || (jsonDeserializer = this._arrayDelegateDeserializer) != null) {
                            AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
                            if (!abstractC9944Glx.A07()) {
                                return JsonDeserializer.A0P(abstractC9916Gl7, abstractC9904Gkk, jsonDeserializer, this, abstractC9944Glx);
                            }
                        }
                        Object objA1V = abstractC9916Gl7.A1V();
                        if (objA1V == null) {
                            return objA1V;
                        }
                        AbstractC9870GjI abstractC9870GjI = this._beanType;
                        Class<?> cls = objA1V.getClass();
                        Class<?> cls2 = abstractC9870GjI._class;
                        if (cls2 == cls || cls2.isAssignableFrom(cls)) {
                            return objA1V;
                        }
                        AbstractC9870GjI abstractC9870GjI2 = this._beanType;
                        C9829GiP c9829GiP = abstractC9904Gkk._config._problemHandlers;
                        Class<?> cls3 = abstractC9870GjI2._class;
                        if (c9829GiP != null) {
                            throw BV4.A0a("handleWeirdNativeValue");
                        }
                        throw new InvalidFormatException(abstractC9904Gkk.A00, cls3, objA1V, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", AbstractC9855Gj3.A06(cls3), AbstractC9855Gj3.A07(objA1V)));
                    case 7:
                        return A1V(abstractC9916Gl7, abstractC9904Gkk);
                    case 8:
                        return A1S(abstractC9916Gl7, abstractC9904Gkk);
                    case 9:
                        return A1R(abstractC9916Gl7, abstractC9904Gkk);
                    case 10:
                    case 11:
                        return A1Q(abstractC9916Gl7, abstractC9904Gkk);
                    case 12:
                        if (abstractC9916Gl7.A20()) {
                            C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
                            c9913Gl1.A0Q();
                            C9926GlN c9926GlNA10 = c9913Gl1.A10(abstractC9916Gl7);
                            c9926GlNA10.A1P();
                            Object objA00 = this._vanillaProcessing ? A00(c9926GlNA10, abstractC9904Gkk) : A1d(c9926GlNA10, abstractC9904Gkk);
                            c9926GlNA10.close();
                            return objA00;
                        }
                        break;
                }
            }
            JsonDeserializer.A0S(abstractC9916Gl7, abstractC9904Gkk, this);
            throw F60.createAndThrow();
        }
        if (this._vanillaProcessing) {
            abstractC9916Gl7.A1P();
            return A00(abstractC9916Gl7, abstractC9904Gkk);
        }
        abstractC9916Gl7.A1P();
        return A1d(abstractC9916Gl7, abstractC9904Gkk);
    }
}
