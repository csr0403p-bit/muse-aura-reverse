package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.AnonymousClass007;
import X.C10091GpF;
import X.C10110Gpb;
import X.EnumC10065Gom;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements InterfaceC9833GiW {
    public static final Object A00 = EnumC10065Gom.NON_EMPTY;
    public AbstractC10109Gpa _dynamicValueSerializers;
    public final AbstractC9870GjI _entryType;
    public JsonSerializer<Object> _keySerializer;
    public final AbstractC9870GjI _keyType;
    public final InterfaceC10017Gnp _property;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public JsonSerializer<Object> _valueSerializer;
    public final AbstractC9870GjI _valueType;
    public final boolean _valueTypeIsStatic;
    public final AbstractC9996GnP _valueTypeSerializer;

    public MapEntrySerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapEntrySerializer mapEntrySerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = C10110Gpb.A00;
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, MapEntrySerializer mapEntrySerializer, Map.Entry entry) throws Throwable {
        JsonSerializer<Object> jsonSerializerA00;
        Class<?> cls;
        AbstractC10109Gpa abstractC10109Gpa;
        AbstractC10109Gpa abstractC10109GpaA01;
        AbstractC9996GnP abstractC9996GnP = mapEntrySerializer._valueTypeSerializer;
        Object key = entry.getKey();
        JsonSerializer<Object> jsonSerializer = key == null ? abstractC9842Gii._nullKeySerializer : mapEntrySerializer._keySerializer;
        Object value = entry.getValue();
        if (value != null) {
            jsonSerializerA00 = mapEntrySerializer._valueSerializer;
            if (jsonSerializerA00 == null && (jsonSerializerA00 = (abstractC10109Gpa = mapEntrySerializer._dynamicValueSerializers).A00((cls = value.getClass()))) == null) {
                AbstractC9870GjI abstractC9870GjI = mapEntrySerializer._valueType;
                if (abstractC9870GjI.A0N()) {
                    AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
                    jsonSerializerA00 = abstractC9842Gii.A0H(mapEntrySerializer._property, abstractC9870GjIA0G);
                    abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, abstractC9870GjIA0G._class);
                } else {
                    jsonSerializerA00 = abstractC9842Gii.A0L(mapEntrySerializer._property, cls);
                    abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, cls);
                }
                if (abstractC10109Gpa != abstractC10109GpaA01) {
                    mapEntrySerializer._dynamicValueSerializers = abstractC10109GpaA01;
                }
            }
            Object obj = mapEntrySerializer._suppressableValue;
            if (obj != null && ((obj == A00 && jsonSerializerA00.A0E(abstractC9842Gii, value)) || mapEntrySerializer._suppressableValue.equals(value))) {
                return;
            }
        } else if (mapEntrySerializer._suppressNulls) {
            return;
        } else {
            jsonSerializerA00 = abstractC9842Gii._nullValueSerializer;
        }
        jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, key);
        try {
            if (abstractC9996GnP == null) {
                jsonSerializerA00.A0C(abstractC9919GlE, abstractC9842Gii, value);
            } else {
                jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, value);
            }
        } catch (Exception e) {
            StdSerializer.A03(abstractC9842Gii, entry, AnonymousClass007.A0a("", key), e);
            throw F60.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        Map.Entry entry = (Map.Entry) obj;
        abstractC9919GlE.A0i(entry);
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_OBJECT, abstractC9996GnP, entry);
        A00(abstractC9919GlE, abstractC9842Gii, this, entry);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3 A[PHI: r3
  0x00a3: PHI (r3v3 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
  (r3v2 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
  (r3v6 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
 binds: [B:22:0x0042, B:24:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r9, X.AbstractC9842Gii r10) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r8 = this;
            X.Gks r2 = X.AbstractC9849Git.A03(r10)
            r7 = 0
            r6 = r8
            if (r9 == 0) goto Lad
            X.Gmj r1 = r9.AHe()
            if (r1 == 0) goto Lad
            if (r2 == 0) goto Lad
            java.lang.Object r0 = r2.A0Y(r1)
            if (r0 == 0) goto Laa
            com.fasterxml.jackson.databind.JsonSerializer r3 = r10.A0Q(r1, r0)
        L1a:
            java.lang.Object r0 = r2.A0T(r1)
            if (r0 == 0) goto L26
            com.fasterxml.jackson.databind.JsonSerializer r0 = r10.A0Q(r1, r0)
            if (r0 != 0) goto L28
        L26:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r0 = r8._valueSerializer
        L28:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r8.A0F(r9, r0, r10)
            if (r5 != 0) goto L42
            boolean r0 = r8._valueTypeIsStatic
            if (r0 == 0) goto L42
            X.GjI r2 = r8._valueType
            java.lang.Class<?> r1 = r2._class
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = X.AnonymousClass002.A1Z(r1, r0)
            if (r0 != 0) goto L42
            com.fasterxml.jackson.databind.JsonSerializer r5 = r10.A0H(r9, r2)
        L42:
            if (r3 != 0) goto La3
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r3 = r8._keySerializer
            if (r3 != 0) goto La3
            X.GjI r0 = r8._keyType
            com.fasterxml.jackson.databind.JsonSerializer r4 = r10.A0I(r9, r0)
        L4e:
            java.lang.Object r3 = r8._suppressableValue
            boolean r8 = r8._suppressNulls
            if (r9 == 0) goto La1
            X.Gma r0 = r10._config
            X.Gnf r2 = r9.ABY(r0, r7)
            if (r2 == 0) goto La1
            X.Gom r1 = r2._contentInclusion
            X.Gom r0 = X.EnumC10065Gom.USE_DEFAULTS
            if (r1 == r0) goto La1
            int r1 = r1.ordinal()
            r0 = 4
            if (r1 == r0) goto L9a
            r0 = 2
            if (r1 == r0) goto L8f
            r0 = 3
            if (r1 == r0) goto L97
            r0 = 5
            if (r1 == r0) goto L7d
            r0 = 1
            r8 = 0
            if (r1 != r0) goto L77
        L76:
            r8 = 1
        L77:
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r3 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L7d:
            java.lang.Class<?> r1 = r2._contentFilter
            r7 = 0
            if (r1 == 0) goto L88
            X.Gma r0 = r10._config
            java.lang.Object r7 = X.AbstractC7608F5v.A0h(r0, r1)
        L88:
            if (r7 == 0) goto L76
            boolean r8 = r10.A0Z(r7)
            goto L77
        L8f:
            X.GjI r0 = r6._valueType
            boolean r0 = r0.A06()
            if (r0 == 0) goto L76
        L97:
            java.lang.Object r7 = com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.A00
            goto L76
        L9a:
            X.GjI r0 = r6._valueType
            java.lang.Object r7 = X.AbstractC9858Gj6.A00(r0)
            goto L76
        La1:
            r7 = r3
            goto L77
        La3:
            boolean r0 = r3 instanceof X.InterfaceC9833GiW
            com.fasterxml.jackson.databind.JsonSerializer r4 = X.AbstractC7609F5w.A0b(r9, r3, r10, r0)
            goto L4e
        Laa:
            r3 = r7
            goto L1a
        Lad:
            r3 = r7
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public MapEntrySerializer(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, AbstractC9870GjI abstractC9870GjI3, AbstractC9996GnP abstractC9996GnP, boolean z) {
        super(abstractC9870GjI);
        this._entryType = abstractC9870GjI;
        this._keyType = abstractC9870GjI2;
        this._valueType = abstractC9870GjI3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = abstractC9996GnP;
        this._property = interfaceC10017Gnp;
        this._dynamicValueSerializers = C10110Gpb.A00;
        this._suppressableValue = null;
        this._suppressNulls = false;
    }
}
