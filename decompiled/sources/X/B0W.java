package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class B0W implements B0Y {
    public static final B0W A00 = new B0W();

    @Override // X.B0Y
    public final B0T A8A(Context context, InterfaceC2166B0e interfaceC2166B0e) {
        C7384Etj.A0Y(context, 0);
        if (!context.isUiContext()) {
            context = context.getApplicationContext();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        C7384Etj.A0U(bounds);
        return new B0T(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
