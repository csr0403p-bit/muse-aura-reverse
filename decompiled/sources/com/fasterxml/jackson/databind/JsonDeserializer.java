package com.fasterxml.jackson.databind;

import X.AbstractC10100GpO;
import X.AbstractC10187Gqy;
import X.AbstractC7609F5w;
import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9915Gl5;
import X.AbstractC9916Gl7;
import X.AbstractC9944Glx;
import X.AbstractC9986Gn8;
import X.BV4;
import X.BV5;
import X.C10035GoB;
import X.C10104GpS;
import X.C10115Gpg;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C8j3;
import X.C9828GiO;
import X.C9931GlS;
import X.C9993GnM;
import X.EnumC10102GpQ;
import X.EnumC9965Gmd;
import X.F60;
import X.FGI;
import X.Gh1;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableBiMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMapDeserializer;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableBiMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public abstract class JsonDeserializer<T> implements InterfaceC10165Gqa {
    public static void A0X(AbstractC9904Gkk abstractC9904Gkk, Class cls, String str, String str2) {
        abstractC9904Gkk.A0k(cls, str, str2, new Object[0]);
        throw F60.createAndThrow();
    }

    public abstract T A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x047b: INVOKE (r0 I:com.fasterxml.jackson.databind.JsonMappingException) = (r2 I:java.lang.Object), (r1 I:java.lang.Throwable), (r0 I:int) STATIC call: com.fasterxml.jackson.databind.JsonMappingException.A03(java.lang.Object, java.lang.Throwable, int):com.fasterxml.jackson.databind.JsonMappingException A[MD:(java.lang.Object, java.lang.Throwable, int):com.fasterxml.jackson.databind.JsonMappingException (m)] (LINE:1147), block:B:321:0x0478 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0693: INVOKE 
  (r7v1 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r13v0 ?? I:X.Gkk)
  (r14v0 ?? I:java.lang.Object)
  (r3 I:java.lang.String)
  (r0 I:java.lang.Throwable)
 VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:1683), block:B:466:0x0693 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0478: IGET (r0 I:int) = (r4 I:X.GiO) (LINE:1144) X.GiO.A00 int, block:B:321:0x0478 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0698: INVOKE (r13v0 ?? I:X.Gkk), (r11v6 ?? I:java.lang.Object), (r5 I:java.lang.String), (r0 I:java.lang.Throwable) STATIC call: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A05(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:1688), block:B:468:0x0698 */
    /* JADX WARN: Path cross not found for [B:343:0x04be, B:339:0x04b2], limit reached: 516 */
    /* JADX WARN: Path cross not found for [B:371:0x051e, B:367:0x0512], limit reached: 516 */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04f4  */
    /* JADX WARN: Type inference failed for: r11v13, types: [T, java.util.EnumSet] */
    /* JADX WARN: Type inference failed for: r11v14, types: [T, X.GhW] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r11v24, types: [T, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r11v29, types: [T, java.lang.Object, java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v40, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v44, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v5, types: [T, java.util.EnumMap] */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v7, types: [T, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.GiO] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:336:0x04a9 -> B:330:0x0496). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:364:0x0509 -> B:358:0x04f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A0l(X.AbstractC9916Gl7 r12, X.AbstractC9904Gkk r13, T r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0l(X.Gl7, X.Gkk, java.lang.Object):java.lang.Object");
    }

    public abstract class None extends JsonDeserializer<Object> {
        public None() {
            throw F60.createAndThrow();
        }
    }

    public static JsonDeserializer A0J(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk, JsonDeserializer jsonDeserializer, ContainerDeserializerBase containerDeserializerBase) {
        AbstractC9870GjI abstractC9870GjIA07 = containerDeserializerBase._containerType.A07();
        return jsonDeserializer == null ? abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjIA07) : abstractC9904Gkk.A0I(interfaceC10017Gnp, abstractC9870GjIA07, jsonDeserializer);
    }

    public static JsonDeserializer A0K(AbstractC9904Gkk abstractC9904Gkk, AbstractC9870GjI abstractC9870GjI) {
        JsonDeserializer jsonDeserializerA02 = abstractC9904Gkk._cache.A02(abstractC9904Gkk, abstractC9870GjI, abstractC9904Gkk._factory);
        if (AbstractC9855Gj3.A0K(jsonDeserializerA02)) {
            return null;
        }
        return jsonDeserializerA02;
    }

    public static AbstractC9915Gl5 A0M(C9931GlS c9931GlS, Object obj) {
        return c9931GlS.A01.get(obj);
    }

    public static C9993GnM A0N(AbstractC9904Gkk abstractC9904Gkk) {
        C9993GnM c9993GnM = abstractC9904Gkk.A01;
        if (c9993GnM != null) {
            return c9993GnM;
        }
        C9993GnM c9993GnM2 = new C9993GnM();
        abstractC9904Gkk.A01 = c9993GnM2;
        return c9993GnM2;
    }

    public static Class A0O(AbstractC9904Gkk abstractC9904Gkk, BeanDeserializerBase beanDeserializerBase) {
        if (beanDeserializerBase._needViewProcesing) {
            return abstractC9904Gkk._view;
        }
        return null;
    }

    public static Object A0Q(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, JsonDeserializer jsonDeserializer, AbstractC9986Gn8 abstractC9986Gn8) {
        return abstractC9986Gn8 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
    }

    public static Object A0R(AbstractC9904Gkk abstractC9904Gkk, ContainerDeserializerBase containerDeserializerBase) {
        return containerDeserializerBase._nullProvider.AIA(abstractC9904Gkk);
    }

    public static void A0T(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, StdDeserializer stdDeserializer) {
        abstractC9904Gkk.A0X(abstractC9916Gl7, stdDeserializer._valueClass);
        throw F60.createAndThrow();
    }

    public static void A0W(AbstractC9904Gkk abstractC9904Gkk, BeanDeserializerBase beanDeserializerBase) {
        C10115Gpg[] c10115GpgArr = beanDeserializerBase._injectables;
        if (c10115GpgArr == null || 0 >= c10115GpgArr.length) {
            return;
        }
        abstractC9904Gkk.A0l(c10115GpgArr[0]._valueId);
        throw F60.createAndThrow();
    }

    public static void A0Y(BeanDeserializerBase beanDeserializerBase, BeanDeserializerBase beanDeserializerBase2) {
        beanDeserializerBase2._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        beanDeserializerBase2._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        beanDeserializerBase2._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
    }

    public static boolean A0Z(BeanDeserializerBase beanDeserializerBase, Object obj) {
        return AbstractC10100GpO.A01(obj, beanDeserializerBase._ignorableProps, beanDeserializerBase._includableProps);
    }

    private final Object A0k(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, AbstractC9986Gn8 abstractC9986Gn8, T t) {
        if (!(this instanceof StdDelegatingDeserializer)) {
            abstractC9904Gkk.A0b(this);
            return A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
        }
        StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) this;
        Class<?> cls = stdDelegatingDeserializer._delegateType._class;
        Class<?> cls2 = t.getClass();
        if (cls.isAssignableFrom(cls2)) {
            return stdDelegatingDeserializer._delegateDeserializer.A0l(abstractC9916Gl7, abstractC9904Gkk, t);
        }
        throw C8j3.A18(String.format("Cannot update object of type %s (using deserializer for type %s)", cls2.getName(), stdDelegatingDeserializer._delegateType));
    }

    public final JsonDeserializer<T> A0b(AbstractC10187Gqy abstractC10187Gqy) {
        BeanDeserializerBase beanDeserializerBase;
        if (this instanceof StdDelegatingDeserializer) {
            StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) this;
            AbstractC9855Gj3.A0E(StdDelegatingDeserializer.class, stdDelegatingDeserializer, "unwrappingDeserializer");
            JsonDeserializer<Object> jsonDeserializerA0b = stdDelegatingDeserializer._delegateDeserializer.A0b(abstractC10187Gqy);
            AbstractC9855Gj3.A0E(StdDelegatingDeserializer.class, stdDelegatingDeserializer, "replaceDelegatee");
            if (jsonDeserializerA0b == stdDelegatingDeserializer._delegateDeserializer) {
                return stdDelegatingDeserializer;
            }
            return new StdDelegatingDeserializer(stdDelegatingDeserializer._delegateType, jsonDeserializerA0b, stdDelegatingDeserializer._converter);
        }
        if (this instanceof BeanAsArrayDeserializer) {
            beanDeserializerBase = ((BeanAsArrayDeserializer) this)._delegate;
        } else {
            if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
                if (this instanceof BuilderBasedDeserializer) {
                    return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, abstractC10187Gqy);
                }
                if (!(this instanceof BeanDeserializer)) {
                    return this;
                }
                BeanDeserializer beanDeserializer = (BeanDeserializer) this;
                boolean z = beanDeserializer instanceof ThrowableDeserializer;
                Class<?> cls = beanDeserializer.getClass();
                if (z) {
                    if (cls != ThrowableDeserializer.class) {
                        return beanDeserializer;
                    }
                    ThrowableDeserializer throwableDeserializer = new ThrowableDeserializer(beanDeserializer, abstractC10187Gqy);
                    throwableDeserializer._vanillaProcessing = false;
                    return throwableDeserializer;
                }
                if (cls != BeanDeserializer.class || beanDeserializer.A01 == abstractC10187Gqy) {
                    return beanDeserializer;
                }
                beanDeserializer.A01 = abstractC10187Gqy;
                try {
                    return new BeanDeserializer(beanDeserializer, abstractC10187Gqy);
                } finally {
                    beanDeserializer.A01 = null;
                }
            }
            beanDeserializerBase = ((BeanAsArrayBuilderDeserializer) this)._delegate;
        }
        return beanDeserializerBase.A0b(abstractC10187Gqy);
    }

    public final AbstractC9915Gl5 A0c(String str) {
        Map<String, AbstractC9915Gl5> map;
        if (this instanceof ContainerDeserializerBase) {
            ContainerDeserializerBase containerDeserializerBase = (ContainerDeserializerBase) this;
            JsonDeserializer jsonDeserializer = containerDeserializerBase instanceof GuavaMapDeserializer ? ((GuavaMapDeserializer) containerDeserializerBase)._valueDeserializer : containerDeserializerBase instanceof GuavaCollectionDeserializer ? ((GuavaCollectionDeserializer) containerDeserializerBase)._valueDeserializer : containerDeserializerBase instanceof StringCollectionDeserializer ? ((StringCollectionDeserializer) containerDeserializerBase)._valueDeserializer : containerDeserializerBase instanceof ObjectArrayDeserializer ? ((ObjectArrayDeserializer) containerDeserializerBase)._elementDeserializer : containerDeserializerBase instanceof MapEntryDeserializer ? ((MapEntryDeserializer) containerDeserializerBase)._valueDeserializer : containerDeserializerBase instanceof MapDeserializer ? ((MapDeserializer) containerDeserializerBase)._valueDeserializer : containerDeserializerBase instanceof EnumMapDeserializer ? ((EnumMapDeserializer) containerDeserializerBase)._valueDeserializer : ((CollectionDeserializer) containerDeserializerBase)._valueDeserializer;
            if (jsonDeserializer != null) {
                return jsonDeserializer.A0c(str);
            }
            throw BV5.A0T("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, C60Q.A0e(containerDeserializerBase)});
        }
        if (this instanceof BeanDeserializerBase) {
            map = ((BeanDeserializerBase) this)._backRefs;
        } else {
            if (!(this instanceof AbstractDeserializer)) {
                throw FGI.A01("Cannot handle managed/back reference '", str, "': type: value deserializer of type ", C60Q.A0e(this), " does not support them");
            }
            map = ((AbstractDeserializer) this)._backRefProperties;
        }
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final C10035GoB A0d() {
        if (this instanceof BeanDeserializerBase) {
            return ((BeanDeserializerBase) this)._objectIdReader;
        }
        if (this instanceof AbstractDeserializer) {
            return ((AbstractDeserializer) this)._objectIdReader;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        if ((((com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers) r1) instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ByteDeser) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC10000GnW A0e() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0e():X.GnW");
    }

    public final EnumC10102GpQ A0f() {
        if (!(this instanceof StringArrayDeserializer) && !(this instanceof StdScalarDeserializer)) {
            if (this instanceof StdDelegatingDeserializer) {
                return ((StdDelegatingDeserializer) this)._delegateDeserializer.A0f();
            }
            if (!(this instanceof PrimitiveArrayDeserializers) && !(this instanceof GuavaImmutableMapDeserializer) && !(this instanceof GuavaImmutableCollectionDeserializer) && !(this instanceof ObjectArrayDeserializer)) {
                return EnumC10102GpQ.DYNAMIC;
            }
        }
        return EnumC10102GpQ.CONSTANT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A0g(X.C9898Gke r2) {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer
            if (r0 == 0) goto Ld
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer r1 = (com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._deserializer
            java.lang.Boolean r0 = r0.A0g(r2)
            return r0
        Ld:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR
            if (r0 == 0) goto L1a
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR r1 = (com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR) r1
            boolean r0 = r1._nonMerging
            if (r0 == 0) goto L73
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L1a:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer
            if (r0 != 0) goto L75
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer
            if (r0 != 0) goto L17
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            if (r0 == 0) goto L2f
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._delegateDeserializer
            java.lang.Boolean r0 = r0.A0g(r2)
            return r0
        L2f:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
            if (r0 != 0) goto L75
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer
            if (r0 != 0) goto L17
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer
            if (r0 != 0) goto L17
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            if (r0 != 0) goto L75
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
            if (r0 == 0) goto L4a
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase r1 = (com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase) r1
            boolean r0 = r1 instanceof com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableCollectionDeserializer
        L47:
            if (r0 == 0) goto L75
            goto L17
        L4a:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
            if (r0 == 0) goto L53
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer) r1
            java.lang.Boolean r0 = r1._supportsUpdates
            return r0
        L53:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
            if (r0 == 0) goto L66
            com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer) r1
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer
            if (r0 != 0) goto L75
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._valueDeserializer
            if (r0 == 0) goto L73
            java.lang.Boolean r0 = r0.A0g(r2)
            return r0
        L66:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.BeanDeserializerBase
            if (r0 == 0) goto L73
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r1 = (com.fasterxml.jackson.databind.deser.BeanDeserializerBase) r1
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer
            if (r0 != 0) goto L17
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
            goto L47
        L73:
            r0 = 0
            return r0
        L75:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0g(X.Gke):java.lang.Boolean");
    }

    public final Class<?> A0h() {
        AbstractC9870GjI abstractC9870GjI;
        JsonDeserializer<Object> jsonDeserializer;
        if (!(this instanceof TypeWrappedDeserializer)) {
            if (this instanceof StdDeserializer) {
                StdDeserializer stdDeserializer = (StdDeserializer) this;
                if (stdDeserializer instanceof StdDelegatingDeserializer) {
                    jsonDeserializer = ((StdDelegatingDeserializer) stdDeserializer)._delegateDeserializer;
                } else {
                    if (!(stdDeserializer instanceof BeanDeserializerBase)) {
                        return stdDeserializer._valueClass;
                    }
                    abstractC9870GjI = ((BeanDeserializerBase) stdDeserializer)._beanType;
                }
            } else {
                if (!(this instanceof AbstractDeserializer)) {
                    return null;
                }
                abstractC9870GjI = ((AbstractDeserializer) this)._baseType;
            }
            return abstractC9870GjI._class;
        }
        jsonDeserializer = ((TypeWrappedDeserializer) this)._deserializer;
        return jsonDeserializer.A0h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02d2, code lost:
    
        if (r0 != null) goto L268;
     */
    /* JADX WARN: Removed duplicated region for block: B:246:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0j(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6, X.AbstractC9986Gn8 r7) throws com.fasterxml.jackson.databind.deser.UnresolvedForwardReference {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0j(X.Gl7, X.Gkk, X.Gn8):java.lang.Object");
    }

    public final Object A0m(AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        if (this instanceof TypeWrappedDeserializer) {
            return ((TypeWrappedDeserializer) this)._deserializer.A0m(abstractC9904Gkk);
        }
        if (this instanceof StringArrayDeserializer) {
            return StringArrayDeserializer.A01;
        }
        if (this instanceof StdDelegatingDeserializer) {
            StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) this;
            Object objA0m = stdDelegatingDeserializer._delegateDeserializer.A0m(abstractC9904Gkk);
            if (objA0m == null) {
                return null;
            }
            return stdDelegatingDeserializer._converter.A7E(objA0m);
        }
        if (this instanceof PrimitiveArrayDeserializers) {
            PrimitiveArrayDeserializers primitiveArrayDeserializers = (PrimitiveArrayDeserializers) this;
            Object obj = primitiveArrayDeserializers.A00;
            if (obj == null) {
                obj = primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.ShortDeser ? new short[0] : primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.LongDeser ? new long[0] : primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.IntDeser ? new int[0] : primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.FloatDeser ? new float[0] : primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.DoubleDeser ? new double[0] : primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.CharDeser ? new char[0] : primitiveArrayDeserializers instanceof PrimitiveArrayDeserializers.ByteDeser ? new byte[0] : new boolean[0];
                primitiveArrayDeserializers.A00 = obj;
            }
            return obj;
        }
        if (this instanceof EnumSetDeserializer) {
            return EnumSet.noneOf(((EnumSetDeserializer) this)._enumType._class);
        }
        try {
            if (this instanceof ContainerDeserializerBase) {
                ContainerDeserializerBase containerDeserializerBase = (ContainerDeserializerBase) this;
                if (containerDeserializerBase instanceof ImmutableSortedMapDeserializer) {
                    return ImmutableSortedMap.A03;
                }
                if (containerDeserializerBase instanceof ImmutableMapDeserializer) {
                    return RegularImmutableMap.A03;
                }
                if (containerDeserializerBase instanceof ImmutableBiMapDeserializer) {
                    return RegularImmutableBiMap.A05;
                }
                if (containerDeserializerBase instanceof GuavaMultisetDeserializer) {
                    return ((GuavaMultisetDeserializer) containerDeserializerBase).A1L();
                }
                if (containerDeserializerBase instanceof GuavaImmutableCollectionDeserializer) {
                    return ((GuavaCollectionDeserializer) containerDeserializerBase).A1K();
                }
                if (containerDeserializerBase instanceof ObjectArrayDeserializer) {
                    return ((ObjectArrayDeserializer) containerDeserializerBase)._emptyValue;
                }
                if (containerDeserializerBase instanceof EnumMapDeserializer) {
                    return EnumMapDeserializer.A01(abstractC9904Gkk, (EnumMapDeserializer) containerDeserializerBase);
                }
                AbstractC9944Glx abstractC9944GlxA0z = containerDeserializerBase.A0z();
                if (abstractC9944GlxA0z != null && abstractC9944GlxA0z.A09()) {
                    return abstractC9944GlxA0z.A0D(abstractC9904Gkk);
                }
                AbstractC9870GjI abstractC9870GjI = containerDeserializerBase._containerType;
                AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, "Cannot create empty instance of %s, no default Creator", new Object[]{abstractC9870GjI});
                throw F60.createAndThrow();
            }
            if (this instanceof GuavaOptionalDeserializer) {
                Object objAIA = ((ReferenceTypeDeserializer) this)._valueDeserializer.AIA(abstractC9904Gkk);
                return objAIA == null ? Absent.INSTANCE : new Present(objAIA);
            }
            if (this instanceof AtomicReferenceDeserializer) {
                return BV4.A16(((ReferenceTypeDeserializer) this)._valueDeserializer.AIA(abstractC9904Gkk));
            }
            if (this instanceof StringDeserializer) {
                return "";
            }
            if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
                return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this)._emptyValue;
            }
            if (this instanceof NumberDeserializers$BigIntegerDeserializer) {
                return BigInteger.ZERO;
            }
            if (this instanceof NumberDeserializers$BigDecimalDeserializer) {
                return BigDecimal.ZERO;
            }
            if (this instanceof UUIDDeserializer) {
                return new UUID(0L, 0L);
            }
            if (this instanceof FromStringDeserializer.StringBuilderDeserializer) {
                return C60O.A0w();
            }
            if (this instanceof FromStringDeserializer.StringBufferDeserializer) {
                return new StringBuffer();
            }
            if (this instanceof FromStringDeserializer.Std) {
                FromStringDeserializer.Std std = (FromStringDeserializer.Std) this;
                int i = std._kind;
                return i != 3 ? i != 8 ? std.AIA(abstractC9904Gkk) : Locale.ROOT : URI.create("");
            }
            if (this instanceof EnumDeserializer) {
                return ((EnumDeserializer) this)._enumDefaultValue;
            }
            if (this instanceof DateDeserializers$TimestampDeserializer) {
                return new Timestamp(0L);
            }
            if (this instanceof DateDeserializers$SqlDateDeserializer) {
                return new Date(0L);
            }
            if (this instanceof DateDeserializers$DateDeserializer) {
                return new java.util.Date(0L);
            }
            if (!(this instanceof DateDeserializers$CalendarDeserializer)) {
                return this instanceof AtomicLongDeserializer ? new AtomicLong() : this instanceof AtomicIntegerDeserializer ? new AtomicInteger() : this instanceof AtomicBooleanDeserializer ? C60O.A1E() : this instanceof BeanDeserializerBase ? ((BeanDeserializerBase) this)._valueInstantiator.A0E(abstractC9904Gkk) : AIA(abstractC9904Gkk);
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        } catch (IOException e) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            if (e instanceof JsonMappingException) {
                throw e;
            }
            JsonMappingException jsonMappingException = new JsonMappingException(abstractC9904Gkk == null ? null : abstractC9904Gkk.A00, e.getMessage());
            jsonMappingException.initCause(e);
            throw jsonMappingException;
        }
    }

    public final Collection<Object> A0n() {
        JsonDeserializer<Object> jsonDeserializer;
        if (this instanceof TypeWrappedDeserializer) {
            jsonDeserializer = ((TypeWrappedDeserializer) this)._deserializer;
        } else {
            if (!(this instanceof StdDelegatingDeserializer)) {
                if (!(this instanceof BeanDeserializerBase)) {
                    return null;
                }
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<AbstractC9915Gl5> it = ((BeanDeserializerBase) this)._beanProperties.iterator();
                while (it.hasNext()) {
                    arrayListA0h.add(it.next()._propName._simpleName);
                }
                return arrayListA0h;
            }
            jsonDeserializer = ((StdDelegatingDeserializer) this)._delegateDeserializer;
        }
        return jsonDeserializer.A0n();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0o() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            if (r0 == 0) goto L17
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._delegateDeserializer
            if (r0 == 0) goto L15
            boolean r0 = r0.A0o()
            r1 = 1
            if (r0 != 0) goto L16
        L15:
            r1 = 0
        L16:
            return r1
        L17:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            if (r0 == 0) goto L2d
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer) r1
            X.GjI r0 = r1._enumType
            java.lang.Object r0 = r0._valueHandler
            if (r0 != 0) goto L15
            X.Gn8 r0 = r1._valueTypeDeserializer
        L29:
            r1 = 1
            if (r0 == 0) goto L16
            goto L15
        L2d:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.StringDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.EnumDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            if (r0 == 0) goto L4a
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r0 = r1._valueDeserializer
            if (r0 != 0) goto L15
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._delegateDeserializer
            goto L29
        L4a:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer
            if (r0 == 0) goto L57
            com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._elementDeserializer
            if (r0 != 0) goto L15
            X.Gn8 r0 = r1._elementTypeDeserializer
            goto L29
        L57:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.MapDeserializer
            if (r0 == 0) goto L70
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.MapDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._valueDeserializer
            if (r0 != 0) goto L15
            X.Gjl r0 = r1._keyDeserializer
            if (r0 != 0) goto L15
            X.Gn8 r0 = r1._valueTypeDeserializer
            if (r0 != 0) goto L15
            java.util.Set<java.lang.String> r0 = r1._ignorableProperties
            if (r0 != 0) goto L15
            java.util.Set<java.lang.String> r0 = r1._includableProperties
            goto L29
        L70:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            if (r0 == 0) goto L81
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._valueDeserializer
            if (r0 != 0) goto L15
            X.Gjl r0 = r1._keyDeserializer
            if (r0 != 0) goto L15
            X.Gn8 r0 = r1._valueTypeDeserializer
            goto L29
        L81:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            if (r0 == 0) goto L92
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r1 = (com.fasterxml.jackson.databind.deser.std.CollectionDeserializer) r1
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._valueDeserializer
            if (r0 != 0) goto L15
            X.Gn8 r0 = r1._valueTypeDeserializer
            if (r0 != 0) goto L15
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r1._delegateDeserializer
            goto L29
        L92:
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.BeanDeserializerBase
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.deser.AbstractDeserializer
            if (r0 != 0) goto La2
            boolean r0 = r1 instanceof com.facebook.common.json.FbJsonDeserializer
            if (r0 == 0) goto L15
        La2:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0o():boolean");
    }

    @Override // X.InterfaceC10165Gqa
    public final Object ACA(AbstractC9904Gkk abstractC9904Gkk) {
        if (!(this instanceof StdDelegatingDeserializer)) {
            if ((this instanceof JsonNodeDeserializer) || (this instanceof AtomicReferenceDeserializer)) {
                return null;
            }
            return AIA(abstractC9904Gkk);
        }
        StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) this;
        Object objACA = stdDelegatingDeserializer._delegateDeserializer.ACA(abstractC9904Gkk);
        if (objACA != null) {
            return stdDelegatingDeserializer._converter.A7E(objACA);
        }
        return null;
    }

    @Override // X.InterfaceC10165Gqa
    public final T AIA(AbstractC9904Gkk abstractC9904Gkk) {
        if (this instanceof StdDelegatingDeserializer) {
            StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) this;
            Object objAIA = stdDelegatingDeserializer._delegateDeserializer.AIA(abstractC9904Gkk);
            if (objAIA == null) {
                return null;
            }
            return stdDelegatingDeserializer._converter.A7E(objAIA);
        }
        if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
            NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer = (NumberDeserializers$PrimitiveOrWrapperDeserializer) this;
            if (numberDeserializers$PrimitiveOrWrapperDeserializer._primitive) {
                if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0B._mask, abstractC9904Gkk._featureFlags)) {
                    abstractC9904Gkk.A0c(numberDeserializers$PrimitiveOrWrapperDeserializer, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", AbstractC9855Gj3.A07(numberDeserializers$PrimitiveOrWrapperDeserializer.A0h()));
                    throw F60.createAndThrow();
                }
            }
            return numberDeserializers$PrimitiveOrWrapperDeserializer._nullValue;
        }
        if (this instanceof JsonNodeDeserializer) {
            return (T) Gh1.A00;
        }
        if (this instanceof GuavaOptionalDeserializer) {
            Object objAIA2 = ((ReferenceTypeDeserializer) this)._valueDeserializer.AIA(abstractC9904Gkk);
            return objAIA2 == null ? (T) Absent.INSTANCE : (T) new Present(objAIA2);
        }
        if (this instanceof AtomicReferenceDeserializer) {
            return (T) BV4.A16(((ReferenceTypeDeserializer) this)._valueDeserializer.AIA(abstractC9904Gkk));
        }
        if (this instanceof TypeWrappedDeserializer) {
            return (T) ((TypeWrappedDeserializer) this)._deserializer.AIA(abstractC9904Gkk);
        }
        return null;
    }

    public static AbstractC9915Gl5 A0L(AbstractC9916Gl7 abstractC9916Gl7, BeanDeserializerBase beanDeserializerBase, String str) {
        abstractC9916Gl7.A1P();
        return beanDeserializerBase._beanProperties.A02(str);
    }

    public static Object A0P(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, JsonDeserializer jsonDeserializer, BeanDeserializerBase beanDeserializerBase, AbstractC9944Glx abstractC9944Glx) {
        Object objA05 = abstractC9944Glx.A05(abstractC9904Gkk, jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk));
        C10115Gpg[] c10115GpgArr = beanDeserializerBase._injectables;
        if (c10115GpgArr == null || 0 >= c10115GpgArr.length) {
            return objA05;
        }
        abstractC9904Gkk.A0l(c10115GpgArr[0]._valueId);
        throw F60.createAndThrow();
    }

    public static void A0S(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, StdDeserializer stdDeserializer) {
        abstractC9904Gkk.A0V(abstractC9916Gl7, stdDeserializer.A0u(abstractC9904Gkk));
        throw F60.createAndThrow();
    }

    public static void A0U(AbstractC9916Gl7 abstractC9916Gl7, String str) {
        abstractC9916Gl7.A1R().A03(str.length());
    }

    public static void A0V(AbstractC9916Gl7 abstractC9916Gl7, String str) {
        abstractC9916Gl7.A1R().A02(str.length());
    }

    public static Object[] A0a(C9828GiO c9828GiO) {
        C9828GiO.A00(c9828GiO);
        Object[] objArr = c9828GiO.A02;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        c9828GiO.A02 = objArr2;
        return objArr2;
    }
}
