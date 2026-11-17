package X;

/* renamed from: X.Db4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5171Db4 implements InterfaceC5173Db6 {
    public final int A00;
    public final int[] A01;
    public final int[] A02;

    public C5171Db4(int[] iArr) {
        int length;
        int i;
        int i2 = 2;
        while (true) {
            length = iArr.length;
            if (i2 >= length * 2) {
                break;
            } else {
                i2 <<= 1;
            }
        }
        int i3 = i2 - 1;
        this.A00 = i3;
        int[] iArr2 = new int[i2];
        this.A01 = iArr2;
        int[] iArr3 = new int[i2];
        this.A02 = iArr3;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = i5 * (-1640531527);
            int i7 = i6 ^ (i6 >>> 16);
            while (true) {
                i = i7 & i3;
                if (iArr3[i] == 0 || iArr2[i] == i5) {
                    break;
                } else {
                    i7 = i + 1;
                }
            }
            iArr2[i] = i5;
            i4++;
            iArr3[i] = i4;
        }
    }
}
