package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.DiR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5430DiR {
    public long A00;
    public C5484DjM A01;
    public C5484DjM A02;
    public C5484DjM A03;
    public final int A04 = 65536;
    public final E1P A05 = BV6.A0Y(32);
    public final InterfaceC5538DkF A06;

    public static int A00(C5430DiR c5430DiR, int i) {
        C5523Djz c5523Djz;
        C5484DjM c5484DjM = c5430DiR.A03;
        C5484DjM c5484DjM2 = c5484DjM;
        if (c5484DjM.A03 == null) {
            C5462Dix c5462Dix = (C5462Dix) c5430DiR.A06;
            synchronized (c5462Dix) {
                int i2 = c5462Dix.A00 + 1;
                c5462Dix.A00 = i2;
                int i3 = c5462Dix.A01;
                if (i3 > 0) {
                    C5523Djz[] c5523DjzArr = c5462Dix.A02;
                    int i4 = i3 - 1;
                    c5462Dix.A01 = i4;
                    c5523Djz = c5523DjzArr[i4];
                    c5523Djz.getClass();
                    c5462Dix.A02[c5462Dix.A01] = null;
                } else {
                    c5523Djz = new C5523Djz(new byte[65536]);
                    C5523Djz[] c5523DjzArr2 = c5462Dix.A02;
                    int length = c5523DjzArr2.length;
                    if (i2 > length) {
                        c5462Dix.A02 = (C5523Djz[]) Arrays.copyOf(c5523DjzArr2, length * 2);
                    }
                }
            }
            c5484DjM2 = c5430DiR.A03;
            C5484DjM c5484DjM3 = new C5484DjM(c5484DjM2.A00);
            c5484DjM.A03 = c5523Djz;
            c5484DjM.A02 = c5484DjM3;
        }
        return Math.min(i, (int) (c5484DjM2.A00 - c5430DiR.A00));
    }

    public static C5484DjM A01(E1P e1p, Di2 di2, C5484DjM c5484DjM, C5516Djs c5516Djs) {
        long j;
        ByteBuffer byteBuffer;
        int iA0D;
        if (AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1073741824, 1073741824)) {
            long j2 = c5516Djs.A01;
            e1p.A0P(1);
            C5484DjM c5484DjMA03 = A03(c5484DjM, e1p.A02, 1, j2);
            long j3 = j2 + 1;
            byte b = e1p.A02[0];
            boolean zA1L = AnonymousClass002.A1L(b & 128);
            int i = b & Byte.MAX_VALUE;
            C5473Dj9 c5473Dj9 = di2.A05;
            byte[] bArr = c5473Dj9.A00;
            if (bArr == null) {
                c5473Dj9.A00 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c5484DjM = A03(c5484DjMA03, c5473Dj9.A00, i, j3);
            long j4 = j3 + i;
            if (zA1L) {
                e1p.A0P(2);
                c5484DjM = A03(c5484DjM, e1p.A02, 2, j4);
                j4 += 2;
                iA0D = e1p.A0D();
            } else {
                iA0D = 1;
            }
            int[] iArr = c5473Dj9.A02;
            if (iArr == null || iArr.length < iA0D) {
                iArr = new int[iA0D];
            }
            int[] iArr2 = c5473Dj9.A03;
            if (iArr2 == null || iArr2.length < iA0D) {
                iArr2 = new int[iA0D];
            }
            if (zA1L) {
                int i2 = iA0D * 6;
                e1p.A0P(i2);
                c5484DjM = A03(c5484DjM, e1p.A02, i2, j4);
                j4 += i2;
                e1p.A0R(0);
                for (int i3 = 0; i3 < iA0D; i3++) {
                    iArr[i3] = e1p.A0D();
                    iArr2[i3] = e1p.A0C();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c5516Djs.A00 - ((int) (j4 - c5516Djs.A01));
            }
            DjB djB = c5516Djs.A02;
            byte[] bArr2 = djB.A03;
            byte[] bArr3 = c5473Dj9.A00;
            int i4 = djB.A01;
            int i5 = djB.A02;
            int i6 = djB.A00;
            c5473Dj9.A02 = iArr;
            c5473Dj9.A03 = iArr2;
            c5473Dj9.A01 = bArr2;
            c5473Dj9.A00 = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = c5473Dj9.A04;
            cryptoInfo.numSubSamples = iA0D;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            C5504Djg c5504Djg = c5473Dj9.A05;
            MediaCodec.CryptoInfo.Pattern pattern = c5504Djg.A00;
            pattern.set(i5, i6);
            c5504Djg.A01.setPattern(pattern);
            long j5 = c5516Djs.A01;
            int i7 = (int) (j4 - j5);
            c5516Djs.A01 = j5 + i7;
            c5516Djs.A00 -= i7;
        }
        if (AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 268435456, 268435456)) {
            e1p.A0P(4);
            C5484DjM c5484DjMA032 = A03(c5484DjM, e1p.A02, 4, c5516Djs.A01);
            int iA0C = e1p.A0C();
            c5516Djs.A01 += 4;
            c5516Djs.A00 -= 4;
            di2.A04(iA0C);
            c5484DjM = A02(c5484DjMA032, di2.A01, iA0C, c5516Djs.A01);
            c5516Djs.A01 += iA0C;
            int i8 = c5516Djs.A00 - iA0C;
            c5516Djs.A00 = i8;
            ByteBuffer byteBuffer2 = di2.A02;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i8) {
                di2.A02 = ByteBuffer.allocate(i8);
            } else {
                di2.A02.clear();
            }
            j = c5516Djs.A01;
            byteBuffer = di2.A02;
        } else {
            di2.A04(c5516Djs.A00);
            j = c5516Djs.A01;
            byteBuffer = di2.A01;
        }
        return A02(c5484DjM, byteBuffer, c5516Djs.A00, j);
    }

    public static C5484DjM A02(C5484DjM c5484DjM, ByteBuffer byteBuffer, int i, long j) {
        while (j >= c5484DjM.A00) {
            c5484DjM = c5484DjM.A02;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c5484DjM.A00 - j));
            byteBuffer.put(c5484DjM.A03.A00, (int) (j - c5484DjM.A01), iMin);
            i -= iMin;
            j += iMin;
            if (j == c5484DjM.A00) {
                c5484DjM = c5484DjM.A02;
            }
        }
        return c5484DjM;
    }

    public static C5484DjM A03(C5484DjM c5484DjM, byte[] bArr, int i, long j) {
        while (j >= c5484DjM.A00) {
            c5484DjM = c5484DjM.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c5484DjM.A00 - j));
            System.arraycopy(c5484DjM.A03.A00, (int) (j - c5484DjM.A01), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == c5484DjM.A00) {
                c5484DjM = c5484DjM.A02;
            }
        }
        return c5484DjM;
    }

    public static void A04(C5484DjM c5484DjM, C5430DiR c5430DiR) {
        if (c5484DjM.A03 != null) {
            C5484DjM c5484DjM2 = c5484DjM;
            C5462Dix c5462Dix = (C5462Dix) c5430DiR.A06;
            synchronized (c5462Dix) {
                do {
                    C5523Djz[] c5523DjzArr = c5462Dix.A02;
                    int i = c5462Dix.A01;
                    c5462Dix.A01 = i + 1;
                    C5523Djz c5523Djz = c5484DjM2.A03;
                    c5523Djz.getClass();
                    c5523DjzArr[i] = c5523Djz;
                    c5462Dix.A00--;
                    c5484DjM2 = c5484DjM2.A02;
                    if (c5484DjM2 == null) {
                        break;
                    }
                } while (c5484DjM2.A03 != null);
                c5462Dix.notifyAll();
            }
            c5484DjM.A03 = null;
            c5484DjM.A02 = null;
        }
    }

    public final void A05(long j) {
        C5484DjM c5484DjM;
        if (j == -1) {
            return;
        }
        while (true) {
            c5484DjM = this.A01;
            if (j < c5484DjM.A00) {
                break;
            }
            InterfaceC5538DkF interfaceC5538DkF = this.A06;
            C5523Djz c5523Djz = c5484DjM.A03;
            C5462Dix c5462Dix = (C5462Dix) interfaceC5538DkF;
            synchronized (c5462Dix) {
                C5523Djz[] c5523DjzArr = c5462Dix.A02;
                int i = c5462Dix.A01;
                c5462Dix.A01 = i + 1;
                c5523DjzArr[i] = c5523Djz;
                c5462Dix.A00--;
                c5462Dix.notifyAll();
            }
            C5484DjM c5484DjM2 = this.A01;
            c5484DjM2.A03 = null;
            C5484DjM c5484DjM3 = c5484DjM2.A02;
            c5484DjM2.A02 = null;
            this.A01 = c5484DjM3;
        }
        if (this.A02.A01 < c5484DjM.A01) {
            this.A02 = c5484DjM;
        }
    }

    public C5430DiR(InterfaceC5538DkF interfaceC5538DkF) {
        this.A06 = interfaceC5538DkF;
        C5484DjM c5484DjM = new C5484DjM(0L);
        this.A01 = c5484DjM;
        this.A02 = c5484DjM;
        this.A03 = c5484DjM;
    }
}
