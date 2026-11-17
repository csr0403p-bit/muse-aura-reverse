package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class HqM extends InputStream {
    public final ByteBuffer A00;

    @Override // java.io.InputStream
    public final int available() {
        return this.A00.remaining();
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    public HqM(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
