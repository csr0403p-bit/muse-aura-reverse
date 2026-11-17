package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes6.dex */
public class ErrorThrowingDeserializer extends JsonDeserializer<Object> {
    public final Error A00;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.A00 = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        throw this.A00;
    }
}
