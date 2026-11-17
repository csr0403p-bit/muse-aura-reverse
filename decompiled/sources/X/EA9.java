package X;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EA9 extends EAP {
    public int A00;
    public int A04;
    public long A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public int A03 = 0;
    public int A02 = 0;
    public int A01 = 0;

    private void A01(int i, int i2) {
        int i3;
        byte b;
        int i4;
        if (i != 0) {
            C1G.A07(BV5.A1P(this.A01, i));
            int i5 = this.A02;
            if (i2 == 2) {
                int i6 = this.A01;
                int i7 = i5 + i6;
                byte[] bArr = this.A08;
                int length = bArr.length;
                if (i7 <= length) {
                    i4 = i7 - i;
                } else {
                    int i8 = i6 - (length - i5);
                    i4 = i8 - i;
                    if (i8 < i) {
                        int i9 = i - i8;
                        System.arraycopy(bArr, length - i9, this.A07, 0, i9);
                        System.arraycopy(this.A08, 0, this.A07, i9, i8);
                    }
                }
                System.arraycopy(bArr, i4, this.A07, 0, i);
            } else {
                int i10 = i5 + i;
                byte[] bArr2 = this.A08;
                int length2 = bArr2.length;
                if (i10 <= length2) {
                    System.arraycopy(bArr2, i5, this.A07, 0, i);
                } else {
                    int i11 = length2 - i5;
                    System.arraycopy(bArr2, i5, this.A07, 0, i11);
                    System.arraycopy(this.A08, 0, this.A07, i11, i - i11);
                }
            }
            C1G.A09(AnonymousClass002.A1M(i % this.A00), FGI.A0H("sizeToOutput is not aligned to frame size: ", i));
            C1G.A08(this.A02 < this.A08.length);
            byte[] bArr3 = this.A07;
            C1G.A09(AnonymousClass002.A1M(i % this.A00), FGI.A0H("byteOutput size is not aligned to frame size ", i));
            if (i2 != 3) {
                for (int i12 = 0; i12 < i; i12 += 2) {
                    int i13 = (((bArr3[i12 + 1] << 8) | (bArr3[i12] & 255)) * (i2 == 0 ? ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100 : i2 == 2 ? ((((i12 * 1000) * 90) / (i - 1)) / 1000) + 10 : 10)) / 100;
                    if (i13 >= 32767) {
                        bArr3[i12] = -1;
                        i3 = i12 + 1;
                        b = Byte.MAX_VALUE;
                    } else if (i13 <= -32768) {
                        bArr3[i12] = 0;
                        i3 = i12 + 1;
                        b = Byte.MIN_VALUE;
                    } else {
                        BV5.A1C(i13, bArr3, i12);
                        i3 = i12 + 1;
                        b = (byte) (i13 >> 8);
                    }
                    bArr3[i3] = b;
                }
            }
            ByteBuffer byteBufferA03 = A03(i);
            byteBufferA03.put(bArr3, 0, i);
            byteBufferA03.flip();
        }
    }

    public static void A02(EA9 ea9, boolean z) {
        int i;
        int iA00;
        int i2 = ea9.A01;
        int length = ea9.A08.length;
        if (i2 == length || z) {
            if (ea9.A03 == 0) {
                if (z) {
                    ea9.A01(i2, 3);
                    i = i2;
                } else {
                    i = length / 2;
                    C1G.A08(BV5.A1P(i2, i));
                    ea9.A01(i, 0);
                }
                iA00 = i;
            } else {
                int i3 = length / 2;
                if (z) {
                    int i4 = i2 - i3;
                    int i5 = i3 + i4;
                    iA00 = ea9.A00(i4) + i3;
                    ea9.A01(iA00, 2);
                    i = i5;
                } else {
                    i = i2 - i3;
                    iA00 = ea9.A00(i);
                    ea9.A01(iA00, 1);
                }
            }
            boolean zA1M = AnonymousClass002.A1M(i % ea9.A00);
            String strA0H = FGI.A0H("bytesConsumed is not aligned to frame size: %s", i);
            if (!zA1M) {
                throw C3cG.A0Q(String.valueOf(strA0H));
            }
            C1G.A08(i2 >= iA00);
            ea9.A01 -= i;
            int i6 = ea9.A02 + i;
            ea9.A02 = i6;
            ea9.A02 = i6 % ea9.A08.length;
            ea9.A03 = ea9.A03 + (iA00 / ea9.A00);
            ea9.A05 += (i - iA00) / r4;
        }
    }

    public EA9() {
        byte[] bArr = Util.A07;
        this.A08 = bArr;
        this.A07 = bArr;
    }

    private int A00(int i) {
        int iA05 = ((int) BV4.A05(2000000 * super.A00.A03)) - this.A03;
        int i2 = this.A00;
        int length = (iA05 * i2) - (this.A08.length / 2);
        C1G.A08(C8j3.A1Q(length));
        return (((int) Math.min((i * 0.2f) + 0.5f, length)) / i2) * i2;
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        int iLimit2;
        while (byteBuffer.hasRemaining() && !super.A01.hasRemaining()) {
            if (this.A04 != 0) {
                C1G.A08(C8j3.A1T(this.A02, this.A08.length));
                iLimit = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | BV6.A0C(byteBuffer, iPosition2 - 1)) > 1024) {
                        int i = this.A00;
                        iLimit2 = i * (iPosition2 / i);
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                int i2 = this.A02;
                int i3 = this.A01;
                int i4 = i2 + i3;
                int length = this.A08.length;
                int i5 = length - i4;
                if (i4 >= length) {
                    i4 = i3 - (length - i2);
                    i5 = i2 - i4;
                }
                boolean zA1T = C8j3.A1T(iLimit2, iLimit);
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.A08, i4, iMin);
                int i6 = this.A01 + iMin;
                this.A01 = i6;
                C1G.A08(BV7.A1S(i6, this.A08.length));
                boolean z = zA1T && iPosition3 < i5;
                A02(this, z);
                if (z) {
                    this.A04 = 0;
                    this.A03 = 0;
                }
            } else {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.A08.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | BV6.A0C(byteBuffer, iLimit3 - 1)) > 1024) {
                        int i7 = this.A00;
                        iPosition = ((iLimit3 / i7) * i7) + i7;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.A04 = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    ByteBuffer byteBufferA03 = A03(byteBuffer.remaining());
                    byteBufferA03.put(byteBuffer);
                    byteBufferA03.flip();
                }
            }
            byteBuffer.limit(iLimit);
        }
    }

    @Override // X.EAP, X.EAX
    public final boolean isActive() {
        return super.isActive() && this.A06;
    }
}
