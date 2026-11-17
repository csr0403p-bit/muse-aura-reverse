package X;

import android.hardware.display.DisplayManager;

/* loaded from: classes5.dex */
public final class Dy0 implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C6169DxC A01;

    public Dy0(DisplayManager displayManager, C6169DxC c6169DxC) {
        this.A01 = c6169DxC;
        this.A00 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C6169DxC.A00(this.A00.getDisplay(0), this.A01);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
