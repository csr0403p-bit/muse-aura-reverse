package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    public static final long serialVersionUID = 1;

    public AtomicLongDeserializer() {
        super(AtomicLong.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AtomicLong A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        long jIntValue;
        if (abstractC9916Gl7.A1w()) {
            jIntValue = abstractC9916Gl7.A1G();
        } else {
            Long lA15 = A15(abstractC9916Gl7, abstractC9904Gkk, AtomicLong.class);
            if (lA15 == null) {
                return null;
            }
            jIntValue = lA15.intValue();
        }
        return new AtomicLong(jIntValue);
    }
}
