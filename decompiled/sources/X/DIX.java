package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class DIX {
    public int A00;
    public int A01;
    public final int A02;
    public final DIY A03;
    public final ByteBuffer A04;
    public final ByteBuffer A05;
    public final ByteBuffer A06;

    public static final void A00(DIX dix, AbstractC4959DId abstractC4959DId, byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (i3 <= dix.A00) {
            ByteBuffer byteBuffer = dix.A04;
            if (byteBuffer.get(i3) == 1 && byteBuffer.getInt(i3 + 1) == i) {
                if (i3 < 0 || (i2 = abstractC4959DId.A00) == -1) {
                    return;
                }
                int i4 = i3 + i2;
                byteBuffer.position(i4 + 1);
                byteBuffer.put(bArr);
                byteBuffer.put(i4, (byte) 1);
                return;
            }
            i3 += dix.A02;
        }
    }

    public final void A01(int i) {
        int i2 = 0;
        while (i2 <= this.A00) {
            ByteBuffer byteBuffer = this.A04;
            if (byteBuffer.get(i2) == 1 && byteBuffer.getInt(i2 + 1) == i) {
                int i3 = i2;
                if (i2 >= 0) {
                    byteBuffer.position(i2);
                    int i4 = this.A02;
                    byteBuffer.put(new byte[i4]);
                    if (this.A00 <= i2) {
                        while (true) {
                            i2 -= i4;
                            if (i2 < 0) {
                                i2 = -1;
                                break;
                            } else if (byteBuffer.get(i2) == 1) {
                                break;
                            }
                        }
                        this.A00 = i2;
                    }
                    if (this.A01 > i3) {
                        this.A01 = i3;
                        return;
                    }
                    return;
                }
                return;
            }
            i2 += this.A02;
        }
    }

    public DIX(DIY diy, ByteBuffer byteBuffer, int i) {
        this.A04 = byteBuffer;
        this.A03 = diy;
        int i2 = diy.A00;
        this.A02 = i2;
        this.A05 = ByteBuffer.allocate(4);
        this.A06 = ByteBuffer.allocate(8);
        this.A00 = -1;
        int i3 = i2 * diy.A02;
        if (i < i3 || byteBuffer.limit() < i) {
            throw BV5.A0Q("Buffer is not suitable to store the current schema information. Should be at least ", i3);
        }
    }
}
