package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FN3 {
    public static final FN3 A00 = new FN3();

    public final C7967FMy A02(Context context) {
        if (AbstractC7609F5w.A1a(AbstractC5321DgF.A02(C79.A0C, new C8632Fhj(2)))) {
            ArrayList arrayList = A23.A01(context).A00;
            if (arrayList.isEmpty()) {
                return null;
            }
            return (C7967FMy) AbstractC0878AGe.A0H(arrayList);
        }
        List<Fragment> listA02 = HiC.A02(HiC.A00(context));
        if (listA02 == null || listA02.isEmpty()) {
            return null;
        }
        return A01(listA02);
    }

    public static final C7967FMy A00(FN3 fn3, String str, List list) {
        int iA00 = C60O.A00(list);
        if (iA00 < 0) {
            return null;
        }
        while (true) {
            int i = iA00 - 1;
            Fragment fragment = (Fragment) list.get(iA00);
            if (fragment instanceof AuraRealityLabsCdsBottomSheetFragment) {
                C7967FMy delegateCdsBottomSheet = ((AuraRealityLabsCdsBottomSheetFragment) fragment).getDelegateCdsBottomSheet();
                if (delegateCdsBottomSheet != null && delegateCdsBottomSheet.A03(str)) {
                    return delegateCdsBottomSheet;
                }
            } else {
                List<Fragment> listA03 = fragment.getChildFragmentManager().A0U.A03();
                C7384Etj.A0U(listA03);
                C7967FMy c7967FMyA00 = A00(fn3, str, listA03);
                if (c7967FMyA00 != null) {
                    return c7967FMyA00;
                }
            }
            if (i < 0) {
                return null;
            }
            iA00 = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[LOOP:0: B:4:0x0006->B:13:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C7967FMy A01(java.util.List r4) {
        /*
            r3 = this;
            int r0 = X.C60O.A00(r4)
            if (r0 < 0) goto L37
        L6:
            int r2 = r0 + (-1)
            java.lang.Object r1 = r4.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment
            if (r0 == 0) goto L1b
            com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment r1 = (com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment) r1
            X.FMy r0 = r1.getDelegateCdsBottomSheet()
        L18:
            if (r0 == 0) goto L33
            return r0
        L1b:
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L33
            X.FgQ r0 = r1.getChildFragmentManager()
            X.FgX r0 = r0.A0U
            java.util.List r0 = r0.A03()
            X.C7384Etj.A0U(r0)
            X.FMy r0 = r3.A01(r0)
            goto L18
        L33:
            if (r2 < 0) goto L37
            r0 = r2
            goto L6
        L37:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FN3.A01(java.util.List):X.FMy");
    }
}
