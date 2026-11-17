package com.facebook.aura.localbrowser;

import X.AEs;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C1BN;
import android.content.Context;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.nodes.HatchNodeClient;

/* loaded from: classes2.dex */
public final class LocalBrowserSettingsViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<Boolean> browserEnabled;
    public final HatchNodeClient nodeClient;
    public final LocalBrowserPreferences preferences;

    public final class Factory extends AuraViewModelFactory<LocalBrowserSettingsViewModel> {
        public static final int $stable = 8;
        public final Context context;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public LocalBrowserSettingsViewModel create() {
            return new LocalBrowserSettingsViewModel(LocalBrowserPreferences.Companion.getInstance(this.userSession), HatchNodeClient.Companion.getInstance(this.userSession, this.context));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            this.userSession = abstractC3358CGz;
            this.context = context;
        }
    }

    public final C1BN<Boolean> getBrowserEnabled() {
        return this.browserEnabled;
    }

    public final void setBrowserEnabled(boolean z) {
        this.preferences.setBrowserEnabled(z);
        this.nodeClient.reregister();
    }

    public LocalBrowserSettingsViewModel(LocalBrowserPreferences localBrowserPreferences, HatchNodeClient hatchNodeClient) {
        AnonymousClass003.A0u(localBrowserPreferences, hatchNodeClient);
        this.preferences = localBrowserPreferences;
        this.nodeClient = hatchNodeClient;
        this.browserEnabled = localBrowserPreferences.browserEnabled;
    }
}
