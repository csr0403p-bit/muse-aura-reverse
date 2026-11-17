package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes6.dex */
public class DateDeserializers$TimestampDeserializer extends DateDeserializers$DateBasedDeserializer<Timestamp> {
    public DateDeserializers$TimestampDeserializer() {
        super(Timestamp.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Timestamp A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        Date dateA1B = A1B(abstractC9916Gl7, abstractC9904Gkk);
        if (dateA1B == null) {
            return null;
        }
        return new Timestamp(dateA1B.getTime());
    }
}
