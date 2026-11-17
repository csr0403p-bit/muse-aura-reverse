package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.F60;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* loaded from: classes6.dex */
public class FailingDeserializer extends StdDeserializer<Object> {
    public static final long serialVersionUID = 1;
    public final String _message;

    public FailingDeserializer() {
        super((Class<?>) Object.class);
        this._message = "No _valueDeserializer assigned";
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        abstractC9904Gkk.A0c(this, this._message, BV4.A1W());
        throw F60.createAndThrow();
    }
}
