package X;

import java.util.List;

/* renamed from: X.EaY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6820EaY {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C6832Eak A01(X.C6788EZx... r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6820EaY.A01(X.EZx[]):X.Eak");
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/EaW;ILjava/util/List<+LX/EZx;>;IILjava/util/List<Ljava/lang/Integer;>;)V */
    private final void A00(List list, List list2, C6818EaW c6818EaW, int i, int i2, int i3, long j) {
        int iIntValue;
        C6818EaW c6818EaW2;
        int i4 = i;
        int i5 = i2;
        if (i5 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i6 = i5; i6 < i3; i6++) {
            if (((C6788EZx) list.get(i6)).A0C() < i4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C6788EZx c6788EZx = (C6788EZx) list.get(i5);
        C6788EZx c6788EZx2 = (C6788EZx) list.get(i3 - 1);
        if (i4 == c6788EZx.A0C()) {
            iIntValue = ((Number) list2.get(i5)).intValue();
            i5 = i2 + 1;
            c6788EZx = (C6788EZx) list.get(i5);
        } else {
            iIntValue = -1;
        }
        if (c6788EZx.A0B(i4) != c6788EZx2.A0B(i4)) {
            int i7 = 1;
            for (int i8 = i5 + 1; i8 < i3; i8++) {
                if (((C6788EZx) list.get(i8 - 1)).A0B(i4) != ((C6788EZx) list.get(i8)).A0B(i4)) {
                    i7++;
                }
            }
            long j2 = j + (c6818EaW.A00 / 4) + 2 + (i7 * 2);
            c6818EaW.Ain(i7);
            c6818EaW.Ain(iIntValue);
            for (int i9 = i5; i9 < i3; i9++) {
                byte bA0B = ((C6788EZx) list.get(i9)).A0B(i4);
                if (i9 == i5 || bA0B != ((C6788EZx) list.get(i9 - 1)).A0B(i4)) {
                    c6818EaW.Ain(bA0B & 255);
                }
            }
            c6818EaW2 = new C6818EaW();
            while (i5 < i3) {
                byte bA0B2 = ((C6788EZx) list.get(i5)).A0B(i4);
                int i10 = i5 + 1;
                int i11 = i10;
                while (true) {
                    if (i11 >= i3) {
                        i11 = i3;
                        break;
                    } else if (bA0B2 != ((C6788EZx) list.get(i11)).A0B(i4)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 == i11 && i + 1 == ((C6788EZx) list.get(i5)).A0C()) {
                    c6818EaW.Ain(((Number) list2.get(i5)).intValue());
                } else {
                    c6818EaW.Ain(-((int) ((c6818EaW2.A00 / 4) + j2)));
                    A00(list, list2, c6818EaW2, i + 1, i5, i11, j2);
                }
                i5 = i11;
            }
        } else {
            int iMin = Math.min(c6788EZx.A0C(), c6788EZx2.A0C());
            int i12 = 0;
            for (int i13 = i4; i13 < iMin && c6788EZx.A0B(i13) == c6788EZx2.A0B(i13); i13++) {
                i12++;
            }
            long j3 = j + (c6818EaW.A00 / 4) + 2 + i12 + 1;
            c6818EaW.Ain(-i12);
            c6818EaW.Ain(iIntValue);
            int i14 = i + i12;
            while (i4 < i14) {
                c6818EaW.Ain(c6788EZx.A0B(i4) & 255);
                i4++;
            }
            if (i5 + 1 == i3) {
                if (i14 != ((C6788EZx) list.get(i5)).A0C()) {
                    throw new IllegalStateException("Check failed.");
                }
                c6818EaW.Ain(((Number) list2.get(i5)).intValue());
                return;
            } else {
                c6818EaW2 = new C6818EaW();
                c6818EaW.Ain(-((int) ((c6818EaW2.A00 / 4) + j3)));
                A00(list, list2, c6818EaW2, i14, i5, i3, j3);
            }
        }
        while (c6818EaW2.AZ7(c6818EaW, 8192L) != -1) {
        }
    }
}
