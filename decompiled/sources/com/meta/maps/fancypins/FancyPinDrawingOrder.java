package com.meta.maps.fancypins;

import X.AbstractC0903AHf;
import X.AnonymousClass003;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinDrawingOrder {
    public int count;
    public int[] orderedChildIndices = new int[0];
    public int[] scratchChildIndices = new int[0];

    private final void merge(int[] iArr, int[] iArr2, int i, int i2, int i3, int[] iArr3, double[] dArr) {
        int i4 = i;
        int i5 = i2;
        while (i < i2 && i5 < i3) {
            int i6 = i4 + 1;
            if (compare(iArr[i], iArr[i5], iArr3, dArr) <= 0) {
                iArr2[i4] = iArr[i];
                i4 = i6;
                i++;
            } else {
                iArr2[i4] = iArr[i5];
                i4 = i6;
                i5++;
            }
        }
        while (i < i2) {
            iArr2[i4] = iArr[i];
            i4++;
            i++;
        }
        while (i5 < i3) {
            iArr2[i4] = iArr[i5];
            i4++;
            i5++;
        }
    }

    public final void rebuild(int i, int[] iArr, double[] dArr) {
        int[] iArr2;
        AnonymousClass003.A0x(iArr, dArr);
        if (iArr.length < i) {
            throw C60O.A0i("Failed requirement.");
        }
        if (dArr.length < i) {
            throw C60O.A0i("Failed requirement.");
        }
        ensureCapacity(i);
        this.count = i;
        int i2 = 0;
        while (true) {
            iArr2 = this.orderedChildIndices;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = i2;
            i2++;
        }
        int[] iArr3 = this.scratchChildIndices;
        int[] iArr4 = iArr3;
        int[] iArr5 = iArr2;
        int i3 = 1;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i) {
                int iMin = Math.min(i4 + i3, i);
                int iMin2 = Math.min((i3 * 2) + i4, i);
                merge(iArr5, iArr3, i4, iMin, iMin2, iArr, dArr);
                i4 = iMin2;
            }
            iArr3 = iArr5;
            i3 *= 2;
            iArr5 = iArr4;
            iArr4 = iArr3;
        }
        if (iArr5 != iArr2) {
            AbstractC0903AHf.A03(iArr5, iArr2, 0, 0, i);
        }
    }

    private final int compare(int i, int i2, int[] iArr, double[] dArr) {
        int iCompare = Double.compare(dArr[i], dArr[i2]);
        return iCompare == 0 ? C7384Etj.A00(iArr[i], iArr[i2]) : iCompare;
    }

    private final void ensureCapacity(int i) {
        int length = this.orderedChildIndices.length;
        if (i > length) {
            int iMax = Math.max(1, length);
            while (iMax < i) {
                int i2 = iMax;
                iMax *= 2;
                if (i2 > 1073741823) {
                    iMax = i;
                }
            }
            this.orderedChildIndices = new int[iMax];
            this.scratchChildIndices = new int[iMax];
        }
    }

    public final int get(int i) {
        if (i < 0 || i >= this.count) {
            throw C60O.A0i("Failed requirement.");
        }
        return this.orderedChildIndices[i];
    }
}
