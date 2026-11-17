package X;

import android.util.SparseArray;

/* loaded from: classes6.dex */
public abstract class FDZ {
    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/FDr<LX/FBB;>;)V */
    public static final void A00(C7764FDr c7764FDr, FDW fdw) {
        C7384Etj.A0Y(fdw, 0);
        C7749FDb c7749FDbA00 = c7764FDr.A00();
        Integer numValueOf = Integer.valueOf(fdw.A04);
        Object objA00 = c7749FDbA00.A00(numValueOf);
        if ((objA00 instanceof SparseArray) && objA00 != null) {
            c7749FDbA00.A02.put(numValueOf, objA00);
        }
        Object objA002 = c7749FDbA00.A00(fdw);
        if (objA002 != null) {
            c7749FDbA00.A02.put(fdw, objA002);
        }
    }
}
