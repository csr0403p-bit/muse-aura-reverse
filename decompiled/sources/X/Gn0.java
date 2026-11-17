package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class Gn0 extends AbstractC9979Gmv {
    public char A00;
    public int A01;
    public int A02;
    public int A03;
    public char[] A04;
    public char[] A05;
    public final Writer A06;
    public static final char[] A08 = AbstractC10006Gne.A01(true);
    public static final char[] A07 = AbstractC10006Gne.A01(false);

    public static int A00(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i < i2) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0 || (i4 = inputStream.read(bArr, i5, i6)) < 0) {
                break;
            }
            i5 += i4;
        } while (i5 < 3);
        return i5;
    }

    private void A02(int i, char c) throws IOException {
        int i2;
        if (i >= 0) {
            int i3 = this.A03;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.A02 = i4;
                char[] cArr = this.A04;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrA0L = this.A05;
            if (cArrA0L == null) {
                cArrA0L = A0L();
            }
            this.A02 = i3;
            cArrA0L[1] = (char) i;
            this.A06.write(cArrA0L, 0, 2);
            return;
        }
        if (i == -2) {
            throw BV4.A0a("getEscapeSequence");
        }
        char[] cArr2 = ((AbstractC9979Gmv) this).A03 ? A08 : A07;
        int i5 = this.A03;
        if (i5 < 6) {
            char[] cArrA0L2 = this.A05;
            if (cArrA0L2 == null) {
                cArrA0L2 = A0L();
            }
            this.A02 = i5;
            if (c > '\u00ff') {
                A0K(this, cArr2, cArrA0L2, c);
                return;
            }
            cArrA0L2[6] = cArr2[c >> 4];
            cArrA0L2[7] = cArr2[c & 15];
            this.A06.write(cArrA0L2, 2, 6);
            return;
        }
        char[] cArr3 = this.A04;
        int i6 = i5 - 6;
        this.A02 = i6;
        cArr3[i6] = '\\';
        cArr3[i5 - 5] = 'u';
        if (c > '\u00ff') {
            int i7 = c >> '\b';
            cArr3[i5 - 4] = cArr2[(i7 & 255) >> 4];
            i2 = i5 - 3;
            cArr3[i2] = cArr2[i7 & 15];
            c = (char) (c & '\u00ff');
        } else {
            cArr3[i5 - 4] = '0';
            i2 = i5 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c >> 4];
        cArr3[i2 + 2] = cArr2[c & 15];
    }

    public static void A0K(Gn0 gn0, char[] cArr, char[] cArr2, int i) throws IOException {
        int i2 = i >> 8;
        cArr2[10] = cArr[(i2 & 255) >> 4];
        cArr2[11] = cArr[i2 & 15];
        cArr2[12] = cArr[(i & 255) >> 4];
        cArr2[13] = cArr[i & 15];
        gn0.A06.write(cArr2, 8, 6);
    }

    private int A01(char[] cArr, char c, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrA0L = this.A05;
            if (cArrA0L == null) {
                cArrA0L = A0L();
            }
            cArrA0L[1] = (char) i3;
            this.A06.write(cArrA0L, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw BV4.A0a("getEscapeSequence");
        }
        char[] cArr2 = ((AbstractC9979Gmv) this).A03 ? A08 : A07;
        if (i <= 5 || i >= i2) {
            char[] cArrA0L2 = this.A05;
            if (cArrA0L2 == null) {
                cArrA0L2 = A0L();
            }
            this.A02 = this.A03;
            if (c > '\u00ff') {
                A0K(this, cArr2, cArrA0L2, c);
                return i;
            }
            cArrA0L2[6] = cArr2[c >> 4];
            cArrA0L2[7] = cArr2[c & 15];
            this.A06.write(cArrA0L2, 2, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i6 = i - 4;
        cArr[i - 5] = 'u';
        if (c > '\u00ff') {
            int i7 = c >> '\b';
            cArr[i6] = cArr2[(i7 & 255) >> 4];
            i4 = i - 2;
            cArr[i - 3] = cArr2[i7 & 15];
            c = (char) (c & '\u00ff');
        } else {
            cArr[i6] = '0';
            i4 = i - 2;
            cArr[i - 3] = '0';
        }
        cArr[i4] = cArr2[c >> 4];
        cArr[i4 + 1] = cArr2[c & 15];
        return i4 - 4;
    }

    public static final void A03(Gn0 gn0) {
        int i = gn0.A03;
        int i2 = gn0.A02;
        int i3 = i - i2;
        if (i3 > 0) {
            gn0.A02 = 0;
            gn0.A03 = 0;
            gn0.A06.write(gn0.A04, i2, i3);
        }
    }

    public static final void A04(Gn0 gn0) {
        AbstractC9919GlE.A0G(gn0, gn0.A03 + 4);
        int i = gn0.A03;
        char[] cArr = gn0.A04;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        gn0.A03 = i + 4;
    }

    public static void A05(Gn0 gn0, char c, int i) {
        int i2;
        if (i >= 0) {
            if (gn0.A03 + 2 > gn0.A01) {
                A03(gn0);
            }
            char[] cArr = gn0.A04;
            int i3 = gn0.A03;
            int i4 = i3 + 1;
            gn0.A03 = i4;
            cArr[i3] = '\\';
            gn0.A03 = i3 + 2;
            cArr[i4] = (char) i;
            return;
        }
        if (i == -2) {
            throw BV4.A0a("getEscapeSequence");
        }
        AbstractC9919GlE.A0G(gn0, gn0.A03 + 5);
        int i5 = gn0.A03;
        char[] cArr2 = gn0.A04;
        char[] cArr3 = ((AbstractC9979Gmv) gn0).A03 ? A08 : A07;
        cArr2[i5] = '\\';
        int i6 = i5 + 2;
        cArr2[i5 + 1] = 'u';
        if (c > '\u00ff') {
            int i7 = c >> '\b';
            cArr2[i6] = cArr3[(i7 & 255) >> 4];
            i2 = i5 + 4;
            cArr2[i5 + 3] = cArr3[i7 & 15];
            c = (char) (c & '\u00ff');
        } else {
            cArr2[i6] = '0';
            i2 = i5 + 4;
            cArr2[i5 + 3] = '0';
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        gn0.A03 = i2 + 2;
    }

    public static void A06(Gn0 gn0, String str) {
        int i = gn0.A03;
        int i2 = gn0.A01;
        if (i >= i2) {
            A03(gn0);
        }
        char cA08 = AbstractC9919GlE.A08(gn0);
        gn0.A0q(str);
        if (gn0.A03 >= i2) {
            A03(gn0);
        }
        AbstractC9919GlE.A0F(gn0, cA08);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[PHI: r20
  0x0061: PHI (r20v7 int) = (r20v4 int), (r20v8 int) binds: [B:23:0x005c, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.Gn0 r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gn0.A07(X.Gn0, java.lang.String):void");
    }

    private char[] A0L() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.A05 = cArr;
        return cArr;
    }

    public Gn0(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, Writer writer, char c, int i) {
        super(abstractC9794GhC, c9984Gn6, i);
        this.A06 = writer;
        C9984Gn6.A00(c9984Gn6.A04);
        char[] cArrA03 = c9984Gn6.A0C.A03(1, 0);
        c9984Gn6.A04 = cArrA03;
        this.A04 = cArrA03;
        this.A01 = cArrA03.length;
        this.A00 = c;
        boolean zA0z = A0z(EnumC9999GnU.A01._mappedFeature);
        if (c != '\"' || zA0z) {
            ((AbstractC9979Gmv) this).A04 = AbstractC10006Gne.A02(c, zA0z);
        }
    }

    @Override // X.AbstractC9932GlT, X.AbstractC9919GlE, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        super.close();
        try {
            if (this.A04 != null && A0z(EnumC9998GnS.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    int i = ((AbstractC10020Gns) ((AbstractC9932GlT) this).A02).A02;
                    if (i != 1) {
                        if (i != 2) {
                            break;
                        } else {
                            A0Q();
                        }
                    } else {
                        A0P();
                    }
                }
            }
            A03(this);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.A02 = 0;
        this.A03 = 0;
        Writer writer = this.A06;
        if (writer != null) {
            try {
                if (((AbstractC9932GlT) this).A05.A0D || A0z(EnumC9998GnS.AUTO_CLOSE_TARGET)) {
                    writer.close();
                } else if (A0z(EnumC9998GnS.FLUSH_PASSED_TO_STREAM)) {
                    writer.flush();
                }
            } catch (IOException | RuntimeException e2) {
                if (e != null) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e);
                }
                throw e2;
            }
        }
        char[] cArr = this.A04;
        if (cArr != null) {
            this.A04 = null;
            C9984Gn6 c9984Gn6 = ((AbstractC9932GlT) this).A05;
            char[] cArr2 = c9984Gn6.A04;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw C60O.A0i("Trying to release buffer smaller than original");
            }
            c9984Gn6.A04 = null;
            c9984Gn6.A0C.A02(cArr, 1);
        }
        if (e != null) {
            throw e;
        }
    }
}
