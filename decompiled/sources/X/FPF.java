package X;

import android.view.Window;

/* loaded from: classes6.dex */
public final class FPF implements Runnable {
    public static final String __redex_internal_original_name = "CDSBloksBottomSheetDialogHelper$constructDialog$3";
    public final /* synthetic */ FOX A00;

    public FPF(FOX fox) {
        this.A00 = fox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.A00.getWindow();
        if (window != null) {
            BAG.A00(window);
        }
    }
}
