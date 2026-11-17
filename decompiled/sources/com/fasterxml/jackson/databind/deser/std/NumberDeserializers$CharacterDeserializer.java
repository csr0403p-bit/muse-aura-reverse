package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.C60O;
import X.C79;
import X.EnumC10000GnW;
import X.EnumC10072Got;
import X.F60;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Character> {
    public static final NumberDeserializers$CharacterDeserializer A00;
    public static final NumberDeserializers$CharacterDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Character.TYPE;
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Integer;
        A00 = new NumberDeserializers$CharacterDeserializer(enumC10000GnW, cls, (char) 0, (char) 0);
        A01 = new NumberDeserializers$CharacterDeserializer(enumC10000GnW, Character.class, null, (char) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Character A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException {
        Object objA16;
        char cCharAt;
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B != 1) {
            if (iA1B != 3) {
                if (iA1B != 11) {
                    if (iA1B == 6) {
                        String strA1c = abstractC9916Gl7.A1c();
                        if (strA1c.length() == 1) {
                            cCharAt = strA1c.charAt(0);
                            return Character.valueOf(cCharAt);
                        }
                        EnumC10072Got enumC10072GotA0x = A0x(abstractC9904Gkk, strA1c);
                        if (enumC10072GotA0x != EnumC10072Got.AsNull) {
                            if (enumC10072GotA0x != EnumC10072Got.AsEmpty) {
                                String strTrim = strA1c.trim();
                                if (!A1J(abstractC9904Gkk, strTrim)) {
                                    JsonDeserializer.A0X(abstractC9904Gkk, A0h(), strTrim, "Expected either Integer value code or 1-character String");
                                }
                            }
                            objA16 = this._emptyValue;
                        }
                    } else if (iA1B != 7) {
                        JsonDeserializer.A0S(abstractC9916Gl7, abstractC9904Gkk, this);
                    } else {
                        EnumC10072Got enumC10072GotA0O = abstractC9904Gkk.A0O(this._logicalType, this._valueClass, C79.A0C);
                        int iOrdinal = enumC10072GotA0O.ordinal();
                        if (iOrdinal == 0) {
                            A1G(abstractC9904Gkk, enumC10072GotA0O, this._valueClass, abstractC9916Gl7.A1U(), C60O.A0r("Integer value (", abstractC9916Gl7.A1c()));
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                int iA1C = abstractC9916Gl7.A1C();
                                if (iA1C >= 0 && iA1C <= 65535) {
                                    cCharAt = (char) iA1C;
                                    return Character.valueOf(cCharAt);
                                }
                                abstractC9904Gkk.A0i(A0h(), Integer.valueOf(iA1C), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                            }
                            objA16 = this._emptyValue;
                        }
                    }
                } else if (this._primitive) {
                    A1E(abstractC9904Gkk);
                }
                objA16 = AIA(abstractC9904Gkk);
            } else {
                objA16 = A16(abstractC9916Gl7, abstractC9904Gkk);
            }
            return (Character) objA16;
        }
        JsonDeserializer.A0T(abstractC9916Gl7, abstractC9904Gkk, this);
        throw F60.createAndThrow();
    }
}
