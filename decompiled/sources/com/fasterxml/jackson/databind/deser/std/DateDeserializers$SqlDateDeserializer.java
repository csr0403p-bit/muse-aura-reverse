package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import java.sql.Date;

/* loaded from: classes6.dex */
public class DateDeserializers$SqlDateDeserializer extends DateDeserializers$DateBasedDeserializer<Date> {
    public DateDeserializers$SqlDateDeserializer() {
        super(Date.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Date A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        java.util.Date dateA1B = A1B(abstractC9916Gl7, abstractC9904Gkk);
        if (dateA1B == null) {
            return null;
        }
        return new Date(dateA1B.getTime());
    }
}
