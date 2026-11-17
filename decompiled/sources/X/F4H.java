package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes5.dex */
public final class F4H extends AbstractC6735EXt {
    public final int $t;

    public F4H(int i) {
        this.$t = i;
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Object read(EY1 ey1) throws MalformedJsonException, NumberFormatException {
        String strNextToken;
        switch (this.$t) {
            case 0:
                if (ey1.A0R() != C79.A0Z) {
                    return Long.valueOf(ey1.A0Q());
                }
                break;
            case 1:
                ArrayList arrayListA0h = C3cG.A0h();
                ey1.A0W();
                while (ey1.A0c()) {
                    try {
                        C60Q.A1P(arrayListA0h, ey1.A0O());
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                ey1.A0Y();
                int size = arrayListA0h.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, AnonymousClass001.A0F(arrayListA0h.get(i)));
                }
                return atomicIntegerArray;
            case 2:
                if (ey1.A0R() != C79.A0Z) {
                    try {
                        return Long.valueOf(ey1.A0Q());
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                break;
            case 3:
                if (ey1.A0R() != C79.A0Z) {
                    String strA0V = ey1.A0V();
                    if (strA0V.length() == 1) {
                        return Character.valueOf(strA0V.charAt(0));
                    }
                    throw new JsonSyntaxException(FGI.A0d("Expecting character, got: ", strA0V, "; at ", ey1.A0T()));
                }
                break;
            case 4:
                Integer numA0R = ey1.A0R();
                if (numA0R != C79.A0Z) {
                    return numA0R == C79.A0Y ? Boolean.toString(ey1.A0d()) : ey1.A0V();
                }
                break;
            case 5:
                if (ey1.A0R() != C79.A0Z) {
                    String strA0V2 = ey1.A0V();
                    try {
                        return EX0.A00(strA0V2);
                    } catch (NumberFormatException e3) {
                        throw AbstractC6735EXt.A02(ey1, strA0V2, "' as BigDecimal; at path ", e3);
                    }
                }
                break;
            case 6:
                if (ey1.A0R() != C79.A0Z) {
                    String strA0V3 = ey1.A0V();
                    try {
                        EX0.A01(strA0V3);
                        return new BigInteger(strA0V3);
                    } catch (NumberFormatException e4) {
                        throw AbstractC6735EXt.A02(ey1, strA0V3, "' as BigInteger; at path ", e4);
                    }
                }
                break;
            case 7:
                if (ey1.A0R() != C79.A0Z) {
                    return new C6716EWz(ey1.A0V());
                }
                break;
            case 8:
                if (ey1.A0R() != C79.A0Z) {
                    return C60O.A0x(ey1.A0V());
                }
                break;
            case 9:
                throw C8j3.A18(FGI.A0M("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ", FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", "java-lang-class-unsupported")));
            case 10:
                if (ey1.A0R() != C79.A0Z) {
                    return new StringBuffer(ey1.A0V());
                }
                break;
            case 11:
                strNextToken = null;
                if (ey1.A0R() != C79.A0Z) {
                    String strA0V4 = ey1.A0V();
                    if (strA0V4.equals(HatchCcvLoggingKt.NO_POSTAL_FIELD)) {
                        return null;
                    }
                    return new URL(strA0V4);
                }
                ey1.A0a();
                return strNextToken;
            case 12:
                strNextToken = null;
                if (ey1.A0R() != C79.A0Z) {
                    try {
                        String strA0V5 = ey1.A0V();
                        if (strA0V5.equals(HatchCcvLoggingKt.NO_POSTAL_FIELD)) {
                            return null;
                        }
                        return new URI(strA0V5);
                    } catch (URISyntaxException e5) {
                        throw new JsonIOException(e5);
                    }
                }
                ey1.A0a();
                return strNextToken;
            case 13:
                if (ey1.A0R() != C79.A0Z) {
                    return InetAddress.getByName(ey1.A0V());
                }
                break;
            case 14:
                if (ey1.A0R() != C79.A0Z) {
                    String strA0V6 = ey1.A0V();
                    try {
                        return UUID.fromString(strA0V6);
                    } catch (IllegalArgumentException e6) {
                        throw AbstractC6735EXt.A02(ey1, strA0V6, "' as UUID; at path ", e6);
                    }
                }
                break;
            case 15:
                String strA0V7 = ey1.A0V();
                try {
                    return Currency.getInstance(strA0V7);
                } catch (IllegalArgumentException e7) {
                    throw AbstractC6735EXt.A02(ey1, strA0V7, "' as Currency; at path ", e7);
                }
            case 16:
                if (ey1.A0R() != C79.A0Z) {
                    ey1.A0X();
                    int iA0G = 0;
                    int iA0G2 = 0;
                    int iA0G3 = 0;
                    int iA0G4 = 0;
                    int iA0G5 = 0;
                    int iA0G6 = 0;
                    while (ey1.A0R() != C79.A0K) {
                        String strA0U = ey1.A0U();
                        int iA0O = ey1.A0O();
                        switch (strA0U.hashCode()) {
                            case -1181204563:
                                iA0G3 = BV7.A0G("dayOfMonth", strA0U, iA0G3, iA0O);
                                break;
                            case -1074026988:
                                iA0G5 = BV7.A0G("minute", strA0U, iA0G5, iA0O);
                                break;
                            case -906279820:
                                iA0G6 = BV7.A0G("second", strA0U, iA0G6, iA0O);
                                break;
                            case 3704893:
                                iA0G = BV7.A0G("year", strA0U, iA0G, iA0O);
                                break;
                            case 104080000:
                                iA0G2 = BV7.A0G("month", strA0U, iA0G2, iA0O);
                                break;
                            case 985252545:
                                iA0G4 = BV7.A0G("hourOfDay", strA0U, iA0G4, iA0O);
                                break;
                        }
                    }
                    ey1.A0Z();
                    return new GregorianCalendar(iA0G, iA0G2, iA0G3, iA0G4, iA0G5, iA0G6);
                }
                break;
            case 17:
                if (ey1.A0R() != C79.A0Z) {
                    StringTokenizer stringTokenizer = new StringTokenizer(ey1.A0V(), "_");
                    String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    if (strNextToken3 == null) {
                        if (strNextToken == null) {
                            return new Locale(strNextToken2);
                        }
                    } else if (strNextToken == null) {
                        return new Locale(strNextToken2, strNextToken3);
                    }
                    return new Locale(strNextToken2, strNextToken3, strNextToken);
                }
                ey1.A0a();
                return strNextToken;
            case 18:
                BitSet bitSet = new BitSet();
                ey1.A0W();
                Integer numA0R2 = ey1.A0R();
                int i2 = 0;
                while (numA0R2 != C79.A01) {
                    int iIntValue = numA0R2.intValue();
                    if (iIntValue == 6 || iIntValue == 5) {
                        int iA0O2 = ey1.A0O();
                        if (iA0O2 == 0) {
                            continue;
                        } else {
                            if (iA0O2 != 1) {
                                throw new JsonSyntaxException(FGI.A0W("Invalid bitset value ", ", expected 0 or 1; at path ", ey1.A0T(), iA0O2));
                            }
                            bitSet.set(i2);
                        }
                    } else {
                        if (iIntValue != 7) {
                            throw new JsonSyntaxException(FGI.A0d("Invalid bitset value type: ", EY2.A00(numA0R2), "; at path ", ey1.A0S()));
                        }
                        if (ey1.A0d()) {
                            bitSet.set(i2);
                        }
                    }
                    i2++;
                    numA0R2 = ey1.A0R();
                }
                ey1.A0Y();
                return bitSet;
            case 19:
                Integer numA0R3 = ey1.A0R();
                if (numA0R3 != C79.A0Z) {
                    return Boolean.valueOf(numA0R3 == C79.A0T ? Boolean.parseBoolean(ey1.A0V()) : ey1.A0d());
                }
                break;
            case 20:
                if (ey1.A0R() != C79.A0Z) {
                    return Boolean.valueOf(ey1.A0V());
                }
                break;
            case 21:
                if (ey1.A0R() != C79.A0Z) {
                    try {
                        int iA0O3 = ey1.A0O();
                        if (iA0O3 > 255 || iA0O3 < -128) {
                            throw new JsonSyntaxException(FGI.A0W("Lossy conversion from ", " to byte; at path ", ey1.A0T(), iA0O3));
                        }
                        return Byte.valueOf((byte) iA0O3);
                    } catch (NumberFormatException e8) {
                        throw new JsonSyntaxException(e8);
                    }
                }
                break;
            case 22:
                if (ey1.A0R() != C79.A0Z) {
                    try {
                        int iA0O4 = ey1.A0O();
                        if (iA0O4 > 65535 || iA0O4 < -32768) {
                            throw new JsonSyntaxException(FGI.A0W("Lossy conversion from ", " to short; at path ", ey1.A0T(), iA0O4));
                        }
                        return Short.valueOf((short) iA0O4);
                    } catch (NumberFormatException e9) {
                        throw new JsonSyntaxException(e9);
                    }
                }
                break;
            case 23:
                if (ey1.A0R() != C79.A0Z) {
                    try {
                        return Integer.valueOf(ey1.A0O());
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                }
                break;
            case 24:
                try {
                    return BV4.A13(ey1.A0O());
                } catch (NumberFormatException e11) {
                    throw new JsonSyntaxException(e11);
                }
            case 25:
                return BV4.A12(ey1.A0d());
            default:
                return null;
        }
        ey1.A0a();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0133, code lost:
    
        if (r5 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    @Override // X.AbstractC6735EXt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void write(X.C6733EXr r4, java.lang.Object r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F4H.write(X.EXr, java.lang.Object):void");
    }
}
