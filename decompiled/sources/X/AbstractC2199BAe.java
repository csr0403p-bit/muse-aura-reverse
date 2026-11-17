package X;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.BAe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2199BAe {
    public static AccessibilityNodeInfo.AccessibilityAction A00() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static CharSequence A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static boolean A05(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void A02(Rect rect, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static void A03(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void A04(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }
}
