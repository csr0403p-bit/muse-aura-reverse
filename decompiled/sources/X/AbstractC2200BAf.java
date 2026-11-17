package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.BAf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2200BAf {
    public static int A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence A02(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean A03(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }
}
