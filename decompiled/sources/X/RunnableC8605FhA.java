package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.FhA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8605FhA implements Runnable {
    public static final String __redex_internal_original_name = "Fragment$1";
    public final /* synthetic */ Fragment A00;

    public RunnableC8605FhA(Fragment fragment) {
        this.A00 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.startPostponedEnterTransition();
    }
}
