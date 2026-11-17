package com.facebook.aura.email;

import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.navigation.EmailSetupDeeplink;
import com.facebook.aura.settings.internal.api.InternalSettingsFeatureContributor;
import com.facebook.aura.settings.internal.api.InternalSettingsFeatureEntry;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class EmailSetupInternalSettings implements InternalSettingsFeatureContributor {
    public static final int $stable = 0;
    public static final EmailSetupInternalSettings INSTANCE = new EmailSetupInternalSettings();

    @Override // com.facebook.aura.settings.internal.api.InternalSettingsFeatureContributor
    public List<InternalSettingsFeatureEntry> entries() {
        return Collections.singletonList(new InternalSettingsFeatureEntry("email:setup_deeplink", R.string._name_removed__res_0x7f120975, null, "Mail email setup deeplink chat", null, Uri.parse(EmailSetupDeeplink.URL), null));
    }
}
