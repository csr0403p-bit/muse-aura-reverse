package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
    public static final long serialVersionUID = 1;

    public AtomicBooleanDeserializer() {
        super(AtomicBoolean.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AtomicBoolean A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws InvalidFormatException {
        boolean zBooleanValue;
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == EnumC9834GiY.VALUE_TRUE) {
            zBooleanValue = true;
        } else if (enumC9834GiYA1N == EnumC9834GiY.VALUE_FALSE) {
            zBooleanValue = false;
        } else {
            Boolean boolA11 = A11(abstractC9916Gl7, abstractC9904Gkk, AtomicBoolean.class);
            if (boolA11 == null) {
                return null;
            }
            zBooleanValue = boolA11.booleanValue();
        }
        return BV4.A12(zBooleanValue);
    }
}
