package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.FhB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8606FhB implements Runnable {
    public static final String __redex_internal_original_name = "Fragment$3";
    public final /* synthetic */ Fragment A00;

    public RunnableC8606FhB(Fragment fragment) {
        this.A00 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.callStartTransitionListener(false);
    }
}
