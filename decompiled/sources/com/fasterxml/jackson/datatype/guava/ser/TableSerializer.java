package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC7609F5w;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.BV4;
import X.C9860Gj8;
import X.C9873GjL;
import X.EnumC9834GiY;
import X.Hrj;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

/* loaded from: classes6.dex */
public class TableSerializer extends ContainerSerializer<Hrj<?, ?, ?>> implements InterfaceC9833GiW {
    public static final long serialVersionUID = 1;
    public final JsonSerializer<Object> _columnSerializer;
    public final InterfaceC10017Gnp _property;
    public final MapSerializer _rowMapSerializer;
    public final JsonSerializer<Object> _rowSerializer;
    public final AbstractC9870GjI _type;
    public final JsonSerializer<Object> _valueSerializer;
    public final AbstractC9996GnP _valueTypeSerializer;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws JsonGenerationException {
        abstractC9919GlE.A0i(null);
        abstractC9996GnP.A02(abstractC9919GlE, abstractC9996GnP.A04(EnumC9834GiY.START_OBJECT, null));
        throw BV4.A0a("rowMap");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerA0b = this._valueSerializer;
        if (jsonSerializerA0b == null) {
            AbstractC9870GjI abstractC9870GjIA03 = AbstractC9870GjI.A03(this._type, 2);
            if (JsonSerializer.A08(abstractC9870GjIA03)) {
                jsonSerializerA0b = abstractC9842Gii.A0K(interfaceC10017Gnp, abstractC9870GjIA03);
            }
        } else {
            jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, jsonSerializerA0b instanceof InterfaceC9833GiW ? 1 : 0);
        }
        JsonSerializer<Object> jsonSerializer = this._rowSerializer;
        JsonSerializer jsonSerializerA0I = jsonSerializer == null ? abstractC9842Gii.A0I(interfaceC10017Gnp, AbstractC9870GjI.A03(this._type, 0)) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializer, abstractC9842Gii, jsonSerializer instanceof InterfaceC9833GiW ? 1 : 0);
        JsonSerializer<Object> jsonSerializer2 = this._columnSerializer;
        JsonSerializer jsonSerializerA0I2 = jsonSerializer2 == null ? abstractC9842Gii.A0I(interfaceC10017Gnp, AbstractC9870GjI.A03(this._type, 1)) : AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializer2, abstractC9842Gii, jsonSerializer2 instanceof InterfaceC9833GiW ? 1 : 0);
        AbstractC9996GnP abstractC9996GnPA05 = this._valueTypeSerializer;
        if (abstractC9996GnPA05 != null) {
            abstractC9996GnPA05 = abstractC9996GnPA05.A05(interfaceC10017Gnp);
        }
        return new TableSerializer(interfaceC10017Gnp, jsonSerializerA0I, jsonSerializerA0I2, jsonSerializerA0b, abstractC9996GnPA05, abstractC9842Gii.A0B(), this);
    }

    public TableSerializer(AbstractC9870GjI abstractC9870GjI) {
        super(abstractC9870GjI);
        this._type = abstractC9870GjI;
        this._property = null;
        this._rowSerializer = null;
        this._columnSerializer = null;
        this._valueTypeSerializer = null;
        this._valueSerializer = null;
        this._rowMapSerializer = null;
    }

    public TableSerializer(AbstractC9996GnP abstractC9996GnP, TableSerializer tableSerializer) {
        super(tableSerializer._handledType, false);
        this._type = tableSerializer._type;
        this._property = tableSerializer._property;
        this._rowSerializer = tableSerializer._rowSerializer;
        this._columnSerializer = tableSerializer._columnSerializer;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = tableSerializer._valueSerializer;
        this._rowMapSerializer = tableSerializer._rowMapSerializer;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/datatype/guava/ser/TableSerializer;LX/Gnp;LX/Gj8;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;)V */
    public TableSerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, JsonSerializer jsonSerializer3, AbstractC9996GnP abstractC9996GnP, C9860Gj8 c9860Gj8, TableSerializer tableSerializer) {
        super(tableSerializer._handledType, false);
        AbstractC9870GjI abstractC9870GjI = tableSerializer._type;
        this._type = abstractC9870GjI;
        this._property = interfaceC10017Gnp;
        this._rowSerializer = jsonSerializer;
        this._columnSerializer = jsonSerializer2;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer3;
        C9873GjL c9873GjLA0B = c9860Gj8.A0B(AbstractC9870GjI.A03(abstractC9870GjI, 1), AbstractC9870GjI.A03(abstractC9870GjI, 2), Map.class);
        this._rowMapSerializer = MapSerializer.A01(c9860Gj8.A0B(AbstractC9870GjI.A03(abstractC9870GjI, 0), c9873GjLA0B, Map.class), jsonSerializer, MapSerializer.A01(c9873GjLA0B, jsonSerializer2, jsonSerializer3, abstractC9996GnP, null, null, null, false), null, null, null, null, false);
    }
}
