package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;
import com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment;

/* renamed from: X.Fge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8580Fge {
    public EnumC8596Fgy A00;
    public final int A01;
    public final Fragment A02;
    public final AbstractC8571FgQ A03;
    public final ActivityLifecycleTracker A04;
    public final C8578Fgc A05;
    public final C8579Fgd A06;
    public final Integer A07;
    public final AuraRealityLabsCdsBottomSheetFragment A08;

    public static final void A00(C8580Fge c8580Fge, EnumC8596Fgy enumC8596Fgy) {
        AuraRealityLabsCdsBottomSheetFragment auraRealityLabsCdsBottomSheetFragment;
        Hky hky;
        if (enumC8596Fgy != c8580Fge.A00) {
            c8580Fge.A00 = enumC8596Fgy;
            int iOrdinal = enumC8596Fgy.ordinal();
            if (iOrdinal == 0) {
                c8580Fge.A08.onEnter();
                return;
            }
            if (iOrdinal == 1) {
                auraRealityLabsCdsBottomSheetFragment = c8580Fge.A08;
                hky = Hky.A03;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                auraRealityLabsCdsBottomSheetFragment = c8580Fge.A08;
                hky = Hky.A02;
            }
            auraRealityLabsCdsBottomSheetFragment.onExit(hky);
        }
    }

    public C8580Fge(Fragment fragment, AuraRealityLabsCdsBottomSheetFragment auraRealityLabsCdsBottomSheetFragment) {
        this.A02 = fragment;
        this.A08 = auraRealityLabsCdsBottomSheetFragment;
        AbstractC8571FgQ parentFragmentManager = fragment.getParentFragmentManager();
        C7384Etj.A0U(parentFragmentManager);
        this.A03 = parentFragmentManager;
        this.A01 = parentFragmentManager.A0R();
        C8579Fgd c8579Fgd = new C8579Fgd(this);
        this.A06 = c8579Fgd;
        FragmentActivity activity = fragment.getActivity();
        FZS fzsA02 = FZS.A02(this, 10);
        if (activity != null) {
            this.A04 = new ActivityLifecycleTracker(activity, fzsA02);
        } else {
            this.A04 = null;
        }
        if (fragment.mParentFragment != null) {
            AbstractC8571FgQ parentFragmentManager2 = fragment.requireParentFragment().getParentFragmentManager();
            C7384Etj.A0U(parentFragmentManager2);
            int iA0R = parentFragmentManager2.A0R();
            this.A07 = Integer.valueOf(iA0R);
            Fragment fragmentRequireParentFragment = fragment.requireParentFragment();
            C7384Etj.A0U(fragmentRequireParentFragment);
            this.A05 = new C8578Fgc(fragmentRequireParentFragment, parentFragmentManager2, fzsA02, iA0R);
        } else {
            this.A07 = null;
            this.A05 = null;
        }
        c8579Fgd.A02();
    }
}
