package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import java.text.DateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gii, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9842Gii extends AbstractC9849Git {
    public static final JsonSerializer<Object> A01 = new FailingSerializer();
    public static final JsonSerializer<Object> A02 = new UnknownSerializer();
    public transient AbstractC9845Gin A00;
    public final C9963Gma _config;
    public DateFormat _dateFormat;
    public JsonSerializer<Object> _keySerializer;
    public final C9672GdU _knownSerializers;
    public JsonSerializer<Object> _nullKeySerializer;
    public JsonSerializer<Object> _nullValueSerializer;
    public final Class<?> _serializationView;
    public final C9670GdS _serializerCache;
    public final AbstractC9843Gik _serializerFactory;
    public final boolean _stdNullValueSerializer;
    public JsonSerializer<Object> _unknownTypeSerializer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fasterxml.jackson.databind.JsonSerializer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> A0Q(X.AbstractC10031Go7 r4, java.lang.Object r5) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r3 = this;
            r1 = 0
            boolean r0 = r5 instanceof com.fasterxml.jackson.databind.JsonSerializer
            if (r0 != 0) goto L52
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 != 0) goto L28
            X.GjI r2 = r4.A07()
            java.lang.String r0 = "AnnotationIntrospector returned serializer definition of type "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            java.lang.Class r0 = r5.getClass()
            X.BV6.A18(r0, r1)
            java.lang.String r0 = "; expected type JsonSerializer or Class<JsonSerializer> instead"
        L1c:
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)
            r3.A0E(r2, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L28:
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None> r0 = com.fasterxml.jackson.databind.JsonSerializer.None.class
            if (r5 == r0) goto L5f
            boolean r0 = X.AbstractC9855Gj3.A0I(r5)
            if (r0 != 0) goto L5f
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer> r0 = com.fasterxml.jackson.databind.JsonSerializer.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L4c
            X.GjI r2 = r4.A07()
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            X.BV6.A18(r5, r1)
            java.lang.String r0 = "; expected Class<JsonSerializer>"
            goto L1c
        L4c:
            X.Gma r0 = r3._config
            java.lang.Object r5 = X.AbstractC7608F5v.A0h(r0, r5)
        L52:
            r1 = r5
            com.fasterxml.jackson.databind.JsonSerializer r1 = (com.fasterxml.jackson.databind.JsonSerializer) r1
            boolean r0 = r1 instanceof X.InterfaceC9844Gim
            if (r0 == 0) goto L5f
            r0 = r1
            X.Gim r0 = (X.InterfaceC9844Gim) r0
            r0.AbW(r3)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9842Gii.A0Q(X.Go7, java.lang.Object):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final JsonSerializer<Object> A00(AbstractC9870GjI abstractC9870GjI) throws JsonMappingException {
        try {
            JsonSerializer<Object> jsonSerializerA04 = this._serializerFactory.A04(abstractC9870GjI, this);
            if (jsonSerializerA04 == 0) {
                return jsonSerializerA04;
            }
            C9670GdS c9670GdS = this._serializerCache;
            synchronized (c9670GdS) {
                InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb = c9670GdS.A00;
                if (((GQ5) interfaceC9510GMb).A00.put(new C9669GdR(abstractC9870GjI, false), jsonSerializerA04) == null) {
                    c9670GdS.A01.set(null);
                }
                if (jsonSerializerA04 instanceof InterfaceC9844Gim) {
                    ((InterfaceC9844Gim) jsonSerializerA04).AbW(this);
                }
            }
            return jsonSerializerA04;
        } catch (IllegalArgumentException e) {
            throw new JsonMappingException(((AbstractC9846Gip) this).A00, AbstractC9855Gj3.A0A(e), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final JsonSerializer<Object> A01(Class<?> cls) throws InvalidDefinitionException {
        AbstractC9870GjI abstractC9870GjIA0R = AbstractC7608F5v.A0R(this._config, cls);
        try {
            JsonSerializer<Object> jsonSerializerA04 = this._serializerFactory.A04(abstractC9870GjIA0R, this);
            if (jsonSerializerA04 == 0) {
                return jsonSerializerA04;
            }
            C9670GdS c9670GdS = this._serializerCache;
            synchronized (c9670GdS) {
                InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb = c9670GdS.A00;
                C9669GdR c9669GdR = new C9669GdR(cls, false);
                AbstractMap abstractMap = ((GQ5) interfaceC9510GMb).A00;
                Object objPut = abstractMap.put(c9669GdR, jsonSerializerA04);
                Object objPut2 = abstractMap.put(new C9669GdR(abstractC9870GjIA0R, false), jsonSerializerA04);
                if (objPut == null || objPut2 == null) {
                    c9670GdS.A01.set(null);
                }
                if (jsonSerializerA04 instanceof InterfaceC9844Gim) {
                    ((InterfaceC9844Gim) jsonSerializerA04).AbW(this);
                }
            }
            return jsonSerializerA04;
        } catch (IllegalArgumentException e) {
            A0E(abstractC9870GjIA0R, AbstractC9855Gj3.A0A(e));
            throw F60.createAndThrow();
        }
    }

    public final AbstractC9870GjI A0G(AbstractC9870GjI abstractC9870GjI, Class<?> cls) {
        return abstractC9870GjI._class != cls ? this._config._base._typeFactory.A06(abstractC9870GjI, cls, true) : abstractC9870GjI;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public final JsonSerializer A0H(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI) {
        JsonSerializer<Object> jsonSerializerA00 = this._knownSerializers.A00(abstractC9870GjI);
        return (jsonSerializerA00 == null && (jsonSerializerA00 = this._serializerCache.A00(abstractC9870GjI)) == null && (jsonSerializerA00 = A00(abstractC9870GjI)) == null) ? A0S(abstractC9870GjI._class) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA00, this, jsonSerializerA00 instanceof InterfaceC9833GiW ? 1 : 0);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0I(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI) {
        JsonSerializer jsonSerializerA03 = this._serializerFactory.A03(abstractC9870GjI, this._keySerializer, this);
        if (jsonSerializerA03 instanceof InterfaceC9844Gim) {
            ((InterfaceC9844Gim) jsonSerializerA03).AbW(this);
        }
        return jsonSerializerA03 != 0 ? AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA03, this, jsonSerializerA03 instanceof InterfaceC9833GiW ? 1 : 0) : jsonSerializerA03;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public final JsonSerializer A0J(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI) {
        JsonSerializer<Object> jsonSerializerA00 = this._knownSerializers.A00(abstractC9870GjI);
        return (jsonSerializerA00 == null && (jsonSerializerA00 = this._serializerCache.A00(abstractC9870GjI)) == null && (jsonSerializerA00 = A00(abstractC9870GjI)) == null) ? A0S(abstractC9870GjI._class) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA00, this, jsonSerializerA00 instanceof InterfaceC9833GiW ? 1 : 0);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public final JsonSerializer A0K(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI) throws JsonMappingException {
        if (abstractC9870GjI == null) {
            A0Y("Null passed for `valueType` of `findValueSerializer()`");
            throw F60.createAndThrow();
        }
        JsonSerializer<Object> jsonSerializerA00 = this._knownSerializers.A00(abstractC9870GjI);
        return (jsonSerializerA00 == null && (jsonSerializerA00 = this._serializerCache.A00(abstractC9870GjI)) == null && (jsonSerializerA00 = A00(abstractC9870GjI)) == null) ? A0S(abstractC9870GjI._class) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA00, this, jsonSerializerA00 instanceof InterfaceC9833GiW ? 1 : 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public final JsonSerializer A0L(InterfaceC10017Gnp interfaceC10017Gnp, Class cls) {
        JsonSerializer<Object> jsonSerializerA01 = this._knownSerializers.A01(cls);
        return (jsonSerializerA01 == null && (jsonSerializerA01 = this._serializerCache.A01(cls)) == null && (jsonSerializerA01 = this._serializerCache.A00(AbstractC7608F5v.A0R(this._config, cls))) == null && (jsonSerializerA01 = A01(cls)) == null) ? A0S(cls) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA01, this, jsonSerializerA01 instanceof InterfaceC9833GiW ? 1 : 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public final JsonSerializer A0M(InterfaceC10017Gnp interfaceC10017Gnp, Class cls) {
        JsonSerializer<Object> jsonSerializerA01 = this._knownSerializers.A01(cls);
        return (jsonSerializerA01 == null && (jsonSerializerA01 = this._serializerCache.A01(cls)) == null && (jsonSerializerA01 = this._serializerCache.A00(AbstractC7608F5v.A0R(this._config, cls))) == null && (jsonSerializerA01 = A01(cls)) == null) ? A0S(cls) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA01, this, jsonSerializerA01 instanceof InterfaceC9833GiW ? 1 : 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public final JsonSerializer A0N(InterfaceC10017Gnp interfaceC10017Gnp, Class cls) {
        JsonSerializer<Object> jsonSerializerA01 = this._knownSerializers.A01(cls);
        return (jsonSerializerA01 == null && (jsonSerializerA01 = this._serializerCache.A01(cls)) == null && (jsonSerializerA01 = this._serializerCache.A00(AbstractC7608F5v.A0R(this._config, cls))) == null && (jsonSerializerA01 = A01(cls)) == null) ? A0S(cls) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA01, this, jsonSerializerA01 instanceof InterfaceC9833GiW ? 1 : 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;ZLX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    public JsonSerializer A0O(InterfaceC10017Gnp interfaceC10017Gnp, Class cls, boolean z) {
        JsonSerializer<Object> jsonSerializer;
        C9672GdU c9672GdU = this._knownSerializers;
        C9671GdT c9671GdT = c9672GdU.A01[(cls.getName().hashCode() + 1) & c9672GdU.A00];
        if (c9671GdT != null) {
            while (true) {
                if (c9671GdT.A03 != cls || !c9671GdT.A04) {
                    c9671GdT = c9671GdT.A02;
                    if (c9671GdT == null) {
                        break;
                    }
                } else {
                    jsonSerializer = c9671GdT.A01;
                    if (jsonSerializer == null) {
                        break;
                    }
                }
            }
        } else {
            C9670GdS c9670GdS = this._serializerCache;
            synchronized (c9670GdS) {
                InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb = c9670GdS.A00;
                jsonSerializer = (JsonSerializer) ((GQ5) interfaceC9510GMb).A00.get(new C9669GdR((Class<?>) cls, true));
            }
            if (jsonSerializer == null) {
                JsonSerializer jsonSerializerA0N = A0N(interfaceC10017Gnp, cls);
                AbstractC9843Gik abstractC9843Gik = this._serializerFactory;
                C9963Gma c9963Gma = this._config;
                AbstractC10028Go2 abstractC10028Go2A05 = abstractC9843Gik.A05(AbstractC7608F5v.A0R(c9963Gma, cls), c9963Gma);
                if (abstractC10028Go2A05 != null) {
                    jsonSerializerA0N = new TypeWrappedSerializer(jsonSerializerA0N, abstractC10028Go2A05.A05(interfaceC10017Gnp));
                }
                if (!z) {
                    return jsonSerializerA0N;
                }
                C9670GdS c9670GdS2 = this._serializerCache;
                synchronized (c9670GdS2) {
                    InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb2 = c9670GdS2.A00;
                    if (((GQ5) interfaceC9510GMb2).A00.put(new C9669GdR((Class<?>) cls, true), jsonSerializerA0N) == null) {
                        c9670GdS2.A01.set(null);
                    }
                }
                return jsonSerializerA0N;
            }
        }
        return jsonSerializer;
    }

    public final JsonSerializer<Object> A0P(AbstractC9870GjI abstractC9870GjI) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerA00 = this._knownSerializers.A00(abstractC9870GjI);
        if (jsonSerializerA00 != null) {
            return jsonSerializerA00;
        }
        JsonSerializer<Object> jsonSerializerA002 = this._serializerCache.A00(abstractC9870GjI);
        if (jsonSerializerA002 != null) {
            return jsonSerializerA002;
        }
        JsonSerializer<Object> jsonSerializerA003 = A00(abstractC9870GjI);
        return jsonSerializerA003 == null ? A0S(abstractC9870GjI._class) : jsonSerializerA003;
    }

    public final JsonSerializer<Object> A0R(Class<?> cls) throws InvalidDefinitionException {
        JsonSerializer<Object> jsonSerializerA01 = this._knownSerializers.A01(cls);
        if (jsonSerializerA01 != null) {
            return jsonSerializerA01;
        }
        JsonSerializer<Object> jsonSerializerA012 = this._serializerCache.A01(cls);
        if (jsonSerializerA012 != null) {
            return jsonSerializerA012;
        }
        JsonSerializer<Object> jsonSerializerA00 = this._serializerCache.A00(AbstractC7608F5v.A0R(this._config, cls));
        if (jsonSerializerA00 != null) {
            return jsonSerializerA00;
        }
        JsonSerializer<Object> jsonSerializerA013 = A01(cls);
        return jsonSerializerA013 == null ? A0S(cls) : jsonSerializerA013;
    }

    public final JsonSerializer<Object> A0S(Class<?> cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C10010Gni A0T(Object obj, AbstractC9848Gir<?> abstractC9848Gir) {
        AbstractC9848Gir abstractC9848Gir2;
        AbstractC9846Gip abstractC9846Gip = (AbstractC9846Gip) this;
        Map<Object, C10010Gni> map = abstractC9846Gip.A02;
        if (map == null) {
            abstractC9846Gip.A02 = abstractC9846Gip._config.A0E(EnumC9975Gmp.USE_EQUALITY_FOR_OBJECT_ID) ? BV4.A0u() : new IdentityHashMap<>();
        } else {
            C10010Gni c10010Gni = map.get(abstractC9848Gir);
            if (c10010Gni != null) {
                return c10010Gni;
            }
        }
        ArrayList<AbstractC9848Gir<?>> arrayListA11 = abstractC9846Gip.A01;
        if (arrayListA11 != null) {
            int size = arrayListA11.size();
            for (int i = 0; i < size; i++) {
                abstractC9848Gir2 = (AbstractC9848Gir) arrayListA11.get(i);
                Gp5 gp5 = (Gp5) abstractC9848Gir2;
                if (!(gp5 instanceof C9994GnN)) {
                    if (obj.getClass() == gp5.getClass() && ((Gp5) obj)._scope == gp5._scope) {
                        break;
                    }
                } else {
                    C9994GnN c9994GnN = (C9994GnN) gp5;
                    if (obj.getClass() == c9994GnN.getClass()) {
                        C9994GnN c9994GnN2 = (C9994GnN) obj;
                        if (c9994GnN2._scope == c9994GnN._scope && c9994GnN2._property == c9994GnN._property) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            arrayListA11 = C60O.A11(8);
            abstractC9846Gip.A01 = arrayListA11;
        }
        abstractC9848Gir2 = obj;
        arrayListA11.add(obj);
        C10010Gni c10010Gni2 = new C10010Gni(abstractC9848Gir2);
        abstractC9846Gip.A02.put(abstractC9848Gir, c10010Gni2);
        return c10010Gni2;
    }

    public final void A0U(AbstractC9919GlE abstractC9919GlE) {
        if (this._stdNullValueSerializer) {
            abstractC9919GlE.A0R();
        } else {
            this._nullValueSerializer.A0C(abstractC9919GlE, this, null);
        }
    }

    public final void A0W(AbstractC9870GjI abstractC9870GjI, Object obj) {
        if (abstractC9870GjI._class.isPrimitive() && BV6.A1Y(AbstractC9855Gj3.A02(abstractC9870GjI._class), obj)) {
            return;
        }
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        AbstractC9849Git.A07(this, abstractC9870GjI, "Incompatible types: declared root type (%s) vs %s", new Object[]{abstractC9870GjI, AbstractC9855Gj3.A06(obj.getClass())});
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/Gl4;Ljava/lang/String;[Ljava/lang/Object;)TT; */
    public final void A0X(C9914Gl4 c9914Gl4, String str, Object... objArr) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(((AbstractC9846Gip) this).A00, c9914Gl4, (AbstractC9958GmS) null, String.format("Invalid type definition for type %s: %s", AbstractC9855Gj3.A06(c9914Gl4.A05._class), AbstractC9849Git.A05(str, str, objArr)));
    }

    public final void A0Y(String str) throws JsonMappingException {
        throw new JsonMappingException(((AbstractC9846Gip) this).A00, str, null);
    }

    public final boolean A0Z(Object obj) throws InvalidDefinitionException {
        AbstractC9846Gip abstractC9846Gip = (AbstractC9846Gip) this;
        try {
            return obj.equals(null);
        } catch (Exception e) {
            Class<?> cls = obj.getClass();
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(abstractC9846Gip.A00, abstractC9846Gip.A0B().A09(cls), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", cls.getName(), C60Q.A0e(e), AbstractC9855Gj3.A0A(e)));
            invalidDefinitionException.initCause(e);
            throw invalidDefinitionException;
        }
    }

    public AbstractC9842Gii() {
        this._unknownTypeSerializer = A02;
        this._nullValueSerializer = NullSerializer.A00;
        this._nullKeySerializer = A01;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new C9670GdS();
        this._knownSerializers = null;
        this._serializationView = null;
        this.A00 = null;
        this._stdNullValueSerializer = true;
    }

    public final void A0V(AbstractC9919GlE abstractC9919GlE, Object obj, String str) throws JsonGenerationException {
        abstractC9919GlE.A0o(str);
        if (obj != null) {
            A0O(null, obj.getClass(), true).A0C(abstractC9919GlE, this, obj);
        } else if (this._stdNullValueSerializer) {
            abstractC9919GlE.A0R();
        } else {
            this._nullValueSerializer.A0C(abstractC9919GlE, this, null);
        }
    }

    public AbstractC9842Gii(C9963Gma c9963Gma, AbstractC9842Gii abstractC9842Gii, AbstractC9843Gik abstractC9843Gik) {
        this._unknownTypeSerializer = A02;
        this._nullValueSerializer = NullSerializer.A00;
        JsonSerializer<Object> jsonSerializer = A01;
        this._nullKeySerializer = jsonSerializer;
        this._serializerFactory = abstractC9843Gik;
        this._config = c9963Gma;
        C9670GdS c9670GdS = abstractC9842Gii._serializerCache;
        this._serializerCache = c9670GdS;
        this._unknownTypeSerializer = abstractC9842Gii._unknownTypeSerializer;
        this._keySerializer = abstractC9842Gii._keySerializer;
        JsonSerializer<Object> jsonSerializer2 = abstractC9842Gii._nullValueSerializer;
        this._nullValueSerializer = jsonSerializer2;
        this._nullKeySerializer = abstractC9842Gii._nullKeySerializer;
        this._stdNullValueSerializer = AnonymousClass002.A1Z(jsonSerializer2, jsonSerializer);
        this._serializationView = c9963Gma._view;
        this.A00 = c9963Gma._attributes;
        AtomicReference<C9672GdU> atomicReference = c9670GdS.A01;
        C9672GdU c9672GdU = atomicReference.get();
        if (c9672GdU == null) {
            synchronized (c9670GdS) {
                c9672GdU = atomicReference.get();
                if (c9672GdU == null) {
                    c9672GdU = new C9672GdU(c9670GdS.A00);
                    atomicReference.set(c9672GdU);
                }
            }
        }
        this._knownSerializers = c9672GdU;
    }
}
