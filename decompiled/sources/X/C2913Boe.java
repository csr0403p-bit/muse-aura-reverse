package X;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.Boe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2913Boe implements DisplayManager.DisplayListener {
    public final /* synthetic */ BoY A00;

    public C2913Boe(BoY boY) {
        this.A00 = boY;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        BoY boY = this.A00;
        Display display = boY.getDisplay();
        if (display == null || display.getDisplayId() != i) {
            return;
        }
        boY.A01();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
