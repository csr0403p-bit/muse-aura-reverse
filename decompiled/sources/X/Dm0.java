package X;

import android.util.Pair;

/* loaded from: classes5.dex */
public final class Dm0 extends DoW {
    public boolean A00;
    public final C5381DhY A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public volatile int A06;
    public volatile C5648Dmc A07;

    public Dm0(C6141Dwj c6141Dwj, C5381DhY c5381DhY, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(null, c6141Dwj, c5381DhY);
        this.A03 = z;
        this.A05 = z2;
        this.A01 = c5381DhY;
        this.A06 = i;
        this.A02 = z3;
        this.A04 = z4;
    }

    public static long A00(C6154Dwx c6154Dwx) {
        int i;
        int i2;
        if (c6154Dwx == null || (i = c6154Dwx.A0Q) <= 0 || (i2 = c6154Dwx.A0D) <= 0) {
            return -1L;
        }
        return i * i2;
    }

    @Override // X.DoW, X.AbstractC5823DqC
    public final void A0B() {
        if (this.A05) {
            return;
        }
        super.A0B();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dod;[[[I[ILX/Dwe;Ljava/lang/String;)Landroid/util/Pair<LX/DhV;Ljava/lang/Integer;>; */
    @Override // X.DoW
    public final Pair A0D(C6136Dwe c6136Dwe, C5742Dod c5742Dod, String str, int[] iArr, int[][][] iArr2) {
        if (this.A03 && c5742Dod.A00(2) == 2) {
            for (int i = 0; i < c5742Dod.A00; i++) {
                if (c5742Dod.A03[i] == 2) {
                    for (int i2 = 0; i2 < iArr2[i].length; i2++) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr3 = iArr2[i][i2];
                            if (i3 < iArr3.length) {
                                if ((iArr3[i3] & 7) == 3) {
                                    int[] iArr4 = iArr2[i][i2];
                                    int i4 = iArr4[i3] & (-8);
                                    iArr4[i3] = i4;
                                    iArr4[i3] = i4 | 4;
                                }
                                i3++;
                            }
                        }
                    }
                }
            }
        }
        if (this.A04) {
            for (int i5 = 0; i5 < c5742Dod.A00; i5++) {
                if (c5742Dod.A03[i5] == 2) {
                    C5414DiA c5414DiA = c5742Dod.A04[i5];
                    int[][] iArr5 = iArr2[i5];
                    for (int i6 = 0; i6 < c5414DiA.A01; i6++) {
                        C5382DhZ c5382DhZA0e = BV7.A0e(c5414DiA, i6);
                        for (int i7 = 0; i7 < c5382DhZA0e.A01; i7++) {
                            int i8 = iArr5[i6][i7] & 7;
                            C6154Dwx c6154Dwx = c5382DhZA0e.A04[i7];
                            if (c6154Dwx.A0Q != 0 && c6154Dwx.A0D != 0 && (i8 == 4 || i8 == 3)) {
                                for (int i9 = 0; i9 < c5414DiA.A01; i9++) {
                                    C5382DhZ c5382DhZA0e2 = BV7.A0e(c5414DiA, i9);
                                    for (int i10 = 0; i10 < c5382DhZA0e2.A01; i10++) {
                                        C6154Dwx c6154Dwx2 = c5382DhZA0e2.A04[i10];
                                        if (c6154Dwx2.A0Q == 0 || c6154Dwx2.A0D == 0) {
                                            int[] iArr6 = iArr2[i5][i9];
                                            iArr6[i10] = (iArr6[i10] & (-8)) | 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return super.A0D(c6136Dwe, c5742Dod, str, iArr, iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x00cb, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    @Override // X.DoW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5378DhV[] A0G(X.C6136Dwe r25, X.C5742Dod r26, int[] r27, int[][][] r28) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dm0.A0G(X.Dwe, X.Dod, int[], int[][][]):X.DhV[]");
    }
}
