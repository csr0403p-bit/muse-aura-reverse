package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRZ extends AccessibilityNodeProvider {
    public final FRa A00;

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.A00.A05(bundle, new C2197BAc(accessibilityNodeInfo), str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C2197BAc c2197BAcA03 = this.A00.A03(i);
        if (c2197BAcA03 == null) {
            return null;
        }
        return c2197BAcA03.A02;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        List<C2197BAc> listA02 = this.A00.A02(str, i);
        if (listA02 == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int size = listA02.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA0h.add(listA02.get(i2).A02);
        }
        return arrayListA0h;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C2197BAc c2197BAcA04 = this.A00.A04(i);
        if (c2197BAcA04 == null) {
            return null;
        }
        return c2197BAcA04.A02;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A06(i, i2, bundle);
    }

    public FRZ(FRa fRa) {
        this.A00 = fRa;
    }
}
