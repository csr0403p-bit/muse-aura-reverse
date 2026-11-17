package X;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class DIW implements DJQ {
    public int A00;
    public int A01;
    public int A02;
    public final byte[] A03 = new byte[50];
    public final byte[] A04 = new byte[50];

    public final Object A00() {
        int i = this.A02;
        if (i >= 0) {
            return BV4.A0n(StandardCharsets.UTF_8, this.A04, 0, i);
        }
        int i2 = -i;
        if (i2 == 1) {
            return Integer.valueOf(this.A00);
        }
        throw C8j3.A18(FGI.A0H("Unsupported annotation value: ", i2));
    }

    @Override // X.DJQ
    public final void AZ8(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer.get();
        this.A02 = byteBuffer.get();
        byteBuffer.get(this.A03, 0, this.A01);
        int i = this.A02;
        if (i >= 0) {
            byteBuffer.get(this.A04, 0, i);
            return;
        }
        int i2 = -i;
        if (i2 != 1) {
            throw BV5.A0Q("Unsupported annotation type: ", i2);
        }
        this.A00 = byteBuffer.getInt();
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(BV4.A0n(StandardCharsets.UTF_8, this.A03, 0, this.A01));
        sbA0w.append("->");
        return C8j3.A14(A00(), sbA0w);
    }
}
