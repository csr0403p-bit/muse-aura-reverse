package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;

/* renamed from: X.FfS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8519FfS {
    public static Hi5 A00 = Hi5.A02;

    public static final Hi5 A00(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                C7384Etj.A0U(fragment.getParentFragmentManager());
            }
            fragment = fragment.mParentFragment;
        }
        return A00;
    }

    public static final void A01(Hi5 hi5, final Violation violation) {
        Fragment fragment = violation.fragment;
        final String strA0e = C60Q.A0e(fragment);
        Set<EnumC8520FfT> set = hi5.A01;
        if (set.contains(EnumC8520FfT.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", FGI.A0M("Policy violation in ", strA0e), violation);
        }
        if (set.contains(EnumC8520FfT.PENALTY_DEATH)) {
            Runnable runnable = new Runnable() { // from class: X.FfU
                public static final String __redex_internal_original_name = "FragmentStrictMode$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    String str = strA0e;
                    Violation violation2 = violation;
                    Hi5 hi52 = AbstractC8519FfS.A00;
                    Log.e("FragmentStrictMode", FGI.A0M("Policy violation with PENALTY_DEATH in ", str), violation2);
                    throw violation2;
                }
            };
            if (fragment.isAdded()) {
                Handler handler = fragment.getParentFragmentManager().A09.A02;
                if (!C7384Etj.areEqual(handler.getLooper(), Looper.myLooper())) {
                    handler.post(runnable);
                    return;
                }
            }
            runnable.run();
            throw null;
        }
    }

    public static final void A02(Violation violation) {
        if (AbstractC8571FgQ.A0M()) {
            Log.d("FragmentManager", FGI.A0M("StrictMode violation in ", C60Q.A0e(violation.fragment)), violation);
        }
    }

    public static final boolean A03(Hi5 hi5, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = hi5.A00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Violation.class.equals(cls2.getSuperclass()) || !AbstractC0878AGe.A0k(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
