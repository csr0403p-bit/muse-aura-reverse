package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EAK extends EAU {
    public int[] A00;
    public int[] A01;

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        int[] iArr = this.A00;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA02 = A02(((iLimit - iPosition) / super.A00.A00) * this.A06.A00);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferA02.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += super.A00.A00;
        }
        byteBuffer.position(iLimit);
        byteBufferA02.flip();
    }
}
