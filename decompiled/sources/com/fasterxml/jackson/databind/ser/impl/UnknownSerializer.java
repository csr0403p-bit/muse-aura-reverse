package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC9831GiU;
import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.EnumC9975Gmp;
import X.F60;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;

/* loaded from: classes6.dex */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super(Object.class, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException {
        if (abstractC9842Gii._config.A0E(EnumC9975Gmp.FAIL_ON_EMPTY_BEANS)) {
            A00(abstractC9842Gii, this, obj);
            throw F60.createAndThrow();
        }
        super.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
    }

    public static final void A00(AbstractC9842Gii abstractC9842Gii, UnknownSerializer unknownSerializer, Object obj) throws InvalidDefinitionException {
        Class<?> cls = obj.getClass();
        boolean zA00 = AbstractC9831GiU.A00(cls);
        abstractC9842Gii.A0F(String.format(zA00 ? "No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized" : "No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", cls.getName()), unknownSerializer._handledType);
        throw F60.createAndThrow();
    }
}
