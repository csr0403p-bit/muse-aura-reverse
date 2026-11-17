package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes6.dex */
public abstract class HuJ {
    public static boolean A00(Context context) {
        AccessibilityManager accessibilityManagerA0F;
        if (Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        if (context == null || (accessibilityManagerA0F = AbstractC7608F5v.A0F(context)) == null) {
            return false;
        }
        return accessibilityManagerA0F.isTouchExplorationEnabled();
    }
}
