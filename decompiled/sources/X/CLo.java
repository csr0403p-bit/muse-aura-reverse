package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class CLo {
    public static final byte[] A01 = new byte[0];
    public static final ByteBuffer A00 = ByteBuffer.allocate(0);

    public static byte[] A00(ByteBuffer byteBuffer) {
        return byteBuffer == null ? A01 : (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0 && byteBuffer.position() == 0 && byteBuffer.limit() == byteBuffer.capacity()) ? byteBuffer.array() : BV5.A1X(byteBuffer.duplicate());
    }
}
