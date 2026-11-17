package X;

import java.nio.ByteBuffer;

/* renamed from: X.DIj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4961DIj {
    public static final int[] A03 = {0, 4};
    public static final boolean[] A04 = {true, false};
    public int A00;
    public byte[] A01;
    public byte[] A02;

    public final int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.get()];
        this.A01 = bArr;
        byteBuffer.get(bArr);
        int length = this.A01.length + 1;
        int i = byteBuffer.get();
        this.A00 = 0;
        int i2 = 1;
        if (i < 0) {
            int iAbs = Math.abs(i);
            this.A00 = iAbs;
            i = A03[iAbs];
            if (i <= 0) {
                i = byteBuffer.get();
                i2 = 2;
            }
        }
        byte[] bArr2 = new byte[i];
        this.A02 = bArr2;
        byteBuffer.get(bArr2);
        return length + i2 + i;
    }
}
