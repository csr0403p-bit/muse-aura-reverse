package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes4.dex */
public final class ARC implements AR9 {
    public final AccessibilityManager A00;

    public ARC(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.A00 = (AccessibilityManager) systemService;
    }
}
