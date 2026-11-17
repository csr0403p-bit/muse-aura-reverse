package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: X.Gl7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9916Gl7 implements Closeable {
    public static final C10037GoH<EnumC10051GoV> A01 = C10037GoH.A00(EnumC10051GoV.values());
    public int A00 = C9924GlL.A02;

    public static char A00(C9981Gmx c9981Gmx) {
        char[] cArr = c9981Gmx.A05;
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        ((AbstractC9980Gmw) c9981Gmx).A05 = i + 1;
        return cArr[i];
    }

    public static int A01(AbstractC9980Gmw abstractC9980Gmw, byte[] bArr, int i) {
        abstractC9980Gmw.A05 = i + 1;
        return bArr[i] & 255;
    }

    public static int A02(AbstractC9980Gmw abstractC9980Gmw, byte[] bArr, int i, int i2) {
        abstractC9980Gmw.A05 = i;
        return bArr[i2] & 255;
    }

    public static JsonParseException A04(AbstractC9927GlO abstractC9927GlO, String str) {
        C9516GMj c9516GMjA1I;
        int i;
        C9517GMk c9517GMkA2Q;
        long j;
        int i2;
        long j2;
        if (abstractC9927GlO instanceof C9982Gmy) {
            AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) abstractC9927GlO;
            int i3 = abstractC9980Gmw.A05 - 1;
            i = (i3 - abstractC9980Gmw.A03) + 1;
            c9517GMkA2Q = abstractC9980Gmw.A2Q();
            j2 = abstractC9980Gmw.A0B + i3;
            j = -1;
            i2 = abstractC9980Gmw.A02;
        } else {
            if (!(abstractC9927GlO instanceof C9981Gmx)) {
                c9516GMjA1I = abstractC9927GlO.A1I();
                JsonParseException jsonParseException = new JsonParseException(str, null);
                jsonParseException._location = c9516GMjA1I;
                jsonParseException.A00 = abstractC9927GlO;
                return jsonParseException;
            }
            AbstractC9980Gmw abstractC9980Gmw2 = (AbstractC9980Gmw) abstractC9927GlO;
            int i4 = abstractC9980Gmw2.A05 - 1;
            i = (i4 - abstractC9980Gmw2.A03) + 1;
            c9517GMkA2Q = abstractC9980Gmw2.A2Q();
            j = abstractC9980Gmw2.A0B + i4;
            i2 = abstractC9980Gmw2.A02;
            j2 = -1;
        }
        c9516GMjA1I = new C9516GMj(c9517GMkA2Q, i2, i, j2, j);
        JsonParseException jsonParseException2 = new JsonParseException(str, null);
        jsonParseException2._location = c9516GMjA1I;
        jsonParseException2.A00 = abstractC9927GlO;
        return jsonParseException2;
    }

    public static Object A05(C9926GlN c9926GlN) {
        C9997GnR c9997GnR = c9926GlN.A03;
        return c9997GnR.A03[c9926GlN.A00];
    }

    public static void A07(AbstractC9980Gmw abstractC9980Gmw, int i) {
        abstractC9980Gmw.A02++;
        abstractC9980Gmw.A03 = i;
    }

    public static void A08(AbstractC9980Gmw abstractC9980Gmw, Object obj) {
        if (obj == EnumC9834GiY.START_ARRAY) {
            abstractC9980Gmw.A2Y(abstractC9980Gmw.A0A, abstractC9980Gmw.A09);
        } else if (obj == EnumC9834GiY.START_OBJECT) {
            abstractC9980Gmw.A2Z(abstractC9980Gmw.A0A, abstractC9980Gmw.A09);
        }
    }

    public static void A09(C9981Gmx c9981Gmx) {
        if (((AbstractC9980Gmw) c9981Gmx).A05 < ((AbstractC9980Gmw) c9981Gmx).A04 || C9981Gmx.A0m(c9981Gmx)) {
            return;
        }
        c9981Gmx.A2B();
        throw F60.createAndThrow();
    }

    private final double A19() throws NumberFormatException {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A19();
        }
        AbstractC9927GlO abstractC9927GlO = (AbstractC9927GlO) this;
        double d = 0.0d;
        EnumC9834GiY enumC9834GiY = abstractC9927GlO.A00;
        if (enumC9834GiY == null) {
            return 0.0d;
        }
        switch (enumC9834GiY._id) {
            case 6:
                String strA1c = abstractC9927GlO.A1c();
                if (HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strA1c)) {
                    return 0.0d;
                }
                abstractC9927GlO.A02.A02(strA1c.length());
                Pattern pattern = HlV.A03;
                String strTrim = strA1c.trim();
                if (strTrim.isEmpty()) {
                    return 0.0d;
                }
                try {
                    d = Double.parseDouble(strTrim);
                    return d;
                } catch (NumberFormatException unused) {
                    return d;
                }
            case 7:
            case 8:
                return abstractC9927GlO.A17();
            case 9:
                return 1.0d;
            case 10:
            case 11:
            default:
                return 0.0d;
            case 12:
                Object objA1V = abstractC9927GlO.A1V();
                if (objA1V instanceof Number) {
                    return BV6.A00(objA1V);
                }
                return 0.0d;
        }
    }

    @Deprecated
    private final void A1k(int i) {
        if (this instanceof AbstractC9922GlJ) {
            ((AbstractC9922GlJ) this).A00.A1k(i);
            return;
        }
        if (!(this instanceof AbstractC9980Gmw)) {
            this.A00 = i;
            return;
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        int i2 = ((AbstractC9916Gl7) abstractC9980Gmw).A00 ^ i;
        if (i2 != 0) {
            ((AbstractC9916Gl7) abstractC9980Gmw).A00 = i;
            AbstractC9980Gmw.A0J(abstractC9980Gmw, i, i2);
        }
    }

    private final boolean A1t() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1t();
        }
        AbstractC9927GlO abstractC9927GlO = (AbstractC9927GlO) this;
        EnumC9834GiY enumC9834GiY = abstractC9927GlO.A00;
        if (enumC9834GiY == null) {
            return false;
        }
        switch (enumC9834GiY._id) {
            case 6:
                String strTrim = abstractC9927GlO.A1c().trim();
                if ("true".equals(strTrim)) {
                    return true;
                }
                return "false".equals(strTrim) ? false : false;
            case 7:
                return abstractC9927GlO.A1C() != 0;
            case 8:
            case 10:
            case 11:
            default:
                return false;
            case 9:
                return true;
            case 12:
                Object objA1V = abstractC9927GlO.A1V();
                if (objA1V instanceof Boolean) {
                    return AnonymousClass001.A1X(objA1V);
                }
                return false;
        }
    }

    public final byte A16() throws InputCoercionException {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A16();
        }
        int iA1C = A1C();
        if (iA1C >= -128 && iA1C <= 255) {
            return (byte) iA1C;
        }
        throw new InputCoercionException(this, EnumC9834GiY.VALUE_NUMBER_INT, Byte.TYPE, String.format("Numeric value (%s) out of range of Java byte", A1c()));
    }

    public final double A17() {
        double dA0E;
        Number numberA0H;
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A17();
        }
        if (this instanceof C9926GlN) {
            return C9926GlN.A0A((C9926GlN) this, false).doubleValue();
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        int i = abstractC9980Gmw.A07;
        if ((i & 8) == 0) {
            if (i == 0) {
                AbstractC9980Gmw.A0I(abstractC9980Gmw, 8);
            }
            int i2 = abstractC9980Gmw.A07;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    if (abstractC9980Gmw.A0G == null) {
                        numberA0H = AbstractC9980Gmw.A0G(abstractC9980Gmw);
                        dA0E = numberA0H.doubleValue();
                    }
                    dA0E = AbstractC9980Gmw.A0A(abstractC9980Gmw);
                } else {
                    if ((i2 & 4) != 0) {
                        if (abstractC9980Gmw.A0G == null) {
                            numberA0H = AbstractC9980Gmw.A0H(abstractC9980Gmw);
                            dA0E = numberA0H.doubleValue();
                        }
                    } else if ((i2 & 2) != 0) {
                        dA0E = abstractC9980Gmw.A0C;
                    } else if ((i2 & 1) != 0) {
                        dA0E = abstractC9980Gmw.A08;
                    } else {
                        if ((i2 & 32) == 0) {
                            AbstractC9927GlO.A0D();
                            throw F60.createAndThrow();
                        }
                        if (abstractC9980Gmw.A0G == null) {
                            dA0E = AbstractC9980Gmw.A0E(abstractC9980Gmw);
                        }
                    }
                    dA0E = AbstractC9980Gmw.A0A(abstractC9980Gmw);
                }
                abstractC9980Gmw.A00 = dA0E;
                abstractC9980Gmw.A07 |= 8;
                return dA0E;
            }
        }
        return AbstractC9980Gmw.A0A(abstractC9980Gmw);
    }

    public final double A18() {
        return this instanceof AbstractC9922GlJ ? ((AbstractC9922GlJ) this).A00.A18() : A19();
    }

    public final float A1A() {
        float fA0A;
        Number numberA0H;
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1A();
        }
        if (this instanceof C9926GlN) {
            return C9926GlN.A0A((C9926GlN) this, false).floatValue();
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        int i = abstractC9980Gmw.A07;
        if ((i & 32) == 0) {
            if (i == 0) {
                AbstractC9980Gmw.A0I(abstractC9980Gmw, 32);
            }
            int i2 = abstractC9980Gmw.A07;
            if ((i2 & 32) == 0) {
                if ((i2 & 16) != 0) {
                    if (abstractC9980Gmw.A0G == null) {
                        numberA0H = AbstractC9980Gmw.A0G(abstractC9980Gmw);
                        fA0A = numberA0H.floatValue();
                    }
                    fA0A = AbstractC9980Gmw.A0E(abstractC9980Gmw);
                } else {
                    if ((i2 & 4) != 0) {
                        if (abstractC9980Gmw.A0G == null) {
                            numberA0H = AbstractC9980Gmw.A0H(abstractC9980Gmw);
                            fA0A = numberA0H.floatValue();
                        }
                    } else if ((i2 & 2) != 0) {
                        fA0A = abstractC9980Gmw.A0C;
                    } else if ((i2 & 1) != 0) {
                        fA0A = abstractC9980Gmw.A08;
                    } else {
                        if ((i2 & 8) == 0) {
                            AbstractC9927GlO.A0D();
                            throw F60.createAndThrow();
                        }
                        if (abstractC9980Gmw.A0G == null) {
                            fA0A = (float) AbstractC9980Gmw.A0A(abstractC9980Gmw);
                        }
                    }
                    fA0A = AbstractC9980Gmw.A0E(abstractC9980Gmw);
                }
                abstractC9980Gmw.A01 = fA0A;
                abstractC9980Gmw.A07 |= 32;
                return fA0A;
            }
        }
        return AbstractC9980Gmw.A0E(abstractC9980Gmw);
    }

    public final int A1B() {
        EnumC9834GiY enumC9834GiY;
        if (this instanceof AbstractC9922GlJ) {
            AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
            if (!(abstractC9922GlJ instanceof C9925GlM)) {
                return abstractC9922GlJ.A00.A1B();
            }
            enumC9834GiY = ((C9925GlM) abstractC9922GlJ).A01;
        } else {
            enumC9834GiY = ((AbstractC9927GlO) this).A00;
        }
        if (enumC9834GiY == null) {
            return 0;
        }
        return enumC9834GiY._id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r0 >= 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1C() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AbstractC9922GlJ
            if (r0 == 0) goto Ld
            X.GlJ r6 = (X.AbstractC9922GlJ) r6
            X.Gl7 r0 = r6.A00
            int r5 = r0.A1C()
        Lc:
            return r5
        Ld:
            boolean r0 = r6 instanceof X.C9926GlN
            if (r0 == 0) goto L94
            X.GlN r6 = (X.C9926GlN) r6
            r0 = 0
            java.lang.Number r2 = X.C9926GlN.A0A(r6, r0)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L8f
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L8f
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L8f
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L40
            long r3 = r2.longValue()
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lc
        L32:
            java.lang.String r1 = r6.A1c()
            X.GiY r0 = r6.A00
            r6.A2H(r0, r1)
        L3b:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L40:
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L58
            r1 = r2
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r0 = X.AbstractC9927GlO.A0A
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L32
            java.math.BigInteger r0 = X.AbstractC9927GlO.A08
            int r0 = r0.compareTo(r1)
        L55:
            if (r0 >= 0) goto L8f
            goto L32
        L58:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 != 0) goto L7a
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 != 0) goto L7a
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L76
            r1 = r2
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.math.BigDecimal r0 = X.AbstractC9927GlO.A06
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L32
            java.math.BigDecimal r0 = X.AbstractC9927GlO.A04
            int r0 = r0.compareTo(r1)
            goto L55
        L76:
            X.AbstractC9927GlO.A0D()
            goto L3b
        L7a:
            double r3 = r2.doubleValue()
            r1 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L32
            r1 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L32
            int r5 = (int) r3
            return r5
        L8f:
            int r5 = r2.intValue()
            return r5
        L94:
            X.Gmw r6 = (X.AbstractC9980Gmw) r6
            int r1 = r6.A07
            r0 = r1 & 1
            if (r0 != 0) goto La6
            if (r1 != 0) goto La3
            int r5 = r6.A2L()
            return r5
        La3:
            r6.A2V()
        La6:
            int r5 = r6.A08
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1C():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[PHI: r2 r3 r4
  0x004c: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:28:0x0040, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r3v1 X.GiY) = (r3v0 X.GiY), (r3v2 X.GiY) binds: [B:28:0x0040, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r4v6 X.Gmx) = (r4v15 X.Gmx), (r4v16 X.Gmx) binds: [B:28:0x0040, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1D() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C9926GlN
            if (r0 == 0) goto Lc
            java.lang.String r0 = r4.A1c()
            if (r0 != 0) goto L6e
        La:
            r0 = 0
            return r0
        Lc:
            boolean r0 = r4 instanceof X.C9982Gmy
            if (r0 == 0) goto L2f
            X.Gmy r4 = (X.C9982Gmy) r4
            X.GiY r3 = r4.A00
            r1 = 0
            if (r3 == 0) goto La
            int r2 = r3._id
            r0 = 5
            if (r2 == r0) goto L57
            r0 = 6
            if (r2 != r0) goto L4c
            boolean r0 = r4.A03
            if (r0 == 0) goto L28
            r4.A03 = r1
            X.C9982Gmy.A0u(r4)
        L28:
            X.Gn2 r0 = r4.A0R
            int r0 = r0.A05()
            return r0
        L2f:
            boolean r0 = r4 instanceof X.C9981Gmx
            if (r0 == 0) goto L5c
            X.Gmx r4 = (X.C9981Gmx) r4
            X.GiY r3 = r4.A00
            r1 = 0
            if (r3 == 0) goto La
            int r2 = r3._id
            r0 = 5
            if (r2 == r0) goto L57
            r0 = 6
            if (r2 != r0) goto L4c
            boolean r0 = r4.A04
            if (r0 == 0) goto L28
            r4.A04 = r1
            X.C9981Gmx.A0d(r4)
            goto L28
        L4c:
            r0 = 7
            if (r2 == r0) goto L28
            r0 = 8
            if (r2 == r0) goto L28
            char[] r0 = r3._serializedChars
            int r0 = r0.length
            return r0
        L57:
            X.Gnr r0 = r4.A0F
            java.lang.String r0 = r0.A05
            goto L6e
        L5c:
            X.GlJ r4 = (X.AbstractC9922GlJ) r4
            boolean r0 = r4 instanceof X.C9925GlM
            if (r0 == 0) goto L73
            X.GlM r4 = (X.C9925GlM) r4
            X.GiY r1 = r4.A01
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            if (r1 != r0) goto L73
            java.lang.String r0 = r4.A1a()
        L6e:
            int r0 = r0.length()
            return r0
        L73:
            X.Gl7 r0 = r4.A00
            int r0 = r0.A1D()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1D():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[PHI: r2 r3
  0x003e: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:21:0x0032, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r3v5 X.Gmx) = (r3v14 X.Gmx), (r3v15 X.Gmx) binds: [B:21:0x0032, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1E() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9926GlN
            if (r0 != 0) goto L54
            boolean r0 = r3 instanceof X.C9982Gmy
            if (r0 == 0) goto L24
            X.Gmy r3 = (X.C9982Gmy) r3
            X.GiY r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L54
            int r2 = r0._id
            r0 = 6
            if (r2 != r0) goto L3e
            boolean r0 = r3.A03
            if (r0 == 0) goto L1d
            r3.A03 = r1
            X.C9982Gmy.A0u(r3)
        L1d:
            X.Gn2 r0 = r3.A0R
            int r0 = r0.A02
            if (r0 < 0) goto L54
            return r0
        L24:
            boolean r0 = r3 instanceof X.C9981Gmx
            if (r0 == 0) goto L46
            X.Gmx r3 = (X.C9981Gmx) r3
            X.GiY r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L54
            int r2 = r0._id
            r0 = 6
            if (r2 != r0) goto L3e
            boolean r0 = r3.A04
            if (r0 == 0) goto L1d
            r3.A04 = r1
            X.C9981Gmx.A0d(r3)
            goto L1d
        L3e:
            r0 = 7
            if (r2 == r0) goto L1d
            r0 = 8
            if (r2 == r0) goto L1d
            goto L54
        L46:
            X.GlJ r3 = (X.AbstractC9922GlJ) r3
            boolean r0 = r3 instanceof X.C9925GlM
            if (r0 == 0) goto L56
            X.GlM r3 = (X.C9925GlM) r3
            X.GiY r1 = r3.A01
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            if (r1 != r0) goto L56
        L54:
            r0 = 0
            return r0
        L56:
            X.Gl7 r0 = r3.A00
            int r0 = r0.A1E()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1E():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x026a, code lost:
    
        r14 = r14 - r15;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0284, code lost:
    
        r8.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (r18._paddingReadBehaviour == X.HjV.PADDING_REQUIRED) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
    
        r14 = r13 - 1;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0294: INVOKE (r4v0 ?? I:X.Gn6), (r3 I:byte[]) VIRTUAL call: X.Gn6.A01(byte[]):void A[MD:(byte[]):void (m)] (LINE:660), block:B:153:0x0294 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0294: INVOKE (r4 I:X.Gn6), (r3 I:byte[]) VIRTUAL call: X.Gn6.A01(byte[]):void A[MD:(byte[]):void (m)] (LINE:660), block:B:153:0x0294 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c A[Catch: all -> 0x0293, PHI: r0
  0x011c: PHI (r0v16 int) = (r0v15 int), (r0v28 int) binds: [B:54:0x0103, B:59:0x010e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0293, blocks: (B:97:0x01e0, B:98:0x01e6, B:100:0x01ec, B:104:0x01fa, B:110:0x0208, B:146:0x0284, B:149:0x028b, B:115:0x0213, B:116:0x0218, B:118:0x021e, B:120:0x0224, B:124:0x022d, B:125:0x0231, B:127:0x023b, B:129:0x0245, B:82:0x0198, B:84:0x01a1, B:86:0x01a9, B:142:0x026d, B:68:0x0158, B:69:0x015a, B:80:0x018e, B:94:0x01bd, B:96:0x01dc, B:95:0x01c9, B:92:0x01b7, B:73:0x016c, B:75:0x0172, B:77:0x017a, B:79:0x0180, B:81:0x018f, B:71:0x0164, B:138:0x025c, B:141:0x026a, B:137:0x0257, B:26:0x0063, B:27:0x0068, B:29:0x0073, B:32:0x007d, B:147:0x0287, B:36:0x0086, B:37:0x008b, B:39:0x0099, B:40:0x009d, B:63:0x0134, B:45:0x00bc, B:47:0x00c4, B:49:0x00cf, B:51:0x00d5, B:52:0x00e5, B:53:0x00ef, B:66:0x0144, B:58:0x010a, B:60:0x0110, B:62:0x012f, B:61:0x011c), top: B:157:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1F(X.Gn1 r18, java.io.OutputStream r19) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1F(X.Gn1, java.io.OutputStream):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r0 >= 0) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.Gmw] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Gl7, X.GlO] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.GlN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A1G() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1G():long");
    }

    public final long A1H() {
        String strTrim;
        int length;
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1H();
        }
        AbstractC9927GlO abstractC9927GlO = (AbstractC9927GlO) this;
        EnumC9834GiY enumC9834GiY = abstractC9927GlO.A00;
        if (enumC9834GiY == EnumC9834GiY.VALUE_NUMBER_INT || enumC9834GiY == EnumC9834GiY.VALUE_NUMBER_FLOAT) {
            return abstractC9927GlO.A1G();
        }
        if (enumC9834GiY == null) {
            return 0L;
        }
        int i = enumC9834GiY._id;
        if (i != 6) {
            switch (i) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                default:
                    return 0L;
                case 12:
                    Object objA1V = abstractC9927GlO.A1V();
                    if (objA1V instanceof Number) {
                        return C3cG.A05(objA1V);
                    }
                    return 0L;
            }
        }
        String strA1c = abstractC9927GlO.A1c();
        if (HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strA1c)) {
            return 0L;
        }
        Pattern pattern = HlV.A03;
        if (strA1c == null || (length = (strTrim = strA1c.trim()).length()) == 0) {
            return 0L;
        }
        int i2 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            try {
                char cCharAt2 = strTrim.charAt(i2);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    return (long) Double.longBitsToDouble(Htt.A01.A00(strTrim, strTrim.length()));
                }
                i2++;
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return Long.parseLong(strTrim);
    }

    public final C9516GMj A1I() {
        long j;
        int i;
        long j2;
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1I();
        }
        if (this instanceof C9926GlN) {
            C9516GMj c9516GMj = ((C9926GlN) this).A01;
            return c9516GMj == null ? C9516GMj.A01 : c9516GMj;
        }
        boolean z = this instanceof C9982Gmy;
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        int i2 = abstractC9980Gmw.A05;
        int i3 = (i2 - abstractC9980Gmw.A03) + 1;
        C9517GMk c9517GMkA2Q = abstractC9980Gmw.A2Q();
        long j3 = abstractC9980Gmw.A0B;
        long j4 = i2;
        if (z) {
            j2 = j3 + j4;
            j = -1;
            i = abstractC9980Gmw.A02;
        } else {
            j = j4 + j3;
            i = abstractC9980Gmw.A02;
            j2 = -1;
        }
        return new C9516GMj(c9517GMkA2Q, i, i3, j2, j);
    }

    public final C9516GMj A1J() {
        C9517GMk c9517GMkA2Q;
        long j;
        int i;
        int i2;
        long j2;
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1J();
        }
        if (this instanceof C9926GlN) {
            C9516GMj c9516GMj = ((C9926GlN) this).A01;
            return c9516GMj == null ? C9516GMj.A01 : c9516GMj;
        }
        if (this instanceof C9982Gmy) {
            C9982Gmy c9982Gmy = (C9982Gmy) this;
            if (((AbstractC9927GlO) c9982Gmy).A00 != EnumC9834GiY.FIELD_NAME) {
                return new C9516GMj(c9982Gmy.A2Q(), c9982Gmy.A0A, c9982Gmy.A09, c9982Gmy.A0D - 1, -1L);
            }
            j2 = c9982Gmy.A0B + (c9982Gmy.A01 - 1);
            c9517GMkA2Q = c9982Gmy.A2Q();
            i = c9982Gmy.A02;
            i2 = c9982Gmy.A00;
            j = -1;
        } else {
            C9981Gmx c9981Gmx = (C9981Gmx) this;
            if (((AbstractC9927GlO) c9981Gmx).A00 == EnumC9834GiY.FIELD_NAME) {
                j = c9981Gmx.A0B + (c9981Gmx.A02 - 1);
                c9517GMkA2Q = c9981Gmx.A2Q();
                i = c9981Gmx.A01;
                i2 = c9981Gmx.A00;
            } else {
                c9517GMkA2Q = c9981Gmx.A2Q();
                j = c9981Gmx.A0D - 1;
                i = c9981Gmx.A0A;
                i2 = c9981Gmx.A09;
            }
            j2 = -1;
        }
        return new C9516GMj(c9517GMkA2Q, i, i2, j2, j);
    }

    @Deprecated
    public final C9516GMj A1K() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1K();
        }
        if (!(this instanceof C9926GlN)) {
            return A1I();
        }
        C9516GMj c9516GMj = ((C9926GlN) this).A01;
        return c9516GMj == null ? C9516GMj.A01 : c9516GMj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r3.A00 == X.EnumC9834GiY.VALUE_NUMBER_FLOAT) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if ((r1 & 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        if ((r1 & 32) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC10067Goo A1L() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AbstractC9922GlJ
            if (r0 == 0) goto Ld
            X.GlJ r3 = (X.AbstractC9922GlJ) r3
            X.Gl7 r0 = r3.A00
            X.Goo r0 = r0.A1L()
            return r0
        Ld:
            boolean r0 = r3 instanceof X.C9926GlN
            if (r0 == 0) goto L40
            X.GlO r3 = (X.AbstractC9927GlO) r3
            java.lang.Object r1 = r3.A1X()
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L6d
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L5a
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 != 0) goto L70
            boolean r0 = r1 instanceof java.math.BigDecimal
            if (r0 != 0) goto L3d
            boolean r0 = r1 instanceof java.math.BigInteger
            if (r0 != 0) goto L6a
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L65
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L6d
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L68
            X.GiY r1 = r3.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            if (r1 != r0) goto L6a
        L3d:
            X.Goo r0 = X.EnumC10067Goo.BIG_DECIMAL
            return r0
        L40:
            X.Gmw r3 = (X.AbstractC9980Gmw) r3
            int r0 = r3.A07
            if (r0 != 0) goto L4a
            r0 = 0
            X.AbstractC9980Gmw.A0I(r3, r0)
        L4a:
            X.GiY r2 = r3.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_INT
            int r1 = r3.A07
            if (r2 != r0) goto L5d
            r0 = r1 & 1
            if (r0 != 0) goto L6d
            r0 = r1 & 2
            if (r0 == 0) goto L6a
        L5a:
            X.Goo r0 = X.EnumC10067Goo.LONG
            return r0
        L5d:
            r0 = r1 & 16
            if (r0 != 0) goto L3d
            r0 = r1 & 32
            if (r0 == 0) goto L70
        L65:
            X.Goo r0 = X.EnumC10067Goo.FLOAT
            return r0
        L68:
            r0 = 0
            return r0
        L6a:
            X.Goo r0 = X.EnumC10067Goo.BIG_INTEGER
            return r0
        L6d:
            X.Goo r0 = X.EnumC10067Goo.INT
            return r0
        L70:
            X.Goo r0 = X.EnumC10067Goo.DOUBLE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1L():X.Goo");
    }

    public final AbstractC10020Gns A1M() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return this instanceof C9926GlN ? ((C9926GlN) this).A04 : ((AbstractC9980Gmw) this).A0F;
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        if (!(abstractC9922GlJ instanceof C9925GlM)) {
            return abstractC9922GlJ.A00.A1M();
        }
        C9925GlM c9925GlM = (C9925GlM) abstractC9922GlJ;
        C10001GnX c10001GnX = c9925GlM.A04;
        return c10001GnX == null ? c9925GlM.A05 : c10001GnX;
    }

    public final EnumC9834GiY A1N() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return ((AbstractC9927GlO) this).A00;
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        return abstractC9922GlJ instanceof C9925GlM ? ((C9925GlM) abstractC9922GlJ).A01 : abstractC9922GlJ.A00.A1N();
    }

    public final EnumC9834GiY A1O() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return ((AbstractC9927GlO) this).A00;
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        return abstractC9922GlJ instanceof C9925GlM ? ((C9925GlM) abstractC9922GlJ).A01 : abstractC9922GlJ.A00.A1O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0217, code lost:
    
        if (r2 == 125) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0398, code lost:
    
        if (r2 != 5) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x039a, code lost:
    
        r1 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x039e, code lost:
    
        if (r1 == X.Gr0.A00) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03a0, code lost:
    
        if (r1 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x03a2, code lost:
    
        r9.A05.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03a9, code lost:
    
        if (r9.A00 != 0) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x03ab, code lost:
    
        r9.A00 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x03f3, code lost:
    
        if (r3 != X.C79.A01) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x03f5, code lost:
    
        r6 = X.C9925GlM.A0A(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03f9, code lost:
    
        if (r6 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x03fc, code lost:
    
        if (r1 != null) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x03fe, code lost:
    
        r3.A1P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0419, code lost:
    
        if (r1 == 4) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x041c, code lost:
    
        if (r1 == 5) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0420, code lost:
    
        r3 = ((X.AbstractC9922GlJ) r9).A00;
        r0 = r3.A1a();
        r2 = r9.A05;
        r2.A01 = r0;
        r2.A02 = true;
        r1 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0430, code lost:
    
        if (r1 != X.Gr0.A00) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0432, code lost:
    
        r9.A02 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0489, code lost:
    
        r9.A02 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x048f, code lost:
    
        if (r9.A06 == X.C79.A00) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0493, code lost:
    
        r0 = r9.A05.A06(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:242:0x038e, B:266:0x03d4], limit reached: 347 */
    /* JADX WARN: Path cross not found for [B:249:0x039a, B:295:0x0420], limit reached: 347 */
    /* JADX WARN: Path cross not found for [B:276:0x03f5, B:351:?], limit reached: 347 */
    /* JADX WARN: Path cross not found for [B:301:0x0446, B:286:0x0412], limit reached: 347 */
    /* JADX WARN: Path cross not found for [B:351:?, B:276:0x03f5], limit reached: 347 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x03ad A[EDGE_INSN: B:337:0x03ad->B:255:0x03ad BREAK  A[LOOP:3: B:282:0x0406->B:349:0x0406], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e A[PHI: r2
  0x010e: PHI (r2v15 int) = (r2v14 int), (r2v19 int) binds: [B:60:0x00ef, B:67:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.Gl7, X.GlO, X.Gmw, X.Gmx] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.GlO] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.Gl7, X.GlO, X.Gmw, X.Gmy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x0401 -> B:282:0x0406). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x041c -> B:249:0x039a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:299:0x0442 -> B:282:0x0406). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x048f -> B:282:0x0406). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC9834GiY A1P() {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1P():X.GiY");
    }

    public final AbstractC9794GhC A1Q() {
        return this instanceof AbstractC9922GlJ ? ((AbstractC9922GlJ) this).A00.A1Q() : this instanceof C9926GlN ? ((C9926GlN) this).A02 : ((AbstractC9988GnE) this).A00;
    }

    public final C10002GnY A1R() {
        return this instanceof AbstractC9922GlJ ? ((AbstractC9922GlJ) this).A00.A1R() : ((AbstractC9927GlO) this).A02;
    }

    public final C10037GoH<EnumC10051GoV> A1S() {
        return this instanceof AbstractC9922GlJ ? ((AbstractC9922GlJ) this).A00.A1S() : this instanceof C9926GlN ? A01 : AbstractC9980Gmw.A0S;
    }

    public final Integer A1T() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1T();
        }
        if (this instanceof C9926GlN) {
            C9926GlN c9926GlN = (C9926GlN) this;
            if (((AbstractC9927GlO) c9926GlN).A00 == EnumC9834GiY.VALUE_NUMBER_FLOAT) {
                Object objA05 = A05(c9926GlN);
                if (objA05 instanceof Double) {
                    return C79.A0C;
                }
                if (objA05 instanceof BigDecimal) {
                    return C79.A0K;
                }
                if (objA05 instanceof Float) {
                    return C79.A01;
                }
            }
        }
        return C79.A0P;
    }

    public final Number A1U() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1U();
        }
        if (this instanceof C9926GlN) {
            return C9926GlN.A0A((C9926GlN) this, false);
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        if (abstractC9980Gmw.A07 == 0) {
            AbstractC9980Gmw.A0I(abstractC9980Gmw, 0);
        }
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) abstractC9980Gmw).A00;
        EnumC9834GiY enumC9834GiY2 = EnumC9834GiY.VALUE_NUMBER_INT;
        int i = abstractC9980Gmw.A07;
        if (enumC9834GiY == enumC9834GiY2) {
            if ((i & 1) != 0) {
                return Integer.valueOf(abstractC9980Gmw.A08);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(abstractC9980Gmw.A0C);
            }
            if ((i & 4) != 0) {
                return AbstractC9980Gmw.A0H(abstractC9980Gmw);
            }
        } else {
            if ((i & 16) != 0) {
                return AbstractC9980Gmw.A0G(abstractC9980Gmw);
            }
            if ((i & 32) != 0) {
                return Float.valueOf(AbstractC9980Gmw.A0E(abstractC9980Gmw));
            }
            if ((i & 8) != 0) {
                return Double.valueOf(AbstractC9980Gmw.A0A(abstractC9980Gmw));
            }
        }
        AbstractC9927GlO.A0D();
        throw F60.createAndThrow();
    }

    public final Object A1V() {
        if (!(this instanceof C9926GlN)) {
            if (this instanceof AbstractC9922GlJ) {
                return ((AbstractC9922GlJ) this).A00.A1V();
            }
            return null;
        }
        C9926GlN c9926GlN = (C9926GlN) this;
        if (((AbstractC9927GlO) c9926GlN).A00 == EnumC9834GiY.VALUE_EMBEDDED_OBJECT) {
            return A05(c9926GlN);
        }
        return null;
    }

    public final Object A1W() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1W();
        }
        if (this instanceof C9981Gmx) {
            return ((C9981Gmx) this).A03;
        }
        return null;
    }

    public final Object A1X() throws JsonParseException {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1X();
        }
        if (this instanceof C9926GlN) {
            C9926GlN c9926GlN = (C9926GlN) this;
            BigDecimal bigDecimal = AbstractC9927GlO.A04;
            EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) c9926GlN).A00;
            if (enumC9834GiY == null || !enumC9834GiY._isNumber) {
                throw A03(c9926GlN, AnonymousClass001.A0v(") not numeric, cannot use numeric value accessors", C3cG.A0f(enumC9834GiY, "Current token (")));
            }
            return A05(c9926GlN);
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        EnumC9834GiY enumC9834GiY2 = ((AbstractC9927GlO) abstractC9980Gmw).A00;
        if (enumC9834GiY2 != EnumC9834GiY.VALUE_NUMBER_INT) {
            if (enumC9834GiY2 != EnumC9834GiY.VALUE_NUMBER_FLOAT) {
                return abstractC9980Gmw.A1U();
            }
            int i = abstractC9980Gmw.A07;
            return (i & 16) != 0 ? AbstractC9980Gmw.A0G(abstractC9980Gmw) : (i & 8) != 0 ? Double.valueOf(AbstractC9980Gmw.A0A(abstractC9980Gmw)) : (i & 32) != 0 ? Float.valueOf(AbstractC9980Gmw.A0E(abstractC9980Gmw)) : abstractC9980Gmw.A0R.A07();
        }
        if (abstractC9980Gmw.A07 == 0) {
            AbstractC9980Gmw.A0I(abstractC9980Gmw, 0);
        }
        int i2 = abstractC9980Gmw.A07;
        if ((i2 & 1) != 0) {
            return Integer.valueOf(abstractC9980Gmw.A08);
        }
        if ((i2 & 2) != 0) {
            return Long.valueOf(abstractC9980Gmw.A0C);
        }
        if ((i2 & 4) == 0) {
            AbstractC9927GlO.A0D();
            throw F60.createAndThrow();
        }
        BigInteger bigInteger = abstractC9980Gmw.A0I;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = abstractC9980Gmw.A0G;
        return str == null ? AbstractC9980Gmw.A0H(abstractC9980Gmw) : str;
    }

    public final Object A1Y() {
        if (!(this instanceof C9926GlN)) {
            if (this instanceof AbstractC9922GlJ) {
                return ((AbstractC9922GlJ) this).A00.A1Y();
            }
            return null;
        }
        C9926GlN c9926GlN = (C9926GlN) this;
        C9997GnR c9997GnR = c9926GlN.A03;
        int i = c9926GlN.A00;
        TreeMap<Integer, Object> treeMap = c9997GnR.A02;
        if (treeMap != null) {
            return BV7.A0r(treeMap, i + i + 1);
        }
        return null;
    }

    public final Object A1Z() {
        if (!(this instanceof C9926GlN)) {
            if (this instanceof AbstractC9922GlJ) {
                return ((AbstractC9922GlJ) this).A00.A1Z();
            }
            return null;
        }
        C9926GlN c9926GlN = (C9926GlN) this;
        C9997GnR c9997GnR = c9926GlN.A03;
        int i = c9926GlN.A00;
        TreeMap<Integer, Object> treeMap = c9997GnR.A02;
        if (treeMap != null) {
            return BV7.A0r(treeMap, i + i);
        }
        return null;
    }

    public final String A1a() {
        if (this instanceof C9926GlN) {
            C9926GlN c9926GlN = (C9926GlN) this;
            EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) c9926GlN).A00;
            return (enumC9834GiY == EnumC9834GiY.START_OBJECT || enumC9834GiY == EnumC9834GiY.START_ARRAY) ? c9926GlN.A04.A03.A02() : c9926GlN.A04.A01;
        }
        if (!(this instanceof AbstractC9922GlJ)) {
            return A1b();
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        if (!(abstractC9922GlJ instanceof C9925GlM)) {
            return abstractC9922GlJ.A00.A1a();
        }
        C9925GlM c9925GlM = (C9925GlM) abstractC9922GlJ;
        C10001GnX c10001GnX = c9925GlM.A04;
        if (c10001GnX == null) {
            c10001GnX = c9925GlM.A05;
        }
        EnumC9834GiY enumC9834GiY2 = c9925GlM.A01;
        if (enumC9834GiY2 != EnumC9834GiY.START_OBJECT && enumC9834GiY2 != EnumC9834GiY.START_ARRAY) {
            return c10001GnX.A01;
        }
        C10001GnX c10001GnX2 = c10001GnX.A05;
        if (c10001GnX2 == null) {
            return null;
        }
        return c10001GnX2.A02();
    }

    @Deprecated
    public final String A1b() {
        C10019Gnr c10019Gnr;
        if (!(this instanceof AbstractC9922GlJ)) {
            if (this instanceof C9926GlN) {
                return A1a();
            }
            AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
            EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) abstractC9980Gmw).A00;
            if ((enumC9834GiY != EnumC9834GiY.START_OBJECT && enumC9834GiY != EnumC9834GiY.START_ARRAY) || (c10019Gnr = abstractC9980Gmw.A0F.A06) == null) {
                c10019Gnr = abstractC9980Gmw.A0F;
            }
            return c10019Gnr.A05;
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        if (!(abstractC9922GlJ instanceof C9925GlM)) {
            return abstractC9922GlJ.A00.A1b();
        }
        C9925GlM c9925GlM = (C9925GlM) abstractC9922GlJ;
        C10001GnX c10001GnX = c9925GlM.A04;
        if (c10001GnX == null) {
            c10001GnX = c9925GlM.A05;
        }
        EnumC9834GiY enumC9834GiY2 = c9925GlM.A01;
        if (enumC9834GiY2 != EnumC9834GiY.START_OBJECT && enumC9834GiY2 != EnumC9834GiY.START_ARRAY) {
            return c10001GnX.A01;
        }
        C10001GnX c10001GnX2 = c10001GnX.A05;
        if (c10001GnX2 == null) {
            return null;
        }
        return c10001GnX2.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        if (r1 != 8) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[PHI: r2 r3
  0x0056: PHI (r2v1 X.GiY) = (r2v0 X.GiY), (r2v2 X.GiY) binds: [B:26:0x0043, B:18:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r3v5 X.Gmx) = (r3v15 X.Gmx), (r3v16 X.Gmx) binds: [B:26:0x0043, B:18:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A1c() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9926GlN
            if (r0 == 0) goto L21
            X.GlN r3 = (X.C9926GlN) r3
            X.GiY r2 = r3.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r2 == r0) goto L68
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            if (r2 == r0) goto L68
            if (r2 == 0) goto L85
            int r1 = r2.ordinal()
            r0 = 8
            if (r1 == r0) goto L73
            r0 = 9
            if (r1 == r0) goto L73
        L1e:
            java.lang.String r1 = r2._serialized
            return r1
        L21:
            boolean r0 = r3 instanceof X.C9982Gmy
            if (r0 == 0) goto L39
            X.Gmy r3 = (X.C9982Gmy) r3
            X.GiY r2 = r3.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r2 != r0) goto L56
            boolean r0 = r3.A03
            if (r0 == 0) goto L4f
            r0 = 0
            r3.A03 = r0
            java.lang.String r1 = X.C9982Gmy.A0e(r3)
            return r1
        L39:
            boolean r0 = r3 instanceof X.C9981Gmx
            if (r0 == 0) goto L87
            X.Gmx r3 = (X.C9981Gmx) r3
            X.GiY r2 = r3.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r2 != r0) goto L56
            boolean r0 = r3.A04
            if (r0 == 0) goto L4f
            r0 = 0
            r3.A04 = r0
            X.C9981Gmx.A0d(r3)
        L4f:
            X.Gn2 r0 = r3.A0R
            java.lang.String r1 = r0.A07()
            return r1
        L56:
            if (r2 == 0) goto L85
            int r1 = r2._id
            r0 = 5
            if (r1 == r0) goto L80
            r0 = 6
            if (r1 == r0) goto L4f
            r0 = 7
            if (r1 == r0) goto L4f
            r0 = 8
            if (r1 == r0) goto L4f
            goto L1e
        L68:
            java.lang.Object r1 = A05(r3)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L77
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L73:
            java.lang.Object r1 = A05(r3)
        L77:
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            if (r1 == 0) goto L85
            java.lang.String r1 = r1.toString()
            return r1
        L80:
            X.Gnr r0 = r3.A0F
            java.lang.String r1 = r0.A05
            return r1
        L85:
            r1 = 0
            return r1
        L87:
            X.GlJ r3 = (X.AbstractC9922GlJ) r3
            boolean r0 = r3 instanceof X.C9925GlM
            if (r0 == 0) goto L9a
            X.GlM r3 = (X.C9925GlM) r3
            X.GiY r1 = r3.A01
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            if (r1 != r0) goto L9a
            java.lang.String r1 = r3.A1a()
            return r1
        L9a:
            X.Gl7 r0 = r3.A00
            java.lang.String r1 = r0.A1c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1c():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r1 == X.EnumC9834GiY.FIELD_NAME) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0242 A[PHI: r2 r9
  0x0242: PHI (r2v9 java.lang.String) = (r2v5 java.lang.String), (r2v12 java.lang.String) binds: [B:116:0x01c3, B:143:0x021f] A[DONT_GENERATE, DONT_INLINE]
  0x0242: PHI (r9v4 X.Gmx) = (r9v29 X.Gmx), (r9v30 X.Gmx) binds: [B:116:0x01c3, B:143:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0257 A[PHI: r2 r9
  0x0257: PHI (r2v8 java.lang.String) = (r2v5 java.lang.String), (r2v12 java.lang.String) binds: [B:108:0x01b3, B:135:0x020f] A[DONT_GENERATE, DONT_INLINE]
  0x0257: PHI (r9v3 X.Gmx) = (r9v31 X.Gmx), (r9v32 X.Gmx) binds: [B:108:0x01b3, B:135:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0297  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.GiY, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.Gl7, X.GlO, X.Gmw, X.Gmy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.Gl7] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A1d() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1d():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Gl7] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.GlO, X.Gmw, X.Gmy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A1e() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C9982Gmy
            if (r0 == 0) goto L26
            X.Gmy r4 = (X.C9982Gmy) r4
            X.GiY r1 = r4.A00
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            r3 = 0
            if (r1 != r0) goto L5b
            r2 = 0
            r4.A0K = r2
            X.GiY r1 = r4.A0E
            r4.A0E = r3
            r4.A2F(r1)
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r1 != r0) goto L68
            boolean r0 = r4.A03
            if (r0 == 0) goto L4a
            r4.A03 = r2
            java.lang.String r3 = X.C9982Gmy.A0e(r4)
        L25:
            return r3
        L26:
            boolean r0 = r4 instanceof X.C9981Gmx
            if (r0 == 0) goto L51
            X.Gmx r4 = (X.C9981Gmx) r4
            X.GiY r1 = r4.A00
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            r3 = 0
            if (r1 != r0) goto L5b
            r2 = 0
            r4.A0K = r2
            X.GiY r1 = r4.A0E
            r4.A0E = r3
            r4.A2F(r1)
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r1 != r0) goto L6c
            boolean r0 = r4.A04
            if (r0 == 0) goto L4a
            r4.A04 = r2
            X.C9981Gmx.A0d(r4)
        L4a:
            X.Gn2 r0 = r4.A0R
            java.lang.String r3 = r0.A07()
            return r3
        L51:
            X.GiY r1 = r4.A1P()
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r1 == r0) goto L63
            r3 = 0
            return r3
        L5b:
            X.GiY r1 = r4.A1P()
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            if (r1 != r0) goto L25
        L63:
            java.lang.String r3 = r4.A1c()
            return r3
        L68:
            A08(r4, r1)
            return r3
        L6c:
            A08(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1e():java.lang.String");
    }

    public final BigDecimal A1f() {
        long j;
        BigDecimal bigDecimalValueOf;
        long jLongValue;
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1f();
        }
        if (this instanceof C9926GlN) {
            Number numberA0A = C9926GlN.A0A((C9926GlN) this, true);
            if (numberA0A instanceof BigDecimal) {
                return (BigDecimal) numberA0A;
            }
            if (numberA0A instanceof Integer) {
                jLongValue = numberA0A.intValue();
            } else {
                if (!(numberA0A instanceof Long)) {
                    return numberA0A instanceof BigInteger ? new BigDecimal((BigInteger) numberA0A) : BigDecimal.valueOf(numberA0A.doubleValue());
                }
                jLongValue = numberA0A.longValue();
            }
            return BigDecimal.valueOf(jLongValue);
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        int i = abstractC9980Gmw.A07;
        if ((i & 16) == 0) {
            if (i == 0) {
                AbstractC9980Gmw.A0I(abstractC9980Gmw, 16);
            }
            int i2 = abstractC9980Gmw.A07;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String strA1c = abstractC9980Gmw.A0G;
                    if (strA1c == null) {
                        strA1c = abstractC9980Gmw.A1c();
                    }
                    bigDecimalValueOf = HlV.A09(strA1c, abstractC9980Gmw.A23(EnumC10013Gnl.A01));
                } else if ((i2 & 4) != 0) {
                    bigDecimalValueOf = new BigDecimal(AbstractC9980Gmw.A0H(abstractC9980Gmw));
                } else {
                    if ((i2 & 2) != 0) {
                        j = abstractC9980Gmw.A0C;
                    } else {
                        if ((i2 & 1) == 0) {
                            AbstractC9927GlO.A0D();
                            throw F60.createAndThrow();
                        }
                        j = abstractC9980Gmw.A08;
                    }
                    bigDecimalValueOf = BigDecimal.valueOf(j);
                }
                abstractC9980Gmw.A0H = bigDecimalValueOf;
                abstractC9980Gmw.A07 |= 16;
                return bigDecimalValueOf;
            }
        }
        return AbstractC9980Gmw.A0G(abstractC9980Gmw);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigInteger A1g() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AbstractC9922GlJ
            if (r0 == 0) goto Ld
            X.GlJ r3 = (X.AbstractC9922GlJ) r3
            X.Gl7 r0 = r3.A00
            java.math.BigInteger r2 = r0.A1g()
            return r2
        Ld:
            boolean r0 = r3 instanceof X.C9926GlN
            if (r0 == 0) goto L3c
            X.GlN r3 = (X.C9926GlN) r3
            r0 = 1
            java.lang.Number r2 = X.C9926GlN.A0A(r3, r0)
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L1f
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            return r2
        L1f:
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L33
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            X.GnY r1 = r3.A02
            int r0 = r2.scale()
            r1.A01(r0)
            java.math.BigInteger r2 = r2.toBigInteger()
            return r2
        L33:
            long r0 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            return r2
        L3c:
            X.Gmw r3 = (X.AbstractC9980Gmw) r3
            int r1 = r3.A07
            r0 = r1 & 4
            if (r0 != 0) goto L9a
            r0 = 4
            if (r1 != 0) goto L4a
            X.AbstractC9980Gmw.A0I(r3, r0)
        L4a:
            int r1 = r3.A07
            r0 = r1 & 4
            if (r0 != 0) goto L9a
            r0 = r1 & 16
            if (r0 != 0) goto L80
            r0 = r1 & 2
            if (r0 == 0) goto L67
            long r0 = r3.A0C
        L5a:
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
        L5e:
            r3.A0I = r2
            int r0 = r3.A07
            r0 = r0 | 4
            r3.A07 = r0
            return r2
        L67:
            r0 = r1 & 1
            if (r0 == 0) goto L6f
            int r0 = r3.A08
            long r0 = (long) r0
            goto L5a
        L6f:
            r0 = r1 & 8
            if (r0 == 0) goto L92
            java.lang.String r0 = r3.A0G
            if (r0 != 0) goto L80
            double r0 = X.AbstractC9980Gmw.A0A(r3)
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            goto L84
        L80:
            java.math.BigDecimal r2 = X.AbstractC9980Gmw.A0G(r3)
        L84:
            X.GnY r1 = r3.A02
            int r0 = r2.scale()
            r1.A01(r0)
            java.math.BigInteger r2 = r2.toBigInteger()
            goto L5e
        L92:
            X.AbstractC9927GlO.A0D()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L9a:
            java.math.BigInteger r2 = X.AbstractC9980Gmw.A0H(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1g():java.math.BigInteger");
    }

    public final short A1h() throws InputCoercionException {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1h();
        }
        int iA1C = A1C();
        if (iA1C >= -32768 && iA1C <= 32767) {
            return (short) iA1C;
        }
        throw new InputCoercionException(this, EnumC9834GiY.VALUE_NUMBER_INT, Short.TYPE, String.format("Numeric value (%s) out of range of Java short", A1c()));
    }

    public final void A1i() {
        if (!(this instanceof AbstractC9922GlJ)) {
            AbstractC9927GlO abstractC9927GlO = (AbstractC9927GlO) this;
            if (abstractC9927GlO.A00 != null) {
                abstractC9927GlO.A00 = null;
                return;
            }
            return;
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        if (!(abstractC9922GlJ instanceof C9925GlM)) {
            abstractC9922GlJ.A00.A1i();
            return;
        }
        C9925GlM c9925GlM = (C9925GlM) abstractC9922GlJ;
        if (c9925GlM.A01 != null) {
            c9925GlM.A01 = null;
        }
    }

    public final void A1j() {
        if (this instanceof C10014Gnm) {
            AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
            EnumC9834GiY enumC9834GiYA1N = abstractC9922GlJ.A00.A1N();
            if (enumC9834GiYA1N != EnumC9834GiY.START_OBJECT && enumC9834GiYA1N != EnumC9834GiY.START_ARRAY) {
                return;
            }
            int i = 1;
            while (true) {
                EnumC9834GiY enumC9834GiYA1P = abstractC9922GlJ.A1P();
                if (enumC9834GiYA1P == null) {
                    return;
                }
                if (enumC9834GiYA1P._isStructStart) {
                    i++;
                } else if (enumC9834GiYA1P._isStructEnd && i - 1 == 0) {
                    return;
                }
            }
        } else if (this instanceof C9925GlM) {
            C9925GlM c9925GlM = (C9925GlM) this;
            EnumC9834GiY enumC9834GiY = c9925GlM.A01;
            if (enumC9834GiY != EnumC9834GiY.START_OBJECT && enumC9834GiY != EnumC9834GiY.START_ARRAY) {
                return;
            }
            int i2 = 1;
            while (true) {
                EnumC9834GiY enumC9834GiYA1P2 = c9925GlM.A1P();
                if (enumC9834GiYA1P2 == null) {
                    return;
                }
                if (enumC9834GiYA1P2._isStructStart) {
                    i2++;
                } else if (enumC9834GiYA1P2._isStructEnd && i2 - 1 == 0) {
                    return;
                }
            }
        } else {
            AbstractC9927GlO abstractC9927GlO = (AbstractC9927GlO) this;
            EnumC9834GiY enumC9834GiY2 = abstractC9927GlO.A00;
            if (enumC9834GiY2 != EnumC9834GiY.START_OBJECT && enumC9834GiY2 != EnumC9834GiY.START_ARRAY) {
                return;
            }
            int i3 = 1;
            while (true) {
                EnumC9834GiY enumC9834GiYA1P3 = abstractC9927GlO.A1P();
                if (enumC9834GiYA1P3 == null) {
                    abstractC9927GlO.A2A();
                    return;
                }
                if (enumC9834GiYA1P3._isStructStart) {
                    i3++;
                } else if (enumC9834GiYA1P3._isStructEnd) {
                    i3--;
                    if (i3 == 0) {
                        return;
                    }
                } else if (enumC9834GiYA1P3 == EnumC9834GiY.NOT_AVAILABLE) {
                    throw A03(abstractC9927GlO, String.format("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", C60Q.A0e(abstractC9927GlO)));
                }
            }
        }
    }

    public final void A1l(int i, int i2) {
        if (this instanceof AbstractC9922GlJ) {
            ((AbstractC9922GlJ) this).A00.A1l(i, i2);
            return;
        }
        if (!(this instanceof AbstractC9980Gmw)) {
            A1k((i & i2) | (this.A00 & (i2 ^ (-1))));
            return;
        }
        AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
        int i3 = ((AbstractC9916Gl7) abstractC9980Gmw).A00;
        int i4 = (i & i2) | ((i2 ^ (-1)) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            ((AbstractC9916Gl7) abstractC9980Gmw).A00 = i4;
            AbstractC9980Gmw.A0J(abstractC9980Gmw, i4, i5);
        }
    }

    public final void A1m(AbstractC9794GhC abstractC9794GhC) {
        if (this instanceof AbstractC9922GlJ) {
            ((AbstractC9922GlJ) this).A00.A1m(abstractC9794GhC);
        } else if (this instanceof C9926GlN) {
            ((C9926GlN) this).A02 = abstractC9794GhC;
        } else {
            ((AbstractC9988GnE) this).A00 = abstractC9794GhC;
        }
    }

    public final void A1n(Writer writer) throws IOException {
        if (this instanceof C9981Gmx) {
            C9981Gmx c9981Gmx = (C9981Gmx) this;
            int i = ((AbstractC9980Gmw) c9981Gmx).A04;
            int i2 = ((AbstractC9980Gmw) c9981Gmx).A05;
            int i3 = i - i2;
            if (i3 >= 1) {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i2 + i3;
                writer.write(c9981Gmx.A05, i2, i3);
            }
        }
    }

    public final void A1o(Object obj) {
        C10019Gnr c10019Gnr;
        if (this instanceof AbstractC9922GlJ) {
            ((AbstractC9922GlJ) this).A00.A1o(obj);
            return;
        }
        if (this instanceof AbstractC9980Gmw) {
            c10019Gnr = ((AbstractC9980Gmw) this).A0F;
        } else {
            AbstractC10020Gns abstractC10020GnsA1M = A1M();
            if (abstractC10020GnsA1M == null) {
                return;
            }
            if (abstractC10020GnsA1M instanceof C10038GoI) {
                ((C10038GoI) abstractC10020GnsA1M).A00 = obj;
                return;
            } else if (abstractC10020GnsA1M instanceof C10018Gnq) {
                ((C10018Gnq) abstractC10020GnsA1M).A01 = obj;
                return;
            } else if (!(abstractC10020GnsA1M instanceof C10019Gnr)) {
                return;
            } else {
                c10019Gnr = (C10019Gnr) abstractC10020GnsA1M;
            }
        }
        c10019Gnr.A04 = obj;
    }

    public final boolean A1p() {
        if (this instanceof C9926GlN) {
            return ((C9926GlN) this).A06;
        }
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1p();
        }
        return false;
    }

    public final boolean A1q() {
        if (this instanceof C9926GlN) {
            return ((C9926GlN) this).A07;
        }
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1q();
        }
        return false;
    }

    public final boolean A1r() throws JsonParseException {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A1r();
        }
        EnumC9834GiY enumC9834GiYA1N = A1N();
        if (enumC9834GiYA1N == EnumC9834GiY.VALUE_TRUE) {
            return true;
        }
        if (enumC9834GiYA1N != EnumC9834GiY.VALUE_FALSE) {
            throw A03(this, String.format("Current token (%s) not of boolean type", enumC9834GiYA1N));
        }
        return false;
    }

    public final boolean A1s() {
        return this instanceof AbstractC9922GlJ ? ((AbstractC9922GlJ) this).A00.A1s() : A1t();
    }

    public final boolean A1u() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return AnonymousClass002.A1X(((AbstractC9927GlO) this).A00);
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        return abstractC9922GlJ instanceof C9925GlM ? AnonymousClass002.A1X(((C9925GlM) abstractC9922GlJ).A01) : abstractC9922GlJ.A00.A1u();
    }

    public final boolean A1v() {
        if (!(this instanceof AbstractC9922GlJ)) {
            if (this instanceof C9926GlN) {
                return false;
            }
            AbstractC9980Gmw abstractC9980Gmw = (AbstractC9980Gmw) this;
            EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) abstractC9980Gmw).A00;
            if (enumC9834GiY == EnumC9834GiY.VALUE_STRING) {
                return true;
            }
            if (enumC9834GiY == EnumC9834GiY.FIELD_NAME) {
                return abstractC9980Gmw.A0K;
            }
            return false;
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        boolean z = abstractC9922GlJ instanceof C9925GlM;
        AbstractC9922GlJ abstractC9922GlJ2 = abstractC9922GlJ;
        if (z) {
            C9925GlM c9925GlM = (C9925GlM) abstractC9922GlJ;
            EnumC9834GiY enumC9834GiY2 = c9925GlM.A01;
            abstractC9922GlJ2 = c9925GlM;
            if (enumC9834GiY2 == EnumC9834GiY.FIELD_NAME) {
                return false;
            }
        }
        return abstractC9922GlJ2.A00.A1v();
    }

    public final boolean A1w() {
        return this instanceof AbstractC9922GlJ ? ((AbstractC9922GlJ) this).A00.A1w() : AnonymousClass002.A1Z(((AbstractC9927GlO) this).A00, EnumC9834GiY.VALUE_NUMBER_INT);
    }

    public final boolean A1x() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return AnonymousClass002.A1Z(((AbstractC9927GlO) this).A00, EnumC9834GiY.START_ARRAY);
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        return abstractC9922GlJ instanceof C9925GlM ? AnonymousClass002.A1Z(((C9925GlM) abstractC9922GlJ).A01, EnumC9834GiY.START_ARRAY) : abstractC9922GlJ.A00.A1x();
    }

    public final boolean A1y() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return AnonymousClass002.A1Z(((AbstractC9927GlO) this).A00, EnumC9834GiY.START_OBJECT);
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        return abstractC9922GlJ instanceof C9925GlM ? AnonymousClass002.A1Z(((C9925GlM) abstractC9922GlJ).A01, EnumC9834GiY.START_OBJECT) : abstractC9922GlJ.A00.A1y();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1z() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.AbstractC9922GlJ
            if (r0 == 0) goto Ld
            X.GlJ r2 = (X.AbstractC9922GlJ) r2
            X.Gl7 r0 = r2.A00
            boolean r1 = r0.A1z()
        Lc:
            return r1
        Ld:
            boolean r0 = r2 instanceof X.C9926GlN
            if (r0 == 0) goto L40
            X.GlN r2 = (X.C9926GlN) r2
            X.GiY r1 = r2.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            if (r1 != r0) goto L4d
            java.lang.Object r1 = A05(r2)
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L36
            double r1 = X.BV6.A00(r1)
        L25:
            boolean r0 = java.lang.Double.isInfinite(r1)
            if (r0 != 0) goto L32
            boolean r1 = java.lang.Double.isNaN(r1)
            r0 = 1
            if (r1 == 0) goto L33
        L32:
            r0 = 0
        L33:
            r1 = r0 ^ 1
            return r1
        L36:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L4d
            float r0 = X.AnonymousClass001.A02(r1)
            double r1 = (double) r0
            goto L25
        L40:
            X.Gmw r2 = (X.AbstractC9980Gmw) r2
            X.GiY r1 = r2.A00
            X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            if (r1 != r0) goto L4d
            boolean r0 = r2.A0L
            r1 = 1
            if (r0 != 0) goto Lc
        L4d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A1z():boolean");
    }

    public final boolean A20() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A20();
        }
        return false;
    }

    public final boolean A21(int i) {
        EnumC9834GiY enumC9834GiY;
        if (this instanceof AbstractC9922GlJ) {
            AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
            if (!(abstractC9922GlJ instanceof C9925GlM)) {
                return abstractC9922GlJ.A00.A21(i);
            }
            enumC9834GiY = ((C9925GlM) abstractC9922GlJ).A01;
        } else {
            enumC9834GiY = ((AbstractC9927GlO) this).A00;
        }
        return enumC9834GiY != null && enumC9834GiY._id == i;
    }

    public final boolean A22(EnumC9834GiY enumC9834GiY) {
        if (!(this instanceof AbstractC9922GlJ)) {
            return AnonymousClass002.A1Z(((AbstractC9927GlO) this).A00, enumC9834GiY);
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        return abstractC9922GlJ instanceof C9925GlM ? AnonymousClass002.A1Z(((C9925GlM) abstractC9922GlJ).A01, enumC9834GiY) : abstractC9922GlJ.A00.A22(enumC9834GiY);
    }

    public final boolean A23(EnumC10013Gnl enumC10013Gnl) {
        return AbstractC7609F5w.A1U(this.A00, enumC10013Gnl._mappedFeature._mask);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0242, code lost:
    
        if (r14._paddingReadBehaviour != X.HjV.PADDING_REQUIRED) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0244, code lost:
    
        ((X.AbstractC9980Gmw) r13).A05 = r4 - 1;
        r13.A2b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0291, code lost:
    
        r2 = r3.A05();
        r13.A0N = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0297, code lost:
    
        r13.A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x029a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0128, code lost:
    
        r13.A2B();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] A24(X.Gn1 r14) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A24(X.Gn1):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[PHI: r1 r2 r6
  0x004f: PHI (r1v8 int) = (r1v1 int), (r1v9 int) binds: [B:28:0x0043, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r2v2 X.GiY) = (r2v0 X.GiY), (r2v3 X.GiY) binds: [B:28:0x0043, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r6v6 X.Gmx) = (r6v15 X.Gmx), (r6v16 X.Gmx) binds: [B:28:0x0043, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char[] A25() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C9926GlN
            if (r0 == 0) goto Lf
            java.lang.String r0 = r6.A1c()
            if (r0 == 0) goto L8a
            char[] r0 = r0.toCharArray()
            return r0
        Lf:
            boolean r0 = r6 instanceof X.C9982Gmy
            if (r0 == 0) goto L32
            X.Gmy r6 = (X.C9982Gmy) r6
            X.GiY r2 = r6.A00
            if (r2 == 0) goto L8a
            int r1 = r2._id
            r0 = 5
            r5 = 0
            if (r1 == r0) goto L59
            r0 = 6
            if (r1 != r0) goto L4f
            boolean r0 = r6.A03
            if (r0 == 0) goto L2b
            r6.A03 = r5
            X.C9982Gmy.A0u(r6)
        L2b:
            X.Gn2 r0 = r6.A0R
            char[] r0 = r0.A0H()
            return r0
        L32:
            boolean r0 = r6 instanceof X.C9981Gmx
            if (r0 == 0) goto L8c
            X.Gmx r6 = (X.C9981Gmx) r6
            X.GiY r2 = r6.A00
            if (r2 == 0) goto L8a
            int r1 = r2._id
            r0 = 5
            r5 = 0
            if (r1 == r0) goto L59
            r0 = 6
            if (r1 != r0) goto L4f
            boolean r0 = r6.A04
            if (r0 == 0) goto L2b
            r6.A04 = r5
            X.C9981Gmx.A0d(r6)
            goto L2b
        L4f:
            r0 = 7
            if (r1 == r0) goto L2b
            r0 = 8
            if (r1 == r0) goto L2b
            char[] r0 = r2._serializedChars
            return r0
        L59:
            boolean r0 = r6.A0K
            if (r0 != 0) goto L81
            X.Gnr r0 = r6.A0F
            java.lang.String r4 = r0.A05
            int r3 = r4.length()
            char[] r1 = r6.A0O
            if (r1 != 0) goto L84
            X.Gn6 r2 = r6.A0Q
            char[] r0 = r2.A05
            X.C9984Gn6.A00(r0)
            X.HjR r1 = r2.A0C
            r0 = 3
            char[] r1 = r1.A03(r0, r3)
            r2.A05 = r1
        L79:
            r6.A0O = r1
        L7b:
            r4.getChars(r5, r3, r1, r5)
            r0 = 1
            r6.A0K = r0
        L81:
            char[] r0 = r6.A0O
            return r0
        L84:
            int r0 = r1.length
            if (r0 >= r3) goto L7b
            char[] r1 = new char[r3]
            goto L79
        L8a:
            r0 = 0
            return r0
        L8c:
            X.GlJ r6 = (X.AbstractC9922GlJ) r6
            boolean r0 = r6 instanceof X.C9925GlM
            if (r0 == 0) goto La3
            X.GlM r6 = (X.C9925GlM) r6
            X.GiY r1 = r6.A01
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            if (r1 != r0) goto La3
            java.lang.String r0 = r6.A1a()
            char[] r0 = r0.toCharArray()
            return r0
        La3:
            X.Gl7 r0 = r6.A00
            char[] r0 = r0.A25()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9916Gl7.A25():char[]");
    }

    public int A26() {
        if (this instanceof AbstractC9922GlJ) {
            return ((AbstractC9922GlJ) this).A00.A26();
        }
        AbstractC9927GlO abstractC9927GlO = (AbstractC9927GlO) this;
        EnumC9834GiY enumC9834GiY = abstractC9927GlO.A00;
        return (enumC9834GiY == EnumC9834GiY.VALUE_NUMBER_INT || enumC9834GiY == EnumC9834GiY.VALUE_NUMBER_FLOAT) ? abstractC9927GlO.A1C() : abstractC9927GlO.A28(0);
    }

    public String A27() {
        if (!(this instanceof AbstractC9922GlJ)) {
            return ((AbstractC9927GlO) this).A29(null);
        }
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        boolean z = abstractC9922GlJ instanceof C9925GlM;
        AbstractC9922GlJ abstractC9922GlJ2 = abstractC9922GlJ;
        if (z) {
            C9925GlM c9925GlM = (C9925GlM) abstractC9922GlJ;
            EnumC9834GiY enumC9834GiY = c9925GlM.A01;
            abstractC9922GlJ2 = c9925GlM;
            if (enumC9834GiY == EnumC9834GiY.FIELD_NAME) {
                return c9925GlM.A1a();
            }
        }
        return abstractC9922GlJ2.A00.A27();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC9922GlJ abstractC9922GlJ = (AbstractC9922GlJ) this;
        if (!(abstractC9922GlJ instanceof C10014Gnm)) {
            abstractC9922GlJ.A00.close();
            return;
        }
        C10014Gnm c10014Gnm = (C10014Gnm) abstractC9922GlJ;
        while (true) {
            ((AbstractC9922GlJ) c10014Gnm).A00.close();
            int i = c10014Gnm.A00;
            AbstractC9916Gl7[] abstractC9916Gl7Arr = c10014Gnm.A01;
            if (i >= abstractC9916Gl7Arr.length) {
                return;
            }
            c10014Gnm.A00 = i + 1;
            ((AbstractC9922GlJ) c10014Gnm).A00 = abstractC9916Gl7Arr[i];
        }
    }

    public static JsonParseException A03(AbstractC9916Gl7 abstractC9916Gl7, String str) {
        C9516GMj c9516GMjA1I = abstractC9916Gl7.A1I();
        JsonParseException jsonParseException = new JsonParseException(str, null);
        jsonParseException._location = c9516GMjA1I;
        jsonParseException.A00 = abstractC9916Gl7;
        jsonParseException._requestPayload = null;
        return jsonParseException;
    }

    public static String A06(AbstractC10020Gns abstractC10020Gns, String str) {
        return FGI.A0U(str, abstractC10020Gns.A03(), " entries");
    }
}
