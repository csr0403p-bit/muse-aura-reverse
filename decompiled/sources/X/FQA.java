package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FQA implements Runnable {
    public static final String __redex_internal_original_name = "BloksViewpointVisibilityExtensionBinder$bind$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FPv A02;
    public final /* synthetic */ FBB A03;
    public final /* synthetic */ C8021FPx A04;

    public FQA(View view, FPv fPv, FBB fbb, C8021FPx c8021FPx, int i) {
        this.A04 = c8021FPx;
        this.A01 = view;
        this.A02 = fPv;
        this.A03 = fbb;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A00(this.A01, FPv.A00(this.A02, this.A03, this.A00));
    }
}
