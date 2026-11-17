package X;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes4.dex */
public abstract class Am6 {
    public static G0U<? super InterfaceC1925Atm, ? extends InterfaceC1925Atm> A00 = BUT.A00(47);

    public static final float A00(float[] fArr, float[] fArr2, int i, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }

    public static final boolean A01(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }
}
