package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface EC0 {
    void close();

    void copy(int i, EC0 ec0, int i2, int i3);

    ByteBuffer getByteBuffer();

    long getNativePtr();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int write(int i, byte[] bArr, int i2, int i3);
}
