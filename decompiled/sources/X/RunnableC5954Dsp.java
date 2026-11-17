package X;

import android.view.Window;

/* renamed from: X.Dsp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5954Dsp implements Runnable {
    public static final String __redex_internal_original_name = "SecureWindowUtils$1";
    public final /* synthetic */ Window A00;

    public RunnableC5954Dsp(Window window) {
        this.A00 = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setFlags(8192, 8192);
    }
}
