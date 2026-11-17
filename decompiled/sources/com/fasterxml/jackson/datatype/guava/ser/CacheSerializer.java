package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC10109Gpa;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC9842Gii;
import X.AbstractC9849Git;
import X.AbstractC9870GjI;
import X.AbstractC9910Gks;
import X.AbstractC9919GlE;
import X.AbstractC9970Gmj;
import X.AbstractC9996GnP;
import X.BV6;
import X.C10029Go4;
import X.C10091GpF;
import X.C10110Gpb;
import X.C9868GjG;
import X.C9894GkV;
import X.EnumC10062Goj;
import X.EnumC9834GiY;
import X.HsZ;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class CacheSerializer extends ContainerSerializer<HsZ<?, ?>> implements InterfaceC9833GiW {
    public static final long serialVersionUID = 1;
    public AbstractC10109Gpa _dynamicValueSerializers;
    public final Object _filterId;
    public final Set<String> _ignoredEntries;
    public final JsonSerializer<Object> _keySerializer;
    public final InterfaceC10017Gnp _property;
    public final boolean _sortKeys;
    public final C9868GjG _type;
    public final JsonSerializer<Object> _valueSerializer;
    public final AbstractC9996GnP _valueTypeSerializer;

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Collection, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) throws JsonMappingException {
        Boolean boolA01;
        JsonSerializer<Object> jsonSerializerA0b = this._valueSerializer;
        if (jsonSerializerA0b == null) {
            AbstractC9870GjI abstractC9870GjI = this._type._valueType;
            if (JsonSerializer.A08(abstractC9870GjI)) {
                jsonSerializerA0b = abstractC9842Gii.A0K(interfaceC10017Gnp, abstractC9870GjI);
            }
        } else {
            jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, jsonSerializerA0b instanceof InterfaceC9833GiW ? 1 : 0);
        }
        AbstractC9910Gks abstractC9910GksA03 = AbstractC9849Git.A03(abstractC9842Gii);
        AbstractC9970Gmj abstractC9970GmjAHe = interfaceC10017Gnp == null ? null : interfaceC10017Gnp.AHe();
        Object objA0W = this._filterId;
        if (abstractC9970GmjAHe != null && abstractC9910GksA03 != null) {
            Object objA0Y = abstractC9910GksA03.A0Y(abstractC9970GmjAHe);
            jsonSerializerA0Q = objA0Y != null ? abstractC9842Gii.A0Q(abstractC9970GmjAHe, objA0Y) : null;
            Object objA0T = abstractC9910GksA03.A0T(abstractC9970GmjAHe);
            if (objA0T != null) {
                jsonSerializerA0b = abstractC9842Gii.A0Q(abstractC9970GmjAHe, objA0T);
            }
            objA0W = abstractC9910GksA03.A0W(abstractC9970GmjAHe);
        }
        if (jsonSerializerA0b == null) {
            jsonSerializerA0b = this._valueSerializer;
        }
        JsonSerializer jsonSerializerA0F = A0F(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii);
        if (jsonSerializerA0F == null) {
            AbstractC9870GjI abstractC9870GjI2 = this._type._valueType;
            if (abstractC9870GjI2._asStatic) {
                jsonSerializerA0F = abstractC9842Gii.A0K(interfaceC10017Gnp, abstractC9870GjI2);
            }
        } else {
            jsonSerializerA0F = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0F, abstractC9842Gii, jsonSerializerA0F instanceof InterfaceC9833GiW ? 1 : 0);
        }
        JsonSerializer jsonSerializerA0I = (jsonSerializerA0Q == null && (jsonSerializerA0Q = this._keySerializer) == null) ? abstractC9842Gii.A0I(interfaceC10017Gnp, this._type._keyType) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0Q, abstractC9842Gii, jsonSerializerA0Q instanceof InterfaceC9833GiW ? 1 : 0);
        AbstractC9996GnP abstractC9996GnPA05 = this._valueTypeSerializer;
        if (abstractC9996GnPA05 != null) {
            abstractC9996GnPA05 = abstractC9996GnPA05.A05(interfaceC10017Gnp);
        }
        ?? A15 = this._ignoredEntries;
        boolean zBooleanValue = false;
        Set set = A15;
        set = A15;
        if (abstractC9910GksA03 != null && abstractC9970GmjAHe != null) {
            C10029Go4 c10029Go4A09 = abstractC9910GksA03.A09(abstractC9970GmjAHe);
            Set<String> set2 = c10029Go4A09._allowGetters ? Collections.EMPTY_SET : c10029Go4A09._ignored;
            if (set2 != null && !set2.isEmpty()) {
                A15 = AbstractC7610F5x.A15(A15);
                Iterator<String> it = set2.iterator();
                while (it.hasNext()) {
                    BV6.A1S(A15, it);
                }
            }
            Boolean boolA0N = abstractC9910GksA03.A0N(abstractC9970GmjAHe);
            set = A15;
            if (boolA0N != null) {
                set = A15;
                if (boolA0N.booleanValue()) {
                    zBooleanValue = true;
                    set = A15;
                }
            }
        }
        C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType);
        if (c9894GkVA02 != null && (boolA01 = c9894GkVA02.A01(EnumC10062Goj.A05)) != null) {
            zBooleanValue = boolA01.booleanValue();
        }
        return new CacheSerializer(interfaceC10017Gnp, jsonSerializerA0I, jsonSerializerA0F, abstractC9996GnPA05, this, objA0W, set, zBooleanValue);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/datatype/guava/ser/CacheSerializer;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/util/Set<Ljava/lang/String;>;Ljava/lang/Object;Z)V */
    public CacheSerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC9996GnP abstractC9996GnP, CacheSerializer cacheSerializer, Object obj, Set set, boolean z) {
        super(cacheSerializer._handledType, false);
        this._type = cacheSerializer._type;
        this._property = interfaceC10017Gnp;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = cacheSerializer._dynamicValueSerializers;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = z;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws JsonMappingException {
        HsZ hsZ = (HsZ) obj;
        abstractC9919GlE.A0i(hsZ);
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_OBJECT, abstractC9996GnP, hsZ);
        A00(abstractC9919GlE, abstractC9842Gii, this, hsZ);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AbstractC9919GlE r7, X.AbstractC9842Gii r8, com.fasterxml.jackson.datatype.guava.ser.CacheSerializer r9, X.HsZ r10) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            java.util.concurrent.ConcurrentMap r2 = r10.A4o()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L8f
            boolean r0 = r9._sortKeys
            if (r0 != 0) goto L18
            X.Gmp r1 = X.EnumC9975Gmp.ORDER_MAP_ENTRIES_BY_KEYS
            X.Gma r0 = r8._config
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L1e
        L18:
            java.util.TreeMap r0 = new java.util.TreeMap     // Catch: java.lang.ClassCastException -> L1e java.lang.NullPointerException -> L85
            r0.<init>(r2)     // Catch: java.lang.ClassCastException -> L1e java.lang.NullPointerException -> L85
            r2 = r0
        L1e:
            java.lang.Object r0 = r9._filterId
            if (r0 == 0) goto L2a
            r9.A0G(r8, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L2a:
            java.util.Set<java.lang.String> r5 = r9._ignoredEntries
            X.Gpa r4 = r9._dynamicValueSerializers
            java.util.Iterator r6 = X.AnonymousClass002.A0n(r2)
        L32:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.util.Map$Entry r2 = X.C3cH.A0l(r6)
            java.lang.Object r1 = r2.getKey()
            if (r5 == 0) goto L49
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L49
            goto L32
        L49:
            if (r1 != 0) goto L5b
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r1 = r8._nullKeySerializer
            r0 = 0
            r1.A0C(r7, r8, r0)
        L51:
            java.lang.Object r3 = r2.getValue()
            if (r3 != 0) goto L61
            r8.A0U(r7)
            goto L32
        L5b:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r0 = r9._keySerializer
            r0.A0C(r7, r8, r1)
            goto L51
        L61:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r1 = r9._valueSerializer
            if (r1 != 0) goto L7f
            java.lang.Class r2 = r3.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.A00(r2)
            if (r1 != 0) goto L7f
            X.Gnp r0 = r9._property
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A0L(r0, r2)
            X.Gpa r0 = r4.A01(r1, r2)
            if (r4 == r0) goto L7d
            r9._dynamicValueSerializers = r0
        L7d:
            X.Gpa r4 = r9._dynamicValueSerializers
        L7f:
            X.GnP r0 = r9._valueTypeSerializer
            com.fasterxml.jackson.databind.JsonSerializer.A07(r7, r1, r8, r0, r3)
            goto L32
        L85:
            java.lang.String r0 = "Failed to sort Multimap entries due to `NullPointerException`: `null` key?"
            r8.A0Y(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.ser.CacheSerializer.A00(X.GlE, X.Gii, com.fasterxml.jackson.datatype.guava.ser.CacheSerializer, X.HsZ):void");
    }

    public CacheSerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC9996GnP abstractC9996GnP, C9868GjG c9868GjG, Object obj, Set set) {
        super(c9868GjG._class, false);
        this._type = c9868GjG;
        this._property = null;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer2;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = false;
        this._dynamicValueSerializers = C10110Gpb.A00;
    }
}
