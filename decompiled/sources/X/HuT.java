package X;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HuT implements HsY {
    @Override // X.HsY
    public final int AFZ(int i) {
        return A00(HxW.A00, i);
    }

    public static final int A00(Map<Integer, C10596Hxs> map, int i) {
        C10596Hxs c10596Hxs = (C10596Hxs) BV5.A0f(map, i);
        if (c10596Hxs != null) {
            Hym hym = c10596Hxs.A00;
            if (34 <= Build.VERSION.SDK_INT && hym.A00.intValue() <= SdkExtensions.getExtensionVersion(34)) {
                return 2;
            }
        }
        return 1;
    }
}
