package com.facebook.aura.playground.intf;

import X.AnonymousClass005;
import com.facebook.aura.playground.itch.impl.ItchInternalSettingsContributor;
import java.util.List;

/* loaded from: classes2.dex */
public class InternalPlaygroundSettingsContributorStatic {
    public static List<InternalPlaygroundSettingsRow> rows(int i) {
        if (i == 0) {
            return ItchInternalSettingsContributor.INSTANCE.rows();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
