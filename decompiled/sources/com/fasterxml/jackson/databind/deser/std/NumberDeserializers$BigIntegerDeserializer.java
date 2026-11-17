package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7611F5y;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.EnumC10072Got;
import X.F60;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
    public static final NumberDeserializers$BigIntegerDeserializer A00 = new NumberDeserializers$BigIntegerDeserializer();

    public NumberDeserializers$BigIntegerDeserializer() {
        super(BigInteger.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final BigInteger A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException {
        Object objA16;
        if (abstractC9916Gl7.A1w()) {
            return abstractC9916Gl7.A1g();
        }
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B != 1) {
            if (iA1B == 3) {
                objA16 = A16(abstractC9916Gl7, abstractC9904Gkk);
            } else if (iA1B == 6) {
                String strA1c = abstractC9916Gl7.A1c();
                EnumC10072Got enumC10072GotA0x = A0x(abstractC9904Gkk, strA1c);
                if (enumC10072GotA0x != EnumC10072Got.AsNull) {
                    if (enumC10072GotA0x != EnumC10072Got.AsEmpty) {
                        String strTrim = strA1c.trim();
                        if (!HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strTrim)) {
                            if (StdDeserializer.A0I(strTrim)) {
                                JsonDeserializer.A0U(abstractC9916Gl7, strTrim);
                                try {
                                    return AbstractC7611F5y.A0Z(abstractC9916Gl7, strTrim);
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                            abstractC9904Gkk.A0k(this._valueClass, strTrim, "not a valid representation", BV4.A1W());
                            throw F60.createAndThrow();
                        }
                    }
                    objA16 = BigInteger.ZERO;
                }
                objA16 = AIA(abstractC9904Gkk);
            } else if (iA1B != 8) {
                JsonDeserializer.A0S(abstractC9916Gl7, abstractC9904Gkk, this);
            } else {
                EnumC10072Got enumC10072GotA0v = A0v(abstractC9916Gl7, abstractC9904Gkk, this._valueClass);
                if (enumC10072GotA0v != EnumC10072Got.AsNull) {
                    if (enumC10072GotA0v != EnumC10072Got.AsEmpty) {
                        BigDecimal bigDecimalA1f = abstractC9916Gl7.A1f();
                        abstractC9916Gl7.A1R().A01(bigDecimalA1f.scale());
                        return bigDecimalA1f.toBigInteger();
                    }
                    objA16 = BigInteger.ZERO;
                }
                objA16 = AIA(abstractC9904Gkk);
            }
            return (BigInteger) objA16;
        }
        JsonDeserializer.A0T(abstractC9916Gl7, abstractC9904Gkk, this);
        throw F60.createAndThrow();
    }
}
