package X;

import android.app.Activity;

/* loaded from: classes5.dex */
public final class DB5 implements Runnable {
    public static final String __redex_internal_original_name = "LifecycleStartupDoneStrategy$onActivityResumed$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DB4 A01;

    public DB5(Activity activity, DB4 db4) {
        this.A01 = db4;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DB4 db4 = this.A01;
        db4.A00.set(null);
        DAZ.A00(db4, "onPreDraw", C3cI.A0Y(this.A00), (short) 2, true);
    }
}
