package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.AeW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1200AeW {
    public int[] A00;
    public int[] A01;
    public final C1139Abr A02;
    public final C00r A03;
    public final C00r A04;
    public final G0V<Integer, Integer, int[]> A05;

    public static final int A00(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (true) {
            if (i < length) {
                int i3 = iArr[i];
                if (i3 <= 0) {
                    break;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                i++;
            } else if (i2 == Integer.MAX_VALUE) {
                break;
            }
        }
        i2 = 0;
        int length2 = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length2; i4++) {
            if (iArr[i4] == i2) {
                iMin = Math.min(iMin, iArr2[i4]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    /* JADX WARN: Incorrect types in method signature: ([I[ILX/G0V<-Ljava/lang/Integer;-Ljava/lang/Integer;[I>;)V */
    public C1200AeW(G0V g0v, int[] iArr, int[] iArr2) {
        int iIntValue;
        this.A05 = g0v;
        this.A00 = iArr;
        int length = iArr.length;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (true) {
            if (i >= length) {
                if (i2 == Integer.MAX_VALUE) {
                    break;
                }
            } else {
                int i3 = iArr[i];
                if (i3 <= 0) {
                    break;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                i++;
            }
        }
        i2 = 0;
        this.A03 = new ParcelableSnapshotMutableIntState(i2);
        this.A01 = iArr2;
        this.A04 = new ParcelableSnapshotMutableIntState(A00(iArr, iArr2));
        if (length == 0) {
            iIntValue = 0;
        } else {
            int i4 = iArr[0];
            int i5 = length - 1;
            int i6 = 1;
            if (1 <= i5) {
                while (true) {
                    int i7 = iArr[i6];
                    i4 = i4 > i7 ? i7 : i4;
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            iIntValue = Integer.valueOf(i4).intValue();
        }
        this.A02 = new C1139Abr(iIntValue, 90, 200);
    }
}
