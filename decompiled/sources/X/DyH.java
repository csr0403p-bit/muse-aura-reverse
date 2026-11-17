package X;

import android.hardware.display.DisplayManager;

/* loaded from: classes5.dex */
public final class DyH implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C6178DxM A01;

    public DyH(DisplayManager displayManager, C6178DxM c6178DxM) {
        this.A01 = c6178DxM;
        this.A00 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C6178DxM.A00(this.A01);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
