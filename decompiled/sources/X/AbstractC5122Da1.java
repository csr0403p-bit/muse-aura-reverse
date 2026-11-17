package X;

import java.nio.ByteBuffer;

/* renamed from: X.Da1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5122Da1 {
    public int A00;
    public int A01;
    public int A02;
    public ByteBuffer A03;

    public final void A00(int i, int i2, ByteBuffer byteBuffer) {
        this.A03 = byteBuffer;
        if (byteBuffer != null) {
            this.A02 = i;
            this.A01 = byteBuffer.getInt(i - 4);
        } else {
            i2 = 0;
            this.A02 = 0;
            this.A01 = 0;
        }
        this.A00 = i2;
    }
}
