package X;

import android.view.WindowInsets;

/* renamed from: X.HbH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10400HbH {
    public static int A00(int i) {
        int iStatusBars;
        int i2 = 0;
        int i3 = 1;
        do {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= iStatusBars;
            }
            i3 <<= 1;
        } while (i3 <= 512);
        return i2;
    }
}
