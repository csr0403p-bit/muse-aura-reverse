package com.facebook.aura.feed.repo;

import X.AbstractC3358CGz;
import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.VmAuthTokenKt;

/* loaded from: classes3.dex */
public final class FeedInstructionsCardStore implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AbstractC3358CGz userSession;

    private final C4oT getPrefs() {
        String string = HatchPrefsStore.INSTANCE.userPrefs(this.userSession).getString(VmAuthTokenKt.KEY_GATEWAY_URL, "");
        return AuraVMPrefs.INSTANCE.get(HatcheryVMIdUtilsKt.extractHatcheryVMId(string != null ? string : ""), AuraVMPrefStore.FEED_INSTRUCTIONS_CARD);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final class Companion {
        public final FeedInstructionsCardStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (FeedInstructionsCardStore) abstractC3358CGz.A03(FeedInstructionsCardStore.class, new FeedInstructionsCardStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedInstructionsCardStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public final boolean isDismissed() {
        return getPrefs().getBoolean(FeedInstructionsCardStoreKt.KEY_DISMISSED, false);
    }

    public final void setDismissed() {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A0A(FeedInstructionsCardStoreKt.KEY_DISMISSED, true);
        bzKA9q.apply();
    }

    public /* synthetic */ FeedInstructionsCardStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
