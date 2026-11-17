package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: X.Gl1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9913Gl1 extends AbstractC9919GlE {
    public static final int A0E;
    public int A00;
    public AbstractC9794GhC A02;
    public C9997GnR A04;
    public C9997GnR A05;
    public Object A06;
    public Object A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public AbstractC10020Gns A0C;
    public C10002GnY A0D;
    public boolean A08 = false;
    public int A01 = A0E;
    public C10018Gnq A03 = new C10018Gnq(null, null, 0);

    public static void A06(C9997GnR c9997GnR, C9913Gl1 c9913Gl1) {
        int i = 1;
        if (c9997GnR == null) {
            i = c9913Gl1.A00 + 1;
        } else {
            c9913Gl1.A05 = c9997GnR;
        }
        c9913Gl1.A00 = i;
    }

    public static final C9926GlN A00(AbstractC9794GhC abstractC9794GhC, C9913Gl1 c9913Gl1) {
        return new C9926GlN(c9913Gl1.A0C, abstractC9794GhC, c9913Gl1.A0D, c9913Gl1.A04, c9913Gl1.A0A, c9913Gl1.A09);
    }

    private void A02(AbstractC9916Gl7 abstractC9916Gl7, EnumC9834GiY enumC9834GiY) throws IOException {
        EnumC9834GiY enumC9834GiY2;
        Object objA1X;
        EnumC9834GiY enumC9834GiY3;
        if (this.A0B) {
            A01(abstractC9916Gl7);
        }
        switch (enumC9834GiY.ordinal()) {
            case 6:
                A0j(abstractC9916Gl7.A1V());
                return;
            case 7:
                if (abstractC9916Gl7.A1v()) {
                    A0y(abstractC9916Gl7.A25(), abstractC9916Gl7.A1E(), abstractC9916Gl7.A1D());
                    return;
                } else {
                    A0s(abstractC9916Gl7.A1c());
                    return;
                }
            case 8:
                int iOrdinal = abstractC9916Gl7.A1L().ordinal();
                if (iOrdinal == 0) {
                    A0X(abstractC9916Gl7.A1C());
                    return;
                } else {
                    if (iOrdinal != 2) {
                        A0Y(abstractC9916Gl7.A1G());
                        return;
                    }
                    objA1X = abstractC9916Gl7.A1X();
                    enumC9834GiY3 = EnumC9834GiY.VALUE_NUMBER_INT;
                    A05(enumC9834GiY3, this, objA1X);
                    return;
                }
            case 9:
                objA1X = abstractC9916Gl7.A1X();
                enumC9834GiY3 = EnumC9834GiY.VALUE_NUMBER_FLOAT;
                A05(enumC9834GiY3, this, objA1X);
                return;
            case 10:
                enumC9834GiY2 = EnumC9834GiY.VALUE_TRUE;
                A04(enumC9834GiY2, this);
                return;
            case 11:
                enumC9834GiY2 = EnumC9834GiY.VALUE_FALSE;
                A04(enumC9834GiY2, this);
                return;
            case 12:
                A0R();
                return;
            default:
                throw BV4.A0c(AnonymousClass007.A0a("Internal error: unexpected token: ", enumC9834GiY));
        }
    }

    public static final void A03(EnumC9834GiY enumC9834GiY, C9913Gl1 c9913Gl1) {
        boolean z = c9913Gl1.A08;
        C9997GnR c9997GnR = c9913Gl1.A05;
        int i = c9913Gl1.A00;
        A06(z ? c9997GnR.A03(enumC9834GiY, c9913Gl1.A06, c9913Gl1.A07, i) : c9997GnR.A01(enumC9834GiY, i), c9913Gl1);
    }

    public static final void A04(EnumC9834GiY enumC9834GiY, C9913Gl1 c9913Gl1) {
        c9913Gl1.A03.A04();
        boolean z = c9913Gl1.A08;
        C9997GnR c9997GnR = c9913Gl1.A05;
        int i = c9913Gl1.A00;
        A06(z ? c9997GnR.A03(enumC9834GiY, c9913Gl1.A06, c9913Gl1.A07, i) : c9997GnR.A01(enumC9834GiY, i), c9913Gl1);
    }

    public static final void A05(EnumC9834GiY enumC9834GiY, C9913Gl1 c9913Gl1, Object obj) {
        C9997GnR c9997GnRA02;
        c9913Gl1.A03.A04();
        boolean z = c9913Gl1.A08;
        C9997GnR c9997GnR = c9913Gl1.A05;
        if (z) {
            c9997GnRA02 = c9997GnR.A04(enumC9834GiY, obj, c9913Gl1.A06, c9913Gl1.A07, c9913Gl1.A00);
        } else {
            c9997GnRA02 = c9997GnR.A02(enumC9834GiY, obj, c9913Gl1.A00);
        }
        A06(c9997GnRA02, c9913Gl1);
    }

    public static final void A07(C9913Gl1 c9913Gl1, Object obj) {
        C9997GnR c9997GnRA02;
        boolean z = c9913Gl1.A08;
        C9997GnR c9997GnR = c9913Gl1.A05;
        if (z) {
            c9997GnRA02 = c9997GnR.A04(EnumC9834GiY.FIELD_NAME, obj, c9913Gl1.A06, c9913Gl1.A07, c9913Gl1.A00);
        } else {
            c9997GnRA02 = c9997GnR.A02(EnumC9834GiY.FIELD_NAME, obj, c9913Gl1.A00);
        }
        A06(c9997GnRA02, c9913Gl1);
    }

    public final C9926GlN A10(AbstractC9916Gl7 abstractC9916Gl7) {
        BigDecimal bigDecimal = AbstractC9927GlO.A04;
        C9997GnR c9997GnR = this.A04;
        C9926GlN c9926GlN = new C9926GlN(this.A0C, abstractC9916Gl7.A1Q(), abstractC9916Gl7.A1R(), c9997GnR, this.A0A, this.A09);
        c9926GlN.A01 = abstractC9916Gl7.A1J();
        return c9926GlN;
    }

    public final C9926GlN A11(C10002GnY c10002GnY) {
        C9997GnR c9997GnR = this.A04;
        return new C9926GlN(this.A0C, this.A02, c10002GnY, c9997GnR, this.A0A, this.A09);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A12(X.AbstractC9919GlE r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9913Gl1.A12(X.GlE):void");
    }

    public final void A14(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException, JsonGenerationException {
        EnumC9834GiY enumC9834GiYA1P;
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.FIELD_NAME;
        if (!abstractC9916Gl7.A22(enumC9834GiY)) {
            A13(abstractC9916Gl7);
            return;
        }
        A0T();
        do {
            A13(abstractC9916Gl7);
            enumC9834GiYA1P = abstractC9916Gl7.A1P();
        } while (enumC9834GiYA1P == enumC9834GiY);
        EnumC9834GiY enumC9834GiY2 = EnumC9834GiY.END_OBJECT;
        if (enumC9834GiYA1P == enumC9834GiY2) {
            A0Q();
            return;
        }
        String strA0a = AnonymousClass007.A0a("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ", enumC9834GiYA1P);
        AbstractC9916Gl7 abstractC9916Gl72 = abstractC9904Gkk.A00;
        String strA0U = String.format("Unexpected token (%s), expected %s", abstractC9916Gl72.A1N(), enumC9834GiY2);
        if (strA0a != null) {
            strA0U = FGI.A0U(strA0U, ": ", strA0a);
        }
        MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9916Gl72, strA0U);
        mismatchedInputException._targetType = C9913Gl1.class;
        throw mismatchedInputException;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A15(X.C9913Gl1 r3) {
        /*
            r2 = this;
            boolean r0 = r2.A0A
            if (r0 != 0) goto L8
            boolean r0 = r3.A0A
            r2.A0A = r0
        L8:
            boolean r1 = r2.A09
            if (r1 != 0) goto L10
            boolean r1 = r3.A09
            r2.A09 = r1
        L10:
            if (r0 != 0) goto L15
            r0 = 0
            if (r1 == 0) goto L16
        L15:
            r0 = 1
        L16:
            r2.A0B = r0
            X.GhC r0 = r3.A02
            X.GlN r1 = A00(r0, r3)
        L1e:
            X.GiY r0 = r1.A1P()
            if (r0 == 0) goto L28
            r2.A13(r1)
            goto L1e
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9913Gl1.A15(X.Gl1):void");
    }

    @Override // X.AbstractC9919GlE, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    static {
        int i = 0;
        for (EnumC9998GnS enumC9998GnS : EnumC9998GnS.values()) {
            if (enumC9998GnS._defaultState) {
                i |= enumC9998GnS._mask;
            }
        }
        A0E = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9913Gl1(X.AbstractC9916Gl7 r4) {
        /*
            r3 = this;
            r3.<init>()
            X.GnY r0 = X.C10002GnY.A00
            r3.A0D = r0
            r2 = 0
            r3.A08 = r2
            X.GhC r0 = r4.A1Q()
            r3.A02 = r0
            X.GnY r0 = r4.A1R()
            r3.A0D = r0
            X.Gns r0 = r4.A1M()
            r3.A0C = r0
            int r0 = X.C9913Gl1.A0E
            r3.A01 = r0
            r1 = 0
            X.Gnq r0 = new X.Gnq
            r0.<init>(r1, r1, r2)
            r3.A03 = r0
            X.GnR r0 = new X.GnR
            r0.<init>()
            r3.A05 = r0
            r3.A04 = r0
            r3.A00 = r2
            boolean r0 = r4.A1q()
            r3.A0A = r0
            boolean r1 = r4.A1p()
            r3.A09 = r1
            if (r0 != 0) goto L44
            r0 = 0
            if (r1 == 0) goto L45
        L44:
            r0 = 1
        L45:
            r3.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9913Gl1.<init>(X.Gl7):void");
    }

    private final void A01(AbstractC9916Gl7 abstractC9916Gl7) {
        Object objA1Z = abstractC9916Gl7.A1Z();
        this.A07 = objA1Z;
        if (objA1Z != null) {
            this.A08 = true;
        }
        Object objA1Y = abstractC9916Gl7.A1Y();
        this.A06 = objA1Y;
        if (objA1Y != null) {
            this.A08 = true;
        }
    }

    @Override // X.AbstractC9919GlE
    public final void A0b(EnumC9998GnS enumC9998GnS) {
        throw F60.createAndThrow();
    }

    public final void A13(AbstractC9916Gl7 abstractC9916Gl7) {
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
            if (this.A0B) {
                A01(abstractC9916Gl7);
            }
            A0o(abstractC9916Gl7.A1a());
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
        } else if (enumC9834GiYA1N == null) {
            throw new JsonEOFException(abstractC9916Gl7, null, "Unexpected end-of-input");
        }
        int iOrdinal = enumC9834GiYA1N.ordinal();
        if (iOrdinal == 1) {
            if (this.A0B) {
                A01(abstractC9916Gl7);
            }
            A0T();
        } else {
            if (iOrdinal == 2) {
                A0Q();
                return;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    A02(abstractC9916Gl7, enumC9834GiYA1N);
                    return;
                } else {
                    A0P();
                    return;
                }
            }
            if (this.A0B) {
                A01(abstractC9916Gl7);
            }
            A0S();
        }
        int i = 1;
        while (true) {
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            if (enumC9834GiYA1P == null) {
                return;
            }
            int iOrdinal2 = enumC9834GiYA1P.ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    A0Q();
                } else if (iOrdinal2 == 3) {
                    if (this.A0B) {
                        A01(abstractC9916Gl7);
                    }
                    A0S();
                } else if (iOrdinal2 == 4) {
                    A0P();
                } else if (iOrdinal2 != 5) {
                    A02(abstractC9916Gl7, enumC9834GiYA1P);
                } else {
                    if (this.A0B) {
                        A01(abstractC9916Gl7);
                    }
                    A0o(abstractC9916Gl7.A1a());
                }
                i--;
                if (i == 0) {
                    return;
                }
            } else {
                if (this.A0B) {
                    A01(abstractC9916Gl7);
                }
                A0T();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            java.lang.StringBuilder r3 = X.C60O.A0w()
            java.lang.String r0 = "[TokenBuffer: "
            r3.append(r0)
            X.GhC r0 = r10.A02
            X.GlN r9 = A00(r0, r10)
            boolean r0 = r10.A0A
            r4 = 0
            if (r0 != 0) goto L19
            boolean r0 = r10.A09
            r8 = 0
            if (r0 == 0) goto L1a
        L19:
            r8 = 1
        L1a:
            X.GiY r7 = r9.A1P()     // Catch: java.io.IOException -> L9f
            r6 = 100
            if (r7 != 0) goto L23
            goto L8e
        L23:
            if (r8 == 0) goto L6c
            X.GnR r1 = r10.A05     // Catch: java.io.IOException -> L9f
            int r0 = r10.A00     // Catch: java.io.IOException -> L9f
            int r0 = r0 + (-1)
            java.util.TreeMap<java.lang.Integer, java.lang.Object> r1 = r1.A02     // Catch: java.io.IOException -> L9f
            if (r1 != 0) goto L30
            goto L38
        L30:
            int r0 = r0 + r0
            int r0 = r0 + 1
            java.lang.Object r1 = X.BV7.A0r(r1, r0)     // Catch: java.io.IOException -> L9f
            goto L39
        L38:
            r1 = 0
        L39:
            r5 = 93
            if (r1 == 0) goto L4c
            java.lang.String r0 = "[objectId="
            r3.append(r0)     // Catch: java.io.IOException -> L9f
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> L9f
            r3.append(r0)     // Catch: java.io.IOException -> L9f
            r3.append(r5)     // Catch: java.io.IOException -> L9f
        L4c:
            X.GnR r2 = r10.A05     // Catch: java.io.IOException -> L9f
            int r0 = r10.A00     // Catch: java.io.IOException -> L9f
            int r1 = r0 + (-1)
            java.util.TreeMap<java.lang.Integer, java.lang.Object> r0 = r2.A02     // Catch: java.io.IOException -> L9f
            if (r0 == 0) goto L6c
            int r1 = r1 + r1
            java.lang.Object r1 = X.BV7.A0r(r0, r1)     // Catch: java.io.IOException -> L9f
            if (r1 == 0) goto L6c
            java.lang.String r0 = "[typeId="
            r3.append(r0)     // Catch: java.io.IOException -> L9f
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> L9f
            r3.append(r0)     // Catch: java.io.IOException -> L9f
            r3.append(r5)     // Catch: java.io.IOException -> L9f
        L6c:
            if (r4 >= r6) goto L8b
            if (r4 <= 0) goto L73
            X.C8j3.A1K(r3)     // Catch: java.io.IOException -> L9f
        L73:
            X.BV4.A1O(r3, r7)     // Catch: java.io.IOException -> L9f
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME     // Catch: java.io.IOException -> L9f
            if (r7 != r0) goto L8b
            r0 = 40
            r3.append(r0)     // Catch: java.io.IOException -> L9f
            java.lang.String r0 = r9.A1a()     // Catch: java.io.IOException -> L9f
            r3.append(r0)     // Catch: java.io.IOException -> L9f
            r0 = 41
            r3.append(r0)     // Catch: java.io.IOException -> L9f
        L8b:
            int r4 = r4 + 1
            goto L1a
        L8e:
            if (r4 < r6) goto L9a
            java.lang.String r0 = " ... (truncated "
            X.AbstractC7607F5u.A1Q(r0, r3, r4, r6)
            java.lang.String r0 = " entries)"
            r3.append(r0)
        L9a:
            java.lang.String r0 = X.BV5.A0o(r3)
            return r0
        L9f:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9913Gl1.toString():java.lang.String");
    }
}
