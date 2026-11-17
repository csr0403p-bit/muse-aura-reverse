package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.BAg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2201BAg {
    public static CharSequence A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void A01(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
