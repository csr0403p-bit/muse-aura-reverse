package com.facebook.aura.localbrowser;

import com.facebook.aura.R;
import com.facebook.aura.navigation.key.LocalBrowserSettingsScreenKey;
import com.facebook.aura.settings.internal.api.InternalSettingsFeatureContributor;
import com.facebook.aura.settings.internal.api.InternalSettingsFeatureEntry;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class LocalBrowserInternalSettingsContributor implements InternalSettingsFeatureContributor {
    public static final int $stable = 0;
    public static final LocalBrowserInternalSettingsContributor INSTANCE = new LocalBrowserInternalSettingsContributor();

    @Override // com.facebook.aura.settings.internal.api.InternalSettingsFeatureContributor
    public List<InternalSettingsFeatureEntry> entries() {
        return Collections.singletonList(new InternalSettingsFeatureEntry("localbrowser:settings", R.string._name_removed__res_0x7f120c9f, LocalBrowserSettingsScreenKey.INSTANCE, "Local browser enable disable", null, null, null));
    }
}
