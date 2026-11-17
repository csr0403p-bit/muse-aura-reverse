package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class DJ2 implements DJQ {
    public int A00;

    public final String toString() {
        return String.valueOf(this.A00);
    }

    @Override // X.DJQ
    public final void AZ8(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer.getInt();
    }
}
