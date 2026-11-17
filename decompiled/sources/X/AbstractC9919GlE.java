package X;

import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.GlE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9919GlE implements Closeable, Flushable {
    public static final C10037GoH<EnumC10052GoW> A01;
    public static final C10037GoH<EnumC10052GoW> A02;
    public static final C10037GoH<EnumC10052GoW> A03;
    public InterfaceC10049GoT A00;

    public abstract void A0b(EnumC9998GnS enumC9998GnS);

    public final void A0x(char[] cArr, int i) throws IOException {
        if (this instanceof C9913Gl1) {
            throw C8j3.A18("Called operation not supported for TokenBuffer");
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            int length = cArr.length;
            if (((length - i) | i | i) < 0) {
                throw new JsonGenerationException(gn0, String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", BV8.A1b(0, i, length)));
            }
            if (i >= 32) {
                Gn0.A03(gn0);
                gn0.A06.write(cArr, 0, i);
                return;
            } else {
                if (i > gn0.A01 - gn0.A03) {
                    Gn0.A03(gn0);
                }
                A0H(gn0, cArr, 0, i);
                return;
            }
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        int iA03 = 0;
        int length2 = cArr.length;
        if (((length2 - i) | i | i) < 0) {
            throw new JsonGenerationException(c9983Gmz, String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", BV8.A1b(0, i, length2)));
        }
        int i2 = i + i + i;
        int i3 = c9983Gmz.A01 + i2;
        int i4 = c9983Gmz.A05;
        if (i3 > i4) {
            if (i4 < i2) {
                byte[] bArr = c9983Gmz.A02;
                while (iA03 < i) {
                    do {
                        char c = cArr[iA03];
                        int i5 = c9983Gmz.A01;
                        if (c > '\u007f') {
                            if (i5 + 3 >= i4) {
                                C9983Gmz.A05(c9983Gmz);
                            }
                            int i6 = iA03 + 1;
                            char c2 = cArr[iA03];
                            if (c2 < '\u0800') {
                                AbstractC7608F5v.A1B(c2, bArr, A0A(c9983Gmz, bArr, c2));
                                iA03 = i6;
                            } else {
                                iA03 = C9983Gmz.A03(c9983Gmz, cArr, c2, i6, i);
                            }
                        } else {
                            if (i5 >= i4) {
                                C9983Gmz.A05(c9983Gmz);
                            }
                            bArr[A09(c9983Gmz)] = (byte) c;
                            iA03++;
                        }
                    } while (iA03 < i);
                    return;
                }
                return;
            }
            C9983Gmz.A05(c9983Gmz);
        }
        while (iA03 < i) {
            do {
                char c3 = cArr[iA03];
                if (c3 > '\u007f') {
                    iA03++;
                    if (c3 < '\u0800') {
                        byte[] bArr2 = c9983Gmz.A02;
                        AbstractC7608F5v.A1B(c3, bArr2, A0A(c9983Gmz, bArr2, c3));
                    } else {
                        iA03 = C9983Gmz.A03(c9983Gmz, cArr, c3, iA03, i);
                    }
                } else {
                    c9983Gmz.A02[A09(c9983Gmz)] = (byte) c3;
                    iA03++;
                }
            } while (iA03 < i);
            return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public static char A08(Gn0 gn0) {
        char[] cArr = gn0.A04;
        int i = gn0.A03;
        gn0.A03 = i + 1;
        char c = gn0.A00;
        cArr[i] = c;
        return c;
    }

    public static int A09(C9983Gmz c9983Gmz) {
        int i = c9983Gmz.A01;
        c9983Gmz.A01 = i + 1;
        return i;
    }

    public static int A0A(C9983Gmz c9983Gmz, byte[] bArr, int i) {
        int i2 = c9983Gmz.A01;
        int i3 = i2 + 1;
        c9983Gmz.A01 = i3;
        bArr[i2] = (byte) ((i >> 6) | 192);
        c9983Gmz.A01 = i2 + 2;
        return i3;
    }

    public static void A0B(AbstractC9932GlT abstractC9932GlT) {
        abstractC9932GlT.A12("write a number");
    }

    public static void A0C(AbstractC9979Gmv abstractC9979Gmv, Object obj) {
        abstractC9979Gmv.A12("start an array");
        C10018Gnq c10018GnqA08 = ((AbstractC9932GlT) abstractC9979Gmv).A02.A08(obj);
        ((AbstractC9932GlT) abstractC9979Gmv).A02 = c10018GnqA08;
        abstractC9979Gmv.A05.A00(((AbstractC10020Gns) c10018GnqA08).A01);
    }

    public static void A0D(C9983Gmz c9983Gmz) {
        if (c9983Gmz.A01 >= c9983Gmz.A05) {
            C9983Gmz.A05(c9983Gmz);
        }
    }

    public static void A0E(C9983Gmz c9983Gmz, byte b) {
        byte[] bArr = c9983Gmz.A02;
        int i = c9983Gmz.A01;
        c9983Gmz.A01 = i + 1;
        bArr[i] = b;
    }

    public static void A0F(Gn0 gn0, char c) {
        char[] cArr = gn0.A04;
        int i = gn0.A03;
        gn0.A03 = i + 1;
        cArr[i] = c;
    }

    public static void A0G(Gn0 gn0, int i) {
        if (i >= gn0.A01) {
            Gn0.A03(gn0);
        }
    }

    public static void A0H(Gn0 gn0, Object obj, int i, int i2) {
        System.arraycopy(obj, i, gn0.A04, gn0.A03, i2);
        gn0.A03 += i2;
    }

    public static byte[] A0I(C10026Go0 c10026Go0) {
        byte[] bArr = c10026Go0._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrA01 = Gn4.A01(c10026Go0._value);
        c10026Go0._unquotedUTF8Ref = bArrA01;
        return bArrA01;
    }

    public static char[] A0J(C10026Go0 c10026Go0) {
        int i;
        char[] cArrA0D = c10026Go0._quotedChars;
        if (cArrA0D == null) {
            String str = c10026Go0._value;
            int length = str.length();
            char[] cArrA0F = new char[Math.min(Math.max(16, length + Math.min((length >> 3) + 6, 1000)), OggOpusStreamEncoder.BIT_RATE)];
            int[] iArr = AbstractC10006Gne.A07;
            Gn2 gn2 = null;
            char[] cArr = null;
            int i2 = 0;
            int i3 = 0;
            loop0: while (i2 < length) {
                do {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt >= '\u0080' || iArr[cCharAt] == 0) {
                        int length2 = cArrA0F.length;
                        if (i3 >= length2) {
                            if (gn2 == null) {
                                gn2 = new Gn2(null);
                                gn2.A07 = cArrA0F;
                                gn2.A00 = length2;
                                gn2.A02 = -1;
                            }
                            try {
                                cArrA0F = gn2.A0F();
                                i3 = 0;
                            } catch (IOException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                        cArrA0F[i3] = cCharAt;
                        i2++;
                        i3++;
                    } else {
                        if (cArr == null) {
                            cArr = new char[]{'\\', 0, '0', '0', 0, 0};
                        }
                        int i4 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        int i5 = iArr[cCharAt2];
                        if (i5 < 0) {
                            cArr[1] = 'u';
                            char[] cArr2 = Gn4.A02;
                            cArr[4] = cArr2[cCharAt2 >> 4];
                            cArr[5] = cArr2[cCharAt2 & 15];
                            i = 6;
                        } else {
                            cArr[1] = (char) i5;
                            i = 2;
                        }
                        int i6 = i3 + i;
                        int length3 = cArrA0F.length;
                        if (i6 > length3) {
                            int i7 = length3 - i3;
                            if (i7 > 0) {
                                System.arraycopy(cArr, 0, cArrA0F, i3, i7);
                            }
                            if (gn2 == null) {
                                gn2 = new Gn2(null);
                                gn2.A07 = cArrA0F;
                                gn2.A00 = length3;
                                gn2.A02 = -1;
                            }
                            try {
                                cArrA0F = gn2.A0F();
                                i6 = i - i7;
                                System.arraycopy(cArr, i7, cArrA0F, 0, i6);
                            } catch (IOException e2) {
                                throw new IllegalStateException(e2);
                            }
                        } else {
                            System.arraycopy(cArr, 0, cArrA0F, i3, i);
                        }
                        i3 = i6;
                        i2 = i4;
                    }
                } while (i2 < length);
            }
            if (gn2 == null) {
                cArrA0D = Arrays.copyOfRange(cArrA0F, 0, i3);
            } else {
                gn2.A00 = i3;
                try {
                    cArrA0D = gn2.A0D();
                } catch (IOException e3) {
                    throw new IllegalStateException(e3);
                }
            }
            c10026Go0._quotedChars = cArrA0D;
        }
        return cArrA0D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[PHI: r1 r2 r3
  0x006a: PHI (r1v5 X.GoT) = (r1v12 X.GoT), (r1v13 X.GoT) binds: [B:24:0x005a, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r2v3 X.Gnq) = (r2v0 X.Gnq), (r2v4 X.Gnq) binds: [B:24:0x005a, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v3 X.Gmz) = (r3v10 X.Gmz), (r3v11 X.Gmz) binds: [B:24:0x005a, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P() throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9913Gl1
            if (r0 == 0) goto L23
            X.Gl1 r3 = (X.C9913Gl1) r3
            X.GiY r1 = X.EnumC9834GiY.END_ARRAY
            X.GnR r0 = r3.A05
            int r2 = r3.A00
            X.GnR r1 = r0.A01(r1, r2)
            r0 = 1
            if (r1 != 0) goto L20
            int r0 = r2 + 1
        L15:
            r3.A00 = r0
            X.Gnq r0 = r3.A03
            X.Gnq r0 = r0.A05
            if (r0 == 0) goto L1f
            r3.A03 = r0
        L1f:
            return
        L20:
            r3.A05 = r1
            goto L15
        L23:
            boolean r0 = r3 instanceof X.Gn0
            if (r0 == 0) goto L4f
            X.Gn0 r3 = (X.Gn0) r3
            X.Gnq r2 = r3.A02
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L72
            X.GoT r1 = r3.A00
            if (r1 != 0) goto L6a
            int r0 = r3.A03
            A0G(r3, r0)
            char[] r2 = r3.A04
            int r1 = r3.A03
            int r0 = r1 + 1
            r3.A03 = r0
            r0 = 93
            r2[r1] = r0
        L45:
            X.Gnq r1 = r3.A02
            r0 = 0
            r1.A01 = r0
            X.Gnq r0 = r1.A05
            r3.A02 = r0
            return
        L4f:
            X.Gmz r3 = (X.C9983Gmz) r3
            X.Gnq r2 = r3.A02
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L72
            X.GoT r1 = r3.A00
            if (r1 != 0) goto L6a
            A0D(r3)
            byte[] r2 = r3.A02
            int r1 = A09(r3)
            r0 = 93
            r2[r1] = r0
            goto L45
        L6a:
            int r0 = r2.A00
            int r0 = r0 + 1
            r1.Aii(r3, r0)
            goto L45
        L72:
            java.lang.String r1 = "Current context not Array but "
            java.lang.String r0 = r2.A03()
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            com.fasterxml.jackson.core.JsonGenerationException r0 = new com.fasterxml.jackson.core.JsonGenerationException
            r0.<init>(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0P():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[PHI: r1 r2 r3
  0x006a: PHI (r1v5 X.GoT) = (r1v12 X.GoT), (r1v13 X.GoT) binds: [B:24:0x005a, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r2v3 X.Gnq) = (r2v0 X.Gnq), (r2v4 X.Gnq) binds: [B:24:0x005a, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v3 X.Gmz) = (r3v10 X.Gmz), (r3v11 X.Gmz) binds: [B:24:0x005a, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q() throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9913Gl1
            if (r0 == 0) goto L23
            X.Gl1 r3 = (X.C9913Gl1) r3
            X.GiY r1 = X.EnumC9834GiY.END_OBJECT
            X.GnR r0 = r3.A05
            int r2 = r3.A00
            X.GnR r1 = r0.A01(r1, r2)
            r0 = 1
            if (r1 != 0) goto L20
            int r0 = r2 + 1
        L15:
            r3.A00 = r0
            X.Gnq r0 = r3.A03
            X.Gnq r0 = r0.A05
            if (r0 == 0) goto L1f
            r3.A03 = r0
        L1f:
            return
        L20:
            r3.A05 = r1
            goto L15
        L23:
            boolean r0 = r3 instanceof X.Gn0
            if (r0 == 0) goto L4f
            X.Gn0 r3 = (X.Gn0) r3
            X.Gnq r2 = r3.A02
            int r1 = r2.A02
            r0 = 2
            if (r1 != r0) goto L72
            X.GoT r1 = r3.A00
            if (r1 != 0) goto L6a
            int r0 = r3.A03
            A0G(r3, r0)
            char[] r2 = r3.A04
            int r1 = r3.A03
            int r0 = r1 + 1
            r3.A03 = r0
            r0 = 125(0x7d, float:1.75E-43)
            r2[r1] = r0
        L45:
            X.Gnq r1 = r3.A02
            r0 = 0
            r1.A01 = r0
            X.Gnq r0 = r1.A05
            r3.A02 = r0
            return
        L4f:
            X.Gmz r3 = (X.C9983Gmz) r3
            X.Gnq r2 = r3.A02
            int r1 = r2.A02
            r0 = 2
            if (r1 != r0) goto L72
            X.GoT r1 = r3.A00
            if (r1 != 0) goto L6a
            A0D(r3)
            byte[] r2 = r3.A02
            int r1 = A09(r3)
            r0 = 125(0x7d, float:1.75E-43)
            r2[r1] = r0
            goto L45
        L6a:
            int r0 = r2.A00
            int r0 = r0 + 1
            r1.Aij(r3, r0)
            goto L45
        L72:
            java.lang.String r1 = "Current context not Object but "
            java.lang.String r0 = r2.A03()
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            com.fasterxml.jackson.core.JsonGenerationException r0 = new com.fasterxml.jackson.core.JsonGenerationException
            r0.<init>(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0Q():void");
    }

    public final void A0R() {
        if (this instanceof C9913Gl1) {
            C9913Gl1.A04(EnumC9834GiY.VALUE_NULL, (C9913Gl1) this);
        } else if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            gn0.A12("write a null");
            Gn0.A04(gn0);
        } else {
            C9983Gmz c9983Gmz = (C9983Gmz) this;
            c9983Gmz.A12("write a null");
            C9983Gmz.A06(c9983Gmz);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0S() {
        C9983Gmz c9983Gmz;
        InterfaceC10049GoT interfaceC10049GoT;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            c9913Gl1.A03.A04();
            C9913Gl1.A03(EnumC9834GiY.START_ARRAY, c9913Gl1);
            c9913Gl1.A03 = c9913Gl1.A03.A06();
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            gn0.A12("start an array");
            C10018Gnq c10018GnqA06 = ((AbstractC9932GlT) gn0).A02.A06();
            ((AbstractC9932GlT) gn0).A02 = c10018GnqA06;
            ((AbstractC9979Gmv) gn0).A05.A00(((AbstractC10020Gns) c10018GnqA06).A01);
            InterfaceC10049GoT interfaceC10049GoT2 = ((AbstractC9919GlE) gn0).A00;
            interfaceC10049GoT = interfaceC10049GoT2;
            c9983Gmz = gn0;
            if (interfaceC10049GoT2 == null) {
                A0G(gn0, gn0.A03);
                char[] cArr = gn0.A04;
                int i = gn0.A03;
                gn0.A03 = i + 1;
                cArr[i] = '[';
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            c9983Gmz2.A12("start an array");
            C10018Gnq c10018GnqA062 = ((AbstractC9932GlT) c9983Gmz2).A02.A06();
            ((AbstractC9932GlT) c9983Gmz2).A02 = c10018GnqA062;
            ((AbstractC9979Gmv) c9983Gmz2).A05.A00(((AbstractC10020Gns) c10018GnqA062).A01);
            InterfaceC10049GoT interfaceC10049GoT3 = ((AbstractC9919GlE) c9983Gmz2).A00;
            interfaceC10049GoT = interfaceC10049GoT3;
            c9983Gmz = c9983Gmz2;
            if (interfaceC10049GoT3 == null) {
                A0D(c9983Gmz2);
                c9983Gmz2.A02[A09(c9983Gmz2)] = 91;
                return;
            }
        }
        interfaceC10049GoT.Aix(c9983Gmz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0T() {
        C9983Gmz c9983Gmz;
        InterfaceC10049GoT interfaceC10049GoT;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            c9913Gl1.A03.A04();
            C9913Gl1.A03(EnumC9834GiY.START_OBJECT, c9913Gl1);
            c9913Gl1.A03 = c9913Gl1.A03.A07();
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            gn0.A12("start an object");
            C10018Gnq c10018GnqA07 = ((AbstractC9932GlT) gn0).A02.A07();
            ((AbstractC9932GlT) gn0).A02 = c10018GnqA07;
            ((AbstractC9979Gmv) gn0).A05.A00(((AbstractC10020Gns) c10018GnqA07).A01);
            InterfaceC10049GoT interfaceC10049GoT2 = ((AbstractC9919GlE) gn0).A00;
            interfaceC10049GoT = interfaceC10049GoT2;
            c9983Gmz = gn0;
            if (interfaceC10049GoT2 == null) {
                A0G(gn0, gn0.A03);
                char[] cArr = gn0.A04;
                int i = gn0.A03;
                gn0.A03 = i + 1;
                cArr[i] = '{';
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            c9983Gmz2.A12("start an object");
            C10018Gnq c10018GnqA072 = ((AbstractC9932GlT) c9983Gmz2).A02.A07();
            ((AbstractC9932GlT) c9983Gmz2).A02 = c10018GnqA072;
            ((AbstractC9979Gmv) c9983Gmz2).A05.A00(((AbstractC10020Gns) c10018GnqA072).A01);
            InterfaceC10049GoT interfaceC10049GoT3 = ((AbstractC9919GlE) c9983Gmz2).A00;
            interfaceC10049GoT = interfaceC10049GoT3;
            c9983Gmz = c9983Gmz2;
            if (interfaceC10049GoT3 == null) {
                A0D(c9983Gmz2);
                c9983Gmz2.A02[A09(c9983Gmz2)] = 123;
                return;
            }
        }
        interfaceC10049GoT.Aiy(c9983Gmz);
    }

    public final void A0U(char c) {
        int iA0A;
        byte b;
        if (this instanceof C9913Gl1) {
            throw C8j3.A18("Called operation not supported for TokenBuffer");
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0G(gn0, gn0.A03);
            A0F(gn0, c);
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        if (c9983Gmz.A01 + 3 >= c9983Gmz.A05) {
            C9983Gmz.A05(c9983Gmz);
        }
        byte[] bArr = c9983Gmz.A02;
        if (c <= '\u007f') {
            iA0A = A09(c9983Gmz);
            b = (byte) c;
        } else if (c >= '\u0800') {
            C9983Gmz.A03(c9983Gmz, null, c, 0, 0);
            return;
        } else {
            iA0A = A0A(c9983Gmz, bArr, c);
            b = (byte) ((c & '?') | 128);
        }
        bArr[iA0A] = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if ((r2.A00 & X.EnumC9998GnS.A08._mask) != 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0V(double r3) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C9913Gl1
            if (r0 == 0) goto L10
            X.Gl1 r2 = (X.C9913Gl1) r2
            X.GiY r1 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            X.C9913Gl1.A05(r1, r2, r0)
            return
        L10:
            boolean r1 = r2 instanceof X.Gn0
            X.GlT r2 = (X.AbstractC9932GlT) r2
            boolean r0 = r2.A03
            if (r1 == 0) goto L3e
            if (r0 != 0) goto L30
            java.lang.String[] r0 = X.AbstractC6798Ea9.A04
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L28
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto L58
        L28:
            X.GnS r0 = X.EnumC9998GnS.QUOTE_NON_NUMERIC_NUMBERS
            boolean r0 = r2.A0z(r0)
            if (r0 == 0) goto L58
        L30:
            X.GnS r0 = X.EnumC9998GnS.USE_FAST_DOUBLE_WRITER
            boolean r0 = r2.A0z(r0)
            java.lang.String r0 = X.AbstractC6798Ea9.A0B(r3, r0)
            r2.A0s(r0)
            return
        L3e:
            if (r0 != 0) goto L30
            java.lang.String[] r0 = X.AbstractC6798Ea9.A04
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L4e
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto L69
        L4e:
            X.GnS r0 = X.EnumC9998GnS.QUOTE_NON_NUMERIC_NUMBERS
            int r1 = r2.A00
            int r0 = r0._mask
            r1 = r1 & r0
            if (r1 == 0) goto L69
            goto L30
        L58:
            A0B(r2)
            X.GnS r0 = X.EnumC9998GnS.USE_FAST_DOUBLE_WRITER
            boolean r0 = r2.A0z(r0)
            java.lang.String r0 = X.AbstractC6798Ea9.A0B(r3, r0)
            r2.A0q(r0)
            return
        L69:
            A0B(r2)
            X.GnS r0 = X.EnumC9998GnS.USE_FAST_DOUBLE_WRITER
            boolean r0 = r2.A0z(r0)
            java.lang.String r0 = X.AbstractC6798Ea9.A0B(r3, r0)
            r2.A0q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0V(double):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if ((r2.A00 & X.EnumC9998GnS.A08._mask) != 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0W(float r3) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C9913Gl1
            if (r0 == 0) goto L10
            X.Gl1 r2 = (X.C9913Gl1) r2
            X.GiY r1 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            X.C9913Gl1.A05(r1, r2, r0)
            return
        L10:
            boolean r1 = r2 instanceof X.Gn0
            X.GlT r2 = (X.AbstractC9932GlT) r2
            boolean r0 = r2.A03
            if (r1 == 0) goto L42
            if (r0 != 0) goto L6c
            java.lang.String[] r0 = X.AbstractC6798Ea9.A04
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 != 0) goto L39
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L39
        L28:
            A0B(r2)
            X.GnS r0 = X.EnumC9998GnS.USE_FAST_DOUBLE_WRITER
            boolean r0 = r2.A0z(r0)
            java.lang.String r0 = X.AbstractC6798Ea9.A0C(r3, r0)
            r2.A0q(r0)
            return
        L39:
            X.GnS r0 = X.EnumC9998GnS.QUOTE_NON_NUMERIC_NUMBERS
            boolean r0 = r2.A0z(r0)
            if (r0 == 0) goto L28
            goto L6c
        L42:
            if (r0 != 0) goto L6c
            java.lang.String[] r0 = X.AbstractC6798Ea9.A04
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 != 0) goto L63
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L63
        L52:
            A0B(r2)
            X.GnS r0 = X.EnumC9998GnS.USE_FAST_DOUBLE_WRITER
            boolean r0 = r2.A0z(r0)
            java.lang.String r0 = X.AbstractC6798Ea9.A0C(r3, r0)
            r2.A0q(r0)
            return
        L63:
            X.GnS r0 = X.EnumC9998GnS.QUOTE_NON_NUMERIC_NUMBERS
            int r1 = r2.A00
            int r0 = r0._mask
            r1 = r1 & r0
            if (r1 == 0) goto L52
        L6c:
            X.GnS r0 = X.EnumC9998GnS.USE_FAST_DOUBLE_WRITER
            boolean r0 = r2.A0z(r0)
            java.lang.String r0 = X.AbstractC6798Ea9.A0C(r3, r0)
            r2.A0s(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0W(float):void");
    }

    public final void A0X(int i) {
        if (this instanceof C9913Gl1) {
            C9913Gl1.A05(EnumC9834GiY.VALUE_NUMBER_INT, (C9913Gl1) this, Integer.valueOf(i));
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0B(gn0);
            if (!((AbstractC9932GlT) gn0).A03) {
                A0G(gn0, gn0.A03 + 11);
                gn0.A03 = AbstractC6798Ea9.A01(i, gn0.A04, gn0.A03);
                return;
            }
            A0G(gn0, gn0.A03 + 13);
            char[] cArr = gn0.A04;
            int i2 = gn0.A03;
            int i3 = i2 + 1;
            gn0.A03 = i3;
            char c = gn0.A00;
            cArr[i2] = c;
            int iA01 = AbstractC6798Ea9.A01(i, cArr, i3);
            char[] cArr2 = gn0.A04;
            gn0.A03 = iA01 + 1;
            cArr2[iA01] = c;
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        A0B(c9983Gmz);
        int i4 = c9983Gmz.A01 + 11;
        int i5 = c9983Gmz.A05;
        if (i4 >= i5) {
            C9983Gmz.A05(c9983Gmz);
        }
        if (!((AbstractC9932GlT) c9983Gmz).A03) {
            c9983Gmz.A01 = AbstractC6798Ea9.A04(c9983Gmz.A02, i, c9983Gmz.A01);
            return;
        }
        if (c9983Gmz.A01 + 13 >= i5) {
            C9983Gmz.A05(c9983Gmz);
        }
        byte[] bArr = c9983Gmz.A02;
        int i6 = c9983Gmz.A01;
        int i7 = i6 + 1;
        c9983Gmz.A01 = i7;
        byte b = c9983Gmz.A00;
        bArr[i6] = b;
        int iA04 = AbstractC6798Ea9.A04(bArr, i, i7);
        byte[] bArr2 = c9983Gmz.A02;
        c9983Gmz.A01 = iA04 + 1;
        bArr2[iA04] = b;
    }

    public final void A0Y(long j) {
        if (this instanceof C9913Gl1) {
            C9913Gl1.A05(EnumC9834GiY.VALUE_NUMBER_INT, (C9913Gl1) this, Long.valueOf(j));
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0B(gn0);
            if (!((AbstractC9932GlT) gn0).A03) {
                A0G(gn0, gn0.A03 + 21);
                gn0.A03 = AbstractC6798Ea9.A09(gn0.A04, gn0.A03, j);
                return;
            }
            A0G(gn0, gn0.A03 + 23);
            char[] cArr = gn0.A04;
            int i = gn0.A03;
            int i2 = i + 1;
            gn0.A03 = i2;
            char c = gn0.A00;
            cArr[i] = c;
            int iA09 = AbstractC6798Ea9.A09(cArr, i2, j);
            char[] cArr2 = gn0.A04;
            gn0.A03 = iA09 + 1;
            cArr2[iA09] = c;
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        A0B(c9983Gmz);
        if (!((AbstractC9932GlT) c9983Gmz).A03) {
            if (c9983Gmz.A01 + 21 >= c9983Gmz.A05) {
                C9983Gmz.A05(c9983Gmz);
            }
            c9983Gmz.A01 = AbstractC6798Ea9.A07(c9983Gmz.A02, c9983Gmz.A01, j);
            return;
        }
        if (c9983Gmz.A01 + 23 >= c9983Gmz.A05) {
            C9983Gmz.A05(c9983Gmz);
        }
        byte[] bArr = c9983Gmz.A02;
        int i3 = c9983Gmz.A01;
        int i4 = i3 + 1;
        c9983Gmz.A01 = i4;
        byte b = c9983Gmz.A00;
        bArr[i3] = b;
        int iA07 = AbstractC6798Ea9.A07(bArr, i4, j);
        byte[] bArr2 = c9983Gmz.A02;
        c9983Gmz.A01 = iA07 + 1;
        bArr2[iA07] = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0292, code lost:
    
        if (r4 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if (r4 > 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(X.Gn1 r19, java.io.InputStream r20, int r21) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0Z(X.Gn1, java.io.InputStream, int):void");
    }

    public final void A0a(Gn1 gn1, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        char[] cArr;
        if (this instanceof C9913Gl1) {
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, i, bArr3, 0, i2);
            A0j(bArr3);
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            gn0.A13(bArr, i, i2);
            gn0.A12("write a binary value");
            int i3 = gn0.A03;
            int i4 = gn0.A01;
            if (i3 >= i4) {
                Gn0.A03(gn0);
            }
            char[] cArr2 = gn0.A04;
            int i5 = gn0.A03;
            int iA05 = i5 + 1;
            gn0.A03 = iA05;
            char c = gn0.A00;
            cArr2[i5] = c;
            int i6 = i2 + i;
            int i7 = i6 - 3;
            int i8 = i4 - 6;
            int i9 = gn1._maxLineLength;
            loop0: while (true) {
                int i10 = i9 >> 2;
                while (i <= i7) {
                    if (iA05 > i8) {
                        Gn0.A03(gn0);
                    }
                    int i11 = i + 2;
                    int i12 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                    i += 3;
                    int i13 = i12 | (bArr[i11] & 255);
                    cArr = gn0.A04;
                    iA05 = gn1.A03(i13, cArr, gn0.A03);
                    gn0.A03 = iA05;
                    i10--;
                    if (i10 <= 0) {
                        break;
                    }
                }
                int i14 = iA05 + 1;
                gn0.A03 = i14;
                cArr[iA05] = '\\';
                iA05 += 2;
                gn0.A03 = iA05;
                cArr[i14] = 'n';
                i9 = gn1._maxLineLength;
            }
            int i15 = i6 - i;
            if (i15 > 0) {
                if (iA05 > i8) {
                    Gn0.A03(gn0);
                }
                int i16 = i + 1;
                int iA0C = bArr[i] << 16;
                if (i15 == 2) {
                    iA0C = AbstractC7608F5v.A0C(bArr, i16, iA0C);
                }
                iA05 = gn1.A05(gn0.A04, iA0C, i15, gn0.A03);
                gn0.A03 = iA05;
            }
            if (iA05 >= i4) {
                Gn0.A03(gn0);
            }
            A0F(gn0, c);
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        c9983Gmz.A13(bArr, i, i2);
        c9983Gmz.A12("write a binary value");
        int i17 = c9983Gmz.A01;
        int i18 = c9983Gmz.A05;
        if (i17 >= i18) {
            C9983Gmz.A05(c9983Gmz);
        }
        byte[] bArr4 = c9983Gmz.A02;
        int i19 = c9983Gmz.A01;
        int iA02 = i19 + 1;
        c9983Gmz.A01 = iA02;
        byte b = c9983Gmz.A00;
        bArr4[i19] = b;
        int i20 = i2 + i;
        int i21 = i20 - 3;
        int i22 = i18 - 6;
        int i23 = gn1._maxLineLength;
        loop2: while (true) {
            int i24 = i23 >> 2;
            while (i <= i21) {
                if (iA02 > i22) {
                    C9983Gmz.A05(c9983Gmz);
                }
                int i25 = i + 2;
                int i26 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                int i27 = i26 | (bArr[i25] & 255);
                bArr2 = c9983Gmz.A02;
                iA02 = gn1.A04(bArr2, i27, c9983Gmz.A01);
                c9983Gmz.A01 = iA02;
                i24--;
                if (i24 <= 0) {
                    break;
                }
            }
            int i28 = iA02 + 1;
            c9983Gmz.A01 = i28;
            bArr2[iA02] = 92;
            iA02 += 2;
            c9983Gmz.A01 = iA02;
            bArr2[i28] = 110;
            i23 = gn1._maxLineLength;
        }
        int i29 = i20 - i;
        if (i29 > 0) {
            if (iA02 > i22) {
                C9983Gmz.A05(c9983Gmz);
            }
            int i30 = i + 1;
            int iA0C2 = bArr[i] << 16;
            if (i29 == 2) {
                iA0C2 = AbstractC7608F5v.A0C(bArr, i30, iA0C2);
            }
            iA02 = gn1.A02(iA0C2, c9983Gmz.A02, i29, c9983Gmz.A01);
            c9983Gmz.A01 = iA02;
        }
        if (iA02 >= i18) {
            C9983Gmz.A05(c9983Gmz);
        }
        A0E(c9983Gmz, b);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0c(X.InterfaceC10180Gqq r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0c(X.Gqq):void");
    }

    public final void A0d(InterfaceC10180Gqq interfaceC10180Gqq) throws IOException {
        if (this instanceof C9913Gl1) {
            throw C8j3.A18("Called operation not supported for TokenBuffer");
        }
        if (!(this instanceof Gn0)) {
            C9983Gmz c9983Gmz = (C9983Gmz) this;
            byte[] bArr = c9983Gmz.A02;
            int i = c9983Gmz.A01;
            C10026Go0 c10026Go0 = (C10026Go0) interfaceC10180Gqq;
            byte[] bArrA0I = A0I(c10026Go0);
            int length = bArrA0I.length;
            if (i + length > bArr.length) {
                C9983Gmz.A0N(c9983Gmz, A0I(c10026Go0));
                return;
            } else {
                System.arraycopy(bArrA0I, 0, bArr, i, length);
                c9983Gmz.A01 += length;
                return;
            }
        }
        Gn0 gn0 = (Gn0) this;
        char[] cArr = gn0.A04;
        int i2 = gn0.A03;
        C10026Go0 c10026Go02 = (C10026Go0) interfaceC10180Gqq;
        String str = c10026Go02._value;
        int length2 = str.length();
        if (i2 + length2 <= cArr.length) {
            str.getChars(0, length2, cArr, i2);
            if (length2 >= 0) {
                gn0.A03 += length2;
                return;
            }
        }
        gn0.A0q(c10026Go02._value);
    }

    public final void A0e(InterfaceC10180Gqq interfaceC10180Gqq) throws IOException {
        if (!(this instanceof AbstractC9932GlT)) {
            A0r(((C10026Go0) interfaceC10180Gqq)._value);
            return;
        }
        AbstractC9932GlT abstractC9932GlT = (AbstractC9932GlT) this;
        if (!(abstractC9932GlT instanceof C9983Gmz)) {
            abstractC9932GlT.A12("write raw value");
            abstractC9932GlT.A0d(interfaceC10180Gqq);
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) abstractC9932GlT;
        c9983Gmz.A12("write a raw (unencoded) value");
        byte[] bArr = c9983Gmz.A02;
        int i = c9983Gmz.A01;
        C10026Go0 c10026Go0 = (C10026Go0) interfaceC10180Gqq;
        byte[] bArrA0I = A0I(c10026Go0);
        int length = bArrA0I.length;
        if (i + length > bArr.length) {
            C9983Gmz.A0N(c9983Gmz, A0I(c10026Go0));
        } else {
            System.arraycopy(bArrA0I, 0, bArr, i, length);
            c9983Gmz.A01 += length;
        }
    }

    public final void A0f(InterfaceC10180Gqq interfaceC10180Gqq) throws IOException {
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            if (interfaceC10180Gqq == null) {
                c9913Gl1.A0R();
                return;
            } else {
                C9913Gl1.A05(EnumC9834GiY.VALUE_STRING, c9913Gl1, interfaceC10180Gqq);
                return;
            }
        }
        if (!(this instanceof Gn0)) {
            C9983Gmz c9983Gmz = (C9983Gmz) this;
            c9983Gmz.A12("write a string");
            int i = c9983Gmz.A01;
            int i2 = c9983Gmz.A05;
            if (i >= i2) {
                C9983Gmz.A05(c9983Gmz);
            }
            byte[] bArr = c9983Gmz.A02;
            int i3 = c9983Gmz.A01;
            int i4 = i3 + 1;
            c9983Gmz.A01 = i4;
            byte b = c9983Gmz.A00;
            bArr[i3] = b;
            int iA4M = interfaceC10180Gqq.A4M(bArr, i4);
            if (iA4M < 0) {
                C9983Gmz.A0N(c9983Gmz, AbstractC7610F5x.A1a((C10026Go0) interfaceC10180Gqq));
            } else {
                c9983Gmz.A01 += iA4M;
            }
            if (c9983Gmz.A01 >= i2) {
                C9983Gmz.A05(c9983Gmz);
            }
            A0E(c9983Gmz, b);
            return;
        }
        Gn0 gn0 = (Gn0) this;
        gn0.A12("write a string");
        int i5 = gn0.A03;
        int i6 = gn0.A01;
        if (i5 >= i6) {
            Gn0.A03(gn0);
        }
        char[] cArr = gn0.A04;
        int i7 = gn0.A03;
        int i8 = i7 + 1;
        gn0.A03 = i8;
        char c = gn0.A00;
        cArr[i7] = c;
        C10026Go0 c10026Go0 = (C10026Go0) interfaceC10180Gqq;
        char[] cArrA0J = A0J(c10026Go0);
        int length = cArrA0J.length;
        if (i8 + length <= cArr.length) {
            System.arraycopy(cArrA0J, 0, cArr, i8, length);
            int i9 = gn0.A03 + length;
            gn0.A03 = i9;
            if (i9 >= i6) {
                Gn0.A03(gn0);
            }
            A0F(gn0, c);
            return;
        }
        char[] cArrA0J2 = A0J(c10026Go0);
        int length2 = cArrA0J2.length;
        if (length2 < 32) {
            if (length2 > i6 - gn0.A03) {
                Gn0.A03(gn0);
            }
            A0H(gn0, cArrA0J2, 0, length2);
        } else {
            Gn0.A03(gn0);
            gn0.A06.write(cArrA0J2, 0, length2);
        }
        if (gn0.A03 >= i6) {
            Gn0.A03(gn0);
        }
        A0F(gn0, c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g(X.C10091GpF r7) throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r6 = this;
            java.lang.Object r5 = r7.A04
            X.GiY r4 = r7.A00
            boolean r0 = r6 instanceof X.C9913Gl1
            if (r0 == 0) goto L29
            r1 = r6
            X.Gl1 r1 = (X.C9913Gl1) r1
            boolean r0 = r1.A0A
            if (r0 == 0) goto L29
            r0 = 0
            r7.A06 = r0
            r1.A07 = r5
            r0 = 1
            r1.A08 = r0
        L17:
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            if (r4 != r0) goto L21
            java.lang.Object r0 = r7.A03
            r6.A0m(r0)
        L20:
            return
        L21:
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r4 != r0) goto L20
            r6.A0S()
            return
        L29:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L5a
            java.lang.String r5 = (java.lang.String) r5
        L2f:
            r3 = 1
            r2 = 4
            r7.A06 = r3
            java.lang.Integer r1 = r7.A02
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            if (r4 == r0) goto L45
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L41
            java.lang.Integer r0 = X.C79.A0K
            if (r1 != r0) goto L45
        L41:
            java.lang.Integer r1 = X.C79.A00
            r7.A02 = r1
        L45:
            int r1 = r1.intValue()
            if (r1 == r2) goto L17
            r0 = 3
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 == r0) goto L66
            if (r1 == r3) goto L5f
            r6.A0S()
            r6.A0s(r5)
            goto L17
        L5a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L2f
        L5f:
            r6.A0T()
            r6.A0o(r5)
            goto L17
        L66:
            java.lang.Object r0 = r7.A03
            r6.A0m(r0)
            java.lang.String r0 = r7.A05
            r6.A0o(r0)
            r6.A0s(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0g(X.GpF):void");
    }

    public final void A0h(C10091GpF c10091GpF) throws JsonGenerationException {
        EnumC9834GiY enumC9834GiY = c10091GpF.A00;
        if (enumC9834GiY == EnumC9834GiY.START_OBJECT) {
            A0Q();
        } else if (enumC9834GiY == EnumC9834GiY.START_ARRAY) {
            A0P();
        }
        if (c10091GpF.A06) {
            int iIntValue = c10091GpF.A02.intValue();
            if (iIntValue == 4) {
                Object obj = c10091GpF.A04;
                String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
                A0o(c10091GpF.A05);
                A0s(strValueOf);
                return;
            }
            if (iIntValue == 3 || iIntValue == 2) {
                return;
            }
            if (iIntValue != 0) {
                A0Q();
            } else {
                A0P();
            }
        }
    }

    public final void A0i(Object obj) {
        C10018Gnq c10018Gnq = ((this instanceof AbstractC9932GlT) || !(this instanceof C9913Gl1)) ? ((AbstractC9932GlT) this).A02 : ((C9913Gl1) this).A03;
        if (c10018Gnq != null) {
            c10018Gnq.A01 = obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0j(java.lang.Object r4) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0j(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0k(Object obj) {
        C9983Gmz c9983Gmz;
        InterfaceC10049GoT interfaceC10049GoT;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            c9913Gl1.A03.A04();
            C9913Gl1.A03(EnumC9834GiY.START_ARRAY, c9913Gl1);
            c9913Gl1.A03 = c9913Gl1.A03.A08(obj);
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0C(gn0, obj);
            InterfaceC10049GoT interfaceC10049GoT2 = ((AbstractC9919GlE) gn0).A00;
            interfaceC10049GoT = interfaceC10049GoT2;
            c9983Gmz = gn0;
            if (interfaceC10049GoT2 == null) {
                A0G(gn0, gn0.A03);
                char[] cArr = gn0.A04;
                int i = gn0.A03;
                gn0.A03 = i + 1;
                cArr[i] = '[';
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            A0C(c9983Gmz2, obj);
            InterfaceC10049GoT interfaceC10049GoT3 = ((AbstractC9919GlE) c9983Gmz2).A00;
            interfaceC10049GoT = interfaceC10049GoT3;
            c9983Gmz = c9983Gmz2;
            if (interfaceC10049GoT3 == null) {
                A0D(c9983Gmz2);
                c9983Gmz2.A02[A09(c9983Gmz2)] = 91;
                return;
            }
        }
        interfaceC10049GoT.Aix(c9983Gmz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0l(Object obj) {
        C9983Gmz c9983Gmz;
        InterfaceC10049GoT interfaceC10049GoT;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            c9913Gl1.A03.A04();
            C9913Gl1.A03(EnumC9834GiY.START_ARRAY, c9913Gl1);
            c9913Gl1.A03 = c9913Gl1.A03.A08(obj);
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0C(gn0, obj);
            InterfaceC10049GoT interfaceC10049GoT2 = ((AbstractC9919GlE) gn0).A00;
            interfaceC10049GoT = interfaceC10049GoT2;
            c9983Gmz = gn0;
            if (interfaceC10049GoT2 == null) {
                A0G(gn0, gn0.A03);
                char[] cArr = gn0.A04;
                int i = gn0.A03;
                gn0.A03 = i + 1;
                cArr[i] = '[';
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            A0C(c9983Gmz2, obj);
            InterfaceC10049GoT interfaceC10049GoT3 = ((AbstractC9919GlE) c9983Gmz2).A00;
            interfaceC10049GoT = interfaceC10049GoT3;
            c9983Gmz = c9983Gmz2;
            if (interfaceC10049GoT3 == null) {
                A0D(c9983Gmz2);
                c9983Gmz2.A02[A09(c9983Gmz2)] = 91;
                return;
            }
        }
        interfaceC10049GoT.Aix(c9983Gmz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0m(Object obj) {
        C9983Gmz c9983Gmz;
        InterfaceC10049GoT interfaceC10049GoT;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            c9913Gl1.A03.A04();
            C9913Gl1.A03(EnumC9834GiY.START_OBJECT, c9913Gl1);
            c9913Gl1.A03 = c9913Gl1.A03.A09(obj);
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            gn0.A12("start an object");
            C10018Gnq c10018Gnq = ((AbstractC9932GlT) gn0).A02;
            C10018Gnq c10018GnqA09 = c10018Gnq.A09(obj);
            ((AbstractC9979Gmv) gn0).A05.A00(((AbstractC10020Gns) c10018Gnq).A01);
            ((AbstractC9932GlT) gn0).A02 = c10018GnqA09;
            InterfaceC10049GoT interfaceC10049GoT2 = ((AbstractC9919GlE) gn0).A00;
            interfaceC10049GoT = interfaceC10049GoT2;
            c9983Gmz = gn0;
            if (interfaceC10049GoT2 == null) {
                A0G(gn0, gn0.A03);
                char[] cArr = gn0.A04;
                int i = gn0.A03;
                gn0.A03 = i + 1;
                cArr[i] = '{';
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            c9983Gmz2.A12("start an object");
            C10018Gnq c10018GnqA092 = ((AbstractC9932GlT) c9983Gmz2).A02.A09(obj);
            ((AbstractC9979Gmv) c9983Gmz2).A05.A00(((AbstractC10020Gns) c10018GnqA092).A01);
            ((AbstractC9932GlT) c9983Gmz2).A02 = c10018GnqA092;
            InterfaceC10049GoT interfaceC10049GoT3 = ((AbstractC9919GlE) c9983Gmz2).A00;
            interfaceC10049GoT = interfaceC10049GoT3;
            c9983Gmz = c9983Gmz2;
            if (interfaceC10049GoT3 == null) {
                A0D(c9983Gmz2);
                c9983Gmz2.A02[A09(c9983Gmz2)] = 123;
                return;
            }
        }
        interfaceC10049GoT.Aiy(c9983Gmz);
    }

    public final void A0n(Object obj) {
        if (!(this instanceof C9913Gl1)) {
            A0m(obj);
            return;
        }
        C9913Gl1 c9913Gl1 = (C9913Gl1) this;
        c9913Gl1.A03.A04();
        C9913Gl1.A03(EnumC9834GiY.START_OBJECT, c9913Gl1);
        c9913Gl1.A03 = c9913Gl1.A03.A09(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (((X.AbstractC9979Gmv) r8).A02 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0o(java.lang.String r9) throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0o(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0p(String str) throws IOException {
        C9983Gmz c9983Gmz;
        if (this instanceof C9913Gl1) {
            C9913Gl1.A05(EnumC9834GiY.VALUE_NUMBER_FLOAT, (C9913Gl1) this, str);
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0B(gn0);
            if (str == null) {
                Gn0.A04(gn0);
                return;
            }
            boolean z = ((AbstractC9932GlT) gn0).A03;
            c9983Gmz = gn0;
            if (z) {
                Gn0.A06(gn0, str);
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            A0B(c9983Gmz2);
            if (str == null) {
                C9983Gmz.A06(c9983Gmz2);
                return;
            }
            boolean z2 = ((AbstractC9932GlT) c9983Gmz2).A03;
            c9983Gmz = c9983Gmz2;
            if (z2) {
                C9983Gmz.A0K(c9983Gmz2, str);
                return;
            }
        }
        c9983Gmz.A0q(str);
    }

    public final void A0q(String str) throws IOException {
        int i;
        char c;
        int i2;
        char[] cArr;
        if (this instanceof C9913Gl1) {
            throw C8j3.A18("Called operation not supported for TokenBuffer");
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            int length = str.length();
            int i3 = gn0.A01;
            int i4 = gn0.A03;
            int i5 = i3 - i4;
            if (i5 == 0) {
                Gn0.A03(gn0);
                i4 = gn0.A03;
                i5 = i3 - i4;
            }
            if (i5 >= length) {
                str.getChars(0, length, gn0.A04, i4);
                i2 = gn0.A03 + length;
            } else {
                str.getChars(0, i5, gn0.A04, i4);
                gn0.A03 += i5;
                Gn0.A03(gn0);
                i2 = length - i5;
                while (true) {
                    cArr = gn0.A04;
                    if (i2 <= i3) {
                        break;
                    }
                    int i6 = i5 + i3;
                    str.getChars(i5, i6, cArr, 0);
                    gn0.A02 = 0;
                    gn0.A03 = i3;
                    Gn0.A03(gn0);
                    i2 -= i3;
                    i5 = i6;
                }
                str.getChars(i5, i5 + i2, cArr, 0);
                gn0.A02 = 0;
            }
            gn0.A03 = i2;
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        int length2 = str.length();
        char[] cArr2 = c9983Gmz.A03;
        int length3 = cArr2.length;
        if (length2 <= length3) {
            str.getChars(0, length2, cArr2, 0);
            c9983Gmz.A0x(cArr2, length2);
            return;
        }
        int i7 = 0;
        if (((length2 - length2) | length2 | length2) < 0) {
            Integer numValueOf = Integer.valueOf(length2);
            throw new JsonGenerationException(c9983Gmz, String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", 0, numValueOf, numValueOf));
        }
        int i8 = c9983Gmz.A05;
        int iMin = Math.min(length3, (i8 >> 2) + (i8 >> 4));
        int i9 = iMin * 3;
        do {
            int iMin2 = Math.min(iMin, length2);
            str.getChars(i7, i7 + iMin2, cArr2, 0);
            if (c9983Gmz.A01 + i9 > i8) {
                C9983Gmz.A05(c9983Gmz);
            }
            if (iMin2 > 1 && (c = cArr2[iMin2 - 1]) >= '\ud800' && c <= '\udbff') {
                iMin2 = i;
            }
            int iA03 = 0;
            while (iA03 < iMin2) {
                do {
                    char c2 = cArr2[iA03];
                    if (c2 > '\u007f') {
                        iA03++;
                        if (c2 < '\u0800') {
                            byte[] bArr = c9983Gmz.A02;
                            AbstractC7608F5v.A1B(c2, bArr, A0A(c9983Gmz, bArr, c2));
                        } else {
                            iA03 = C9983Gmz.A03(c9983Gmz, cArr2, c2, iA03, iMin2);
                        }
                    } else {
                        c9983Gmz.A02[A09(c9983Gmz)] = (byte) c2;
                        iA03++;
                    }
                } while (iA03 < iMin2);
            }
            i7 += iMin2;
            length2 -= iMin2;
        } while (length2 > 0);
    }

    public final void A0r(String str) throws IOException {
        if (!(this instanceof C9913Gl1)) {
            AbstractC9932GlT abstractC9932GlT = (AbstractC9932GlT) this;
            abstractC9932GlT.A12("write raw value");
            abstractC9932GlT.A0q(str);
        } else {
            EnumC9834GiY enumC9834GiY = EnumC9834GiY.VALUE_EMBEDDED_OBJECT;
            C9810Ghi c9810Ghi = new C9810Ghi();
            c9810Ghi.A00 = str;
            C9913Gl1.A05(enumC9834GiY, (C9913Gl1) this, c9810Ghi);
        }
    }

    public final void A0s(String str) {
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            if (str == null) {
                c9913Gl1.A0R();
                return;
            } else {
                C9913Gl1.A05(EnumC9834GiY.VALUE_STRING, c9913Gl1, str);
                return;
            }
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            gn0.A12("write a string");
            if (str == null) {
                Gn0.A04(gn0);
                return;
            }
            int i = gn0.A03;
            int i2 = gn0.A01;
            if (i >= i2) {
                Gn0.A03(gn0);
            }
            char cA08 = A08(gn0);
            Gn0.A07(gn0, str);
            if (gn0.A03 >= i2) {
                Gn0.A03(gn0);
            }
            A0F(gn0, cA08);
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        c9983Gmz.A12("write a string");
        if (str == null) {
            C9983Gmz.A06(c9983Gmz);
            return;
        }
        int length = str.length();
        if (length > c9983Gmz.A06) {
            C9983Gmz.A0M(c9983Gmz, str, true);
            return;
        }
        int i3 = c9983Gmz.A01 + length;
        int i4 = c9983Gmz.A05;
        if (i3 >= i4) {
            C9983Gmz.A05(c9983Gmz);
        }
        byte[] bArr = c9983Gmz.A02;
        int iA09 = A09(c9983Gmz);
        byte b = c9983Gmz.A00;
        bArr[iA09] = b;
        C9983Gmz.A0L(c9983Gmz, str, 0, length);
        if (c9983Gmz.A01 >= i4) {
            C9983Gmz.A05(c9983Gmz);
        }
        A0E(c9983Gmz, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0t(BigDecimal bigDecimal) throws IOException {
        String strA10;
        C9983Gmz c9983Gmz;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            if (bigDecimal == null) {
                c9913Gl1.A0R();
                return;
            } else {
                C9913Gl1.A05(EnumC9834GiY.VALUE_NUMBER_FLOAT, c9913Gl1, bigDecimal);
                return;
            }
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0B(gn0);
            if (bigDecimal == null) {
                Gn0.A04(gn0);
                return;
            }
            boolean z = ((AbstractC9932GlT) gn0).A03;
            strA10 = gn0.A10(bigDecimal);
            c9983Gmz = gn0;
            if (z) {
                Gn0.A06(gn0, strA10);
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            A0B(c9983Gmz2);
            if (bigDecimal == null) {
                C9983Gmz.A06(c9983Gmz2);
                return;
            }
            boolean z2 = ((AbstractC9932GlT) c9983Gmz2).A03;
            strA10 = c9983Gmz2.A10(bigDecimal);
            c9983Gmz = c9983Gmz2;
            if (z2) {
                C9983Gmz.A0K(c9983Gmz2, strA10);
                return;
            }
        }
        c9983Gmz.A0q(strA10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0u(BigInteger bigInteger) throws IOException {
        String string;
        C9983Gmz c9983Gmz;
        if (this instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) this;
            if (bigInteger == null) {
                c9913Gl1.A0R();
                return;
            } else {
                C9913Gl1.A05(EnumC9834GiY.VALUE_NUMBER_INT, c9913Gl1, bigInteger);
                return;
            }
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0B(gn0);
            if (bigInteger == null) {
                Gn0.A04(gn0);
                return;
            }
            boolean z = ((AbstractC9932GlT) gn0).A03;
            string = bigInteger.toString();
            c9983Gmz = gn0;
            if (z) {
                Gn0.A06(gn0, string);
                return;
            }
        } else {
            C9983Gmz c9983Gmz2 = (C9983Gmz) this;
            A0B(c9983Gmz2);
            if (bigInteger == null) {
                C9983Gmz.A06(c9983Gmz2);
                return;
            }
            boolean z2 = ((AbstractC9932GlT) c9983Gmz2).A03;
            string = bigInteger.toString();
            c9983Gmz = c9983Gmz2;
            if (z2) {
                C9983Gmz.A0K(c9983Gmz2, string);
                return;
            }
        }
        c9983Gmz.A0q(string);
    }

    public final void A0v(short s) {
        if (this instanceof C9913Gl1) {
            C9913Gl1.A05(EnumC9834GiY.VALUE_NUMBER_INT, (C9913Gl1) this, Short.valueOf(s));
            return;
        }
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            A0B(gn0);
            if (!((AbstractC9932GlT) gn0).A03) {
                A0G(gn0, gn0.A03 + 6);
                gn0.A03 = AbstractC6798Ea9.A01(s, gn0.A04, gn0.A03);
                return;
            }
            A0G(gn0, gn0.A03 + 8);
            char[] cArr = gn0.A04;
            int i = gn0.A03;
            int i2 = i + 1;
            gn0.A03 = i2;
            char c = gn0.A00;
            cArr[i] = c;
            int iA01 = AbstractC6798Ea9.A01(s, cArr, i2);
            char[] cArr2 = gn0.A04;
            gn0.A03 = iA01 + 1;
            cArr2[iA01] = c;
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        A0B(c9983Gmz);
        int i3 = c9983Gmz.A01 + 6;
        int i4 = c9983Gmz.A05;
        if (i3 >= i4) {
            C9983Gmz.A05(c9983Gmz);
        }
        if (!((AbstractC9932GlT) c9983Gmz).A03) {
            c9983Gmz.A01 = AbstractC6798Ea9.A04(c9983Gmz.A02, s, c9983Gmz.A01);
            return;
        }
        if (c9983Gmz.A01 + 8 >= i4) {
            C9983Gmz.A05(c9983Gmz);
        }
        byte[] bArr = c9983Gmz.A02;
        int i5 = c9983Gmz.A01;
        int i6 = i5 + 1;
        c9983Gmz.A01 = i6;
        byte b = c9983Gmz.A00;
        bArr[i5] = b;
        int iA04 = AbstractC6798Ea9.A04(bArr, s, i6);
        byte[] bArr2 = c9983Gmz.A02;
        c9983Gmz.A01 = iA04 + 1;
        bArr2[iA04] = b;
    }

    public final void A0w(boolean z) {
        int i;
        if (this instanceof C9913Gl1) {
            C9913Gl1.A04(z ? EnumC9834GiY.VALUE_TRUE : EnumC9834GiY.VALUE_FALSE, (C9913Gl1) this);
            return;
        }
        if (!(this instanceof Gn0)) {
            C9983Gmz c9983Gmz = (C9983Gmz) this;
            c9983Gmz.A12("write a boolean value");
            if (c9983Gmz.A01 + 5 >= c9983Gmz.A05) {
                C9983Gmz.A05(c9983Gmz);
            }
            byte[] bArr = z ? C9983Gmz.A0B : C9983Gmz.A08;
            int length = bArr.length;
            System.arraycopy(bArr, 0, c9983Gmz.A02, c9983Gmz.A01, length);
            c9983Gmz.A01 += length;
            return;
        }
        Gn0 gn0 = (Gn0) this;
        gn0.A12("write a boolean value");
        A0G(gn0, gn0.A03 + 5);
        int i2 = gn0.A03;
        char[] cArr = gn0.A04;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
        }
        cArr[i] = 'e';
        gn0.A03 = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[PHI: r6
  0x0067: PHI (r6v9 int) = (r6v6 int), (r6v10 int) binds: [B:30:0x0063, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0y(char[] r11, int r12, int r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9919GlE.A0y(char[], int, int):void");
    }

    public final boolean A0z(EnumC9998GnS enumC9998GnS) {
        if (this instanceof C9913Gl1) {
            return AbstractC7609F5w.A1U(enumC9998GnS._mask, ((C9913Gl1) this).A01);
        }
        return AbstractC7609F5w.A1U(enumC9998GnS._mask, ((AbstractC9932GlT) this).A00);
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    static {
        C10037GoH<EnumC10052GoW> c10037GoH;
        C10037GoH<EnumC10052GoW> c10037GoHA00 = C10037GoH.A00(EnumC10052GoW.values());
        A03 = c10037GoHA00;
        EnumC10052GoW enumC10052GoW = EnumC10052GoW.CAN_WRITE_FORMATTED_NUMBERS;
        int i = c10037GoHA00._enabled;
        int i2 = enumC10052GoW._mask | i;
        if (i2 == i) {
            c10037GoH = c10037GoHA00;
        } else {
            c10037GoH = new C10037GoH<>();
            c10037GoH._enabled = i2;
        }
        A02 = c10037GoH;
        EnumC10052GoW enumC10052GoW2 = EnumC10052GoW.CAN_WRITE_BINARY_NATIVELY;
        int i3 = c10037GoHA00._enabled;
        int i4 = enumC10052GoW2._mask | i3;
        if (i4 != i3) {
            c10037GoHA00 = new C10037GoH<>();
            c10037GoHA00._enabled = i4;
        }
        A01 = c10037GoHA00;
    }
}
