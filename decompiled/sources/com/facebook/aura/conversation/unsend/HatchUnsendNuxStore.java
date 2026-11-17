package com.facebook.aura.conversation.unsend;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
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

/* loaded from: classes.dex */
public final class HatchUnsendNuxStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String KEY_HAS_SEEN_UNSEND_NUX = "has_seen_unsend_nux";
    public final BLG<Boolean> _hasSeenNux;
    public final C1BN<Boolean> hasSeenNux;
    public final AbstractC3358CGz userSession;

    private final C4oT getPrefs() {
        return HatchPrefsStore.INSTANCE.userPrefs(this.userSession);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass004.A1D(false, this._hasSeenNux);
    }

    public final C1BN<Boolean> getHasSeenNux() {
        return this.hasSeenNux;
    }

    public final void markSeen() {
        if (AnonymousClass003.A1Z(this._hasSeenNux)) {
            return;
        }
        AnonymousClass004.A1D(true, this._hasSeenNux);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A0A(KEY_HAS_SEEN_UNSEND_NUX, true);
        bzKA9q.apply();
    }

    public final class Companion {
        public final HatchUnsendNuxStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchUnsendNuxStore) abstractC3358CGz.A03(HatchUnsendNuxStore.class, new HatchUnsendNuxStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchUnsendNuxStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public HatchUnsendNuxStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(getPrefs().getBoolean(KEY_HAS_SEEN_UNSEND_NUX, false));
        this._hasSeenNux = c9286GCnA0v;
        this.hasSeenNux = C3Pi.A00(c9286GCnA0v);
    }
}
