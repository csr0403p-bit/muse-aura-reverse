package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10100GpO;
import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.AnonymousClass002;
import X.C10091GpF;
import X.C10110Gpb;
import X.C10126Gpr;
import X.C3cH;
import X.C9860Gj8;
import X.EnumC10065Gom;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements InterfaceC9833GiW {
    public static final long serialVersionUID = 1;
    public AbstractC10109Gpa _dynamicValueSerializers;
    public final Object _filterId;
    public final Set<String> _ignoredEntries;
    public final Set<String> _includedEntries;
    public final C10126Gpr _inclusionChecker;
    public JsonSerializer<Object> _keySerializer;
    public final AbstractC9870GjI _keyType;
    public final InterfaceC10017Gnp _property;
    public final boolean _sortKeys;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public JsonSerializer<Object> _valueSerializer;
    public final AbstractC9870GjI _valueType;
    public final boolean _valueTypeIsStatic;
    public final AbstractC9996GnP _valueTypeSerializer;
    public static final AbstractC9870GjI A01 = C9860Gj8.A05;
    public static final Object A00 = EnumC10065Gom.NON_EMPTY;

    public MapSerializer(AbstractC9996GnP abstractC9996GnP, MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = abstractC9996GnP;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<Ljava/lang/String;>;Ljava/util/Set<Ljava/lang/String;>;LX/GjI;ZLX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/ser/std/MapSerializer; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer A01(X.AbstractC9870GjI r10, com.fasterxml.jackson.databind.JsonSerializer r11, com.fasterxml.jackson.databind.JsonSerializer r12, X.AbstractC9996GnP r13, java.lang.Object r14, java.util.Set r15, java.util.Set r16, boolean r17) {
        /*
            if (r10 != 0) goto L3d
            X.GjI r4 = com.fasterxml.jackson.databind.ser.std.MapSerializer.A01
            r3 = r4
        L5:
            if (r17 != 0) goto L35
            if (r4 == 0) goto L11
            boolean r0 = com.fasterxml.jackson.databind.JsonSerializer.A08(r4)
            r17 = 1
            if (r0 != 0) goto L13
        L11:
            r17 = 0
        L13:
            r10 = r17
        L15:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r2 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r15
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 == 0) goto L4f
            java.lang.Object r0 = r2._filterId
            if (r0 == r14) goto L4f
            java.lang.String r1 = "withFilterId"
            java.lang.Class<com.fasterxml.jackson.databind.ser.std.MapSerializer> r0 = com.fasterxml.jackson.databind.ser.std.MapSerializer.class
            X.AbstractC9855Gj3.A0E(r0, r2, r1)
            boolean r1 = r2._sortKeys
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r0.<init>(r2, r14, r1)
            return r0
        L35:
            java.lang.Class<?> r1 = r4._class
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10 = 0
            if (r1 == r0) goto L15
            goto L13
        L3d:
            X.GjI r3 = r10.A08()
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            java.lang.Class<?> r0 = r10._class
            if (r0 != r1) goto L4a
            X.GjE r4 = X.C9860Gj8.A05
            goto L5
        L4a:
            X.GjI r4 = r10.A07()
            goto L5
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.A01(X.GjI, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, X.GnP, java.lang.Object, java.util.Set, java.util.Set, boolean):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<**>;LX/GlE;LX/Gii;Ljava/lang/Object;)V */
    private final void A05(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj, Map map) throws Throwable {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> jsonSerializerA00;
        boolean zEquals;
        boolean zA1Z = AnonymousClass002.A1Z(A00, obj);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            if (key == null) {
                jsonSerializer = abstractC9842Gii._nullKeySerializer;
            } else {
                C10126Gpr c10126Gpr = this._inclusionChecker;
                if (c10126Gpr == null || !c10126Gpr.A00(key)) {
                    jsonSerializer = this._keySerializer;
                }
            }
            Object value = entryA0l.getValue();
            if (value != null) {
                jsonSerializerA00 = this._valueSerializer;
                if (jsonSerializerA00 == null) {
                    jsonSerializerA00 = A00(abstractC9842Gii, this, value);
                }
                if (zA1Z) {
                    zEquals = jsonSerializerA00.A0E(abstractC9842Gii, value);
                } else if (obj != null) {
                    zEquals = obj.equals(value);
                } else {
                    jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, key);
                    jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, this._valueTypeSerializer, value);
                }
                if (zEquals) {
                    continue;
                } else {
                    jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, key);
                    jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, this._valueTypeSerializer, value);
                }
            } else if (this._suppressNulls) {
                continue;
            } else {
                jsonSerializerA00 = abstractC9842Gii._nullValueSerializer;
                jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, key);
                try {
                    jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, this._valueTypeSerializer, value);
                } catch (Exception e) {
                    StdSerializer.A03(abstractC9842Gii, map, String.valueOf(key), e);
                    throw F60.createAndThrow();
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        Map map = (Map) obj;
        abstractC9919GlE.A0i(map);
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_OBJECT, abstractC9996GnP, map);
        A0H(abstractC9919GlE, abstractC9842Gii, map);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[PHI: r4
  0x0063: PHI (r4v4 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
  (r4v3 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
  (r4v14 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
 binds: [B:14:0x0029, B:16:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.Collection, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.Set<java.lang.String>] */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r15, X.AbstractC9842Gii r16) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public static final JsonSerializer A00(AbstractC9842Gii abstractC9842Gii, MapSerializer mapSerializer, Object obj) {
        AbstractC10109Gpa abstractC10109GpaA01;
        Class<?> cls = obj.getClass();
        AbstractC10109Gpa abstractC10109Gpa = mapSerializer._dynamicValueSerializers;
        JsonSerializer<Object> jsonSerializerA00 = abstractC10109Gpa.A00(cls);
        if (jsonSerializerA00 == null) {
            AbstractC9870GjI abstractC9870GjI = mapSerializer._valueType;
            if (abstractC9870GjI.A0N()) {
                AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
                jsonSerializerA00 = abstractC9842Gii.A0H(mapSerializer._property, abstractC9870GjIA0G);
                abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, abstractC9870GjIA0G._class);
            } else {
                jsonSerializerA00 = abstractC9842Gii.A0L(mapSerializer._property, cls);
                abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, cls);
            }
            if (abstractC10109Gpa != abstractC10109GpaA01) {
                mapSerializer._dynamicValueSerializers = abstractC10109GpaA01;
            }
        }
        return jsonSerializerA00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<**>;LX/GlE;LX/Gii;)V */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f A[PHI: r11
  0x007f: PHI (r11v2 java.util.Map) = (r11v0 java.util.Map), (r11v1 java.util.Map), (r11v0 java.util.Map) binds: [B:9:0x0016, B:39:0x007e, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(X.AbstractC9919GlE r9, X.AbstractC9842Gii r10, java.util.Map r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.A0H(X.GlE, X.Gii, java.util.Map):void");
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = C10110Gpb.A00;
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<Ljava/lang/String;>;Ljava/util/Set<Ljava/lang/String;>;LX/GjI;LX/GjI;ZLX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;)V */
    public MapSerializer(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC9996GnP abstractC9996GnP, Set set, Set set2, boolean z) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = abstractC9870GjI;
        this._valueType = abstractC9870GjI2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = abstractC9996GnP;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = C10110Gpb.A00;
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._inclusionChecker = AbstractC10100GpO.A00(set, set2);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/util/Set<Ljava/lang/String;>;Ljava/util/Set<Ljava/lang/String;>;)V */
    public MapSerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapSerializer mapSerializer, Set set, Set set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = C10110Gpb.A00;
        this._property = interfaceC10017Gnp;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = AbstractC10100GpO.A00(set, set2);
    }
}
