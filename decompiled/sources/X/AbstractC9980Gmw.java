package X;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.Gmw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9980Gmw extends AbstractC9927GlO {
    public static final C10037GoH<EnumC10051GoV> A0S = AbstractC9916Gl7.A01;
    public double A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public EnumC9834GiY A0E;
    public C10019Gnr A0F;
    public String A0G;
    public BigDecimal A0H;
    public BigInteger A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public byte[] A0N;
    public char[] A0O;
    public C9964Gmb A0P;
    public final C9984Gn6 A0Q;
    public final Gn2 A0R;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC9980Gmw(C9984Gn6 c9984Gn6, int i) {
        C10002GnY c10002GnY = c9984Gn6.A09;
        super(c10002GnY, i);
        this.A02 = 1;
        this.A0A = 1;
        this.A07 = 0;
        this.A0Q = c9984Gn6;
        this.A0R = new C10093GpH(c10002GnY, c9984Gn6.A0C);
        this.A0F = new C10019Gnr((i & EnumC10012Gnk.STRICT_DUPLICATE_DETECTION._mask) != 0 ? new C10086GpA(this) : null, null, 0, 0, 1, 0);
    }

    public static final double A0A(AbstractC9980Gmw abstractC9980Gmw) {
        String str = abstractC9980Gmw.A0G;
        if (str != null) {
            try {
                abstractC9980Gmw.A00 = HlV.A00(str, abstractC9980Gmw.A23(EnumC10013Gnl.A02));
                abstractC9980Gmw.A0G = null;
            } catch (NumberFormatException e) {
                A0K(abstractC9980Gmw, e);
                throw F60.createAndThrow();
            }
        }
        return abstractC9980Gmw.A00;
    }

    public static final float A0E(AbstractC9980Gmw abstractC9980Gmw) {
        String str = abstractC9980Gmw.A0G;
        if (str != null) {
            try {
                abstractC9980Gmw.A01 = HlV.A02(str, abstractC9980Gmw.A23(EnumC10013Gnl.A02));
                abstractC9980Gmw.A0G = null;
            } catch (NumberFormatException e) {
                A0K(abstractC9980Gmw, e);
                throw F60.createAndThrow();
            }
        }
        return abstractC9980Gmw.A01;
    }

    public static final IllegalArgumentException A0F(Gn1 gn1, String str, int i, int i2) {
        String str2;
        StringBuilder sbA0x;
        String strA0v;
        if (i <= 32) {
            strA0v = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", BV5.A1a(Integer.toHexString(i), i2 + 1));
        } else {
            char c = gn1._paddingChar;
            if (i == c) {
                sbA0x = AbstractC7608F5v.A0y("Unexpected padding character ('", c);
                sbA0x.append("') as character #");
                sbA0x.append(i2 + 1);
                str2 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else {
                str2 = ") in base64 content";
                if (!Character.isDefined(i) || Character.isISOControl(i)) {
                    sbA0x = C60O.A0x("Illegal character (code 0x");
                } else {
                    sbA0x = C60O.A0x("Illegal character '");
                    sbA0x.append((char) i);
                    sbA0x.append("' (code 0x");
                }
                BV4.A1N(sbA0x, i);
            }
            strA0v = AnonymousClass001.A0v(str2, sbA0x);
        }
        if (str != null) {
            strA0v = FGI.A0U(strA0v, ": ", str);
        }
        return C60O.A0i(strA0v);
    }

    public static final BigDecimal A0G(AbstractC9980Gmw abstractC9980Gmw) {
        BigDecimal bigDecimal = abstractC9980Gmw.A0H;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = abstractC9980Gmw.A0G;
        if (str == null) {
            throw C3cG.A0Q("cannot get BigDecimal from current parser state");
        }
        try {
            BigDecimal bigDecimalA09 = HlV.A09(str, abstractC9980Gmw.A23(EnumC10013Gnl.A01));
            abstractC9980Gmw.A0H = bigDecimalA09;
            abstractC9980Gmw.A0G = null;
            return bigDecimalA09;
        } catch (NumberFormatException e) {
            A0K(abstractC9980Gmw, e);
            throw F60.createAndThrow();
        }
    }

    public static final BigInteger A0H(AbstractC9980Gmw abstractC9980Gmw) {
        BigInteger bigInteger = abstractC9980Gmw.A0I;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = abstractC9980Gmw.A0G;
        if (str == null) {
            throw C3cG.A0Q("cannot get BigInteger from current parser state");
        }
        try {
            BigInteger bigIntegerA0Z = AbstractC7611F5y.A0Z(abstractC9980Gmw, str);
            abstractC9980Gmw.A0I = bigIntegerA0Z;
            abstractC9980Gmw.A0G = null;
            return bigIntegerA0Z;
        } catch (NumberFormatException e) {
            A0K(abstractC9980Gmw, e);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e7, code lost:
    
        if (r1 < 0) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(X.AbstractC9980Gmw r11, int r12) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9980Gmw.A0I(X.Gmw, int):void");
    }

    public static final void A0J(AbstractC9980Gmw abstractC9980Gmw, int i, int i2) {
        int i3 = EnumC10012Gnk.STRICT_DUPLICATE_DETECTION._mask;
        if ((i2 & i3) == 0 || (i & i3) == 0) {
            return;
        }
        C10019Gnr c10019Gnr = abstractC9980Gmw.A0F;
        c10019Gnr.A02 = c10019Gnr.A02 == null ? new C10086GpA(abstractC9980Gmw) : null;
        abstractC9980Gmw.A0F = c10019Gnr;
    }

    public static void A0K(AbstractC9980Gmw abstractC9980Gmw, Throwable th) throws JsonParseException {
        String strA0U = FGI.A0U("Malformed numeric value (", AbstractC9927GlO.A0C(abstractC9980Gmw.A0G), ")");
        C9516GMj c9516GMjA1I = abstractC9980Gmw.A1I();
        JsonParseException jsonParseException = new JsonParseException(strA0U, th);
        jsonParseException._location = c9516GMjA1I;
        jsonParseException.A00 = abstractC9980Gmw;
        throw jsonParseException;
    }

    private final void A2W(char c) throws JsonParseException {
        if (AbstractC7609F5w.A1U(((AbstractC9916Gl7) this).A00, EnumC10012Gnk.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER._mask)) {
            return;
        }
        if (c == '\'') {
            if (AbstractC7609F5w.A1U(((AbstractC9916Gl7) this).A00, EnumC10012Gnk.ALLOW_SINGLE_QUOTES._mask)) {
                return;
            }
        }
        throw AbstractC9916Gl7.A04(this, FGI.A0M("Unrecognized character escape ", AbstractC9927GlO.A0B(c)));
    }

    public final char A2K() throws JsonParseException {
        if (this instanceof C9982Gmy) {
            C9982Gmy c9982Gmy = (C9982Gmy) this;
            int i = ((AbstractC9980Gmw) c9982Gmy).A05;
            int i2 = ((AbstractC9980Gmw) c9982Gmy).A04;
            if (i < i2) {
                byte[] bArr = c9982Gmy.A04;
                int i3 = i + 1;
                ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
                int i4 = bArr[i];
                if (i4 != 34 && i4 != 47 && i4 != 92) {
                    if (i4 == 98) {
                        return '\b';
                    }
                    if (i4 == 102) {
                        return '\f';
                    }
                    if (i4 == 110) {
                        return '\n';
                    }
                    if (i4 == 114) {
                        return '\r';
                    }
                    if (i4 == 116) {
                        return '\t';
                    }
                    if (i4 != 117) {
                        char cA0T = (char) C9982Gmy.A0T(c9982Gmy, i4);
                        c9982Gmy.A2W(cA0T);
                        return cA0T;
                    }
                    int i5 = 0;
                    i4 = 0;
                    while (i3 < i2) {
                        int i6 = i3;
                        i3++;
                        ((AbstractC9980Gmw) c9982Gmy).A05 = i3;
                        int i7 = bArr[i6] & '\u00ff';
                        int i8 = AbstractC10006Gne.A01[i7];
                        if (i8 < 0) {
                            c9982Gmy.A2D(i7, "expected a hex-digit for character escape sequence");
                            break;
                        }
                        i4 = (i4 << 4) | i8;
                        i5++;
                        if (i5 < 4) {
                        }
                    }
                    c9982Gmy.A2G(EnumC9834GiY.VALUE_STRING, " in character escape sequence");
                }
                return (char) i4;
            }
            c9982Gmy.A2G(EnumC9834GiY.VALUE_STRING, " in character escape sequence");
        } else {
            C9981Gmx c9981Gmx = (C9981Gmx) this;
            if (((AbstractC9980Gmw) c9981Gmx).A05 < ((AbstractC9980Gmw) c9981Gmx).A04 || C9981Gmx.A0m(c9981Gmx)) {
                char[] cArr = c9981Gmx.A05;
                int i9 = ((AbstractC9980Gmw) c9981Gmx).A05;
                int i10 = i9 + 1;
                ((AbstractC9980Gmw) c9981Gmx).A05 = i10;
                char c = cArr[i9];
                if (c != '\"' && c != '/' && c != '\\') {
                    if (c == 'b') {
                        return '\b';
                    }
                    if (c == 'f') {
                        return '\f';
                    }
                    if (c == 'n') {
                        return '\n';
                    }
                    if (c == 'r') {
                        return '\r';
                    }
                    if (c == 't') {
                        return '\t';
                    }
                    if (c == 'u') {
                        int i11 = 0;
                        int i12 = 0;
                        do {
                            if (i10 < ((AbstractC9980Gmw) c9981Gmx).A04 || C9981Gmx.A0m(c9981Gmx)) {
                                char[] cArr2 = c9981Gmx.A05;
                                int i13 = ((AbstractC9980Gmw) c9981Gmx).A05;
                                i10 = i13 + 1;
                                ((AbstractC9980Gmw) c9981Gmx).A05 = i10;
                                char c2 = cArr2[i13];
                                int i14 = AbstractC10006Gne.A01[c2 & '\u00ff'];
                                if (i14 < 0) {
                                    c9981Gmx.A2D(c2, "expected a hex-digit for character escape sequence");
                                } else {
                                    i12 = (i12 << 4) | i14;
                                    i11++;
                                }
                            } else {
                                c9981Gmx.A2G(EnumC9834GiY.VALUE_STRING, " in character escape sequence");
                            }
                        } while (i11 < 4);
                        return (char) i12;
                    }
                    c9981Gmx.A2W(c);
                }
                return c;
            }
            c9981Gmx.A2G(EnumC9834GiY.VALUE_STRING, " in character escape sequence");
        }
        throw F60.createAndThrow();
    }

    public final int A2L() throws JsonParseException, InputCoercionException {
        if (this.A0J) {
            throw AbstractC9916Gl7.A03(this, "Internal error: _parseNumericValue called when parser instance closed");
        }
        if (((AbstractC9927GlO) this).A00 != EnumC9834GiY.VALUE_NUMBER_INT || this.A06 > 9) {
            A0I(this, 1);
            if ((this.A07 & 1) == 0) {
                A2V();
            }
            return this.A08;
        }
        int iA06 = this.A0R.A06(this.A0M);
        this.A08 = iA06;
        this.A07 = 1;
        return iA06;
    }

    public final int A2M(Gn1 gn1, char c, int i) {
        if (c == '\\') {
            c = A2K();
            if (c <= ' ' && i == 0) {
                return -1;
            }
            int iA01 = gn1.A01(c);
            if (iA01 >= 0) {
                return iA01;
            }
            if (iA01 == -2 && i >= 2) {
                return iA01;
            }
        }
        throw A0F(gn1, null, c, i);
    }

    public final int A2N(Gn1 gn1, int i, int i2) {
        if (i == 92) {
            i = A2K();
            if (i <= 32) {
                if (i2 == 0) {
                    return -1;
                }
            } else if (i <= 127) {
            }
            int i3 = gn1.A01[i];
            if (i3 >= 0 || i3 == -2) {
                return i3;
            }
        }
        throw A0F(gn1, null, i, i2);
    }

    public final EnumC9834GiY A2O(int i, boolean z) {
        super.A02.A03(i);
        this.A0M = z;
        this.A0L = false;
        this.A06 = i;
        this.A07 = 0;
        this.A0G = null;
        return EnumC9834GiY.VALUE_NUMBER_INT;
    }

    public final EnumC9834GiY A2P(String str, double d) throws StreamConstraintsException {
        Gn2 gn2 = this.A0R;
        gn2.A08 = null;
        gn2.A02 = -1;
        gn2.A01 = 0;
        gn2.A09(str.length());
        gn2.A04 = str;
        gn2.A09 = null;
        if (gn2.A06) {
            Gn2.A01(gn2);
        }
        gn2.A00 = 0;
        this.A00 = d;
        this.A07 = 8;
        this.A0L = true;
        this.A0G = null;
        return EnumC9834GiY.VALUE_NUMBER_FLOAT;
    }

    public final C9517GMk A2Q() {
        return (((AbstractC9916Gl7) this).A00 & EnumC10012Gnk.INCLUDE_SOURCE_IN_LOCATION._mask) != 0 ? this.A0Q.A0B : C9517GMk.A01;
    }

    public final C9964Gmb A2R() {
        C9964Gmb c9964Gmb = this.A0P;
        if (c9964Gmb == null) {
            this.A0P = new C9964Gmb((HjR) null);
        } else {
            c9964Gmb.A01();
        }
        return this.A0P;
    }

    public final String A2S() {
        return AbstractC7609F5w.A1U(((AbstractC9916Gl7) this).A00, EnumC10012Gnk.ALLOW_NON_NUMERIC_NUMBERS._mask) ? "(JSON String, Number (or 'NaN'/'+INF'/'-INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A2T() throws java.io.IOException {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9982Gmy
            if (r0 != 0) goto L22
            X.Gmx r3 = (X.C9981Gmx) r3
            java.io.Reader r2 = r3.A03
            if (r2 == 0) goto L22
            X.Gn6 r0 = r3.A0Q
            boolean r0 = r0.A0D
            if (r0 != 0) goto L1c
            X.Gnk r0 = X.EnumC10012Gnk.AUTO_CLOSE_SOURCE
            int r1 = r3.A00
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r1, r0)
            if (r0 == 0) goto L1f
        L1c:
            r2.close()
        L1f:
            r0 = 0
            r3.A03 = r0
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9980Gmw.A2T():void");
    }

    public void A2U() {
        this.A0R.A08();
        char[] cArr = this.A0O;
        if (cArr != null) {
            this.A0O = null;
            C9984Gn6 c9984Gn6 = this.A0Q;
            char[] cArr2 = c9984Gn6.A05;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw C60O.A0i("Trying to release buffer smaller than original");
            }
            c9984Gn6.A05 = null;
            c9984Gn6.A0C.A02(cArr, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r5 != r3) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A2V() throws com.fasterxml.jackson.core.exc.InputCoercionException {
        /*
            r6 = this;
            int r1 = r6.A07
            r0 = r1 & 2
            if (r0 == 0) goto L1c
            long r3 = r6.A0C
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L38
        Le:
            java.lang.String r1 = r6.A1c()
            X.GiY r0 = r6.A00
            r6.A2H(r0, r1)
        L17:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1c:
            r0 = r1 & 4
            if (r0 == 0) goto L41
            java.math.BigInteger r1 = A0H(r6)
            java.math.BigInteger r0 = X.AbstractC9927GlO.A0A
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto Le
            java.math.BigInteger r0 = X.AbstractC9927GlO.A08
            int r0 = r0.compareTo(r1)
        L32:
            if (r0 < 0) goto Le
            int r5 = r1.intValue()
        L38:
            r6.A08 = r5
            int r0 = r6.A07
            r0 = r0 | 1
            r6.A07 = r0
            return
        L41:
            r0 = r1 & 8
            if (r0 == 0) goto L5a
            double r3 = A0A(r6)
            r1 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Le
            r1 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Le
            int r5 = (int) r3
            goto L38
        L5a:
            r0 = r1 & 16
            if (r0 == 0) goto L71
            java.math.BigDecimal r1 = A0G(r6)
            java.math.BigDecimal r0 = X.AbstractC9927GlO.A06
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto Le
            java.math.BigDecimal r0 = X.AbstractC9927GlO.A04
            int r0 = r0.compareTo(r1)
            goto L32
        L71:
            X.AbstractC9927GlO.A0D()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9980Gmw.A2V():void");
    }

    public final void A2X(int i, char c) throws JsonParseException {
        C10019Gnr c10019Gnr = this.A0F;
        throw AbstractC9916Gl7.A04(this, String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), c10019Gnr.A03(), new C9516GMj(A2Q(), c10019Gnr.A01, c10019Gnr.A00, -1L, -1L)));
    }

    public final void A2Y(int i, int i2) {
        C10019Gnr c10019Gnr = this.A0F;
        C10019Gnr c10019Gnr2 = c10019Gnr.A03;
        if (c10019Gnr2 == null) {
            c10019Gnr2 = new C10019Gnr(AbstractC7610F5x.A0h(c10019Gnr.A02), c10019Gnr, ((AbstractC10020Gns) c10019Gnr).A01 + 1, 1, i, i2);
            c10019Gnr.A03 = c10019Gnr2;
        } else {
            ((AbstractC10020Gns) c10019Gnr2).A02 = 1;
            ((AbstractC10020Gns) c10019Gnr2).A00 = -1;
            c10019Gnr2.A01 = i;
            c10019Gnr2.A00 = i2;
            c10019Gnr2.A05 = null;
            c10019Gnr2.A04 = null;
            C10086GpA c10086GpA = c10019Gnr2.A02;
            if (c10086GpA != null) {
                c10086GpA.A00 = null;
                c10086GpA.A01 = null;
                c10086GpA.A02 = null;
            }
        }
        this.A0F = c10019Gnr2;
        C10002GnY c10002GnY = super.A02;
        int i3 = ((AbstractC10020Gns) c10019Gnr2).A01;
        int i4 = c10002GnY._maxNestingDepth;
        if (i3 <= i4) {
            return;
        }
        C10002GnY.A00("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Integer.valueOf(i3), Integer.valueOf(i4), "getMaxNestingDepth"));
        throw F60.createAndThrow();
    }

    public final void A2Z(int i, int i2) {
        C10019Gnr c10019Gnr = this.A0F;
        C10019Gnr c10019Gnr2 = c10019Gnr.A03;
        if (c10019Gnr2 == null) {
            c10019Gnr2 = new C10019Gnr(AbstractC7610F5x.A0h(c10019Gnr.A02), c10019Gnr, ((AbstractC10020Gns) c10019Gnr).A01 + 1, 2, i, i2);
            c10019Gnr.A03 = c10019Gnr2;
        } else {
            ((AbstractC10020Gns) c10019Gnr2).A02 = 2;
            ((AbstractC10020Gns) c10019Gnr2).A00 = -1;
            c10019Gnr2.A01 = i;
            c10019Gnr2.A00 = i2;
            c10019Gnr2.A05 = null;
            c10019Gnr2.A04 = null;
            C10086GpA c10086GpA = c10019Gnr2.A02;
            if (c10086GpA != null) {
                c10086GpA.A00 = null;
                c10086GpA.A01 = null;
                c10086GpA.A02 = null;
            }
        }
        this.A0F = c10019Gnr2;
        C10002GnY c10002GnY = super.A02;
        int i3 = ((AbstractC10020Gns) c10019Gnr2).A01;
        int i4 = c10002GnY._maxNestingDepth;
        if (i3 <= i4) {
            return;
        }
        C10002GnY.A00("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Integer.valueOf(i3), Integer.valueOf(i4), "getMaxNestingDepth"));
        throw F60.createAndThrow();
    }

    public final void A2a(int i, String str) throws JsonParseException {
        if (!AbstractC7609F5w.A1U(((AbstractC9916Gl7) this).A00, EnumC10012Gnk.ALLOW_UNQUOTED_CONTROL_CHARS._mask) || i > 32) {
            throw AbstractC9916Gl7.A04(this, FGI.A0d("Illegal unquoted character (", AbstractC9927GlO.A0B((char) i), "): has to be escaped using backslash to be included in ", str));
        }
    }

    public final void A2b(Gn1 gn1) {
        throw AbstractC9916Gl7.A03(this, String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", gn1._name, Character.valueOf(gn1._paddingChar)));
    }

    public final int[] A2c(int[] iArr, int i) throws StreamConstraintsException {
        C10002GnY c10002GnY = super.A02;
        int length = iArr.length;
        c10002GnY.A04(length << 2);
        int i2 = length + i;
        if (i2 >= 0) {
            return Arrays.copyOf(iArr, i2);
        }
        throw C60O.A0i("Unable to grow array to longer than `Integer.MAX_VALUE`");
    }
}
