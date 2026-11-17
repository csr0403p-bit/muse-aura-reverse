package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    public static final long serialVersionUID = 1;

    public AtomicIntegerDeserializer() {
        super(AtomicInteger.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AtomicInteger A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        int iIntValue;
        if (abstractC9916Gl7.A1w()) {
            iIntValue = abstractC9916Gl7.A1C();
        } else {
            Integer numA14 = A14(abstractC9916Gl7, abstractC9904Gkk, AtomicInteger.class);
            if (numA14 == null) {
                return null;
            }
            iIntValue = numA14.intValue();
        }
        return new AtomicInteger(iIntValue);
    }
}
