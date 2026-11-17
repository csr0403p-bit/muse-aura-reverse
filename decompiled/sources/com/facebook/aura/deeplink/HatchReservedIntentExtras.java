package com.facebook.aura.deeplink;

import X.AnonymousClass005;
import X.C7384Etj;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchReservedIntentExtras {
    public static final int $stable = 0;
    public static final HatchReservedIntentExtras INSTANCE = new HatchReservedIntentExtras();
    public static final List<String> keys = Arrays.asList(HatchIntentViewModel.EXTRA_DEEPLINK_OPENER, "hatch_notif_origin", HatchIntentViewModel.EXTRA_DEEPLINK_SOURCE_APPLICATION);

    public final void clear(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            intent.removeExtra(AnonymousClass005.A0j(it));
        }
    }

    public final boolean hasAny(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        List<String> list = keys;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (intent.hasExtra(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
