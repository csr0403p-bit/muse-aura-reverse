package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.Dxv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6210Dxv implements InterfaceC6274DzR, DisplayManager.DisplayListener {
    public C6214Dy2 A00;
    public final DisplayManager A01;

    @Override // X.InterfaceC6274DzR
    public final void AZx(C6214Dy2 c6214Dy2) {
        this.A00 = c6214Dy2;
        DisplayManager displayManager = this.A01;
        displayManager.registerDisplayListener(this, C1G.A02(null));
        c6214Dy2.A00(displayManager.getDisplay(0));
    }

    @Override // X.InterfaceC6274DzR
    public final void Ahh() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        C6214Dy2 c6214Dy2 = this.A00;
        if (c6214Dy2 == null || i != 0) {
            return;
        }
        c6214Dy2.A00(this.A01.getDisplay(0));
    }

    public C6210Dxv(DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
