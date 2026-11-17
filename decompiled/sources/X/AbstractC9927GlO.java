package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.GlO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9927GlO extends AbstractC9916Gl7 {
    public static final BigDecimal A04;
    public static final BigDecimal A05;
    public static final BigDecimal A06;
    public static final BigDecimal A07;
    public static final BigInteger A08;
    public static final BigInteger A09;
    public static final BigInteger A0A;
    public static final BigInteger A0B;
    public EnumC9834GiY A00;
    public long A01;
    public final C10002GnY A02;
    public final boolean A03;

    public static final String A0B(int i) {
        StringBuilder sbA0y;
        char c = (char) i;
        if (!Character.isISOControl(c)) {
            sbA0y = AbstractC7608F5v.A0y("'", c);
            sbA0y.append("' (code ");
            if (i > 255) {
                sbA0y.append(i);
                sbA0y.append(" / 0x");
                BV4.A1N(sbA0y, i);
            }
            return AnonymousClass001.A0v(")", sbA0y);
        }
        sbA0y = C60O.A0x("(CTRL-CHAR, code ");
        sbA0y.append(i);
        return AnonymousClass001.A0v(")", sbA0y);
    }

    public final void A2C(int i) throws JsonParseException {
        throw AbstractC9916Gl7.A03(this, FGI.A0U("Illegal character (", A0B((char) i), "): only regular white space (\\r, \\n, \\t) is allowed between tokens"));
    }

    public static final void A0D() {
        throw BV4.A0c("Internal error: this code path should never get executed");
    }

    public int A28(int i) {
        EnumC9834GiY enumC9834GiY = this.A00;
        if (enumC9834GiY == EnumC9834GiY.VALUE_NUMBER_INT || enumC9834GiY == EnumC9834GiY.VALUE_NUMBER_FLOAT) {
            return A1C();
        }
        if (enumC9834GiY != null) {
            int i2 = enumC9834GiY._id;
            if (i2 != 6) {
                switch (i2) {
                    case 9:
                        return 1;
                    case 10:
                    case 11:
                        break;
                    case 12:
                        Object objA1V = A1V();
                        if (objA1V instanceof Number) {
                            return AnonymousClass001.A0F(objA1V);
                        }
                    default:
                        return i;
                }
            } else {
                String strA1c = A1c();
                if (!HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strA1c)) {
                    return HlV.A05(strA1c, i);
                }
            }
            return 0;
        }
        return i;
    }

    public String A29(String str) {
        EnumC9834GiY enumC9834GiY = this.A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_STRING) {
            if (enumC9834GiY == EnumC9834GiY.FIELD_NAME) {
                return A1a();
            }
            if (enumC9834GiY == null || enumC9834GiY == EnumC9834GiY.VALUE_NULL || !enumC9834GiY._isScalar) {
                return str;
            }
        }
        return A1c();
    }

    public final void A2A() throws JsonEOFException {
        if (this instanceof C9926GlN) {
            A0D();
        } else {
            AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
            C10019Gnr c10019Gnr = abstractC9980Gmw.A0F;
            int i = ((AbstractC10020Gns) c10019Gnr).A02;
            if (i == 0) {
                return;
            } else {
                abstractC9980Gmw.A2G(null, String.format(": expected close marker for %s (start marker at %s)", i == 1 ? "Array" : "Object", new C9516GMj(abstractC9980Gmw.A2Q(), c10019Gnr.A01, c10019Gnr.A00, -1L, -1L)));
            }
        }
        throw F60.createAndThrow();
    }

    public final void A2B() {
        A2G(this.A00, C8j3.A14(this.A00, C60O.A0x(" in ")));
        throw F60.createAndThrow();
    }

    public final void A2D(int i, String str) throws JsonParseException {
        if (i < 0) {
            A2B();
            throw F60.createAndThrow();
        }
        String strA0U = String.format("Unexpected character (%s)", A0B(i));
        if (str != null) {
            strA0U = FGI.A0U(strA0U, ": ", str);
        }
        throw AbstractC9916Gl7.A04(this, strA0U);
    }

    public final void A2F(EnumC9834GiY enumC9834GiY) throws StreamConstraintsException {
        this.A00 = enumC9834GiY;
        if (this.A03) {
            C10002GnY c10002GnY = this.A02;
            long j = this.A01 + 1;
            this.A01 = j;
            long j2 = c10002GnY._maxTokenCount;
            if (j > j2) {
                C10002GnY.A00("Token count (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Long.valueOf(j), Long.valueOf(j2), "getMaxTokenCount"));
                throw F60.createAndThrow();
            }
        }
    }

    public final void A2G(EnumC9834GiY enumC9834GiY, String str) throws JsonEOFException {
        throw new JsonEOFException(this, enumC9834GiY, FGI.A0M("Unexpected end-of-input", str));
    }

    public final void A2I(String str) {
        EnumC9834GiY enumC9834GiY = this.A00;
        int length = str.length();
        if (length >= 1000) {
            if (str.startsWith("-")) {
                length--;
            }
            str = String.format("[Integer with %d digits]", BV5.A1Y(length));
        }
        throw new InputCoercionException(this, enumC9834GiY, Long.TYPE, String.format("Numeric value (%s) out of range of long (%d - %s)", str, Long.MIN_VALUE, Long.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX)));
    }

    @Override // X.AbstractC9916Gl7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this instanceof C9926GlN) {
            C9926GlN c9926GlN = (C9926GlN) this;
            if (c9926GlN.A05) {
                return;
            }
            c9926GlN.A05 = true;
            return;
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        if (abstractC9980Gmw.A0J) {
            return;
        }
        abstractC9980Gmw.A05 = Math.max(abstractC9980Gmw.A05, abstractC9980Gmw.A04);
        abstractC9980Gmw.A0J = true;
        try {
            abstractC9980Gmw.A2T();
        } finally {
            abstractC9980Gmw.A2U();
            abstractC9980Gmw.A0Q.close();
        }
    }

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(AuraImpressionTimeTracker.UNKNOWN_TIME);
        A0A = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        A08 = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        A0B = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        A09 = bigIntegerValueOf4;
        A07 = new BigDecimal(bigIntegerValueOf3);
        A05 = new BigDecimal(bigIntegerValueOf4);
        A06 = new BigDecimal(bigIntegerValueOf);
        A04 = new BigDecimal(bigIntegerValueOf2);
    }

    public AbstractC9927GlO(C10002GnY c10002GnY) {
        c10002GnY = c10002GnY == null ? C10002GnY.A00 : c10002GnY;
        this.A02 = c10002GnY;
        this.A03 = AnonymousClass002.A1N((c10002GnY._maxTokenCount > 0L ? 1 : (c10002GnY._maxTokenCount == 0L ? 0 : -1)));
    }

    public static final String A0C(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", BV5.A1Y(length));
    }

    public final void A2E(Gn1 gn1, C9964Gmb c9964Gmb, String str) {
        try {
            gn1.A07(c9964Gmb, str);
        } catch (IllegalArgumentException e) {
            throw AbstractC9916Gl7.A03(this, e.getMessage());
        }
    }

    public final void A2H(EnumC9834GiY enumC9834GiY, String str) throws InputCoercionException {
        int length = str.length();
        if (length >= 1000) {
            if (str.startsWith("-")) {
                length--;
            }
            str = String.format("[Integer with %d digits]", BV5.A1Y(length));
        }
        throw new InputCoercionException(this, enumC9834GiY, Integer.TYPE, String.format("Numeric value (%s) out of range of int (%d - %s)", str, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(ILjava/lang/String;)TT; */
    public final void A2J(String str, int i) throws JsonParseException {
        throw AbstractC9916Gl7.A04(this, FGI.A0U(String.format("Unexpected character (%s) in numeric value", A0B(i)), ": ", str));
    }

    public AbstractC9927GlO(C10002GnY c10002GnY, int i) {
        super.A00 = i;
        c10002GnY = c10002GnY == null ? C10002GnY.A00 : c10002GnY;
        this.A02 = c10002GnY;
        this.A03 = AnonymousClass002.A1N((c10002GnY._maxTokenCount > 0L ? 1 : (c10002GnY._maxTokenCount == 0L ? 0 : -1)));
    }
}
