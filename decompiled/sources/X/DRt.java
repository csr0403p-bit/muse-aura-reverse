package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public abstract class DRt {
    public int A00;
    public ByteBuffer A01;

    public final int A01(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }

    public final int A02(int i) {
        int i2 = i + this.A00;
        return i2 + this.A01.getInt(i2) + 4;
    }

    public final int A03(int i) {
        int i2 = i + this.A00;
        return this.A01.getInt(i2 + this.A01.getInt(i2));
    }

    public final String A04(int i) {
        int i2 = i + this.A01.getInt(i);
        boolean zHasArray = this.A01.hasArray();
        ByteBuffer byteBuffer = this.A01;
        if (zHasArray) {
            return BV4.A0n(DSW.A00, byteBuffer.array(), this.A01.arrayOffset() + i2 + 4, this.A01.getInt(i2));
        }
        ByteBuffer byteBufferOrder = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = byteBufferOrder.getInt(i2);
        byte[] bArr = new byte[i3];
        byteBufferOrder.position(i2 + 4);
        byteBufferOrder.get(bArr);
        return BV4.A0n(DSW.A00, bArr, 0, i3);
    }
}
