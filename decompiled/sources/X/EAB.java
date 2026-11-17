package X;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EAB extends EAP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = Util.A07;

    @Override // X.EAP, X.EAX
    public final ByteBuffer AIL() {
        int i;
        if (super.isEnded() && (i = this.A00) > 0) {
            ByteBuffer byteBufferA03 = A03(i);
            byteBufferA03.put(this.A06, 0, this.A00);
            byteBufferA03.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = super.A01;
        super.A01 = EAX.A00;
        return byteBuffer;
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int i2 = this.A01;
            int iMin = Math.min(i, i2);
            this.A04 += iMin / super.A00.A00;
            this.A01 = i2 - iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.A01 <= 0) {
                int i3 = i - iMin;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer byteBufferA03 = A03(length);
                int iA02 = BV5.A02(length, this.A00, 0);
                byteBufferA03.put(this.A06, 0, iA02);
                int iA022 = BV5.A02(length - iA02, i3, 0);
                byteBuffer.limit(byteBuffer.position() + iA022);
                byteBufferA03.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i4 = i3 - iA022;
                int i5 = this.A00 - iA02;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, iA02, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                byteBufferA03.flip();
            }
        }
    }

    @Override // X.EAP, X.EAX
    public final boolean isEnded() {
        return super.isEnded() && this.A00 == 0;
    }
}
