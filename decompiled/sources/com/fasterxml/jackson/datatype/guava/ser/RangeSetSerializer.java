package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.C9860Gj8;
import X.C9861Gj9;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.Range;
import java.util.List;

/* loaded from: classes6.dex */
public class RangeSetSerializer extends JsonSerializer implements InterfaceC9833GiW {
    public AbstractC9870GjI A00;

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        if (interfaceC10017Gnp == null) {
            return this;
        }
        RangeSetSerializer rangeSetSerializer = new RangeSetSerializer();
        C9860Gj8 c9860Gj8A0B = abstractC9842Gii.A0B();
        rangeSetSerializer.A00 = c9860Gj8A0B.A0A(C9860Gj8.A00(c9860Gj8A0B.A07(null, C9861Gj9.A01(new AbstractC9870GjI[]{interfaceC10017Gnp.AM9().A0B(0)}[0], Range.class), Range.class), c9860Gj8A0B), List.class);
        return rangeSetSerializer;
    }
}
