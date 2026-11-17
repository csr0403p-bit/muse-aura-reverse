package X;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class B0b implements InterfaceC2166B0e {
    public static final B0b A00 = new B0b();

    @Override // X.InterfaceC2166B0e
    public final float A8n(Context context) {
        C7384Etj.A0Y(context, 0);
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
