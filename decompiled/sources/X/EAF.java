package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EAF extends EAP {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        int iFloatToIntBits = Float.floatToIntBits((float) ((i2 | ((byteBuffer.get(i) & 255) << 24)) * 4.656612875245797E-10d));
        if (iFloatToIntBits == A00) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer2.putInt(iFloatToIntBits);
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA03;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.A00.A02;
        if (i2 == 21) {
            byteBufferA03 = A03((i / 3) * 4);
            while (iPosition < iLimit) {
                A00(byteBuffer, byteBufferA03, iPosition + 2, BV7.A0L(byteBuffer, iPosition + 1, BV6.A0C(byteBuffer, iPosition) << 8));
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferA03 = A03(i);
            while (iPosition < iLimit) {
                A00(byteBuffer, byteBufferA03, iPosition + 3, BV7.A0L(byteBuffer, iPosition + 2, BV6.A0C(byteBuffer, iPosition) | (BV6.A0C(byteBuffer, iPosition + 1) << 8)));
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferA03 = A03((i / 3) * 4);
            while (iPosition < iLimit) {
                A00(byteBuffer, byteBufferA03, iPosition, BV7.A0L(byteBuffer, iPosition + 1, BV6.A0C(byteBuffer, iPosition + 2) << 8));
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw BV4.A0T();
            }
            byteBufferA03 = A03(i);
            while (iPosition < iLimit) {
                A00(byteBuffer, byteBufferA03, iPosition, BV7.A0L(byteBuffer, iPosition + 1, BV6.A0C(byteBuffer, iPosition + 3) | (BV6.A0C(byteBuffer, iPosition + 2) << 8)));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA03.flip();
    }
}
