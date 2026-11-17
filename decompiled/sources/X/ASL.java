package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class ASL extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public float A00;
    public boolean A01;

    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    @Override // X.InterfaceC1356Ahh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi AQV(X.AXY r8, X.C3TG r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.A01
            r1 = 0
            r4 = 1
            if (r0 != 0) goto L57
            long r2 = r7.A01(r10, r4)
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A00(r10, r4)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A03(r10, r4)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A02(r10, r4)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A01(r10, r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A00(r10, r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A03(r10, r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A02(r10, r1)
        L44:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
        L48:
            X.AZE r3 = r9.AQW(r10)
            int r2 = r3.A01
            int r1 = r3.A00
            r0 = 16
            X.Abi r0 = X.AXY.A00(r8, r3, r0, r2, r1)
            return r0
        L57:
            long r2 = r7.A00(r10, r4)
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A01(r10, r4)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A02(r10, r4)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A03(r10, r4)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A00(r10, r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A01(r10, r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A02(r10, r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L96
            long r2 = r7.A03(r10, r1)
            goto L44
        L96:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L48
            int r1 = X.C8j3.A0G(r2)
            int r0 = X.AnonymousClass002.A09(r2)
            long r10 = androidx.compose.ui.unit.Constraints.A04(r1, r0)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASL.AQV(X.AXY, X.3TG, long):X.Abi");
    }

    private final long A00(long j, boolean z) {
        int iRound;
        int iA00 = Constraints.A00(j);
        if (iA00 == Integer.MAX_VALUE || (iRound = Math.round(iA00 * this.A00)) <= 0) {
            return 0L;
        }
        if (!z || A04(iRound, iA00, j)) {
            return AnonymousClass007.A0C(iRound, iA00);
        }
        return 0L;
    }

    private final long A01(long j, boolean z) {
        int iRound;
        int iA01 = Constraints.A01(j);
        if (iA01 == Integer.MAX_VALUE || (iRound = Math.round(iA01 / this.A00)) <= 0) {
            return 0L;
        }
        if (!z || A04(iA01, iRound, j)) {
            return AnonymousClass007.A0C(iA01, iRound);
        }
        return 0L;
    }

    private final long A02(long j, boolean z) {
        int iA02 = Constraints.A02(j);
        int iRound = Math.round(iA02 * this.A00);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || A04(iRound, iA02, j)) {
            return AnonymousClass007.A0C(iRound, iA02);
        }
        return 0L;
    }

    private final long A03(long j, boolean z) {
        int iA03 = Constraints.A03(j);
        int iRound = Math.round(iA03 / this.A00);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || A04(iA03, iRound, j)) {
            return AnonymousClass007.A0C(iA03, iRound);
        }
        return 0L;
    }

    public static final boolean A04(int i, int i2, long j) {
        int iA03 = Constraints.A03(j);
        if (i <= Constraints.A01(j) && iA03 <= i) {
            int iA02 = Constraints.A02(j);
            if (i2 <= Constraints.A00(j) && iA02 <= i2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.A00) : c3Tr.AQM(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.A00) : c3Tr.AQO(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.A00) : c3Tr.AQo(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.A00) : c3Tr.AQq(i);
    }
}
