package X;

import com.google.common.base.Preconditions;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class CRO extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b) {
        b.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b, int off, int len) {
        b.getClass();
        Preconditions.checkPositionIndexes(off, len + off, b.length);
    }

    @Override // java.io.OutputStream
    public final void write(int b) {
    }
}
