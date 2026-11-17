package X;

import java.util.Arrays;

/* renamed from: X.DoT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5734DoT {
    public final int A00;
    public final C5382DhZ A01;
    public final int[] A02;
    public final boolean[] A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5734DoT c5734DoT = (C5734DoT) obj;
                if (this.A04 != c5734DoT.A04 || !this.A01.equals(c5734DoT.A01) || !Arrays.equals(this.A02, c5734DoT.A02) || !Arrays.equals(this.A03, c5734DoT.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0E(this.A01) + (this.A04 ? 1 : 0)) * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5734DoT(X.C5382DhZ r6, int[] r7, boolean[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            int r4 = r6.A01
            r5.A00 = r4
            int r0 = r7.length
            r3 = 0
            r2 = 1
            if (r4 != r0) goto L10
            int r1 = r8.length
            r0 = 1
            if (r4 == r1) goto L11
        L10:
            r0 = 0
        L11:
            X.C1G.A07(r0)
            r5.A01 = r6
            if (r9 == 0) goto L1b
            if (r4 <= r2) goto L1b
            r3 = 1
        L1b:
            r5.A04 = r3
            java.lang.Object r0 = r7.clone()
            int[] r0 = (int[]) r0
            r5.A02 = r0
            java.lang.Object r0 = r8.clone()
            boolean[] r0 = (boolean[]) r0
            r5.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5734DoT.<init>(X.DhZ, int[], boolean[], boolean):void");
    }
}
