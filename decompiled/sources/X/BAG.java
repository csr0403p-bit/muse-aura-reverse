package X;

import android.os.Build;
import android.view.Window;

/* loaded from: classes4.dex */
public interface BAG {
    static void A01(Window window, Boolean bool, Boolean bool2, Integer num, Integer num2, boolean z) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : AnonymousClass003.A18(window.getDecorView().getResources().getConfiguration().uiMode & 48);
        BA8 baf = Build.VERSION.SDK_INT >= 30 ? new BAF() : new BA8();
        baf.A02(window, bool2, num, num2, z, zBooleanValue);
        baf.A01(window, z);
    }

    static void A00(Window window) {
        (Build.VERSION.SDK_INT >= 30 ? new BAF() : new BA8()).A00(window);
    }
}
