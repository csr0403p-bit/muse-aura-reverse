package X;

import android.view.ViewGroup;

/* renamed from: X.Dro, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5905Dro implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$HeroPlayerListenerImpl$maybeRecoverZeroSizedContainer$1";
    public final /* synthetic */ ViewGroup A00;

    public RunnableC5905Dro(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.requestLayout();
    }
}
