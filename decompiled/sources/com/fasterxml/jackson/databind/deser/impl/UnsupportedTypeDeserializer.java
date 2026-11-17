package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV6;
import X.EnumC9834GiY;
import X.F60;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

/* loaded from: classes6.dex */
public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    public static final long serialVersionUID = 1;
    public final String _message;
    public final AbstractC9870GjI _type;

    public UnsupportedTypeDeserializer(AbstractC9870GjI abstractC9870GjI, String str) {
        super(abstractC9870GjI);
        this._type = abstractC9870GjI;
        this._message = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws InvalidDefinitionException {
        Object objA1V;
        if (abstractC9916Gl7.A1N() == EnumC9834GiY.VALUE_EMBEDDED_OBJECT && ((objA1V = abstractC9916Gl7.A1V()) == null || BV6.A1Y(this._type._class, objA1V))) {
            return objA1V;
        }
        abstractC9904Gkk.A0E(this._type, this._message);
        throw F60.createAndThrow();
    }
}
