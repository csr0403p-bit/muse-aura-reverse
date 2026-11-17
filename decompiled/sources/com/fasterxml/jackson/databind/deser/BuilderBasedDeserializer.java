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
import X.C10035GoB;
import X.C60O;
import X.C8j3;
import X.C9668GdQ;
import X.C9912Gkv;
import X.C9913Gl1;
import X.C9914Gl4;
import X.C9918GlC;
import X.C9934Glc;
import X.EnumC9834GiY;
import X.EnumC9965Gmd;
import X.F60;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    public static final long serialVersionUID = 1;
    public final C9934Glc _buildMethod;
    public final AbstractC9870GjI _targetType;

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        super((BeanDeserializerBase) builderBasedDeserializer, true);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0206: INVOKE 
  (r6v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r11v0 ?? I:X.Gkk)
  (r2v0 ?? I:java.lang.Object)
  (r1 I:java.lang.String)
  (r0 I:java.lang.Throwable)
 VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:518), block:B:121:0x0206 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0206: INVOKE 
  (r6v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r11v0 ?? I:X.Gkk)
  (r2 I:java.lang.Object)
  (r1 I:java.lang.String)
  (r0 I:java.lang.Throwable)
 VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:518), block:B:121:0x0206 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e7 A[Catch: Exception -> 0x01f9, TRY_ENTER, TryCatch #2 {Exception -> 0x01f9, blocks: (B:112:0x01e7, B:73:0x0123), top: B:130:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0i(X.AbstractC9916Gl7 r10, X.AbstractC9904Gkk r11) throws com.fasterxml.jackson.databind.exc.MismatchedInputException, com.fasterxml.jackson.core.JsonGenerationException, com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Object");
    }

    public static final Object A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BuilderBasedDeserializer builderBasedDeserializer, C9913Gl1 c9913Gl1, Object obj) throws JsonGenerationException {
        Class<?> clsA0O = JsonDeserializer.A0O(abstractC9904Gkk, builderBasedDeserializer);
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        while (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
            String strA1a = abstractC9916Gl7.A1a();
            AbstractC9915Gl5 abstractC9915Gl5A02 = builderBasedDeserializer._beanProperties.A02(strA1a);
            abstractC9916Gl7.A1P();
            if (abstractC9915Gl5A02 != null) {
                if (clsA0O == null || abstractC9915Gl5A02.A0R(clsA0O)) {
                    try {
                        obj = abstractC9915Gl5A02.A0D(abstractC9916Gl7, abstractC9904Gkk, obj);
                    } catch (Exception e) {
                        builderBasedDeserializer.A1b(abstractC9904Gkk, obj, strA1a, e);
                        throw F60.createAndThrow();
                    }
                } else {
                    abstractC9916Gl7.A1j();
                }
            } else if (JsonDeserializer.A0Z(builderBasedDeserializer, strA1a)) {
                builderBasedDeserializer.A1X(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
            } else {
                c9913Gl1.A0o(strA1a);
                c9913Gl1.A13(abstractC9916Gl7);
                AbstractC9930GlR abstractC9930GlR = builderBasedDeserializer._anySetter;
                if (abstractC9930GlR != null) {
                    abstractC9930GlR.A03(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                }
            }
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
        }
        c9913Gl1.A0Q();
        builderBasedDeserializer._unwrappedPropertyHandler.A00(abstractC9916Gl7, abstractC9904Gkk, c9913Gl1, obj);
        return obj;
    }

    public static final Object A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BuilderBasedDeserializer builderBasedDeserializer, Class cls, Object obj) throws MismatchedInputException {
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        while (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
            String strA1a = abstractC9916Gl7.A1a();
            AbstractC9915Gl5 abstractC9915Gl5A0L = JsonDeserializer.A0L(abstractC9916Gl7, builderBasedDeserializer, strA1a);
            if (abstractC9915Gl5A0L == null) {
                builderBasedDeserializer.A1Z(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
            } else if (abstractC9915Gl5A0L.A0R(cls)) {
                try {
                    obj = abstractC9915Gl5A0L.A0D(abstractC9916Gl7, abstractC9904Gkk, obj);
                } catch (Exception e) {
                    builderBasedDeserializer.A1b(abstractC9904Gkk, obj, strA1a, e);
                    throw F60.createAndThrow();
                }
            } else {
                EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0F;
                if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                    Class<?> cls2 = builderBasedDeserializer._beanType._class;
                    throw AbstractC9849Git.A04(abstractC9904Gkk, cls2, "Input mismatch while deserializing %s. Property '%s' is not part of current active view '%s' (disable 'DeserializationFeature.FAIL_ON_UNEXPECTED_VIEW_PROPERTIES' to allow)", new Object[]{AbstractC9855Gj3.A06(cls2), abstractC9915Gl5A0L._propName._simpleName, cls.getName()});
                }
                abstractC9916Gl7.A1j();
            }
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
        }
        return obj;
    }

    public static final Object A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BuilderBasedDeserializer builderBasedDeserializer, Object obj) throws MismatchedInputException, JsonGenerationException {
        Class<?> clsA0O = JsonDeserializer.A0O(abstractC9904Gkk, builderBasedDeserializer);
        C9918GlC c9918GlC = new C9918GlC(builderBasedDeserializer._externalTypeIdHandler);
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        while (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
            String strA1a = abstractC9916Gl7.A1a();
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            AbstractC9915Gl5 abstractC9915Gl5A02 = builderBasedDeserializer._beanProperties.A02(strA1a);
            if (abstractC9915Gl5A02 != null) {
                if (enumC9834GiYA1P._isScalar) {
                    c9918GlC.A01(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                }
                if (clsA0O == null || abstractC9915Gl5A02.A0R(clsA0O)) {
                    try {
                        obj = abstractC9915Gl5A02.A0D(abstractC9916Gl7, abstractC9904Gkk, obj);
                    } catch (Exception e) {
                        builderBasedDeserializer.A1b(abstractC9904Gkk, obj, strA1a, e);
                        throw F60.createAndThrow();
                    }
                } else {
                    abstractC9916Gl7.A1j();
                }
            } else if (JsonDeserializer.A0Z(builderBasedDeserializer, strA1a)) {
                builderBasedDeserializer.A1X(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
            } else if (!c9918GlC.A03(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a)) {
                AbstractC9930GlR abstractC9930GlR = builderBasedDeserializer._anySetter;
                if (abstractC9930GlR != null) {
                    abstractC9930GlR.A03(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                } else {
                    builderBasedDeserializer.A1Y(abstractC9916Gl7, abstractC9904Gkk, obj, strA1a);
                }
            }
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
        }
        c9918GlC.A02(obj, abstractC9916Gl7, abstractC9904Gkk);
        return obj;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set, Set<String> set2) {
        super(builderBasedDeserializer, set, set2);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkv;LX/Gl4;LX/GjI;LX/GdQ;Ljava/util/Map<Ljava/lang/String;LX/Gl5;>;Ljava/util/Set<Ljava/lang/String;>;ZLjava/util/Set<Ljava/lang/String;>;Z)V */
    public BuilderBasedDeserializer(AbstractC9870GjI abstractC9870GjI, C9912Gkv c9912Gkv, C9668GdQ c9668GdQ, C9914Gl4 c9914Gl4, Map map, Set set, Set set2, boolean z, boolean z2) {
        super(c9912Gkv, c9668GdQ, c9914Gl4, map, set, set2, z, z2);
        this._targetType = abstractC9870GjI;
        this._buildMethod = c9912Gkv.A04;
        if (this._objectIdReader == null) {
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Cannot use Object Id with Builder-based deserialization (type ");
        sbA0x.append(c9914Gl4.A05);
        throw C8j3.A0w(")", sbA0x);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, AbstractC10187Gqy abstractC10187Gqy) {
        super(builderBasedDeserializer, abstractC10187Gqy);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C9668GdQ c9668GdQ) {
        super(builderBasedDeserializer, c9668GdQ);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C10035GoB c10035GoB) {
        super(builderBasedDeserializer, c10035GoB);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }
}
