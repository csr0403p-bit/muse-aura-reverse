package X;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: X.DIi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4960DIi {
    public static final int[] A02 = new int[3];
    public final int A00;
    public final IntBuffer A01;

    private int A00(int i, int i2, int i3, int i4, int i5) {
        int i6;
        IntBuffer intBuffer;
        if (i5 >= 5) {
            return i;
        }
        int i7 = 0;
        do {
            int iA01 = A01(this, i, i2, i7);
            i6 = this.A00;
            intBuffer = this.A01;
            intBuffer.position(((i7 * i6) + iA01) * 3);
            int i8 = intBuffer.get();
            int i9 = intBuffer.get();
            if (i8 == i && i9 == i2) {
                intBuffer.put(i3);
                return 0;
            }
            i7++;
        } while (i7 < 2);
        int iA012 = ((i4 * i6) + A01(this, i, i2, i4)) * 3;
        intBuffer.position(iA012);
        int i10 = intBuffer.get();
        int i11 = intBuffer.get();
        int i12 = intBuffer.get();
        intBuffer.position(iA012);
        intBuffer.put(i);
        intBuffer.put(i2);
        intBuffer.put(i3);
        if (i10 == 0 && i11 == 0) {
            return 0;
        }
        return A00(i10, i11, i12, (i4 + 1) % 2, i5 + 1);
    }

    public final int A02(int i, int i2) {
        int i3 = 0;
        do {
            int iA01 = ((this.A00 * i3) + A01(this, i, i2, i3)) * 3;
            IntBuffer intBuffer = this.A01;
            intBuffer.position(iA01);
            int i4 = intBuffer.get();
            int i5 = intBuffer.get();
            int i6 = intBuffer.get();
            if (i == i4 && i2 == i5) {
                intBuffer.position(iA01);
                intBuffer.put(A02);
                return i6;
            }
            i3++;
        } while (i3 < 2);
        return 0;
    }

    public final void A03(int i, int i2, int i3) {
        if (i3 == 0) {
            throw C60O.A0i("Value 0 is reserved and can't be put into the map");
        }
        A00(i, i2, i3, 0, 0);
    }

    public static final int A01(C4960DIi c4960DIi, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + (i2 * 31);
        if (i3 == 0) {
            i4 = i6 & Integer.MAX_VALUE;
            i5 = c4960DIi.A00;
        } else {
            if (i3 != 1) {
                throw C60O.A0i("Supporting only 2 hashes at the moment");
            }
            i5 = c4960DIi.A00;
            i4 = (i6 / i5) & Integer.MAX_VALUE;
        }
        return i4 % i5;
    }

    public C4960DIi(ByteBuffer byteBuffer) {
        int iLimit = ((byteBuffer.limit() / 4) / 3) / 2;
        this.A01 = byteBuffer.asIntBuffer();
        this.A00 = iLimit;
    }
}
