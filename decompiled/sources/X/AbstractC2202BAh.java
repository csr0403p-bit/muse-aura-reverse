package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.BAh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2202BAh {
    public static void A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setTextSelectable(true);
    }

    public static String A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean A02(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
