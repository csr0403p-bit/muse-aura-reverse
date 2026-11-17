package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.lifecycle.ReportFragment$LifecycleCallbacks;

/* renamed from: X.Bxy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class FragmentC3090Bxy extends Fragment {
    public static final void A00(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new ReportFragment$LifecycleCallbacks());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC3090Bxy(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Activity activity, EnumC3085Bxl enumC3085Bxl) {
        if (activity instanceof C1HY) {
            F2N lifecycle = ((C1HY) activity).getLifecycle();
            if (lifecycle instanceof C5303Dfm) {
                ((C5303Dfm) lifecycle).A06(enumC3085Bxl);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
    }
}
