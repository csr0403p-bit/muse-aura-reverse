package X;

import androidx.media3.common.util.Util;
import com.facebook.acra.util.UrlEncodingWriter;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E1P {
    public int A00;
    public int A01;
    public byte[] A02 = Util.A07;
    public static final char[] A04 = {'\r', '\n'};
    public static final char[] A05 = {'\n'};
    public static final ImmutableSet<Charset> A03 = ImmutableSet.A03(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);

    public static final String A03(E1P e1p) {
        if (e1p.A04() == 0) {
            return null;
        }
        int i = e1p.A01;
        while (i < e1p.A00 && e1p.A02[i] != 0) {
            i++;
        }
        String strA0n = BV4.A0n(StandardCharsets.UTF_8, e1p.A02, i, i - i);
        e1p.A01 = i;
        if (i >= e1p.A00) {
            return strA0n;
        }
        e1p.A01 = i + 1;
        return strA0n;
    }

    public static int A01(int i, int i2, int i3, int i4) {
        long j = ((i & 7) << 2) | ((i2 & 48) >> 4);
        Preconditions.checkArgument(AnonymousClass002.A1M(((j >> 8) > 0L ? 1 : ((j >> 8) == 0L ? 0 : -1))), "out of range: %s", j);
        byte b = (byte) j;
        byte b2 = (byte) i3;
        long j2 = ((((byte) i2) & 15) << 4) | ((b2 & 60) >> 2);
        Preconditions.checkArgument(AnonymousClass002.A1M(((j2 >> 8) > 0L ? 1 : ((j2 >> 8) == 0L ? 0 : -1))), "out of range: %s", j2);
        byte b3 = (byte) j2;
        long j3 = ((b2 & 3) << 6) | (((byte) i4) & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
        Preconditions.checkArgument(AnonymousClass002.A1M(((j3 >> 8) > 0L ? 1 : ((j3 >> 8) == 0L ? 0 : -1))), "out of range: %s", j3);
        return 0 | ((b & 255) << 16) | ((b3 & 255) << 8) | (((byte) j3) & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if ((r5[r7 + 2] & 192) == 128) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[PHI: r3
  0x00d2: PHI (r3v5 int) = (r3v4 int), (r3v9 int) binds: [B:18:0x005f, B:47:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(X.E1P r13, java.nio.charset.Charset r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.A02(X.E1P, java.nio.charset.Charset):int");
    }

    public final int A04() {
        return Math.max(this.A00 - this.A01, 0);
    }

    public final int A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.A01 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.A01 = i6;
        int iA0D = i5 | BV6.A0D(bArr, i4);
        this.A01 = i + 4;
        return (bArr[i6] & 255) | iA0D;
    }

    public final int A06() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.A01 = i4;
        int iA0D = BV6.A0D(bArr, i2) | i3;
        int i5 = i + 3;
        this.A01 = i5;
        int i6 = iA0D | ((bArr[i4] & 255) << 16);
        this.A01 = i + 4;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    public final int A08() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = bArr[i] & 255;
        this.A01 = i + 2;
        return BV6.A0D(bArr, i2) | i3;
    }

    public final int A0A() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0B() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.A01 = i4;
        int iA0D = BV6.A0D(bArr, i2) | i3;
        this.A01 = i + 3;
        return (bArr[i4] & 255) | iA0D;
    }

    public final int A0D() {
        return BV8.A08(this, this.A02, this.A01);
    }

    public final long A0E() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i + 2;
        this.A01 = i3;
        long jA0K = (bArr[i] & 255) | (BV6.A0K(bArr, i2) << 8);
        int i4 = i + 3;
        this.A01 = i4;
        long jA0K2 = jA0K | (BV6.A0K(bArr, i3) << 16);
        int i5 = i + 4;
        this.A01 = i5;
        long jA0K3 = jA0K2 | (BV6.A0K(bArr, i4) << 24);
        int i6 = i + 5;
        this.A01 = i6;
        long jA0K4 = jA0K3 | (BV6.A0K(bArr, i5) << 32);
        int i7 = i + 6;
        this.A01 = i7;
        long jA0K5 = jA0K4 | (BV6.A0K(bArr, i6) << 40);
        int i8 = i + 7;
        this.A01 = i8;
        long jA0K6 = jA0K5 | (BV6.A0K(bArr, i7) << 48);
        this.A01 = i + 8;
        return (BV6.A0K(bArr, i8) << 56) | jA0K6;
    }

    public final long A0F() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i + 2;
        this.A01 = i3;
        long jA0K = (bArr[i] & 255) | (BV6.A0K(bArr, i2) << 8);
        int i4 = i + 3;
        this.A01 = i4;
        long jA0K2 = jA0K | (BV6.A0K(bArr, i3) << 16);
        this.A01 = i + 4;
        return (BV6.A0K(bArr, i4) << 24) | jA0K2;
    }

    public final long A0G() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i + 2;
        this.A01 = i3;
        long jA0K = ((bArr[i] & 255) << 56) | (BV6.A0K(bArr, i2) << 48);
        int i4 = i + 3;
        this.A01 = i4;
        long jA0K2 = jA0K | (BV6.A0K(bArr, i3) << 40);
        int i5 = i + 4;
        this.A01 = i5;
        long jA0K3 = jA0K2 | (BV6.A0K(bArr, i4) << 32);
        int i6 = i + 5;
        this.A01 = i6;
        long jA0K4 = jA0K3 | (BV6.A0K(bArr, i5) << 24);
        int i7 = i + 6;
        this.A01 = i7;
        long jA0K5 = jA0K4 | (BV6.A0K(bArr, i6) << 16);
        int i8 = i + 7;
        this.A01 = i8;
        long jA0K6 = jA0K5 | (BV6.A0K(bArr, i7) << 8);
        this.A01 = i + 8;
        return BV6.A0K(bArr, i8) | jA0K6;
    }

    public final long A0H() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i + 2;
        this.A01 = i3;
        long jA0K = ((bArr[i] & 255) << 24) | (BV6.A0K(bArr, i2) << 16);
        int i4 = i + 3;
        this.A01 = i4;
        long jA0K2 = jA0K | (BV6.A0K(bArr, i3) << 8);
        this.A01 = i + 4;
        return BV6.A0K(bArr, i4) | jA0K2;
    }

    public final long A0J() {
        int i;
        byte[] bArr = this.A02;
        int i2 = this.A01;
        long j = bArr[i2];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r13 - 1;
                i = 7 - i3;
                if (i != 0) {
                    for (int i4 = 1; i4 < i; i4++) {
                        if ((bArr[i2 + i4] & 192) != 128) {
                            throw BV6.A0k(FGI.A0B(j, "Invalid UTF-8 sequence continuation byte: "));
                        }
                        j = (j << 6) | (r9 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE);
                    }
                    this.A01 = i2 + i;
                    return j;
                }
            } else if (i3 == 7) {
                i = 1;
                this.A01 = i2 + i;
                return j;
            }
        }
        throw BV6.A0k(FGI.A0B(j, "Invalid UTF-8 sequence first byte: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0K(int r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            int r3 = r4.A01
            int r0 = r3 + r5
            int r1 = r0 + (-1)
            int r0 = r4.A00
            if (r1 >= r0) goto L17
            byte[] r0 = r4.A02
            r0 = r0[r1]
            int r2 = r5 + (-1)
            if (r0 == 0) goto L18
        L17:
            r2 = r5
        L18:
            byte[] r1 = r4.A02
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = X.BV4.A0n(r0, r1, r3, r2)
            int r0 = r4.A01
            int r0 = r0 + r5
            r4.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.A0K(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0L(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            com.google.common.collect.ImmutableSet<java.nio.charset.Charset> r0 = X.E1P.A03
            boolean r2 = r0.contains(r6)
            java.lang.String r1 = "Unsupported charset: "
            java.lang.String r0 = X.AnonymousClass007.A0a(r1, r6)
            X.C1G.A09(r2, r0)
            int r0 = r5.A04()
            if (r0 != 0) goto L17
            r2 = 0
        L16:
            return r2
        L17:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L22
            r5.A0N()
        L22:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4f
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L4f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4d
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4d
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4d
            java.lang.IllegalArgumentException r0 = X.BV5.A0O(r6, r1)
            throw r0
        L4d:
            r4 = 2
            goto L50
        L4f:
            r4 = 1
        L50:
            int r3 = r5.A01
        L52:
            int r1 = r5.A00
            int r0 = r4 + (-1)
            int r0 = r1 - r0
            if (r3 >= r0) goto Ld1
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L68
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L91
        L68:
            byte[] r0 = r5.A02
            r1 = r0[r3]
            r0 = 10
            if (r1 == r0) goto L74
            r0 = 13
            if (r1 != r0) goto L91
        L74:
            int r0 = r5.A01
            int r3 = r3 - r0
            java.lang.String r2 = r5.A0M(r6, r3)
            int r1 = r5.A01
            int r0 = r5.A00
            if (r1 == r0) goto L16
            char[] r0 = X.E1P.A04
            char r1 = r5.A00(r6, r0)
            r0 = 13
            if (r1 != r0) goto L16
            char[] r0 = X.E1P.A05
            r5.A00(r6, r0)
            return r2
        L91:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto La1
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb4
        La1:
            byte[] r1 = r5.A02
            r0 = r1[r3]
            if (r0 != 0) goto Lb4
            int r0 = r3 + 1
            r1 = r1[r0]
            r0 = 10
            if (r1 == r0) goto L74
            r0 = 13
            if (r1 != r0) goto Lb4
            goto L74
        Lb4:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lcf
            byte[] r1 = r5.A02
            int r0 = r3 + 1
            r0 = r1[r0]
            if (r0 != 0) goto Lcf
            r1 = r1[r3]
            r0 = 10
            if (r1 == r0) goto L74
            r0 = 13
            if (r1 != r0) goto Lcf
            goto L74
        Lcf:
            int r3 = r3 + r4
            goto L52
        Ld1:
            r3 = r1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.A0L(java.nio.charset.Charset):java.lang.String");
    }

    public final String A0M(Charset charset, int i) {
        String strA0n = BV4.A0n(charset, this.A02, this.A01, i);
        this.A01 += i;
        return strA0n;
    }

    public final void A0O(int i) {
        byte[] bArr = this.A02;
        if (i > bArr.length) {
            this.A02 = Arrays.copyOf(bArr, i);
        }
    }

    public final void A0P(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        A0T(bArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L8
            byte[] r0 = r2.A02
            int r1 = r0.length
            r0 = 1
            if (r3 <= r1) goto L9
        L8:
            r0 = 0
        L9:
            X.C1G.A07(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.A0Q(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0R(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L7
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L8
        L7:
            r0 = 0
        L8:
            X.C1G.A07(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.A0R(int):void");
    }

    public final void A0S(int i) {
        A0R(this.A01 + i);
    }

    public final void A0T(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    public final void A0U(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private char A00(java.nio.charset.Charset r12, char[] r13) {
        /*
            r11 = this;
            int r2 = r11.A04()
            com.google.common.collect.ImmutableSet<java.nio.charset.Charset> r0 = X.E1P.A03
            boolean r1 = r0.contains(r12)
            java.lang.String r0 = "Unsupported charset: "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r12)
            X.C1G.A09(r1, r0)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L24
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r12.equals(r0)
            r0 = 2
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            r10 = 0
            if (r2 < r0) goto L70
            int r7 = A02(r11, r12)
            if (r7 == 0) goto L70
            int r0 = r7 >>> 8
            long r2 = (long) r0
            r0 = 32
            long r8 = r2 >> r0
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass002.A1M(r0)
            java.lang.String r0 = "out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r2)
            int r1 = (int) r2
            boolean r0 = java.lang.Character.isSupplementaryCodePoint(r1)
            if (r0 != 0) goto L70
            long r2 = (long) r1
            int r0 = (int) r2
            char r4 = (char) r0
            long r5 = (long) r4
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass002.A1M(r0)
            java.lang.String r0 = "Out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r2)
            int r2 = r13.length
            r1 = 0
        L5a:
            if (r1 >= r2) goto L70
            char r0 = r13[r1]
            if (r0 != r4) goto L6d
            int r2 = r11.A01
            r0 = r7 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            int r0 = X.DX6.A00(r0)
            int r2 = r2 + r0
            r11.A01 = r2
            return r4
        L6d:
            int r1 = r1 + 1
            goto L5a
        L70:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1P.A00(java.nio.charset.Charset, char[]):char");
    }

    public final int A07() {
        int iA06 = A06();
        if (iA06 >= 0) {
            return iA06;
        }
        throw BV7.A0l("Top bit not zero: ", iA06);
    }

    public final int A09() {
        return (A0A() << 21) | (A0A() << 14) | (A0A() << 7) | A0A();
    }

    public final int A0C() {
        int iA05 = A05();
        if (iA05 >= 0) {
            return iA05;
        }
        throw BV7.A0l("Top bit not zero: ", iA05);
    }

    public final long A0I() {
        long jA0G = A0G();
        if (jA0G >= 0) {
            return jA0G;
        }
        throw C3cG.A0Q(FGI.A0B(jA0G, "Top bit not zero: "));
    }

    public final Charset A0N() {
        int iA04 = A04();
        if (iA04 >= 3) {
            byte[] bArr = this.A02;
            int i = this.A01;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.A01 = i + 3;
                return StandardCharsets.UTF_8;
            }
        } else if (iA04 < 2) {
            return null;
        }
        byte[] bArr2 = this.A02;
        int i2 = this.A01;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.A01 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.A01 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }
}
