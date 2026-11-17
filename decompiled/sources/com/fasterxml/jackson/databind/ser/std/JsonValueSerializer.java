package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10109Gpa;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC9842Gii;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9970Gmj;
import X.AbstractC9996GnP;
import X.BV7;
import X.C10078Goz;
import X.C10091GpF;
import X.C10110Gpb;
import X.C60O;
import X.EnumC9834GiY;
import X.EnumC9951GmA;
import X.F60;
import X.FGI;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class JsonValueSerializer extends StdSerializer implements InterfaceC9833GiW {
    public transient AbstractC10109Gpa A00;
    public final AbstractC9970Gmj _accessor;
    public final boolean _forceTypeInformation;
    public final Set<String> _ignoredProperties;
    public final InterfaceC10017Gnp _property;
    public final JsonSerializer<Object> _valueSerializer;
    public final AbstractC9870GjI _valueType;
    public final AbstractC9996GnP _valueTypeSerializer;

    public static final JsonSerializer A00(AbstractC9842Gii abstractC9842Gii, JsonValueSerializer jsonValueSerializer, Class cls) {
        JsonSerializer jsonSerializerA0i;
        AbstractC10109Gpa abstractC10109GpaA01;
        JsonSerializer<Object> jsonSerializerA00 = jsonValueSerializer.A00.A00(cls);
        if (jsonSerializerA00 != null) {
            return jsonSerializerA00;
        }
        AbstractC9870GjI abstractC9870GjI = jsonValueSerializer._valueType;
        if (abstractC9870GjI.A0N()) {
            AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
            JsonSerializer jsonSerializerA0J = abstractC9842Gii.A0J(jsonValueSerializer._property, abstractC9870GjIA0G);
            jsonSerializerA0i = AbstractC7610F5x.A0i(jsonSerializerA0J, jsonSerializerA0J, jsonValueSerializer._ignoredProperties);
            abstractC10109GpaA01 = jsonValueSerializer.A00.A01(jsonSerializerA0i, abstractC9870GjIA0G._class);
        } else {
            JsonSerializer jsonSerializerA0M = abstractC9842Gii.A0M(jsonValueSerializer._property, cls);
            jsonSerializerA0i = AbstractC7610F5x.A0i(jsonSerializerA0M, jsonSerializerA0M, jsonValueSerializer._ignoredProperties);
            abstractC10109GpaA01 = jsonValueSerializer.A00.A01(jsonSerializerA0i, cls);
        }
        jsonValueSerializer.A00 = abstractC10109GpaA01;
        return jsonSerializerA0i;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        try {
            Object objA0D = this._accessor.A0D(obj);
            if (objA0D == null) {
                abstractC9842Gii.A0U(abstractC9919GlE);
                return;
            }
            JsonSerializer<Object> jsonSerializerA00 = this._valueSerializer;
            if (jsonSerializerA00 == null) {
                jsonSerializerA00 = A00(abstractC9842Gii, this, objA0D.getClass());
            } else if (this._forceTypeInformation) {
                C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_STRING, abstractC9996GnP, obj);
                jsonSerializerA00.A0C(abstractC9919GlE, abstractC9842Gii, objA0D);
                abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
                return;
            }
            jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, new C10078Goz(abstractC9996GnP, obj), objA0D);
        } catch (Exception e) {
            StdSerializer.A03(abstractC9842Gii, obj, FGI.A0M(this._accessor.A09(), "()"), e);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        boolean zA0K;
        Class<Double> cls;
        AbstractC9996GnP abstractC9996GnPA05 = this._valueTypeSerializer;
        if (abstractC9996GnPA05 != null) {
            abstractC9996GnPA05 = abstractC9996GnPA05.A05(interfaceC10017Gnp);
        }
        JsonSerializer<Object> jsonSerializerA0b = this._valueSerializer;
        if (jsonSerializerA0b == null) {
            if (!abstractC9842Gii._config.A09(EnumC9951GmA.A0V) && !JsonSerializer.A08(this._valueType)) {
                if (interfaceC10017Gnp == this._property) {
                    return this;
                }
                zA0K = this._forceTypeInformation;
                return new JsonValueSerializer(interfaceC10017Gnp, jsonSerializerA0b, abstractC9996GnPA05, this, zA0K);
            }
            JsonSerializer jsonSerializerA0J = abstractC9842Gii.A0J(interfaceC10017Gnp, this._valueType);
            jsonSerializerA0b = AbstractC7610F5x.A0i(jsonSerializerA0J, jsonSerializerA0J, this._ignoredProperties);
            Class<?> cls2 = this._valueType._class;
            zA0K = false;
            if (cls2.isPrimitive()) {
                if (cls2 != Integer.TYPE && cls2 != Boolean.TYPE) {
                    cls = Double.TYPE;
                    if (cls2 == cls) {
                    }
                }
                zA0K = AbstractC9855Gj3.A0K(jsonSerializerA0b);
            } else {
                if (cls2 != String.class && cls2 != Integer.class && cls2 != Boolean.class) {
                    cls = Double.class;
                    if (cls2 == cls) {
                    }
                }
                zA0K = AbstractC9855Gj3.A0K(jsonSerializerA0b);
            }
            return new JsonValueSerializer(interfaceC10017Gnp, jsonSerializerA0b, abstractC9996GnPA05, this, zA0K);
        }
        jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, jsonSerializerA0b instanceof InterfaceC9833GiW ? 1 : 0);
        zA0K = this._forceTypeInformation;
        if (this._property == interfaceC10017Gnp && this._valueTypeSerializer == abstractC9996GnPA05 && this._valueSerializer == jsonSerializerA0b && zA0K == this._forceTypeInformation) {
            return this;
        }
        return new JsonValueSerializer(interfaceC10017Gnp, jsonSerializerA0b, abstractC9996GnPA05, this, zA0K);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("(@JsonValue serializer for method ");
        sbA0x.append(this._accessor.A0C());
        sbA0x.append("#");
        sbA0x.append(this._accessor.A09());
        return BV7.A10(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gmj;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/util/Set<Ljava/lang/String;>;)V */
    public JsonValueSerializer(JsonSerializer jsonSerializer, AbstractC9970Gmj abstractC9970Gmj, AbstractC9996GnP abstractC9996GnP, Set set) {
        super(abstractC9970Gmj.A07());
        this._accessor = abstractC9970Gmj;
        this._valueType = abstractC9970Gmj.A07();
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
        this._ignoredProperties = set;
        this.A00 = C10110Gpb.A00;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/std/JsonValueSerializer;LX/Gnp;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Z)V */
    public JsonValueSerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, JsonValueSerializer jsonValueSerializer, boolean z) {
        Class cls = jsonValueSerializer._handledType;
        super(cls == null ? Object.class : cls);
        this._accessor = jsonValueSerializer._accessor;
        this._valueType = jsonValueSerializer._valueType;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer;
        this._property = interfaceC10017Gnp;
        this._forceTypeInformation = z;
        this._ignoredProperties = jsonValueSerializer._ignoredProperties;
        this.A00 = C10110Gpb.A00;
    }
}
