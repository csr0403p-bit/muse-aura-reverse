package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Bs7 extends InputStream {
    public ByteBuffer A00;

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer.hasRemaining()) {
            return BV4.A02(byteBuffer);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
