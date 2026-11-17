package com.facebook.aura.settings.api;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.impl.VoiceControlsSettingsRowProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SettingsGeneralRows {
    public static final int $stable = 0;
    public static final SettingsGeneralRows INSTANCE = new SettingsGeneralRows();

    public final List<SettingsGeneralRowContributor> contributors() {
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(VoiceControlsSettingsRowProvider.INSTANCE.contributor());
        return arrayList;
    }
}
