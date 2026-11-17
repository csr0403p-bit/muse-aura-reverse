package X;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EAI extends EAU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;

    public EAI() {
        byte[] bArr = Util.A07;
        this.A07 = bArr;
        this.A08 = bArr;
    }

    private void A00(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iRemaining = byteBuffer.remaining();
        int i2 = this.A02;
        int iMin = Math.min(iRemaining, i2);
        int i3 = i2 - iMin;
        System.arraycopy(bArr, i - i3, this.A08, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.A08, i3, iMin);
    }

    public static void A01(EAI eai, byte[] bArr, int i) {
        ByteBuffer byteBufferA02 = eai.A02(i);
        byteBufferA02.put(bArr, 0, i);
        byteBufferA02.flip();
        if (i > 0) {
            eai.A06 = true;
        }
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        int i;
        int iLimit2;
        int iLimit3;
        long j;
        int i2;
        while (byteBuffer.hasRemaining() && !super.A01.hasRemaining()) {
            int i3 = this.A03;
            if (i3 != 0) {
                iLimit = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                if (i3 != 1) {
                    while (true) {
                        if (iPosition2 >= byteBuffer.limit()) {
                            iLimit2 = byteBuffer.limit();
                            break;
                        } else {
                            if (Math.abs((int) byteBuffer.getShort(iPosition2)) > 1024) {
                                int i4 = this.A00;
                                iLimit2 = i4 * (iPosition2 / i4);
                                break;
                            }
                            iPosition2 += 2;
                        }
                    }
                    byteBuffer.limit(iLimit2);
                    this.A04 += byteBuffer.remaining() / this.A00;
                    A00(byteBuffer, this.A08, this.A02);
                    if (iLimit2 < iLimit) {
                        A01(this, this.A08, this.A02);
                        i = 0;
                        this.A03 = i;
                    }
                } else {
                    while (true) {
                        if (iPosition2 >= byteBuffer.limit()) {
                            iLimit3 = byteBuffer.limit();
                            break;
                        } else {
                            if (Math.abs((int) byteBuffer.getShort(iPosition2)) > 1024) {
                                int i5 = this.A00;
                                iLimit3 = i5 * (iPosition2 / i5);
                                break;
                            }
                            iPosition2 += 2;
                        }
                    }
                    int iPosition3 = iLimit3 - byteBuffer.position();
                    byte[] bArr = this.A07;
                    int length = bArr.length;
                    int i6 = this.A01;
                    int i7 = length - i6;
                    if (iLimit3 >= iLimit || iPosition3 >= i7) {
                        int iMin = Math.min(iPosition3, i7);
                        byteBuffer.limit(byteBuffer.position() + iMin);
                        byteBuffer.get(this.A07, this.A01, iMin);
                        int i8 = this.A01 + iMin;
                        this.A01 = i8;
                        byte[] bArr2 = this.A07;
                        if (i8 == bArr2.length) {
                            i = 2;
                            if (this.A06) {
                                A01(this, bArr2, this.A02);
                                j = this.A04;
                                i8 = this.A01;
                                i2 = this.A02 * 2;
                            } else {
                                j = this.A04;
                                i2 = this.A02;
                            }
                            this.A04 = j + ((i8 - i2) / this.A00);
                            A00(byteBuffer, this.A07, i8);
                            this.A01 = 0;
                            this.A03 = i;
                        }
                    } else {
                        A01(this, bArr, i6);
                        this.A01 = 0;
                        this.A03 = 0;
                    }
                }
                byteBuffer.limit(iLimit);
            } else {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.A07.length));
                int iLimit4 = byteBuffer.limit();
                while (true) {
                    iLimit4 -= 2;
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit4)) > 1024) {
                        int i9 = this.A00;
                        iPosition = ((iLimit4 / i9) * i9) + i9;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    i = 1;
                    this.A03 = i;
                    byteBuffer.limit(iLimit);
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    ByteBuffer byteBufferA02 = A02(iRemaining);
                    byteBufferA02.put(byteBuffer);
                    byteBufferA02.flip();
                    if (iRemaining > 0) {
                        this.A06 = true;
                    }
                    byteBuffer.limit(iLimit);
                }
            }
        }
    }
}
