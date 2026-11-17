package X;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GGB extends GHR {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public GGB(InputStream inputStream) {
        Charset charset = AbstractC9352GFl.A04;
        this.A06 = inputStream;
        this.A07 = new byte[4096];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public static final int A00(GGB ggb) {
        int i = ggb.A03;
        if (ggb.A00 - i < 4) {
            A08(ggb, 4);
            i = ggb.A03;
        }
        byte[] bArr = ggb.A07;
        ggb.A03 = i + 4;
        return AbstractC7611F5y.A0E(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r4[r3] < 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(X.GGB r7) {
        /*
            int r5 = r7.A03
            int r1 = r7.A00
            if (r1 == r5) goto L67
            byte[] r4 = r7.A07
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L11
            r7.A03 = r3
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
            r7.A03 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGB.A01(X.GGB):int");
    }

    private final long A02() throws InvalidProtocolBufferException {
        long j = 0;
        int i = 0;
        do {
            if (this.A03 == this.A00) {
                A08(this, 1);
            }
            byte[] bArr = this.A07;
            int i2 = this.A03;
            this.A03 = i2 + 1;
            j |= (r2 & Byte.MAX_VALUE) << i;
            if ((bArr[i2] & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw AbstractC7609F5w.A0c("CodedInputStream encountered a malformed varint.");
    }

    public static final long A03(GGB ggb) {
        int i = ggb.A03;
        if (ggb.A00 - i < 8) {
            A08(ggb, 8);
            i = ggb.A03;
        }
        byte[] bArr = ggb.A07;
        ggb.A03 = i + 8;
        return AbstractC7611F5y.A0J(bArr, i);
    }

    public static final long A04(GGB ggb) {
        long jA0K;
        long j;
        long j2;
        int i = ggb.A03;
        int i2 = ggb.A00;
        if (i2 != i) {
            byte[] bArr = ggb.A07;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                ggb.A03 = i3;
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
                ggb.A03 = i4;
                return jA0K;
            }
        }
        return ggb.A02();
    }

    private final void A06(final int size) throws InvalidProtocolBufferException {
        int i;
        int i2 = this.A00;
        int i3 = this.A03;
        int i4 = i2 - i3;
        if (size <= i4) {
            if (size >= 0) {
                i = i3 + size;
                this.A03 = i;
                return;
            }
            throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (size >= 0) {
            int i5 = this.A04;
            int i6 = i5 + i3;
            int i7 = i6 + size;
            int i8 = this.A01;
            if (i7 > i8) {
                A06((i8 - i5) - i3);
                throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.A04 = i6;
            this.A00 = 0;
            this.A03 = 0;
            while (i4 < size) {
                int i9 = size - i4;
                try {
                    InputStream inputStream = this.A06;
                    long j = i9;
                    try {
                        long jSkip = inputStream.skip(j);
                        if (jSkip >= 0 && jSkip <= j) {
                            if (jSkip == 0) {
                                break;
                            } else {
                                i4 += (int) jSkip;
                            }
                        } else {
                            StringBuilder sbA12 = AbstractC7610F5x.A12(inputStream);
                            sbA12.append("#skip returned invalid result: ");
                            sbA12.append(jSkip);
                            throw BV8.A0m("\nThe InputStream implementation is buggy.", sbA12);
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.wasThrownFromInputStream = true;
                        throw e;
                    }
                } finally {
                    this.A04 += i4;
                    A07(this);
                }
            }
            if (i4 < size) {
                int i10 = this.A00;
                int i11 = i10 - this.A03;
                this.A03 = i10;
                while (true) {
                    A08(this, 1);
                    i = size - i11;
                    int i12 = this.A00;
                    if (i <= i12) {
                        break;
                    }
                    i11 += i12;
                    this.A03 = i12;
                }
                this.A03 = i;
                return;
            }
            return;
        }
        throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static void A07(GGB ggb) {
        int i = ggb.A00 + ggb.A05;
        ggb.A00 = i;
        int i2 = ggb.A04 + i;
        int i3 = ggb.A01;
        if (i2 <= i3) {
            ggb.A05 = 0;
            return;
        }
        int i4 = i2 - i3;
        ggb.A05 = i4;
        ggb.A00 = i - i4;
    }

    public static boolean A09(GGB ggb, int i) throws IOException {
        int i2 = ggb.A03;
        int i3 = i2 + i;
        int i4 = ggb.A00;
        if (i3 <= i4) {
            throw FGI.A04("refillBuffer() called when ", " bytes were already available in buffer", i);
        }
        int i5 = ggb.A04;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= ggb.A01) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = ggb.A07;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = ggb.A04 + i2;
                ggb.A04 = i5;
                i4 = ggb.A00 - i2;
                ggb.A00 = i4;
                ggb.A03 = 0;
            }
            InputStream inputStream = ggb.A06;
            try {
                int i6 = inputStream.read(ggb.A07, i4, C8j3.A0F(Integer.MAX_VALUE - i5, i4, 4096 - i4));
                if (i6 == 0 || i6 < -1 || i6 > 4096) {
                    StringBuilder sbA12 = AbstractC7610F5x.A12(inputStream);
                    sbA12.append("#read(byte[]) returned invalid result: ");
                    sbA12.append(i6);
                    throw BV8.A0m("\nThe InputStream implementation is buggy.", sbA12);
                }
                if (i6 > 0) {
                    ggb.A00 += i6;
                    A07(ggb);
                    if (ggb.A00 >= i || A09(ggb, i)) {
                        return true;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                e.wasThrownFromInputStream = true;
                throw e;
            }
        }
        return false;
    }

    public static byte[] A0B(GGB ggb, int i) {
        int i2 = ggb.A04;
        int i3 = ggb.A03;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw AbstractC7609F5w.A0c("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = ggb.A01;
        if (i4 <= i5) {
            int i6 = ggb.A00 - i3;
            int i7 = i - i6;
            if (i7 >= 4096) {
                try {
                    if (i7 > ggb.A06.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.wasThrownFromInputStream = true;
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(ggb.A07, ggb.A03, bArr, 0, i6);
            ggb.A04 += ggb.A00;
            ggb.A03 = 0;
            ggb.A00 = 0;
            while (i6 < i) {
                int i8 = ggb.A06.read(bArr, i6, i - i6);
                if (i8 != -1) {
                    ggb.A04 += i8;
                    i6 += i8;
                }
            }
            return bArr;
        }
        ggb.A06((i5 - i2) - i3);
        throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static ArrayList A05(GGB ggb, int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = ggb.A06.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                ggb.A04 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayListA0h.add(bArr);
        }
        return arrayListA0h;
    }

    public static void A08(GGB ggb, int i) {
        if (A09(ggb, i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - ggb.A04) - ggb.A03) {
            throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw AbstractC7609F5w.A0c("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public static byte[] A0A(final GGB size, int ensureNoLeakedReferences) {
        byte[] bArrA0B = A0B(size, ensureNoLeakedReferences);
        if (bArrA0B != null) {
            return bArrA0B;
        }
        int i = size.A03;
        int i2 = size.A00;
        int iA0O = i2 - i;
        size.A04 += i2;
        size.A03 = 0;
        size.A00 = 0;
        ArrayList arrayListA05 = A05(size, ensureNoLeakedReferences - iA0O);
        byte[] bArr = new byte[ensureNoLeakedReferences];
        System.arraycopy(size.A07, i, bArr, 0, iA0O);
        Iterator it = arrayListA05.iterator();
        while (it.hasNext()) {
            iA0O = AbstractC7610F5x.A0O(bArr, it, iA0O);
        }
        return bArr;
    }
}
