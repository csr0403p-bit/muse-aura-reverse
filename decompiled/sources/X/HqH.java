package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class HqH extends OutputStream {
    public final ByteBuffer A00;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.A00.put((byte) i);
    }

    public HqH(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.A00.put(bArr, i, i2);
    }
}
