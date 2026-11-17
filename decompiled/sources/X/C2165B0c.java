package X;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: X.B0c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2165B0c implements InterfaceC1079AXi {
    public final ViewConfiguration A00;

    @Override // X.InterfaceC1079AXi
    public final float AG3() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2168B0h.A00(this.A00);
        }
        return 16.0f;
    }

    @Override // X.InterfaceC1079AXi
    public final float AG4() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2168B0h.A01(this.A00);
        }
        return 2.0f;
    }

    @Override // X.InterfaceC1079AXi
    public final float AHX() {
        return this.A00.getScaledMaximumFlingVelocity();
    }

    @Override // X.InterfaceC1079AXi
    public final /* synthetic */ long AHo() {
        return C16n.A00(48.0f, 48.0f);
    }

    @Override // X.InterfaceC1079AXi
    public final float ALr() {
        return this.A00.getScaledTouchSlop();
    }

    public C2165B0c(ViewConfiguration viewConfiguration) {
        this.A00 = viewConfiguration;
    }

    @Override // X.InterfaceC1079AXi
    public final long AEp() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // X.InterfaceC1079AXi
    public final long AHG() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
