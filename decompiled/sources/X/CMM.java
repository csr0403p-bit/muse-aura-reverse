package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class CMM extends CLp {
    public final int A03(int i) {
        int iA02 = A02(16);
        if (iA02 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.A04;
        int i2 = iA02 + this.A00;
        return byteBuffer.getInt(i2 + byteBuffer.getInt(i2) + 4 + (i * 4));
    }
}
