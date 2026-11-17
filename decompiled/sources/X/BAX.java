package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes4.dex */
public final class BAX extends FRa {
    public final /* synthetic */ BAV A00;

    public BAX(BAV bav) {
        this.A00 = bav;
    }

    @Override // X.FRa
    public final C2197BAc A03(int i) {
        return new C2197BAc(AccessibilityNodeInfo.obtain(this.A00.obtainAccessibilityNodeInfo(i).A02));
    }

    @Override // X.FRa
    public final C2197BAc A04(int i) {
        BAV bav = this.A00;
        int i2 = i == 2 ? bav.mAccessibilityFocusedVirtualViewId : bav.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return A03(i2);
    }

    @Override // X.FRa
    public final boolean A06(int i, int i2, Bundle bundle) {
        return this.A00.performAction(i, i2, bundle);
    }
}
