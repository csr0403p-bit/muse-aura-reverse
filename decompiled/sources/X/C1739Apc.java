package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* renamed from: X.Apc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1739Apc extends C1716Aoz {
    @Override // X.AbstractC1717Ap0, X.InterfaceC1713Aow
    public final void AMn(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
