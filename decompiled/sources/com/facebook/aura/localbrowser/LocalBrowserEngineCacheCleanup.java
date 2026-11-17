package com.facebook.aura.localbrowser;

import X.C3380CIk;
import X.C3cG;
import X.C7384Etj;
import X.CEV;
import X.EDZ;
import android.content.Context;
import com.facebook.aura.lifecycle.AppOpenedListener;
import java.io.File;

/* loaded from: classes5.dex */
public final class LocalBrowserEngineCacheCleanup implements AppOpenedListener {
    public static final int $stable = 0;
    public static final LocalBrowserEngineCacheCleanup INSTANCE = new LocalBrowserEngineCacheCleanup();

    @Override // com.facebook.aura.lifecycle.AppOpenedListener
    public void onAppOpened(Context context) {
        C7384Etj.A0Y(context, 0);
        EDZ edzA01 = EDZ.A01(context);
        C3380CIk c3380CIk = SC.android_ras_blobs;
        C7384Etj.A0V(c3380CIk);
        File fileA0O = C3cG.A0O(edzA01.getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(c3380CIk.A00, null), "hatch_browser_core");
        if (fileA0O.exists()) {
            CEV.A03(fileA0O);
        }
    }
}
