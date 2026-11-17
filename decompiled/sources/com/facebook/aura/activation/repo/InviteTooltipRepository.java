package com.facebook.aura.activation.repo;

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

/* loaded from: classes.dex */
public final class InviteTooltipRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _seen;
    public final C4oT prefs;
    public final C1BN<Boolean> seen;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final C1BN<Boolean> getSeen() {
        return this.seen;
    }

    public final void markSeen() {
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.A0A(InviteTooltipRepositoryKt.INVITE_TOOLTIP_SEEN, true);
        bzKA9q.apply();
        AnonymousClass004.A1D(true, this._seen);
    }

    public final class Companion {
        public final InviteTooltipRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (InviteTooltipRepository) abstractC3358CGz.A03(InviteTooltipRepository.class, new InviteTooltipRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ InviteTooltipRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public InviteTooltipRepository(AbstractC3358CGz abstractC3358CGz) {
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.prefs = c4oTUserPrefs;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(c4oTUserPrefs.getBoolean(InviteTooltipRepositoryKt.INVITE_TOOLTIP_SEEN, false));
        this._seen = c9286GCnA0v;
        this.seen = C3Pi.A00(c9286GCnA0v);
    }
}
