package X;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

/* loaded from: classes6.dex */
public final class GGG extends GGT {
    public int A00;
    public int A02;
    public final byte[] A05;
    public int A01 = Integer.MAX_VALUE;
    public int A03 = 0;
    public int A04 = 0;

    public GGG(byte[] bArr) {
        this.A05 = bArr;
    }

    public static final int A00(GGG ggg) throws InvalidProtocolBufferException {
        int i = ggg.A04;
        if (ggg.A03 - i < 4) {
            throw AbstractC7608F5v.A0H();
        }
        byte[] bArr = ggg.A05;
        ggg.A04 = i + 4;
        return AbstractC7611F5y.A0E(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r4[r3] < 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(X.GGG r7) {
        /*
            int r5 = r7.A04
            int r1 = r7.A03
            if (r1 == r5) goto L67
            byte[] r4 = r7.A05
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L11
            r7.A04 = r3
            return r2
        L11:
            int r1 = r1 - r3
            r0 = 9
            if (r1 < r0) goto L67
            int r1 = r5 + 2
            r0 = r4[r3]
            int r6 = r0 << 7
            r6 = r6 ^ r2
            if (r6 >= 0) goto L22
            r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L71
        L22:
            int r3 = r5 + 3
            r0 = r4[r1]
            int r2 = r0 << 14
            r2 = r2 ^ r6
            if (r2 < 0) goto L2e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            goto L6e
        L2e:
            int r1 = r5 + 4
            r0 = r4[r3]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L3c
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L71
        L3c:
            int r3 = r5 + 5
            r1 = r4[r1]
            int r0 = r1 << 28
            r2 = r2 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r0
            if (r1 >= 0) goto L6d
            int r1 = r5 + 6
            r0 = r4[r3]
            if (r0 >= 0) goto L70
            int r3 = r5 + 7
            r0 = r4[r1]
            if (r0 >= 0) goto L6d
            int r1 = r5 + 8
            r0 = r4[r3]
            if (r0 >= 0) goto L70
            int r3 = r5 + 9
            r0 = r4[r1]
            if (r0 >= 0) goto L6d
            int r1 = r5 + 10
            r0 = r4[r3]
            if (r0 >= 0) goto L70
        L67:
            long r1 = r7.A02()
            int r0 = (int) r1
            return r0
        L6d:
            r0 = r2
        L6e:
            r1 = r3
            goto L71
        L70:
            r0 = r2
        L71:
            r7.A04 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGG.A01(X.GGG):int");
    }

    private final long A02() throws InvalidProtocolBufferException {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A04;
            if (i2 == this.A03) {
                throw AbstractC7608F5v.A0H();
            }
            byte[] bArr = this.A05;
            this.A04 = i2 + 1;
            j |= (r2 & Byte.MAX_VALUE) << i;
            if ((bArr[i2] & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw AbstractC7607F5u.A0k("CodedInputStream encountered a malformed varint.");
    }

    public static final long A03(GGG ggg) throws InvalidProtocolBufferException {
        int i = ggg.A04;
        if (ggg.A03 - i < 8) {
            throw AbstractC7608F5v.A0H();
        }
        byte[] bArr = ggg.A05;
        ggg.A04 = i + 8;
        return AbstractC7611F5y.A0J(bArr, i);
    }

    public static final long A04(GGG ggg) {
        long jA0K;
        long j;
        long j2;
        int i = ggg.A04;
        int i2 = ggg.A03;
        if (i2 != i) {
            byte[] bArr = ggg.A05;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                ggg.A04 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    jA0K = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        jA0K = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            jA0K = (-2080896) ^ i9;
                        } else {
                            i4 = i + 5;
                            long j3 = i9 ^ (bArr[i8] << 28);
                            if (j3 >= 0) {
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j4 = j3 ^ (bArr[i4] << 35);
                                if (j4 < 0) {
                                    j = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j3 = j4 ^ (bArr[i8] << 42);
                                    if (j3 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j4 = j3 ^ (bArr[i4] << 49);
                                        if (j4 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            jA0K = AbstractC7611F5y.A0K(bArr, i8, j4);
                                            if (jA0K < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                jA0K = j ^ j4;
                            }
                            jA0K = j2 ^ j3;
                        }
                        i4 = i8;
                    }
                }
                ggg.A04 = i4;
                return jA0K;
            }
        }
        return ggg.A02();
    }
}
