package com.facebook.aura.devices.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C20Q;
import android.content.Context;
import com.facebook.aura.devices.link.ordering.impl.HatchLinkOrderInternalSettingsContributor;
import java.util.List;

/* loaded from: classes2.dex */
public class InternalDeviceSettingsContributorStatic {
    public static C20Q<List<InternalDeviceSettingsRow>> rows(int i, Context context, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return HatchLinkOrderInternalSettingsContributor.INSTANCE.rows(context, abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
