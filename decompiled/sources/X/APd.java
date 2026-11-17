package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import java.util.List;

/* loaded from: classes4.dex */
public final class APd {
    public int A00;
    public int A01;
    public APe A02;
    public final APc A04;
    public final MutableState A07 = AbstractC1798ArH.A06(C1018AQb.A00);
    public final C00r A05 = new ParcelableSnapshotMutableIntState(0);
    public Integer A03 = C79.A00;
    public final C00r A06 = new ParcelableSnapshotMutableIntState(0);

    public final void A00() {
        APe aPe;
        Object obj;
        List listA1C = C8j3.A1C(this.A04.A05);
        int size = listA1C.size();
        int i = 0;
        while (true) {
            aPe = null;
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listA1C.get(i);
            if (((C1008AOz) ((APh) obj).A04.getValue()).A03()) {
                break;
            } else {
                i++;
            }
        }
        APh aPh = (APh) obj;
        if (aPh != null) {
            aPe = aPh.A00;
        } else if (this.A02 == null) {
            return;
        }
        if (C7384Etj.areEqual(aPe, this.A02)) {
            return;
        }
        this.A06.AdX(this.A01 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0131 A[PHI: r1
  0x0131: PHI (r1v7 X.APh) = (r1v5 X.APh), (r1v10 X.APh) binds: [B:53:0x012f, B:44:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APd.A01():void");
    }

    public APd(APc aPc) {
        this.A04 = aPc;
    }
}
