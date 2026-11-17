package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class B0V implements B0Y {
    public static final B0V A00 = new B0V();

    @Override // X.B0Y
    public final B0T A8A(Context context, InterfaceC2166B0e interfaceC2166B0e) {
        C7384Etj.A0Y(context, 0);
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = C60Q.A0B(context).density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        C7384Etj.A0U(bounds);
        return new B0T(bounds, f);
    }
}
