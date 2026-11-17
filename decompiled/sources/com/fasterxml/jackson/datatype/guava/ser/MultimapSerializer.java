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
import X.AnonymousClass002;
import X.BV6;
import X.C10029Go4;
import X.C10110Gpb;
import X.C3cH;
import X.C9868GjG;
import X.C9894GkV;
import X.EnumC10062Goj;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC5023DOs;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public class MultimapSerializer extends ContainerSerializer<InterfaceC5023DOs<?, ?>> implements InterfaceC9833GiW {
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
        return new MultimapSerializer(interfaceC10017Gnp, jsonSerializerA0I, jsonSerializerA0F, abstractC9996GnPA05, this, objA0W, set, zBooleanValue);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/util/Set<Ljava/lang/String;>;Ljava/lang/Object;Z)V */
    public MultimapSerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC9996GnP abstractC9996GnP, MultimapSerializer multimapSerializer, Object obj, Set set, boolean z) {
        super(multimapSerializer._handledType, false);
        this._type = multimapSerializer._type;
        this._property = interfaceC10017Gnp;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = multimapSerializer._dynamicValueSerializers;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = z;
    }

    public static final InterfaceC5023DOs A00(AbstractC9842Gii abstractC9842Gii, InterfaceC5023DOs interfaceC5023DOs) throws JsonMappingException {
        try {
            NaturalOrdering naturalOrdering = NaturalOrdering.A00;
            TreeMap treeMap = new TreeMap(naturalOrdering);
            TreeMultimap treeMultimap = new TreeMultimap();
            Preconditions.checkArgument(treeMap.isEmpty());
            ((AbstractMapBasedMultimap) treeMultimap).A01 = treeMap;
            treeMultimap.A00 = naturalOrdering;
            treeMultimap.A01 = naturalOrdering;
            Iterator it = interfaceC5023DOs.AAn().iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                treeMultimap.AYl(entryA0l.getKey(), entryA0l.getValue());
            }
            return treeMultimap;
        } catch (ClassCastException unused) {
            return interfaceC5023DOs;
        } catch (NullPointerException unused2) {
            abstractC9842Gii.A0Y("Failed to sort Multimap entries due to `NullPointerException`: `null` key?");
            throw F60.createAndThrow();
        }
    }

    public static final void A01(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, MultimapSerializer multimapSerializer, InterfaceC5023DOs interfaceC5023DOs) throws InvalidDefinitionException, JsonGenerationException {
        Class<?> cls;
        Set<String> set = multimapSerializer._ignoredEntries;
        AbstractC10109Gpa abstractC10109Gpa = multimapSerializer._dynamicValueSerializers;
        Iterator itA0n = AnonymousClass002.A0n(interfaceC5023DOs.A4n());
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    abstractC9842Gii._nullKeySerializer.A0C(abstractC9919GlE, abstractC9842Gii, null);
                } else {
                    multimapSerializer._keySerializer.A0C(abstractC9919GlE, abstractC9842Gii, key);
                }
                abstractC9919GlE.A0S();
                for (Object obj : (Collection) entryA0l.getValue()) {
                    if (obj == null) {
                        abstractC9842Gii.A0U(abstractC9919GlE);
                    } else {
                        JsonSerializer<Object> jsonSerializerA00 = multimapSerializer._valueSerializer;
                        if (jsonSerializerA00 == null && (jsonSerializerA00 = abstractC10109Gpa.A00((cls = obj.getClass()))) == null) {
                            jsonSerializerA00 = abstractC9842Gii.A0L(multimapSerializer._property, cls);
                            AbstractC10109Gpa abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, cls);
                            if (abstractC10109Gpa != abstractC10109GpaA01) {
                                multimapSerializer._dynamicValueSerializers = abstractC10109GpaA01;
                            }
                            abstractC10109Gpa = multimapSerializer._dynamicValueSerializers;
                        }
                        JsonSerializer.A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii, multimapSerializer._valueTypeSerializer, obj);
                    }
                }
                abstractC9919GlE.A0P();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A0B(X.AbstractC9919GlE r4, X.AbstractC9842Gii r5, X.AbstractC9996GnP r6, java.lang.Object r7) throws com.fasterxml.jackson.core.JsonGenerationException, com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r3 = this;
            X.DOs r7 = (X.InterfaceC5023DOs) r7
            r4.A0i(r7)
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            X.GpF r2 = X.AbstractC9996GnP.A00(r4, r0, r6, r7)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L32
            boolean r0 = r3._sortKeys
            if (r0 != 0) goto L1f
            X.Gmp r1 = X.EnumC9975Gmp.ORDER_MAP_ENTRIES_BY_KEYS
            X.Gma r0 = r5._config
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L23
        L1f:
            X.DOs r7 = A00(r5, r7)
        L23:
            java.lang.Object r0 = r3._filterId
            if (r0 == 0) goto L2f
            r3.A0G(r5, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L2f:
            A01(r4, r5, r3, r7)
        L32:
            r6.A03(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer.A0B(X.GlE, X.Gii, X.GnP, java.lang.Object):void");
    }

    public MultimapSerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC9996GnP abstractC9996GnP, C9868GjG c9868GjG, Object obj, Set set) {
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
