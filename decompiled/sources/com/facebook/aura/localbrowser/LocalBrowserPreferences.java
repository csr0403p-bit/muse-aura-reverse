package com.facebook.aura.localbrowser;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class LocalBrowserPreferences implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final String BROWSER_ENABLED = "local_browser_enabled";
    public static final Companion Companion = new Companion();
    public final C1BN<Boolean> browserEnabled;
    public boolean cleared;
    public final BLG<Boolean> mutableBrowserEnabled;
    public final C4oT prefs;

    public final class Companion {
        public final LocalBrowserPreferences getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LocalBrowserPreferences) abstractC3358CGz.A03(LocalBrowserPreferences.class, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserPreferences$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LocalBrowserPreferences(abstractC3358CGz);
                }
            });
        }

        public static final LocalBrowserPreferences getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new LocalBrowserPreferences(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.cleared = true;
        AnonymousClass004.A1D(false, this.mutableBrowserEnabled);
    }

    public final synchronized void setBrowserEnabled(boolean z) {
        if (!this.cleared) {
            BzK bzKA9q = this.prefs.A9q();
            bzKA9q.A0A(BROWSER_ENABLED, z);
            bzKA9q.apply();
            AnonymousClass004.A1D(z, this.mutableBrowserEnabled);
        }
    }

    public final C1BN<Boolean> getBrowserEnabled() {
        return this.browserEnabled;
    }

    public LocalBrowserPreferences(AbstractC3358CGz abstractC3358CGz) {
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.prefs = c4oTUserPrefs;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(c4oTUserPrefs.getBoolean(BROWSER_ENABLED, true));
        this.mutableBrowserEnabled = c9286GCnA0v;
        this.browserEnabled = C3Pi.A00(c9286GCnA0v);
    }

    public /* synthetic */ LocalBrowserPreferences(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
