package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC7609F5w;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9875Gjj;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.C10448Hig;
import X.C60O;
import X.C9963Gma;
import X.EnumC10046GoQ;
import X.EnumC9834GiY;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;

/* loaded from: classes6.dex */
public class RangeSerializer extends StdSerializer<Range<?>> implements InterfaceC9833GiW {
    public final JsonSerializer<Object> _endpointSerializer;
    public final C10448Hig _fieldNames;
    public final AbstractC9870GjI _rangeType;
    public final EnumC10046GoQ _shape;

    public static final void A01(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, RangeSerializer rangeSerializer, Range range) throws JsonGenerationException {
        Cut<C> cut = range.lowerBound;
        if (cut != Cut.BelowAll.A00) {
            String str = rangeSerializer._fieldNames.lowerEndpoint;
            if (rangeSerializer._endpointSerializer != null) {
                abstractC9919GlE.A0o(str);
                rangeSerializer._endpointSerializer.A0C(abstractC9919GlE, abstractC9842Gii, range.lowerBound.A03());
            } else {
                abstractC9842Gii.A0V(abstractC9919GlE, cut.A03(), str);
            }
            String str2 = rangeSerializer._fieldNames.lowerBoundType;
            String strName = range.lowerBound.A01().name();
            abstractC9919GlE.A0o(str2);
            abstractC9919GlE.A0s(strName);
        }
        Cut<C> cut2 = range.upperBound;
        if (cut2 != Cut.AboveAll.A00) {
            String str3 = rangeSerializer._fieldNames.upperEndpoint;
            if (rangeSerializer._endpointSerializer != null) {
                abstractC9919GlE.A0o(str3);
                rangeSerializer._endpointSerializer.A0C(abstractC9919GlE, abstractC9842Gii, range.upperBound.A03());
            } else {
                abstractC9842Gii.A0V(abstractC9919GlE, cut2.A03(), str3);
            }
            String str4 = rangeSerializer._fieldNames.upperBoundType;
            String strName2 = range.upperBound.A02().name();
            abstractC9919GlE.A0o(str4);
            abstractC9919GlE.A0s(strName2);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws JsonGenerationException {
        C10091GpF c10091GpFA00;
        Range range = (Range) obj;
        abstractC9919GlE.A0i(range);
        if (this._shape == EnumC10046GoQ.STRING) {
            c10091GpFA00 = abstractC9996GnP.A03(abstractC9919GlE, abstractC9996GnP.A04(EnumC9834GiY.VALUE_STRING, A00(range)));
        } else {
            c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_OBJECT, abstractC9996GnP, range);
            A01(abstractC9919GlE, abstractC9842Gii, this, range);
        }
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) throws JsonMappingException {
        EnumC10046GoQ enumC10046GoQ = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType)._shape;
        C9963Gma c9963Gma = abstractC9842Gii._config;
        C10448Hig c10448HigA00 = AbstractC9875Gjj.A00(c9963Gma._base._propertyNamingStrategy, c9963Gma);
        JsonSerializer<Object> jsonSerializerA0b = this._endpointSerializer;
        if (jsonSerializerA0b == null) {
            AbstractC9870GjI abstractC9870GjIA03 = AbstractC9870GjI.A03(this._rangeType, 0);
            if (abstractC9870GjIA03._class != Object.class) {
                jsonSerializerA0b = abstractC9842Gii.A0K(interfaceC10017Gnp, abstractC9870GjIA03);
            }
        } else {
            jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, jsonSerializerA0b instanceof InterfaceC9833GiW ? 1 : 0);
        }
        return new RangeSerializer(enumC10046GoQ, this._rangeType, jsonSerializerA0b, c10448HigA00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/Hig;LX/GoQ;)V */
    public RangeSerializer(EnumC10046GoQ enumC10046GoQ, AbstractC9870GjI abstractC9870GjI, JsonSerializer jsonSerializer, C10448Hig c10448Hig) {
        super(abstractC9870GjI);
        this._rangeType = abstractC9870GjI;
        this._endpointSerializer = jsonSerializer;
        this._fieldNames = c10448Hig;
        this._shape = enumC10046GoQ;
    }

    public static final String A00(Range<?> range) {
        StringBuilder sbA0w = C60O.A0w();
        Cut<C> cut = range.lowerBound;
        if (cut != Cut.BelowAll.A00) {
            sbA0w.append(cut.A01() == BoundType.CLOSED ? '[' : '(');
            sbA0w.append(range.lowerBound.A03());
        } else {
            sbA0w.append("(-\u221e");
        }
        sbA0w.append("..");
        Cut<C> cut2 = range.upperBound;
        if (cut2 != Cut.AboveAll.A00) {
            sbA0w.append(cut2.A03());
            sbA0w.append(range.upperBound.A02() == BoundType.CLOSED ? ']' : ')');
        } else {
            sbA0w.append("+\u221e)");
        }
        return sbA0w.toString();
    }
}
