package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class TypeWrappedDeserializer extends JsonDeserializer<Object> implements Serializable {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<Object> _deserializer;
    public final AbstractC9986Gn8 _typeDeserializer;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        return this._deserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, this._typeDeserializer);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gn8;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)V */
    public TypeWrappedDeserializer(JsonDeserializer jsonDeserializer, AbstractC9986Gn8 abstractC9986Gn8) {
        this._typeDeserializer = abstractC9986Gn8;
        this._deserializer = jsonDeserializer;
    }
}
