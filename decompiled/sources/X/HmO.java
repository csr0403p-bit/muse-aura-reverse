package X;

import android.view.View;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class HmO implements Runnable {
    public static final String __redex_internal_original_name = "RenderLifecycleExtensionBinderUtils$bind$runnable$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ FDW A03;
    public final /* synthetic */ Runnable A04;

    public HmO(View view, FBB fbb, FDW fdw, FDW fdw2, Runnable runnable) {
        this.A00 = view;
        this.A02 = fdw;
        this.A03 = fdw2;
        this.A01 = fbb;
        this.A04 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setTag(R.id.render_lifecycle_extension_runnable, null);
        FDW fdw = this.A02;
        HsM hsMA0Z = AbstractC7608F5v.A0Z(this.A03);
        F9J.A03(this.A01, fdw, C9115Fyg.A01(fdw), hsMA0Z, 1);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
