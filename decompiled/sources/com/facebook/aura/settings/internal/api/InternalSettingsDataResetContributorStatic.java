package com.facebook.aura.settings.internal.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.email.EmailDataResetContributor;
import java.util.List;

/* loaded from: classes3.dex */
public class InternalSettingsDataResetContributorStatic {
    public static List<InternalSettingsDataResetEntry> entries(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return EmailDataResetContributor.INSTANCE.entries(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
